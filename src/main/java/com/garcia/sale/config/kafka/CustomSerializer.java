package com.garcia.sale.config.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.garcia.sale.adapters.out.message.SaleMessage;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.serialization.Serializer;

public class CustomSerializer implements Serializer<SaleMessage> {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public byte[] serialize(String s, SaleMessage saleMessage) {
        try {
            if (saleMessage == null) {
                return null;
            }
            return objectMapper.writeValueAsBytes(saleMessage);
        } catch (Exception e) {
            throw new SerializationException("Erro ao serializar SaleMessage para byte[]");
        }
    }

}
