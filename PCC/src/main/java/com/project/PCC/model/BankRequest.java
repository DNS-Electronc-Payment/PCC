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

    private Long requestId;
    private String acquirerOrderId;
    private String acquirerTimestamp;
    private LocalDateTime sendingMoment;
    private double currentState;
    private String cardHolderName;
    private String cardPAN;
    private int cardCVC;
    private Date cardDueDate;
    private long customerId;
    private long paymentId;
    private String merchantOrderId;

}
