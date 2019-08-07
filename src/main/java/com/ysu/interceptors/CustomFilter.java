package com.ysu.filter;

import com.ysu.consts.Const;
import com.ysu.pojo.UserInfo;
import com.ysu.service.IUserService;
import com.ysu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/user/home/111")
public class CustomFilter implements Filter {


    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request=(HttpServletRequest)req;
        HttpServletResponse response=(HttpServletResponse)resp;

        HttpSession session=request.getSession();

        /**
         * 从cookie获取用户名密码
         */

        Cookie[] cookies=request.getCookies();
        UserInfo userInfo=new UserInfo();
        if(cookies!=null&&cookies.length>0)
        {
            for(Cookie c:cookies)
            {
                //c->name value
                if(c.getName().equals("username"))
                {
                    userInfo.setUsername(c.getValue());
                }
                if(c.getName().equals("password"))
                {
                    userInfo.setPassword(c.getValue());
                }
            }
        }
        if(userInfo.getUsername()!=null&&userInfo.getPassword()!=null)//根据用户名密码进行登录
        {
            IUserService userService=new UserServiceImpl();
            UserInfo loginUserInfo=userService.login(userInfo);
            if(loginUserInfo!=null)
            {
                session.setAttribute(Const.CURRENT_USER,loginUserInfo);
            }
        }
        UserInfo userInfo1=(UserInfo)session.getAttribute(Const.CURRENT_USER);
        if(userInfo1==null)
        {
            //用户未登录
            response.sendRedirect("login");
            return;
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
