package com.garcia.sale.adapters.out;

import com.garcia.sale.adapters.out.repository.SaleRepository;
import com.garcia.sale.adapters.out.repository.entity.SaleEntity;
import com.garcia.sale.adapters.out.repository.mapper.SaleEntityMapper;
import com.garcia.sale.application.core.domain.Sale;
import com.garcia.sale.application.ports.out.SaveSaleOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveSaleAdapter implements SaveSaleOutputPort {

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private SaleEntityMapper saleEntityMapper;

    @Override
    public Sale save(Sale sale) {
        SaleEntity entity = saleRepository.save(saleEntityMapper.toSaleEntity(sale));
        return saleEntityMapper.toSale(entity);
    }
}
