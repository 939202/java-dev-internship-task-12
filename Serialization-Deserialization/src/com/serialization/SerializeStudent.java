package com.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeStudent {

    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Pavan Teja",
                "Data Science",
                "secret123"
        );

        try {
            FileOutputStream fos = new FileOutputStream("data/student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
            fos.close();

            System.out.println("✅ Student object serialized successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
