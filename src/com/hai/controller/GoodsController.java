package com.hai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hai.pojo.Goods;
import com.hai.service.GoodsService;

@Controller
@RequestMapping("")
public class GoodsController {
	@Autowired
    GoodsService goodsService;
 
    @RequestMapping("goods_sell")
    public ModelAndView listUser(){
        ModelAndView mav = new ModelAndView();
        List<Goods> cs= goodsService.list();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("goods_sell");
        return mav;
    }
}
