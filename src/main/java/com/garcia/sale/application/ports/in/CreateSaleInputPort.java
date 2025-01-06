package com.garcia.sale.application.ports.in;

import com.garcia.sale.application.core.domain.Sale;

public interface CreateSaleInputPort {

    void create(Sale sale);

}
