package com.cs.springbootesthree.dao;

import com.cs.springbootesthree.pojo.Kaoshi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KaoshiDao extends JpaRepository<Kaoshi, Integer> {
    Kaoshi findAllByKspwdAndKsname(String ksname,String kspwd);
    int deleteByKsid(int ksid);


}
