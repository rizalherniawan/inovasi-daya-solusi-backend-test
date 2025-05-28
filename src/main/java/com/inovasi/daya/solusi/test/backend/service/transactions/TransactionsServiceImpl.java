package com.inovasi.daya.solusi.test.backend.service.transactions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inovasi.daya.solusi.test.backend.model.Transactions;
import com.inovasi.daya.solusi.test.backend.repository.TransactionRepository;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transactions> getAllTransactions() {
        return transactionRepository.findAll();
    }
    
}
