package cn.lynx.test;

import cn.lynx.dao.IAccountDao;
import cn.lynx.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    @Test
    public void run() throws Exception{
        //加载配置文件
      InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
      //创建sqlSessionFactory
        SqlSessionFactory factory =  new SqlSessionFactoryBuilder().build(in);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取代理对象
        IAccountDao dao = sqlSession.getMapper(IAccountDao.class);
        //查询所有数据
        List<Account> list = dao.findAll();
        for (Account account: list){
            System.out.println(account);
        }
        //关闭资源
        sqlSession.close();
        in.close();
    }
}
