package com.hai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hai.mapper.GoodsMapper;
import com.hai.pojo.Goods;
import com.hai.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	GoodsMapper goodsMapper;
     
    public List<Goods> list(){
        return goodsMapper.list();
    }
}
