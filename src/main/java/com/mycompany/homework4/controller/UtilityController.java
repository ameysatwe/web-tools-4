package com.mycompany.homework4.controller;

import com.mycompany.homework4.utility.MessageUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/utility")
public class UtilityController {

    private MessageUtility messageUtility;



    public UtilityController(MessageUtility messageUtility){
        this.messageUtility = messageUtility;
    }


    @GetMapping
    public String handleUtilityReq(Model model){
        String message = messageUtility.getMessage();
        model.addAttribute("message",message);
        System.out.println("Utility class instance: " + messageUtility.hashCode());

        return "customUtility";
    }

//    @GetMapping
//    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//        String message = messageUtility.getMessage();
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("message",message);
//        mv.setViewName("customUtility");
//        System.out.println("Utility class instance: " + messageUtility.hashCode());
//
////        return "customUtility";
//        return mv;
//    }
}
