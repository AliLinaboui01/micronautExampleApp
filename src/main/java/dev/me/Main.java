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