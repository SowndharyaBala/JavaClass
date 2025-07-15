package seri_deser;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) {
		try {
			 FileInputStream fis = new FileInputStream("Serial.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            
	            Student s = (Student)ois.readObject();
	            System.out.println("ID: " + s.id + ", Name: " + s.name);
	            ois.close();
	            fis.close();
	    
		}catch (Exception e) {
            e.printStackTrace();
        }

	}

}
