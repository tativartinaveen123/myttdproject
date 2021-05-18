package com.ttd.common.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.awt.image.BufferedImage;
import javax.imageio.stream.ImageInputStream;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReader;


public class FileServerUtil {

	//Logger logger = Logger.getLogger(FileServerUtil.class);

	public static void uploadImageToFileServer(String imagePath, byte[] userImage){
		//logger.info("imagePath :: " + imagePath);			
		ByteArrayInputStream bais = null;
		BufferedImage originalImage = null;
		try {
		    byte[] imageInByte;
		    bais = new ByteArrayInputStream(userImage);
	    	originalImage = ImageIO.read(bais);	
			String fileExtn = "jpg";
			if(imagePath != null) {
				fileExtn = imagePath.substring(imagePath.indexOf(".")+1);
			}				
			ImageIO.write(originalImage, fileExtn, new File(imagePath));

		} catch (Exception ex) {
		    ex.printStackTrace();
		}  finally { 
			try {
				bais.close();
				originalImage.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
		}
	}

	public static String determineImageFormat( byte[] imageBytes ) {

		try {
	      final ByteArrayInputStream bStream = new ByteArrayInputStream( imageBytes );

	      final ImageInputStream imgStream = ImageIO.createImageInputStream( bStream );
	      final Iterator<ImageReader> iter = ImageIO.getImageReaders( imgStream );

	      final ImageReader imgReader = iter.next();

	      return imgReader.getFormatName();
		  
		} catch (Exception ex) {
		    ex.printStackTrace();
		} 	  
		return "";
	}	
	
	public static byte[] retriveImageForFileServer (String imagePath)  {
		byte[] imageInByte = null;
		 // open image
	
		 try{
				
				BufferedImage originalImage = 
			                              ImageIO.read(new File(imagePath));
				String type = imagePath.substring(imagePath.lastIndexOf('.')+1);
				//logger.info("Type is" + type);
				ByteArrayOutputStream baos = new ByteArrayOutputStream();
				ImageIO.write( originalImage, type, baos );
				baos.flush();
				imageInByte = baos.toByteArray();
				baos.close();
						
				}catch(IOException e){
					System.out.println(e.getMessage());
				}		
		

		 return imageInByte;
		}
	
}
