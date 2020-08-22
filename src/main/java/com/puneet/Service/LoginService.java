package com.puneet.Service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
   public Boolean validateUser(String name , String pass){
      return name.equals("Puneet") && pass.equals("nema");
   }
}
