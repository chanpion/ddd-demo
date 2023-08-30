package com.chenpp.ddd.persistence;

import java.util.Optional;

/**
 * @author April.Chen
 * @date 2023/8/30 7:13 下午
 **/
public interface AccountMapper {
    Optional<AccountDO> findById(Long value);

    AccountDO saveAndFlush(AccountDO accountDO);
}
