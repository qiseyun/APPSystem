package com.qise.interceptor;

import com.qise.domain.DevUser;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author jql
 * @date 2020/4/25 - 10:36
 */
public class DevInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        DevUser devUserSession = (DevUser) session.getAttribute("devUserSession");
        if (null!=devUserSession){
            return true;
        }else{
            response.sendRedirect(request.getContextPath()+"/403.jsp");
            return false;
        }
    }

}
