package com.ttd.common.pdf;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;

import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.velocity.VelocityEngineUtils;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.Barcode128;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.ttd.common.util.CommonUtility;
import com.ttd.common.util.EnglishNumberToWords;
import com.ttd.ehundi.model.TransactionDetail;


import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class PdfGeneratorService {

	Logger logger = Logger.getLogger(PdfGeneratorService.class);

	private final VelocityEngine velocityEngine;

	private String fileServerIP;
	private String pdfEHundiLoc;
	private String pdfEDonLoc;
	private String pdfEAccommLoc;
	private String pdfESevaLoc;
	private String pdfEDarsLoc;
	private String pdfKMLoc;
    private String barCodeLoc;
    private String pdfKalyanVedikaLoc;
    private String pdfSgmsLoc;
    private String pdfESevaDipLoc;
    private String ussesvvdBarcodeLoc;
    private String pdfPublicationLoc;
    private String pdfEDarshanDipLoc;
    

	public String getPdfKMLoc() {
		return pdfKMLoc;
	}

	public void setPdfKMLoc(String pdfKMLoc) {
		this.pdfKMLoc = pdfKMLoc;
	}

	private HashMap<String, String> receiptMessageSections = new HashMap<String, String>();

	@Autowired
	private ServletContext servletContext;

	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@Autowired
	public PdfGeneratorService(VelocityEngine velocityEngine) {
		this.velocityEngine = velocityEngine;
	}

	public HashMap<String, String> getReceiptMessageSections() {
		return receiptMessageSections;
	}

	public void setReceiptMessageSections(
			HashMap<String, String> receiptMessageSections) {
		this.receiptMessageSections = receiptMessageSections;
	}

	public String generateAckReceiptPdf(TransactionDetail tranDetail) {

		String contextPath = servletContext.getContextPath();

		logger.info("contextPath :: " + contextPath);
		// String dest =
		// servletContext.getRealPath("/")+tranDetail.getAckReceiptName();
		String dest = getFileServerPath(tranDetail.getAckReceiptName());
		logger.info("fileName :: " + dest);
		byte[] OWNER="World".getBytes();
		byte[] USER="Hello".getBytes();
		Document ackReceipt = new Document();
		try {

			File f = new File(dest);
			f.createNewFile();
			PdfWriter pdfWriter = PdfWriter.getInstance(ackReceipt, new FileOutputStream(f));
			pdfWriter.setEncryption(USER, OWNER,PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);
			ackReceipt.open();

			addMetaData(ackReceipt);
			addContent(ackReceipt, tranDetail);
			return "test";
		} catch (DocumentException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return null;
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return null;
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
			return null;
		} finally {
			ackReceipt.close();
		}
	}

	private static void addMetaData(Document document) {
		document.addTitle("Transaction Acknowledgement Receipt");
		document.addCreationDate();
	}

	private void addContent(Document document, TransactionDetail tranDetail)
			throws DocumentException, MalformedURLException, IOException {

		Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD,
				BaseColor.RED);
		Font subFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL);
		Font subBoldFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
		Font smallFont = new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL);
		Font smallBoldFont = new Font(Font.FontFamily.TIMES_ROMAN, 10,
				Font.BOLD);

		Image image = Image.getInstance(servletContext.getRealPath("/")
				+ "content/img/logo.png");
		image.setAlignment(Element.ALIGN_MIDDLE);
		image.scaleToFit(200f, 300f);
		PdfPTable receiptInfo = new PdfPTable(2);
		receiptInfo.setWidthPercentage(100);
		PdfPCell cell = new PdfPCell();
		cell.setBorder(PdfPCell.NO_BORDER);
		cell.setColspan(2);
		Paragraph transactionId = new Paragraph(getReceiptMessageSections()
				.get("transactionId") + " : " + tranDetail.getOfferingId(),
				subFont);
		PdfPCell leftCell = new PdfPCell(transactionId);
		leftCell.setPaddingTop(0);
		leftCell.setHorizontalAlignment(PdfPCell.ALIGN_LEFT);
		leftCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		leftCell.setBorder(PdfPCell.NO_BORDER);

		Paragraph receiptDate = new Paragraph(
				getReceiptMessageSections().get("date") + " : "
						+ CommonUtility.formatDate(tranDetail.getUpdatedTime()),
				subFont);
		PdfPCell rightCell = new PdfPCell(receiptDate);
		rightCell.setPadding(0);
		rightCell.setHorizontalAlignment(PdfPCell.ALIGN_RIGHT);
		rightCell.setVerticalAlignment(Element.ALIGN_MIDDLE);
		rightCell.setBorder(PdfPCell.NO_BORDER);
		receiptInfo.addCell(leftCell);
		receiptInfo.addCell(rightCell);

		Paragraph receiptHeading = new Paragraph(getReceiptMessageSections()
				.get("heading"), catFont);
		receiptHeading.setAlignment(Element.ALIGN_CENTER);

		Map<String, Object> propsMap = prepareTemplateVariables(tranDetail);
		String body = VelocityEngineUtils.mergeTemplateIntoString(
				velocityEngine, "/acknowledgeReceiptBody.vm", propsMap);
		System.out.println(body);

		Paragraph content = new Paragraph(body, subFont);
		content.setAlignment(Element.ALIGN_CENTER);
		content.setIndentationLeft(0);
		content.setIndentationRight(0);

		Paragraph onBehalfOf = new Paragraph();
		if (propsMap.get("onBehalfOf") != null) {
			onBehalfOf = new Paragraph("On Behalf Of : "
					+ tranDetail.getOnBehalfOf(), subFont);
			onBehalfOf.setAlignment(Element.ALIGN_LEFT);
			onBehalfOf.setIndentationLeft(0);
		}

		Paragraph receiptSignedBy = new Paragraph(getReceiptMessageSections()
				.get("signedBy"), subBoldFont);
		receiptSignedBy.setAlignment(Element.ALIGN_RIGHT);
		receiptSignedBy.setIndentationRight(0);
		Paragraph receiptNote = new Paragraph();
		Chunk note = new Chunk("Note: ", smallBoldFont);
		Chunk noteText = new Chunk(getReceiptMessageSections().get("note"),
				smallFont);
		receiptNote.add(note);
		receiptNote.add(noteText);
		receiptNote.setAlignment(Element.ALIGN_LEFT);
		receiptNote.setIndentationLeft(0);

		document.add(image);
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(receiptInfo);
		addEmptyLine(receiptHeading, 1);
		document.add(receiptHeading);
		addEmptyLine(content, 1);
		document.add(content);
		if (onBehalfOf.isEmpty() == false) {
			addEmptyLine(onBehalfOf, 1);
			document.add(onBehalfOf);
		}
		addEmptyLine(receiptSignedBy, 1);
		document.add(receiptSignedBy);
		document.add(receiptNote);
		document.newPage();
	}

	private static void addEmptyLine(Paragraph paragraph, int number) {
		for (int i = 0; i < number; i++) {
			paragraph.add(new Paragraph(" "));
		}
	}

	private Map<String, Object> prepareTemplateVariables(
			TransactionDetail tranDetail) {
		Map<String, Object> props = new HashMap<String, Object>();
		props.put("firstName", tranDetail.getPiligrimFirstName());
		props.put("amount", tranDetail.getOfferingAmount());
		props.put("amountInWords", EnglishNumberToWords.convert(tranDetail
				.getOfferingAmount().longValue()));
		props.put("offeringDate",
				CommonUtility.formatDate(tranDetail.getUpdatedTime()));
		props.put("onBehalfOf", tranDetail.getOnBehalfOf());
		return props;
	}

	public void generateAcknowledgeReceipt(String receiptBody,
			String receiptName) {
		//logger.error("================================ in side generateAcknowledgeReceipt");
		String contextPath = servletContext.getContextPath();

		logger.info("Start of generateAcknowledgeReceipt( " + receiptBody
				+ " ) in PdfGeneratorService");
		logger.info("contextPath :: " + contextPath);
		// String dest = servletContext.getRealPath("/")+ receiptName;
		String dest = getFileServerPath(receiptName);
		logger.info("fileName :: " + dest);

		Document ackReceipt = new Document();
		
		PdfWriter pdfWriter = null;
		File f = null;
		try {
			f = new File(dest);
			f.createNewFile();
			pdfWriter = PdfWriter.getInstance(ackReceipt,
					new FileOutputStream(f));
			ackReceipt.open();
			addMetaData(ackReceipt);
			XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
			worker.parseXHtml(pdfWriter, ackReceipt, new StringReader(
					receiptBody));
			ackReceipt.close();
			//logger.error("================================ end of e generateAcknowledgeReceipt");
		} catch (DocumentException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			if(pdfWriter!=null){
			pdfWriter.flush();
			pdfWriter.close();}
			if(ackReceipt!=null){
				ackReceipt.close();
			}
			//System.out.println("================PDF================ "+dest +" "+ new File(dest).exists());
			//logger.error("================PDF================ "+dest +" "+ new File(dest).exists());
		}
	}

	public String generateBarCode(String barCodeStr, String receiptName) {
		//logger.error("================================ in side generateBarCode");
		String path = getFileServerPath(barCodeStr+".jpg");
		
		if(new File(path).exists()) return path;
		
		FileOutputStream fos = null;
		ByteArrayOutputStream bytesOut = null;
		
		try {
			Barcode128 code128 = new Barcode128();
			code128.setCodeType(Barcode128.CODE128);
			code128.setCode(barCodeStr);
			java.awt.Image img = code128.createAwtImage(Color.BLACK, Color.WHITE);			
						
			BufferedImage outImage = new BufferedImage(img.getWidth(null),
				img.getHeight(null), BufferedImage.TYPE_INT_RGB);
			outImage.getGraphics().drawImage(img, 0, 0, null);
			bytesOut = new ByteArrayOutputStream();
		
			ImageIO.write(outImage, "jpg", bytesOut);
			
			byte[] pngImageData = bytesOut.toByteArray();
			
			fos = new FileOutputStream(new File(path));
			fos.write(pngImageData);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (bytesOut != null)  {
				try {					
					bytesOut.flush();
					bytesOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			if (fos != null)  {
				try {
					fos.flush();
					fos.close();					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			//System.out.println("================================ "+path +" "+ new File(path).exists());
			//logger.error("================================ "+path +" "+ new File(path).exists());
		}
		
		
		return path;
	}

	
	public String generateQRCode(String barCodeStr, String receiptName,String qrCodeText) {
		//logger.error("================================ in side generateBarCode");
		logger.error("Start of generateQRCode"+barCodeStr+""+qrCodeText);
		String path = getFileServerPath(barCodeStr+"QR"+".jpg");
		
		if(new File(path).exists()) return path;
		
		FileOutputStream fos = null;
		ByteArrayOutputStream bytesOut = null;
		
		try {
			int size = 125;
			String fileType = "jpg";
			/*
			 * Barcode128 code128 = new Barcode128();
			 * code128.setCodeType(Barcode128.CODE128); code128.setCode(barCodeStr);
			 * java.awt.Image img = code128.createAwtImage(Color.BLACK, Color.WHITE);
			 * 
			 * BufferedImage outImage = new BufferedImage(img.getWidth(null),
			 * img.getHeight(null), BufferedImage.TYPE_INT_RGB);
			 * outImage.getGraphics().drawImage(img, 0, 0, null); bytesOut = new
			 * ByteArrayOutputStream();
			 * 
			 * ImageIO.write(outImage, "jpg", bytesOut);
			 */
			
			// Create the ByteMatrix for the QR-Code that encodes the given String
			Hashtable<EncodeHintType, ErrorCorrectionLevel> hintMap = new Hashtable();
			hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
			QRCodeWriter qrCodeWriter = new QRCodeWriter();
			BitMatrix byteMatrix = qrCodeWriter.encode(qrCodeText, BarcodeFormat.QR_CODE, size, size, hintMap);
			// Make the BufferedImage that are to hold the QRCode
			int matrixWidth = byteMatrix.getWidth();
			BufferedImage image = new BufferedImage(matrixWidth, matrixWidth, BufferedImage.TYPE_INT_RGB);
			image.createGraphics();

			Graphics2D graphics = (Graphics2D) image.getGraphics();
			graphics.setColor(Color.WHITE);
			graphics.fillRect(0, 0, matrixWidth, matrixWidth);
			// Paint and save the image using the ByteMatrix
			graphics.setColor(Color.BLACK);

			for (int i = 0; i < matrixWidth; i++) {
				for (int j = 0; j < matrixWidth; j++) {
					if (byteMatrix.get(i, j)) {
						graphics.fillRect(i, j, 1, 1);
					}
				}
			}
			bytesOut= new ByteArrayOutputStream();
			ImageIO.write(image, fileType, bytesOut);
			
			byte[] pngImageData = bytesOut.toByteArray();
			
			fos = new FileOutputStream(new File(path));
			fos.write(pngImageData);
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if (bytesOut != null)  {
				try {					
					bytesOut.flush();
					bytesOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			if (fos != null)  {
				try {
					fos.flush();
					fos.close();					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			//System.out.println("================================ "+path +" "+ new File(path).exists());
			//logger.error("================================ "+path +" "+ new File(path).exists());
		}
		
		
		return path;
	}

	
	public void generateAcknowledgeReceipt(String receiptBody,
			String receiptName, String barCodeStr) {
		String contextPath = servletContext.getContextPath();

		logger.info("Start of generateAcknowledgeReceipt( " + receiptBody
				+ " ) in PdfGeneratorService");
		logger.info("contextPath :: " + contextPath);

		String dest = getFileServerPath(receiptName);
		logger.info("fileName :: " + dest);

		Document ackReceipt = new Document();
		try {
			File f = new File(dest);
			f.createNewFile();
			PdfWriter pdfWriter = PdfWriter.getInstance(ackReceipt,
					new FileOutputStream(f));
			ackReceipt.open();
			addMetaData(ackReceipt);
			XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
			worker.parseXHtml(pdfWriter, ackReceipt, new StringReader(
					receiptBody));			
			if (barCodeStr != null) {
				// Add Barcode to PDF document
				ackReceipt.add(new Paragraph(" "));
				Barcode128 code128 = new Barcode128();
				code128.setCodeType(Barcode128.CODE128);
				code128.setCode(barCodeStr);

				ackReceipt.add(code128.createImageWithBarcode(
						pdfWriter.getDirectContent(), null, null));
			}			
			ackReceipt.close();
		} catch (DocumentException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {

		}
	}

	public void generateAcknowledgeReceipt(String receiptBody,
			String receiptBodyLaddus, String receiptName, String barCodeStr) {
		String contextPath = servletContext.getContextPath();

		logger.info("Start of generateAcknowledgeReceipt( " + receiptBody
				+ " ) in PdfGeneratorService");
		logger.info("contextPath :: " + contextPath);
		// String dest = servletContext.getRealPath("/")+ receiptName;
		String dest = getFileServerPath(receiptName);
		logger.info("fileName :: " + dest);

		Document ackReceipt = new Document();
		try {
			File f = new File(dest);
			f.createNewFile();
			PdfWriter pdfWriter = PdfWriter.getInstance(ackReceipt,
					new FileOutputStream(f));
			ackReceipt.open();
			addMetaData(ackReceipt);
			XMLWorkerHelper worker = XMLWorkerHelper.getInstance();
			worker.parseXHtml(pdfWriter, ackReceipt, new StringReader(
					receiptBody));
			if (barCodeStr != null) {
				// Add Barcode to PDF document
				ackReceipt.add(new Paragraph(" "));
				Barcode128 code128 = new Barcode128();
				code128.setCodeType(Barcode128.CODE128);
				code128.setCode(barCodeStr);
				ackReceipt.add(code128.createImageWithBarcode(
						pdfWriter.getDirectContent(), null, null));
			}

			worker.parseXHtml(pdfWriter, ackReceipt, new StringReader(
					receiptBodyLaddus));
			if (barCodeStr != null) {
				// Add Barcode to PDF document
				ackReceipt.add(new Paragraph(" "));
				Barcode128 code128 = new Barcode128();
				code128.setCodeType(Barcode128.CODE128);
				code128.setCode(barCodeStr);
				ackReceipt.add(code128.createImageWithBarcode(
						pdfWriter.getDirectContent(), null, null));
			}

			ackReceipt.close();
		} catch (DocumentException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {

		}
	}

	private String getFileServerPath(String receiptName) {
		logger.info("receiptName :: " + receiptName.substring(0, 4));
		if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("EHUN")) {
			return getPdfEHundiLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("EDON")) {
			return getPdfEDonLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("EACC")) {
			return getPdfEAccommLoc() + "/" + receiptName;
		}
		else if (receiptName != null
				&& receiptName.substring(0, 6).equalsIgnoreCase("DIPSEV")) {
			return getPdfESevaDipLoc() + "/" + receiptName;
		}
		else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("ESEV")) {
			return getPdfESevaLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("EDAR")) {
			return getPdfEDarsLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("KALY")) {
			return getPdfKalyanVedikaLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("SGMS")) {
			return getPdfSgmsLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IM")) {
			return getPdfSgmsLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IS")) {
			return getPdfESevaLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("ID")) {
			return getPdfEDarsLoc() + "/" + receiptName;
		} else if (receiptName != null
				&& receiptName.substring(0, 3).equalsIgnoreCase("ITD")) {
			return getPdfEDarsLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IL")) {
				return getPdfEDarsLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("RE")) {
			return getBarCodeLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IA")) {
			return getPdfEAccommLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 3).equalsIgnoreCase("IKM")) {
			return getPdfKMLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IK")) {
			return getPdfKalyanVedikaLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& (receiptName.substring(0, 2).equalsIgnoreCase("UR") || receiptName.substring(0, 2).equalsIgnoreCase("VR")) ) {
			return getUssesvvdBarcodeLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 4).equalsIgnoreCase("Publ")) {
			return getPdfPublicationLoc()+ "/" + receiptName;
		}else if (receiptName != null
				&& (receiptName.substring(0, 1).equalsIgnoreCase("P")) ) {
			return getPdfPublicationLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 6).equalsIgnoreCase("DIPDAR")) {
			return getPdfEDarshanDipLoc() + "/" + receiptName;
		}else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("DB")) {
			return getBarCodeLoc()+"/"+receiptName;
			//return getPdfEDarshanDipLoc()+ "/" + receiptName;
		}
		else if (receiptName != null
				&& receiptName.substring(0, 2).equalsIgnoreCase("IL")) {
			return getPdfEDarsLoc() + "/" + receiptName;

		}
			
		
		return "test";
	}

	public String getFileServerIP() {
		return fileServerIP;
	}

	public void setFileServerIP(String fileServerIP) {
		this.fileServerIP = fileServerIP;
	}

	public String getPdfEHundiLoc() {
		return pdfEHundiLoc;
	}

	public void setPdfEHundiLoc(String pdfEHundiLoc) {
		this.pdfEHundiLoc = pdfEHundiLoc;
	}

	public String getPdfEDonLoc() {
		return pdfEDonLoc;
	}

	public void setPdfEDonLoc(String pdfEDonLoc) {
		this.pdfEDonLoc = pdfEDonLoc;
	}

	public String getPdfEAccommLoc() {
		return pdfEAccommLoc;
	}

	public void setPdfEAccommLoc(String pdfEAccommLoc) {
		this.pdfEAccommLoc = pdfEAccommLoc;
	}

	public String getPdfESevaLoc() {
		return pdfESevaLoc;
	}

	public void setPdfESevaLoc(String pdfESevaLoc) {
		this.pdfESevaLoc = pdfESevaLoc;
	}

	public String getPdfEDarsLoc() {
		return pdfEDarsLoc;
	}

	public void setPdfEDarsLoc(String pdfEDarsLoc) {
		this.pdfEDarsLoc = pdfEDarsLoc;
	}

	public String getBarCodeLoc() {
		return barCodeLoc;
	}

	public void setBarCodeLoc(String barCodeLoc) {
		this.barCodeLoc = barCodeLoc;
	}
	

	

	public String getPdfKalyanVedikaLoc() {
		return pdfKalyanVedikaLoc;
	}

	public void setPdfKalyanVedikaLoc(String pdfKalyanVedikaLoc) {
		this.pdfKalyanVedikaLoc = pdfKalyanVedikaLoc;
	}

	public String getPdfSgmsLoc() {
		return pdfSgmsLoc;
	}

	public void setPdfSgmsLoc(String pdfSgmsLoc) {
		this.pdfSgmsLoc = pdfSgmsLoc;
	}
	public String getPdfESevaDipLoc() {
		return pdfESevaDipLoc;
	}

	public void setPdfESevaDipLoc(String pdfESevaDipLoc) {
		this.pdfESevaDipLoc = pdfESevaDipLoc;
	}

	public String getUssesvvdBarcodeLoc() {
		return ussesvvdBarcodeLoc;
	}

	public void setUssesvvdBarcodeLoc(String ussesvvdBarcodeLoc) {
		this.ussesvvdBarcodeLoc = ussesvvdBarcodeLoc;
	}

	public String getPdfPublicationLoc() {
		return pdfPublicationLoc;
	}

	public void setPdfPublicationLoc(String pdfPublicationLoc) {
		this.pdfPublicationLoc = pdfPublicationLoc;
	}

	public String getPdfEDarshanDipLoc() {
		return pdfEDarshanDipLoc;
	}

	public void setPdfEDarshanDipLoc(String pdfEDarshanDipLoc) {
		this.pdfEDarshanDipLoc = pdfEDarshanDipLoc;
	}
	

}
