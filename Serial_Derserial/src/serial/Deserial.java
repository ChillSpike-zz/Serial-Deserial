package serial;

import java.io.*;
import java.sql.*;

public class Deserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerializeContent obj1=null;
		String filename="java.ser";
		DB__Connect db=new DB__Connect();
		db.connectMysql();
		db.getRole("admin");
		try {
			/*FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			obj1=(SerializeContent)in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialized "); 
	        System.out.println("a = " + obj1.a); 
	        System.out.println("b = " + obj1.b); 
	        System.out.println("role = " + obj1.role+"\n"); 
	        if(obj1.role.equals("Admin")) {
	        	System.out.println("***ACCESS GRANTED***");
	        }*/
		}
		catch(Exception io) {
			System.out.println("Errrrr"+io);
		}

	}

}
