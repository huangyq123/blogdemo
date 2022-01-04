package com.example.myblogdemo.controller;

import com.example.myblogdemo.entity.SaleGoods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author admin
 */
@Controller
public class TestController {

    @RequestMapping("/test/type/conversion")
    public void typeConverterTest(String goodsname, float weight, int type, Boolean onscale){
        System.out.println("goosname:"+goodsname);
        System.out.println("weight:"+weight);
        System.out.println("type:"+type);
        System.out.println("onscale:"+onscale);
    }

    @RequestMapping(value = "/test/httpmessageconverter",method = RequestMethod.POST)
    @ResponseBody
    public SaleGoods httpMessageConverterTest(@RequestBody SaleGoods saleGoods){
        System.out.println(saleGoods.toString());
        saleGoods.setType(saleGoods.getType()+1);
        saleGoods.setGoodsname("商品名称："+saleGoods.getGoodsname());
        return saleGoods;
    }
}
