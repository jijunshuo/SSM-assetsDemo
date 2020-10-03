package com.kgc.controller;

import com.kgc.pojo.Assets;
import com.kgc.service.AssetsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class AppController {
    @Resource
    AssetsService assetsService;

    @RequestMapping("/")
    public String index(Model model,
                        @RequestParam(value = "assetid", required = false, defaultValue = "") String assetid,
                        @RequestParam(value = "assettype", required = false, defaultValue = "") String assettype) {
        List<Assets> assets = assetsService.selectAll(assetid, assettype);
        model.addAttribute("assets", assets);
        return "index";
    }

    @RequestMapping("/toadd")
    public String toadd() {
        return "add";
    }

    @RequestMapping("/doadd")
    public String doadd(Assets assets, HttpSession session) {
        int add = assetsService.add(assets);
        if (add > 0) {
            session.setAttribute("success", "新增成功");
        } else {
            return "add";
        }

        return "redirect:/";
    }
}
