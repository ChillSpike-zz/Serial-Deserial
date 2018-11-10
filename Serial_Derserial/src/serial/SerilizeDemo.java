package serial;

import java.io.*;



class SerializeContent implements Serializable{
	public int a;
	public String b;
	public String role;
	
	public SerializeContent(int a,String b,String role) {
		this.a=a;
		this.b=b;
		this.role=role;
	}
	
}

public class SerilizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SerializeContent obj=new SerializeContent(10,"Different Class/Program","Admin");
		String filename="java.ser";
		try {
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been Seriliazed: "+obj);
			
		}
		catch(IOException io){
			System.out.println("ERRRR"+io);

	}


	}

}
