package dev.me;

import dev.me.models.Address;
import dev.me.models.AddressBuilder;
import io.micronaut.runtime.Micronaut;
import org.apache.avro.Schema;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Application {

    public static void main(String[] args) throws IOException {
        //Micronaut.run(Application.class, args);
//        try {
//            Schema schema = ReflectData.get().getSchema(Salamander.class);
//            ByteArrayOutputStream out = new ByteArrayOutputStream();
//            Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
//            ReflectDatumWriter<Salamander> datumWriter = new ReflectDatumWriter<>(schema);
//
//            Salamander salamanderInstance = new Salamander("ali", List.of(List.of(List.of("now", "how", "law"), List.of("a", "b", "c"))));
//
//            datumWriter.write(salamanderInstance, encoder);
//            encoder.flush();
//
//            byte[] avroData = out.toByteArray(); // this is the serialized data
//            System.out.println("Serialized data: " + Arrays.toString(avroData));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
//class Salamander {
//    private String a;
//    private List<List<List<String>>> b;
//
//    public Salamander(String name, List<List<List<String>>> words) {
//        this.a = name;
//        this.b = words;
//    }
//}