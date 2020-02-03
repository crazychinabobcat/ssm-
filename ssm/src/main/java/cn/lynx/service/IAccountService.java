package cn.lynx.service;

import cn.lynx.dao.IAccountDao;
import cn.lynx.domain.Account;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAccountService {



    //查询所有账户信息
    public List<Account> findAll();

    //保存用户的信息
    public void saveAccount(Account account);
}
