package com.chenpp.ddd.repository.impl;

import com.chenpp.ddd.domain.entity.Account;
import com.chenpp.ddd.persistence.AccountBuilder;
import com.chenpp.ddd.persistence.AccountDO;
import com.chenpp.ddd.persistence.AccountMapper;
import com.chenpp.ddd.repository.AccountRepository;

import javax.annotation.Resource;

/**
 * @author April.Chen
 * @date 2023/8/30 7:09 下午
 **/
public class AccountRepositoryImpl implements AccountRepository {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account find() {
        AccountDO accountDO = accountMapper.findById(null).get();
        return AccountBuilder.toAccount(accountDO);
    }

    @Override
    public Account save(Account account) {
        AccountDO accountDO = AccountBuilder.fromAccount(account);
        accountMapper.saveAndFlush(accountDO);
        return AccountBuilder.toAccount(accountDO);
    }
}
