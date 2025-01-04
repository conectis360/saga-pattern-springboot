package com.garcia.sale.application.ports.out;

import com.garcia.sale.application.core.domain.Sale;
import com.garcia.sale.application.core.domain.enums.SaleEvent;

public interface SendCreatedSaleOutputPort {

    void send(Sale sale, SaleEvent event);
}
