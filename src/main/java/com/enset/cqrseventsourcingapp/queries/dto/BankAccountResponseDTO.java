package com.enset.cqrseventsourcingapp.queries.dto;

import com.enset.cqrseventsourcingapp.enums.AccountStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data @AllArgsConstructor @NoArgsConstructor
public class BankAccountResponseDTO {
    private String id;
    private BigDecimal balance;
    private AccountStatus status;
}
