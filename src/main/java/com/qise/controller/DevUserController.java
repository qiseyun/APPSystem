package com.qise.controller;

import com.qise.domain.DevUser;
import com.qise.service.DevUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.misc.Request;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author jql
 * @date 2020/4/20 - 15:28
 */
@Controller
@RequestMapping(value = "/dev")
public class DevUserController {

    @Autowired
    private DevUserService devUserService;

    /**
     * 跳转到登录界面
     * @return
     */
    @RequestMapping(value="/begin")
    public String login(){
        return "devLogin";
    }

    /**
     * 开发者登陆验证
     * @param devCode
     * @param devPassword
     * @param request
     * @param session
     * @return
     */
    @RequestMapping(value = "/Login",method = RequestMethod.POST)
    public String doLogin(@RequestParam String devCode,
                          @RequestParam String devPassword,
                          HttpServletRequest request,
                          HttpSession session) {
        DevUser user=devUserService.login(devCode,devPassword);

        if (devCode.equals(user.getDevCode()) && devPassword.equals(user.getDevPassword())){
            session.setAttribute("devUserSession", user);
            //页面跳转
            return "redirect:/dev/init";
        }else {
            //页面跳转,带出提示信息
            request.setAttribute("error", "用户名或密码不正确");
            return "devLogin";
        }
    }

    /**
     * 进入开发者主页
     * @param session
     * @return
     */
    @RequestMapping(value="/init")
    public String main(HttpSession session){
        if(session.getAttribute("devUserSession") == null){
            return "redirect:/dev/login";
        }
        return "devHome/home";
    }

    /**
     * 退出登陆
     * @return
     */
    @RequestMapping(value="/over")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = (HttpSession) request.getSession();
        session.removeAttribute("devUserSession");
        return "devLogin";
    }

}
