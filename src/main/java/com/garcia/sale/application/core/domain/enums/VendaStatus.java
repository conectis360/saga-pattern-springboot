package com.garcia.sale.application.core.domain.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@NoArgsConstructor
@AllArgsConstructor
public enum VendaStatus {
    PENDENTE(1L),

    FINALIZADA(2L),

    CANCELADA(3L);

    private Long statusId;

    public Long getStatusId() {
        return statusId;
    }

    public static VendaStatus toEnum(Long id) {
        if (id == null) return null;
        return Arrays.stream(VendaStatus.values())
                .filter(status -> id.equals(status.getStatusId()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Id do status não é valido: " + id));
    }
}
