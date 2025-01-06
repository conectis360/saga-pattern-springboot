package com.garcia.sale.adapters.in.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleRequest {

    @NotNull
    private Long userId;

    @NotNull
    private Long productId;

    @NotNull
    private Integer quantity;

    @NotNull
    private BigDecimal value;

}
