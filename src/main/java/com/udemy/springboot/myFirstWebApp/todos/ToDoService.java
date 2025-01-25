package com.udemy.springboot.myFirstWebApp.todos;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoService {

    private static List<ToDo> toDoList = new ArrayList<>();

    public static List<ToDo> retrieveToDos() {
        toDoList.add(new ToDo(1, "Swami", "Learn Spring MVC", LocalDate.now(), false));
        toDoList.add(new ToDo(2, "in28minutes", "Learn Spring",  LocalDate.now().plusMonths(2), false));
        toDoList.add(new ToDo(3, "Sulu", "Learn Java", LocalDate.now().plusMonths(5), false));
        toDoList.add(new ToDo(4, "Mahendra", "Learn Devops", LocalDate.now().plusMonths(1), false));
        return toDoList;
    }

}
