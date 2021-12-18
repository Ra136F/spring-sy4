package com.zust.edu.controller;

import com.zust.edu.entity.user;
import com.zust.edu.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class loginController {

    @Autowired
    private userService userService;
    @RequestMapping("/login")
    public String login(String username, String psd, Model model){

        user user = userService.finduser(username, psd);
        if(user!=null){
            model.addAttribute("user",user);
            return "clogin";
        }
        model.addAttribute("msg","用户名或者密码错误");
        return "flogin";
    }

    @RequestMapping("/loginout")
    public String loginout(HttpSession session ,Model model){
        session.invalidate();
        model.addAttribute("msg","退出成功");
        return "loginout";
    }
}
