package com.utsav.javaserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableUtil {

	public static void main(String[] args) {
	  File fileName = new File("c:\\ATT\\serialFile.txt");
	 /* Employee emp = new Employee();
	  emp.setId(100);
	  emp.setName("Pankaj");
	  emp.setSalary(5000);
		
		//serialize to file
		try {
			SerializableUtil.serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}*/
		
		Employee empNew = null;
		try {
			empNew = (Employee) SerializableUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}

	// serialize the given object and save it to file
	public static void serialize(Object obj, File fileName)throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}
	

	// deserialize to Object from given file
	public static Object deserialize(File fileName) throws IOException,ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
}
