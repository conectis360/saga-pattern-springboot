package com.garcia.sale.adapters.in.controller;

import com.garcia.sale.adapters.in.controller.mapper.SaleRequestMapper;
import com.garcia.sale.adapters.in.controller.request.SaleRequest;
import com.garcia.sale.application.ports.in.CreateSaleInputPort;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1/sales")
public class SaleController {

    @Autowired
    private CreateSaleInputPort createSaleInputPort;

    @Autowired
    private SaleRequestMapper saleRequestMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createSale(@Valid @RequestBody SaleRequest saleRequest) {
        log.info("criando a venda...");

        createSaleInputPort.create(saleRequestMapper.toSale(saleRequest));

        log.info("criado com sucesso");

    }

}
