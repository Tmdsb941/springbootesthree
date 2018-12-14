package com.cs.springbootesthree.service.impl;

import com.cs.springbootesthree.dao.KaoshiDao;
import com.cs.springbootesthree.pojo.Kaoshi;
import com.cs.springbootesthree.service.KaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class KaoshiServiceImpl implements KaoshiService {

//    @Resource
    @Autowired
    private KaoshiDao kaoshiDao;

    @Override
    public Kaoshi login(String ksname, String kspwd) {
        return kaoshiDao.findAllByKspwdAndKsname(kspwd,ksname);
    }

    @Override
    public int del(int ksid) {
        return kaoshiDao.deleteByKsid(ksid);
    }


    @Override
    public Kaoshi ist(Kaoshi kaoshi) {
        return kaoshiDao.save(kaoshi);
    }

    @Override
    public List<Kaoshi> ALL() {
        return kaoshiDao.findAll();
    }
}
