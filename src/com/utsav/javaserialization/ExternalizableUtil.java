package com.utsav.javaserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizableUtil {

	public static void main(String[] args) {
		File fileName = new File("d:\\externalFile.txt");
		Person person = new Person();
		person.setId(1);
		person.setName("Pankaj");
		person.setGender("Male");
		
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		    oos.writeObject(person);
		    oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream fis;
		try {
			fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
		    Person p = (Person)ois.readObject();
		    ois.close();
		    System.out.println("Person Object Read="+p);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
