package seri_deser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {

		Student s = new Student(001, "Sowndharya");
		
		try {
			FileOutputStream fos = new FileOutputStream("Serial.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			oos.close();
			fos.close();
			  System.out.println("Object Serialized Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
