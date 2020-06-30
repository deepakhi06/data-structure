package com.utsav.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializationTest {
	static ThreadSafeSingleton instanceOne = ThreadSafeSingleton.getInstance();
	 
    public static void main(String[] args) {
        try {
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                    "filename.ser"));
            out.writeObject(instanceOne);
            out.close();
 
            instanceOne.setI(20);
 
            // Deserialize to a file
            ObjectInput in = new ObjectInputStream(new FileInputStream(
                    "filename.ser"));
            ThreadSafeSingleton instanceTwo = (ThreadSafeSingleton) in.readObject();
            in.close();
 
            System.out.println(instanceOne.getI());
            System.out.println(instanceTwo.getI());
 
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
