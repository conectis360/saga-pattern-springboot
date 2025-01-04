package com.garcia.sale.adapters.out.message;

import com.garcia.sale.application.core.domain.Sale;
import com.garcia.sale.application.core.domain.enums.SaleEvent;
import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleMessage {

    private Sale sale;

    private SaleEvent event;


}
