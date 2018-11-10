package serial;

import java.io.*;

class SerializeContent implements Serializable{
	public int id;
	public String firstname;;
	public String lastname;;
	public String role;

	public SerializeContent(int id,String firstname,String lastname,String role) {
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.role=role;
	}

}

public class SerilizeDemo {

	public static void main(String[] args) {
		SerializeContent objArray[]=new SerializeContent[4];
		objArray[0]=new SerializeContent(234,"Johnnie","Walker","executive");
		objArray[1]=new SerializeContent(874,"Jager","Meister","executive");
		objArray[2]=new SerializeContent(104,"Chivas","Regal","executive");
		objArray[3]=new SerializeContent(0,"System","Administrator","Admin");
		System.out.println("length: "+objArray.length);
		String filename="java.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			for(int i=0;i<objArray.length;i++) {
				
				out.writeObject(objArray);
			}
			out.close();
			file.close();
			System.out.println("Object has been Seriliazed: ");

		}
		catch(IOException io){
			System.out.println("ERRRR"+io);

		}


	}

}
