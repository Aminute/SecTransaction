package com.hai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hai.pojo.User;
import com.hai.service.UserService;
 
// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;
 
    @RequestMapping("listUser")
    public ModelAndView listUser(){
        ModelAndView mav = new ModelAndView();
        List<User> cs= userService.list();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listUser");
        return mav;
    }
    @RequestMapping("/addUser")
    public ModelAndView add(User user) throws Exception {
    	userService.add(user);
    	System.out.println("运行增加函数");
        ModelAndView mav = new ModelAndView("redirect:/listUser");
        return mav;
    }
    @RequestMapping("/login")
    public ModelAndView  login(@RequestParam("user_id") String user_id,
			@RequestParam("user_pwd") String user_pwd,Model model){
		User user = new User();
		user.setUser_id(user_id);
		user.setUser_pwd(user_pwd);
		if(userService.loginCheck(user) != null){
			//model.addAttribute("user_id",user_id);
			ModelAndView mav = new ModelAndView("redirect:/goods_sell");
			mav.addObject("user_id", user_id);
			return mav;
			//return "goods_sell";
		}
	    else{
	    	ModelAndView mav = new ModelAndView("redirect:/goods_sell");
			mav.addObject("user_id", user_id);
			return mav;
//	    	model.addAttribute("error","账号或密码错误");
//	    	return "goods_sell";
	    }
		}
    
    @RequestMapping("/index")
    public ModelAndView index() {
    	  ModelAndView mav = new ModelAndView();
          return mav;
    }
}