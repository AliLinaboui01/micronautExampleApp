package dev.me;

import org.apache.avro.Conversions;
import org.apache.avro.LogicalTypes;
import org.apache.avro.Schema;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.EncoderFactory;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        Schema decimalSchema = LogicalTypes.decimal(10, 4)
                .addToSchema(Schema.create(Schema.Type.BYTES));

        BigDecimal bd = new BigDecimal("12.1232");

        Conversions.DecimalConversion conversion = new Conversions.DecimalConversion();
        ByteBuffer byteBuffer = conversion.toBytes(bd, decimalSchema, decimalSchema.getLogicalType());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BinaryEncoder encoder = EncoderFactory.get().binaryEncoder(outputStream, null);

        encoder.writeBytes(byteBuffer);
        encoder.writeFloat(12.1f);
        encoder.flush();

        byte[] avroData = outputStream.toByteArray();
        System.out.println("Avro API Serialized data: " + Arrays.toString(avroData));
    }
}
/*
* try {
            Schema schema = ReflectData.get().getSchema(Salamander.class);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            Encoder encoder = EncoderFactory.get().binaryEncoder(out, null);
            ReflectDatumWriter<Salamander> datumWriter = new ReflectDatumWriter<>(schema);

            Salamander salamanderInstance = new Salamander(
                    "ali",
                    23,
                    Color.BLUE,
                    List.of(List.of("test1")),
                    new BigDecimal("23.122"),
                    Map.of("key1", Map.of("key1", "val1")),
                    12.1f,
                    new UUID(2,6),
                    true,
                    new BigInteger("123453322"),
                    'a'
            ); // create and set properties of Salamander instance

            datumWriter.write(salamanderInstance, encoder);
            encoder.flush();

            byte[] avroData = out.toByteArray(); // this is the serialized data
            System.out.println("Serialized data: " + Arrays.toString(avroData));

        } catch (Exception e) {
            e.printStackTrace();
        }


        Schema schema = ReflectData.get().getSchema(Salamander.class);
        System.out.println(schema.toString());


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

        String userSchemaString = "{\n" +
                "  \"type\": \"record\",\n" +
                "  \"name\": \"User\",\n" +
                "  \"fields\": [\n" +
                "    {\"name\": \"name\", \"type\": \"string\"},\n" +
                "    {\"name\": \"age\", \"type\": \"int\"}\n" +
                "  ]\n" +
                "}";
        //Schema schema = new Schema.Parser().parse(userSchemaString);

        // Create a User instance
        GenericRecordBuilder userBuilder = new GenericRecordBuilder(schema);
        userBuilder.set("name", "John Doe");
        userBuilder.set("age", 25);
        GenericRecord user = userBuilder.build();

        // Serialize the User instance to a byte array
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
        DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(schema);

        datumWriter.write(user, binaryEncoder);
        binaryEncoder.flush();
        byte[] serializedBytes = outputStream.toByteArray();
        System.out.println(Arrays.toString(serializedBytes));

    }
* */