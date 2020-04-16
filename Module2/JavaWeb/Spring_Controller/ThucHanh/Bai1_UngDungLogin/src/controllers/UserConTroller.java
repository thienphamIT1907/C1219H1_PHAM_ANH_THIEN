package controllers;

import models.Login;
import models.User;
import models.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserConTroller {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        return new ModelAndView("home", "login", new Login());
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("error");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }

}
