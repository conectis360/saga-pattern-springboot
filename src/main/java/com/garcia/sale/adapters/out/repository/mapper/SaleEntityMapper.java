package com.garcia.sale.adapters.out.repository.mapper;

import com.garcia.sale.adapters.out.repository.entity.SaleEntity;
import com.garcia.sale.application.core.domain.Sale;
import com.garcia.sale.application.core.domain.enums.SaleStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface SaleEntityMapper {


    @Mapping(source = "status", target = "statusId", qualifiedByName = "setStatusId")
    SaleEntity toSaleEntity(Sale sale);

    @Mapping(source = "statusId", target = "status", qualifiedByName = "setStatus")
    Sale toSale(SaleEntity entity);

    @Named("setStatusId")
    default Long setStatusId(SaleStatus status) {
        return status.getStatusId();
    }

    @Named("setStatus")
    default SaleStatus setStatusId(Long status) {
        return SaleStatus.toEnum(status);
    }
}
