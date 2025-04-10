package dev.me;

import dev.me.models.Color;
import dev.me.models.Male;
import dev.me.models.Salamander;
import dev.me.models.User;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.reflect.ReflectData;
import org.apache.avro.reflect.ReflectDatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args) throws IOException {
//        Schema schema = ReflectData.get().getSchema(Salamander.class);
//        System.out.println(schema.toString());


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(out, null);
        encoder.writeInt(23);

        encoder.writeArrayStart();
        encoder.setItemCount(2);
        encoder.writeString("orange");
        encoder.writeString("blue");
        encoder.writeArrayEnd();

        encoder.writeMapStart();
        encoder.setItemCount(1);
        encoder.writeString("keyOne");
        encoder.writeString("val");
        encoder.writeMapEnd();

        encoder.writeString("foo");

        encoder.flush();

        byte[] avroBytes = out.toByteArray();
        System.out.println(Arrays.toString(avroBytes));

//        String userSchemaString = "{\n" +
//                "  \"type\": \"record\",\n" +
//                "  \"name\": \"User\",\n" +
//                "  \"fields\": [\n" +
//                "    {\"name\": \"name\", \"type\": \"string\"},\n" +
//                "    {\"name\": \"age\", \"type\": \"int\"}\n" +
//                "  ]\n" +
//                "}";
//        Schema schema = new Schema.Parser().parse(userSchemaString);
//
//        // Create a User instance
//        GenericRecordBuilder userBuilder = new GenericRecordBuilder(schema);
//        userBuilder.set("name", "John Doe");
//        userBuilder.set("age", 25);
//        GenericRecord user = userBuilder.build();
//
//        // Serialize the User instance to a byte array
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
//        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);
//
//        datumWriter.write(user, binaryEncoder);
//        binaryEncoder.flush();
//        byte[] serializedBytes = outputStream.toByteArray();
//        System.out.println(Arrays.toString(serializedBytes));

    }



}
//[46, 4, 12, 111, 114, 97, 110, 103, 101, 8, 98, 108, 117, 101, 0, 2, 12, 107, 101, 121, 79, 110, 101, 6, 118, 97, 108, 0, 6, 102, 111, 111]