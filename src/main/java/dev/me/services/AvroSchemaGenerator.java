package dev.me.services;


import jakarta.inject.Singleton;
import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Singleton
public class AvroSchemaGenerator {

    public String generateSchema(Class<?> clazz) {
        Schema schema = ReflectData.get().getSchema(clazz);
        try{
        File myObj = new File("/Users/alilinaboui/development/microApp/src/main/resources/person.avsc");

        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
            FileWriter myWriter = new FileWriter("/Users/alilinaboui/development/microApp/src/main/resources/person.avsc");
            myWriter.write(schema.toString(true));
            myWriter.close();
        } else {
            System.out.println("File already exists.");
        }
        }catch (
        IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return schema.toString(true);
    }
}