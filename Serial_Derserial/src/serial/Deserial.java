package serial;

import java.io.*;



public class Deserial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeContent obj1[]=new SerializeContent[4] ;	
		String filename="java.ser";
		DB__Connect db=new DB__Connect();

		db.connectMysql();


		try {
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			for(int i=0;i<obj1.length;i++) {	
				SerializeContent obj2[]=(SerializeContent[])in.readObject();
				//System.out.println("ID: "+obj2[i].id+"\tfirstname: "+obj2[i].firstname+"\tlastname: "+obj2[i].lastname+"\trole: "+obj2[i].role);				
				if(obj2[i].role.equalsIgnoreCase("admin"))
				db.getRole(obj2[i].role);
				}
			in.close();
			file.close();
			System.out.println("\nObject has been deserialized.. "); 
			
		}
		catch(Exception io) {
			System.out.println("Errrrr"+io);
		}

	}

}
