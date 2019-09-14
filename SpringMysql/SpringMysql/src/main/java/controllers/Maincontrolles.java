package controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


public class Maincontrolles {


	    @RequestMapping("/")
	    public ModelAndView doHome() {
	        ModelAndView mv = new ModelAndView("index");
	        return mv;
	    }

}
