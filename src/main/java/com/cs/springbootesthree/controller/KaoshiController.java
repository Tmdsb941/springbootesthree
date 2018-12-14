package com.cs.springbootesthree.controller;

import com.cs.springbootesthree.pojo.Kaoshi;
import com.cs.springbootesthree.service.KaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/kaoshi")
public class KaoshiController {
    @Autowired
    KaoshiService kaoshiService;


    @RequestMapping("/All")
    public void TestAll(){
        List<Kaoshi> list=kaoshiService.ALL();
        for (Kaoshi kaoshi:list){
            System.out.println(kaoshi.toString());
        }
    }

    @RequestMapping("/Add")
    public void TestAdd(){
        Kaoshi kaoshi=new Kaoshi();
        kaoshi.setKsname("喜羊羊");
        kaoshi.setKspwd("123456");
        kaoshi.setKsrq(LocalDate.now());
        kaoshi.setKsxb(2);
        kaoshiService.ist(kaoshi);
    }

    @RequestMapping("/Del")
    public  void TestDel(){

        int de=kaoshiService.del(19);
        System.out.println(de);

            kaoshiService.del(19);

    }
}
