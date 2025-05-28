package com.inovasi.daya.solusi.test.backend.dto.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionDetail {
    private Integer id;
    private String productId;
    private Integer amount;
    private String customerName;
    private Integer status;
    private String transactionDate;
    private String createBy;
    private String createOn;
}
