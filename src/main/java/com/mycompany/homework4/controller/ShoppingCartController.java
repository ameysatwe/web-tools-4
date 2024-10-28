package com.mycompany.homework4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

@Controller
@RequestMapping(value = "/cart")
public class ShoppingCartController {
    @GetMapping
    public ModelAndView showCart() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("shoppingCart");
        return mv;
    }

    @PostMapping
    public String handleCartSubmission(@RequestParam("action") String action,
                                       @RequestParam(name = "product", required = false) String[] products, HttpSession session, Model model){
        List<String> productList = new ArrayList<>();
        if (session.getAttribute("products") != null) {
            productList = new ArrayList<>(Arrays.asList((String[]) session.getAttribute("products")));
        }

        if ("add".equals(action)) {
            if (products != null) {
                productList.addAll(Arrays.asList(products));
                session.setAttribute("products", productList.toArray(new String[0]));
            }
        } else if ("remove".equals(action)) {
            if (products != null) {
                productList.removeAll(Arrays.asList(products));
                session.setAttribute("products", productList.toArray(new String[0]));
            }
        }

        model.addAttribute("products", productList);
        return "shoppingCart";
    }

}
