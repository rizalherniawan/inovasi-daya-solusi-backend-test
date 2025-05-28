package com.inovasi.daya.solusi.test.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inovasi.daya.solusi.test.backend.model.Transactions;


public interface TransactionRepository extends JpaRepository<Transactions, Object>{

}
