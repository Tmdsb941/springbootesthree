package com.cs.springbootesthree.service.impl;

import com.cs.springbootesthree.dao.KaoshiDao;
import com.cs.springbootesthree.pojo.Kaoshi;
import com.cs.springbootesthree.service.KaoshiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
<<<<<<< HEAD
=======
import javax.transaction.Transactional;
>>>>>>> Initial commit
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
<<<<<<< HEAD
    public int del(int ksid) {
        return kaoshiDao.deleteByKsid(ksid);
=======
    @Transactional
    public int del(int id) {
        return kaoshiDao.deleteByKsid(id);
>>>>>>> Initial commit
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
