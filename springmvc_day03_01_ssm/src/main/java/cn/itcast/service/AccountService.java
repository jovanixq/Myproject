package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();

    //增加
    void  add(Account account);
}
