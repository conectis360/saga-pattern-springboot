package com.garcia.sale.adapters.in.controller.mapper;

import com.garcia.sale.adapters.in.controller.request.SaleRequest;
import com.garcia.sale.application.core.domain.Sale;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SaleRequestMapper {
    Sale toSale(SaleRequest saleRequest);
}
