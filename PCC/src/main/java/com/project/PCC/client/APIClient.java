package com.project.PCC.client;

import com.project.PCC.model.BankRequest;
import com.project.PCC.model.TransactionResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class APIClient {

    @Autowired
    private RestTemplate restTemplate;

    public void forwardBankRequest(BankRequest bankRequest){
        System.out.println(bankRequest);
        String url = "https://localhost:8082/api/bankAccount/send-bank-request";

        restTemplate.postForEntity(url, bankRequest, Void.class);

        System.out.println("request  sent to Bank service.");
    }

    public void forwardTransactionResult(TransactionResult transactionResult){

        System.out.println(transactionResult);
        String url = "https://localhost:8082/api/bankAccount/send-transaction-result";

        restTemplate.postForEntity(url, transactionResult, Void.class);

        System.out.println("transactionResult  sent to Bank service.");
    }
}
