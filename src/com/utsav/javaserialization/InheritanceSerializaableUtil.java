package com.utsav.javaserialization;

import java.io.File;
import java.io.IOException;

public class InheritanceSerializaableUtil {

	public static void main(String[] args) {
		File fileName = new File("c:\\ATT\\inheritanceSerialFile.txt");
		SubClass subClass = new SubClass();
		subClass.setId(10);
		subClass.setValue("Data");
		subClass.setName("Pankaj");
		
		try {
			SerializableUtil.serialize(subClass, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		try {
			SubClass subNew = (SubClass) SerializableUtil.deserialize(fileName);
			System.out.println("SubClass read = "+subNew);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
