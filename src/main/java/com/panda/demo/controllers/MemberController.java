package com.panda.demo.controllers;

import com.panda.demo.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @RequestMapping(value = "/members", method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("member save...");
        return "{'module':'save'}";
    }

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    @ResponseBody
    public String getMembers() {
        System.out.println("member list...");
        return "{'module':'list'}";
    }

    @RequestMapping(value = "/members/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getMember(@PathVariable Integer id) {
        System.out.println("member item..." + id);
        return "{'module':'item'}";
    }

    @RequestMapping(value = "/members", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody Member member) {
        System.out.println("member update..." + member);
        return "{'module':'put'}";
    }

    @RequestMapping(value = "/members/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable Integer id) {
        System.out.println("member delete..." + id);
        return "{'module':'delete'}";
    }
}
