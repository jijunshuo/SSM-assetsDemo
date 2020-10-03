package com.kgc.service;

import com.kgc.pojo.Assets;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface AssetsService {
    List<Assets> selectAll(String assetid,String assettype);

    int add(Assets assets);
}
