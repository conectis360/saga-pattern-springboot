package com.garcia.sale.config.usecase;

import com.garcia.sale.application.core.usecase.CreateSaleUseCase;
import com.garcia.sale.application.ports.out.SaveSaleOutputPort;
import com.garcia.sale.application.ports.out.SendCreatedSaleOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateSaleConfig {

    @Bean
    public CreateSaleUseCase createSaleUseCase(SaveSaleOutputPort saveSaleOutputPort, SendCreatedSaleOutputPort sendCreatedSaleOutputPort) {
        return new CreateSaleUseCase(saveSaleOutputPort, sendCreatedSaleOutputPort);
    }
}
