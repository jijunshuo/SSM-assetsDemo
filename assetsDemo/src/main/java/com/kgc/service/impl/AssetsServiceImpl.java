package com.kgc.service.impl;

import com.kgc.mapper.AssetsMapper;
import com.kgc.pojo.Assets;
import com.kgc.pojo.AssetsExample;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;

    @Override
    public List<Assets> selectAll(String assetid, String assettype) {
        AssetsExample example = new AssetsExample();
        AssetsExample.Criteria criteria = example.createCriteria();
        if (assetid != "" && assetid.isEmpty() == false) {
            criteria.andAssetidEqualTo(assetid);
        }
        if (assettype != "" && assettype.isEmpty() == false) {
            criteria.andAssettypeEqualTo(assettype);
        }
        List<Assets> assets = assetsMapper.selectByExample(example);
        return assets;
    }

    @Override
    public int add(Assets assets) {
        int insert = assetsMapper.insert(assets);
        return insert;
    }
}
