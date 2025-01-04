package com.garcia.sale.application.core.usecase;

import com.garcia.sale.application.core.domain.Sale;
import com.garcia.sale.application.core.domain.enums.SaleEvent;
import com.garcia.sale.application.core.domain.enums.SaleStatus;
import com.garcia.sale.application.ports.out.SaveSaleOutputPort;
import com.garcia.sale.application.ports.out.SendCreatedSaleOutputPort;

public class CreateSaleUseCase {

    private final SaveSaleOutputPort saveSaleOutputPort;

    private final SendCreatedSaleOutputPort sendCreatedSaleOutputPort;

    public CreateSaleUseCase(SaveSaleOutputPort saveSaleOutputPort, SendCreatedSaleOutputPort sendCreatedSaleOutputPort) {
        this.saveSaleOutputPort = saveSaleOutputPort;
        this.sendCreatedSaleOutputPort = sendCreatedSaleOutputPort;
    }

    public void create(Sale sale) {
        sale.setStatus(SaleStatus.PENDENTE);
        var saleResponse = saveSaleOutputPort.save(sale);
        sendCreatedSaleOutputPort.send(saleResponse, SaleEvent.CREATED_SALE);
    }
}
