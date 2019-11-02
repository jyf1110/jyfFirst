package com.waysoft.work.controller;

import com.waysoft.work.pojo.User;
import com.waysoft.work.service.OrderService;
import com.waysoft.work.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/web/")
public class WorkController {
@Resource
private UserService userService;
@Resource
private OrderService orderService;
    @RequestMapping("register")
    public void toRegister(){

    }
    @RequestMapping("login1")
    public void toLogin1(){

    }
    @RequestMapping("checkUserName")
    @ResponseBody
    public String checkUserName(String name){
        User user = userService.findByAccount(name);
        String f;
        if (user == null) {
            f = "0";
        } else {
            f = "1";
        }
        return f;
    }
    @RequestMapping("checkRegister")
    public String checkRegister(User user){
        userService.insert(user);
        return "redirect:/web/login";
    }
    @RequestMapping("login")
    public void toLogin(){

    }
    @RequestMapping("index")
    public void toIndex(){

    }
    @RequestMapping("checkLogin")
    @ResponseBody
    public String checkLogin(String name,String passWord){
        User user = userService.findByNameAndpassWord(name,passWord);
        String f;
        System.out.println(user);
        if (user == null) {
            f = "0";
        } else {
            f = "1";
        }
        return f;
    }
    @RequestMapping("show")
    public void successLogin(){
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("orders",orderService.findAll());
//        return mv;
    }
//    @RequestMapping("show")
//    public ModelAndView successLogin(){
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("orders",orderService.findAll());
//        return mv;
//    }

}
