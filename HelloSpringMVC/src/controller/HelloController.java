package controller;

import entity.User;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import util.JsonUtils;

import javax.servlet.http.HttpServletResponse;
//import org.springframework.web.servlet.mvc.Controller;

@Controller
public class HelloController {

//    @Override
    @RequestMapping("/hello")
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
//        ModelAndView mav = new ModelAndView("/jsp/test/index.jsp");
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("message", "Hello Spring MVC");
        return mav;
    }

    @RequestMapping("/test")
    public ModelAndView handleRequestTest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mav = new ModelAndView("test");
        return mav;
    }

    @RequestMapping("/param")
    public ModelAndView handleRequestParam(String userName,
                                           String password, @RequestParam("alidatecode")String alidatecode, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
     // first way
      /*  String userName = httpServletRequest.getParameter("userName");
        String password = httpServletRequest.getParameter("password");
*/
      //second way same name
        //third way @RequestParam
        System.out.println(userName);
        System.out.println(password);
        return null;
    }

    @RequestMapping("/json")
//    @ResponseBody
    public void json(HttpServletResponse response){
        User user = new User();
        user.setId(1);
        user.setName("name");
        user.setPassword("password");

        JSONObject json = JSONObject.fromObject(user);
        JsonUtils.ajaxJson(json.toString(), response);

    }

    @RequestMapping("/json2")
    @ResponseBody
    public User json2(HttpServletResponse response){
        User user = new User();
        user.setId(1);
        user.setName("json2");
        user.setPassword("password");

        return user;

    }
}
