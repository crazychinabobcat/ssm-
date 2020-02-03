package cn.lynx.dao;

import cn.lynx.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAccountDao {


    //查询所有账户信息
    @Select("select * from account")
    public List<Account> findAll();

    //保存用户的信息
    @Insert("insert into account(name,money) value(#{name},#{money})")
    public void saveAccount(Account account);

}
