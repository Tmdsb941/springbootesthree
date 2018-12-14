package com.cs.springbootesthree.service;

import com.cs.springbootesthree.pojo.Kaoshi;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KaoshiService {
    Kaoshi login(String ksname,String kspwd);
<<<<<<< HEAD
    int del(int ksid);
=======

    int del(int id);
>>>>>>> Initial commit
    Kaoshi ist(Kaoshi kaoshi);
    List<Kaoshi> ALL();

}
