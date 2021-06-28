package com.study.java8.base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * @author rajan
 * 
 *Base64 encoding and decoding for normal string, url and mime
 */
public class Base64Dem {
	
	public static void main(String args[]) {
		
		
		try {
			
			//String encoding
			String encodedString = Base64.getEncoder().encodeToString("rajan?123".getBytes("utf-8"));
			System.out.println(encodedString);
			
			//String decoding
			byte[] bytesOut=Base64.getDecoder().decode(encodedString);
			String decodingString= new String(bytesOut,"utf-8");
			System.out.println(decodingString);
			
			
			//Url encoding
			String encodingUrl=Base64.getUrlEncoder().encodeToString("rajan?123".getBytes("utf-8"));
			System.out.println(encodingUrl);
			
			//Url decoding
			byte[] byteOutUrl=Base64.getUrlDecoder().decode(encodingUrl);
			System.out.println(new String(byteOutUrl,"utf-8"));
			
			
			//Mime encoding
			StringBuilder strBuilder=new StringBuilder();
			for(int i=0;i<2;i++) {
				strBuilder.append(UUID.randomUUID().toString()).append(".");
			}
			byte[] bytesMime=strBuilder.toString().getBytes("utf-8");
			String encodingMime=Base64.getMimeEncoder().encodeToString(bytesMime);
			System.out.println(encodingMime);
			
			//Mime decoding
			byte[] byteOutMime=Base64.getMimeDecoder().decode(encodingMime);
			System.out.println(new String(byteOutMime,"utf-8"));
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
