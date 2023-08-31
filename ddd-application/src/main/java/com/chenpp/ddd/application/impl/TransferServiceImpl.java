package com.chenpp.ddd.application.impl;

import com.chenpp.ddd.application.TransferService;

import java.math.BigDecimal;

/**
 * @author April.Chen
 * @date 2023/8/31 10:02 上午
 **/
public class TransferServiceImpl implements TransferService {
    @Override
    public boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) {
        return false;
    }
}
