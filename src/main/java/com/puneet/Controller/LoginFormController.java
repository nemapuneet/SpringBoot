package com.puneet.Controller;

import com.puneet.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.EnumSet;

@Controller
@SessionAttributes("name")
public class LoginFormController {
   @Autowired
   LoginService service;

   @RequestMapping(value = "/form",method = RequestMethod.GET)
   public String loginMessage(){
      return "loginform";
   }
   @RequestMapping(value = "/form",method = RequestMethod.POST)
   public String welcomeMessage(@RequestParam String name, @RequestParam String pass, ModelMap model){
      System.out.println(name+pass);
      if(!service.validateUser(name,pass)){
         return "loginform";
      }
      model.put("name",name);
      return "welcome";
   }
}
