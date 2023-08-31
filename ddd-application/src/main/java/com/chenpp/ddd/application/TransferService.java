package com.chenpp.ddd.application;

import java.math.BigDecimal;

/**
 * @author April.Chen
 * @date 2023/8/31 9:57 上午
 **/
public interface TransferService {

    boolean transfer(Long sourceUserId, String targetAccountNumber, BigDecimal targetAmount, String targetCurrency) ;
}
