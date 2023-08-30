package com.chenpp.ddd.repository;

import com.chenpp.ddd.domain.entity.Account;

/**
 * @author April.Chen
 * @date 2023/8/30 7:01 下午
 **/
public interface AccountRepository {

    Account find();

    Account save(Account account);
}
