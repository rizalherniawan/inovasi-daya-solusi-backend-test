package com.inovasi.daya.solusi.test.backend.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inovasi.daya.solusi.test.backend.dto.converter.ConverterTransactionsToTransactionsResponse;
import com.inovasi.daya.solusi.test.backend.dto.response.TransactionsResponse;
import com.inovasi.daya.solusi.test.backend.service.transactions.TransactionsService;


@RestController
@RequestMapping("v1/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionsService transactionsService;

    @Autowired
    private ConverterTransactionsToTransactionsResponse converterTransactionsToTransactionsResponse;

    
    @GetMapping
    public TransactionsResponse getAllTransaction() {
        return this.converterTransactionsToTransactionsResponse.convert(this.transactionsService.getAllTransactions());
    }
    
}
