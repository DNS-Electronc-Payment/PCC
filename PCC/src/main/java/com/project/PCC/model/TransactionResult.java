package com.project.PCC.model;


import com.project.PCC.model.enums.TransactionStatus;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionResult {

    @NotEmpty(message = "Field transactionResult "+ " cannot be empty")
    private TransactionStatus transactionResult;
    @NotEmpty(message = "Field acquirerOrderId"+ " cannot be empty")
    private String acquirerOrderId;
    @NotEmpty(message = "Field acquirerTimestamp"+ " cannot be empty")
    private String acquirerTimestamp;
    @NotEmpty(message = "Field issuerOrderId"+ " cannot be empty")
    private String issuerOrderId;
    @NotEmpty(message = "Field issuerTimestamp"+ " cannot be empty")
    private String issuerTimestamp;

}
