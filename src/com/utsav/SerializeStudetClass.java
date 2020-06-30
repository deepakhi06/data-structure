package com.utsav;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeStudetClass {

	public static void main(String[] args) {
		
		String fileName = "D:/MyTestFile.txt";
		Student student = new Student("Aman", 22);
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
		//new SerializeStudetClass().serialize(student, fileName);
		new SerializeStudetClass().deserialize(fileName);
		System.out.println("----- After Deserialization -----");
		System.out.println("Name: " + student.getName());
		System.out.println("Age: " + student.getAge());
	}
	
	public void serialize(Student student, String fileName){
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object deserialize(String fileName){
		Student student = null;
		try(FileInputStream fis = new FileInputStream(fileName);
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			student = (Student)ois.readObject();
		}catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return student;
	}
}
