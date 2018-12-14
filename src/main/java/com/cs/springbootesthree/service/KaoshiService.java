package com.cs.springbootesthree.service;

import com.cs.springbootesthree.pojo.Kaoshi;
import org.springframework.stereotype.Service;

import java.util.List;


public interface KaoshiService {
    Kaoshi login(String ksname,String kspwd);
    int del(int ksid);
    Kaoshi ist(Kaoshi kaoshi);
    List<Kaoshi> ALL();

}
