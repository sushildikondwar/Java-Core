package com.java.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOpenCloseExceptionHandle {
	
	void fileManager() {
		FileInputStream x = null;
		try {
			x = new FileInputStream("D:/..jpg");
			System.out.println("File Found!..");
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found!..");
		}
		finally {	//	FINALLY BLOCK IS GENERALLY USED TO CLOSE ALL THE OPEN HANDLERS (FILE, DATABASE, ETC..)
			if (x != null) {
				try {
					x.close();
					System.out.println("File Closed!..");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOpenCloseExceptionHandle abc = new FileOpenCloseExceptionHandle();
		abc.fileManager();

	}

}
