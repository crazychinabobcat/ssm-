package cn.lynx.serviceimpl;

import cn.lynx.dao.IAccountDao;
import cn.lynx.domain.Account;
import cn.lynx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao accountDao;


    //查询所有
    public List<Account> findAll() {
        System.out.println("业务层，查询所有账号");

        return accountDao.findAll();
    }


    //保存用户
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账号");
        accountDao.saveAccount(account);
    }
}
