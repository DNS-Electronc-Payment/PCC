package com.project.PCC.controller;


import com.project.PCC.client.APIClient;
import com.project.PCC.model.BankRequest;
import com.project.PCC.model.TransactionResult;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/pcc")
public class BankCommunicationController {

    @Autowired
    private APIClient apiClient;

    @PostMapping("/bankRequest")
    public void recieveBankRequest( @RequestBody BankRequest bankRequest){

       apiClient.forwardBankRequest(bankRequest);

    }

    @PostMapping("/transactionResult")
    public void recieveTransactionResult( @RequestBody  TransactionResult transactionResult){

       apiClient.forwardTransactionResult(transactionResult);

    }
}
