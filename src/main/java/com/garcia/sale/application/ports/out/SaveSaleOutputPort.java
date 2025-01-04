package com.garcia.sale.application.ports.out;

import com.garcia.sale.application.core.domain.Sale;

public interface SaveSaleOutputPort {
    Sale save(Sale sale);
}
