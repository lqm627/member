package com.qm.member.controller;

import com.qm.member.model.Member;
import com.qm.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;

    @GetMapping("/home")
    public String getListaUtentiView(ModelMap map){
        map.put("name", "Spring Boot");
        return "index";
    }
    @PostMapping("save")
    @ResponseBody
    public String save(@RequestBody Member member, ModelMap map){
        try {
            member = memberService.save(member);
            map.put("member",member);
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败！";
        }
        return "添加成功！";
    }
}
