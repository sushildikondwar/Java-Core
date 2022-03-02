package com.java.exception;
import java.io.*;

//	IT IS REFERRED AS 'AUTOMATIC RESOURCE MANAGEMENT' AS IT CLOSES THE RESOURCES AUTOMATICALLY NY USING 'AUTOCLOSABLE RESOURCES'
//	RESOURCES BE ANYTHING LIKE FILE, DATABASE CONNECTION, ETC. WE DON'T NEED TO CLOSE THEM EXPLICITLY, THE JVM WILL DO THAT AUTOMATICALLY
//	Any object that implements 'java.lang.AutoCloseable' or 'java.io.Closeable', can be passed as a parameter to try statement

public class TryWithResource {
	
	public static void openFile() {
		
		//	NOTE: TRY PARENTHESIS CAN ACCEPT 'N' PARAMETERS FOR OPENING FILES/CONNECTIONS
		try (BufferedReader br = new BufferedReader(new FileReader("d://..jpg"))) {	//	HERE, AS WE ARE OPENING THE FILE/CONNECTION AS A PARAMETER OF TRY, THEN AFTER TRY BLOCK EXECUTES SUCCESSFULLY, THE JVM CLOSES ALL THE FUNCTIONS OPENED IN THE TRY PARAMETERS 
			String str;
			while ((str=br.readLine()) != null) {
				System.out.println(str);
			}
		}
		catch (IOException ie) {	//	WILL THROW AN ERROR IF FILE DOESN'T EXISTS
			System.out.println(ie);
		}
		
	}
	
	public static void main(String[] args) {

		TryWithResource.openFile();

	}

}
