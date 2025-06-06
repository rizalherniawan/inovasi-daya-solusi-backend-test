package com.inovasi.daya.solusi.test.backend.dto.converter;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.stereotype.Service;

import com.inovasi.daya.solusi.test.backend.dto.response.Status;
import com.inovasi.daya.solusi.test.backend.dto.response.TransactionDetail;
import com.inovasi.daya.solusi.test.backend.dto.response.TransactionsResponse;
import com.inovasi.daya.solusi.test.backend.model.Transactions;

@Service
public class ConverterTransactionsToTransactionsResponse implements Converter<List<Transactions>, TransactionsResponse> {

    @Override
    public TransactionsResponse convert(List<Transactions> source) {

        // Initialize response object
        TransactionsResponse response = new TransactionsResponse();

        // Initialize date formater for output
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        // Set response data
        response.setData(source.stream()
                .map(transaction -> {
                    TransactionDetail detail = new TransactionDetail();
                    detail.setId(transaction.getId());  
                    detail.setAmount(transaction.getQuantity());
                    detail.setTransactionDate(outputFormat.format(transaction.getTransactionDate()));
                    detail.setCustomerName(transaction.getCustomer().getName());
                    detail.setProductId(transaction.getProduct().getId());
                    detail.setStatus(transaction.getStatus());
                    detail.setCreateOn(outputFormat.format(transaction.getCreatedAt()));
                    detail.setCreateBy(transaction.getCreatedBy());
                    return detail;
                })
                .toList());
        
        // Set response status
        response.setStatus(getStatuses());
        
        return response;
    }

    private List<Status> getStatuses() {
        // Logic to retrieve statuses
        return List.of(
            new Status(0, "SUCCESS"),
            new Status(1, "FAILED")
        );
    }
    
}
