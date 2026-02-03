package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeStudent {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("data/student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student student = (Student) ois.readObject();

            ois.close();
            fis.close();

            System.out.println("✅ Student object deserialized successfully!");
            System.out.println("📄 Restored Data:");
            System.out.println(student);

        } catch (ClassNotFoundException e) {
            System.out.println("❌ Student class not found!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
