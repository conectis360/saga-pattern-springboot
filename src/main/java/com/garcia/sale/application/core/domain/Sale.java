package com.garcia.sale.application.core.domain;

import com.garcia.sale.application.core.domain.enums.VendaStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    private Long id;

    private Long produtoId;

    private Long usuarioId;

    private BigDecimal valor;

    private VendaStatus status;

    private Integer quantidade;
}
