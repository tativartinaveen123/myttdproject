package com.ttd.common.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Enumeration;
import java.math.*;

import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.*;


public class RSASignAndVerify {

	static final Base64.Decoder DECODER = Base64.getMimeDecoder();
	
	//To sign the data using private key
	public static String sign(byte[] plainTextInByteStr, PrivateKey privateKey) throws Exception {
        Signature privateSignature = Signature.getInstance("SHA256withRSA");
        privateSignature.initSign(privateKey);
        privateSignature.update(plainTextInByteStr);

        byte[] signature = privateSignature.sign();

        return Base64.getEncoder().encodeToString(signature);
    }
	
	//To verify the data and signature using public key
	 public static boolean verify(byte[] plainTextInByteStr, String signature, PublicKey publicKey) throws Exception {
        Signature publicSignature = Signature.getInstance("SHA256withRSA");
        publicSignature.initVerify(publicKey);
        publicSignature.update(plainTextInByteStr);

        byte[] signatureBytes = Base64.getDecoder().decode(signature);

        return publicSignature.verify(signatureBytes);
    }
		 
	 public static PublicKey readPublicKey(File filename) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException
	 {
	     X509EncodedKeySpec publicSpec = new X509EncodedKeySpec(readPublicFileBytes(filename));
	     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
	     return keyFactory.generatePublic(publicSpec);         
	 }

	 public static PrivateKey readPrivateKey(File filename) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException
	 {
			   
//	     PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(readPrivateFileBytes(filename));
//	     KeyFactory keyFactory = KeyFactory.getInstance("RSA");
//	     return keyFactory.generatePrivate(keySpec);
		    
	     PrivateKey pk = null;
		    try {
		        ASN1Sequence primitive = (ASN1Sequence) ASN1Sequence
		            .fromByteArray(readPrivateFileBytes(filename));
		        Enumeration<?> e = primitive.getObjects();
		        BigInteger v = ((DERInteger) e.nextElement()).getValue();

		        int version = v.intValue();
		        if (version != 0 && version != 1) {
		            throw new IllegalArgumentException("wrong version for RSA private key");
		        }
		        /**
		         * In fact only modulus and private exponent are in use.
		         */
		        BigInteger modulus = ((DERInteger) e.nextElement()).getValue();
		        BigInteger publicExponent = ((DERInteger) e.nextElement()).getValue();
		        BigInteger privateExponent = ((DERInteger) e.nextElement()).getValue();
		        BigInteger prime1 = ((DERInteger) e.nextElement()).getValue();
		        BigInteger prime2 = ((DERInteger) e.nextElement()).getValue();
		        BigInteger exponent1 = ((DERInteger) e.nextElement()).getValue();
		        BigInteger exponent2 = ((DERInteger) e.nextElement()).getValue();
		        BigInteger coefficient = ((DERInteger) e.nextElement()).getValue();

		        RSAPrivateKeySpec spec = new RSAPrivateKeySpec(modulus, privateExponent);
		        KeyFactory kf = KeyFactory.getInstance("RSA");
		        pk = kf.generatePrivate(spec);
		    } catch (IOException e2) {
		        throw new IllegalStateException();
		    } catch (NoSuchAlgorithmException e) {
		        throw new IllegalStateException(e);
		    } catch (InvalidKeySpecException e) {
		        throw new IllegalStateException(e);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		    
	     return pk;     
	 }

	 public static byte[] readFileBytes(String filename) throws IOException
	 {
		 System.out.println("file name in parameter : "+filename);
		 byte[] buffer = new byte[1];  
		 try{
			File f = new File(filename);
	        byte[] keyBytes = new byte[(int) f.length()];
			 System.out.println("size of buffer : "+keyBytes.length);
			 return keyBytes;
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 return buffer;
	 }
	 
	 public static byte[] readPrivateFileBytes(File filename) throws IOException
	 {
		 final String s = new String(Files.readAllBytes(filename.toPath()));
		 return DECODER.decode(s.replace("-----BEGIN RSA PRIVATE KEY-----\n", "").replace("-----END RSA PRIVATE KEY-----", ""));
	 }
	 
	 public static byte[] readPublicFileBytes(File filename) throws IOException
	 {
		 final String s = new String(Files.readAllBytes(filename.toPath()));
		 return DECODER.decode(s.replace("-----BEGIN PUBLIC KEY-----\n", "").replace("-----END PUBLIC KEY-----", ""));
	 }
	 
}
