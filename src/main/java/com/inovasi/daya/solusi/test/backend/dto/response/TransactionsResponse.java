package com.inovasi.daya.solusi.test.backend.dto.response;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionsResponse {
    private List<TransactionDetail> data;
    private List<Status> status;
}
