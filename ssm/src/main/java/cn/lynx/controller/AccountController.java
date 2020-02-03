package cn.lynx.controller;

import cn.lynx.domain.Account;
import cn.lynx.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService accountService;




    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层查询所有账户信息");
        //调用Service的方法
        List<Account> list = accountService.findAll();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public String save(Account account, HttpServletResponse response, HttpServletRequest request) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/acc ount/findAll");
        return null;
    }
}
