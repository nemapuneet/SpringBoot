package com.puneet.Controller;

import com.puneet.Service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@SessionAttributes("name")
public class TodoController {
   @Autowired
   TodoService todoService;

   @RequestMapping(value = "/list-todos",method = RequestMethod.GET)
   public String listTodo(ModelMap model){
      model.put("todos",todoService.retrieveTodos((String)model.get("name")));
      return "todolist";
   }

   @RequestMapping(value = "/add-todo",method = RequestMethod.GET)
   public String addTodo(){
      return "addtodo";
   }

   @RequestMapping(value = "/add-todo",method = RequestMethod.POST)
   public String addTodoDetails(ModelMap model ,@RequestParam String desc, @RequestParam String date) throws ParseException {
      todoService.addTodo((String)model.get("name"),desc,new SimpleDateFormat("yyyy-MM-dd").parse(date),false);
      return "redirect:/list-todos";
   }
}
