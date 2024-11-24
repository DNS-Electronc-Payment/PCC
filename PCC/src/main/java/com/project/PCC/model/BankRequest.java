package com.project.PCC.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankRequest {

    @NotEmpty(message="Field requestId "+"cannot be empty")
    private Long requestId;
    @NotEmpty(message="Field acquirerOrderId "+"cannot be empty")
    private String acquirerOrderId;
    @NotEmpty(message="Field acquirerTimestamp "+"cannot be empty")
    private String acquirerTimestamp;
    @NotEmpty(message="Field sendingMoment "+"cannot be empty")
    private LocalDateTime sendingMoment;
    @NotEmpty(message="Field currentState "+"cannot be empty")
    private double currentState;
    @NotEmpty(message="Field cardHolderName "+"cannot be empty")
    private String cardHolderName;
    @NotEmpty(message="Field cardPAN "+"cannot be empty")
    private String cardPAN;
    @NotEmpty(message="Field cardCVC "+"cannot be empty")
    private int cardCVC;
    @NotEmpty(message="Field cardDueDate "+"cannot be empty")
    private Date cardDueDate;
    @NotEmpty(message="Field customerId "+"cannot be empty")
    private long customerId;
    @NotEmpty(message="Field paymentId "+"cannot be empty")
    private long paymentId;
    @NotEmpty(message="Field merchantOrderId "+"cannot be empty")
    private String merchantOrderId;

}
