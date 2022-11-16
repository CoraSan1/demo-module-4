package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TuanManh {
    @GetMapping("/tuan/manh")
    public ModelAndView tuanManh(@RequestParam String name,@RequestParam int age) {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("name",name);
        return modelAndView;
    }
}