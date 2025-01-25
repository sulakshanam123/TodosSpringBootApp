package com.udemy.springboot.myFirstWebApp.todos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class ToDoController {

    @RequestMapping("/list-todos")
    public String getToDos(ModelMap model) {
        // System.out.println("ToDoController.getToDos()" + "\n" +  ToDoService.retrieveToDos());
        model.put("todos", ToDoService.retrieveToDos());
        return "todos";
    }
}
