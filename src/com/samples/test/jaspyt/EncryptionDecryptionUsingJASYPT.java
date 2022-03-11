package com.samples.test.jaspyt


import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class EncryptionDecryptionUsingJASYPT {
//	 private static String mpCryptoPassword = "R+vFJ0ulVSpWf4p00cCyEY9xmdk5dRObuzl5Vu4swmY+hAMGxbJqwg==";
	 private static String mpCryptoPassword = "IQModernization2021V1";

	    public static void main(String[] args) {
	        String value = "4VH6KoqOR8yRHmaaau0NH5NjDM+qrhce";

	        System.out.println("Original Value : "+value);
	        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
	        encryptor.setPassword(mpCryptoPassword);
	        
	        
	        String encryptedPassword = encryptor.encrypt(value);
	        System.out.println(encryptedPassword);

	    	encryptedPassword="4VH6KoqOR8yRHmaaau0NH5NjDM+qrhce";
	        StandardPBEStringEncryptor decryptor = new StandardPBEStringEncryptor();
	        decryptor.setPassword(mpCryptoPassword);
	        System.out.println(decryptor.decrypt(encryptedPassword));
	    }
}
