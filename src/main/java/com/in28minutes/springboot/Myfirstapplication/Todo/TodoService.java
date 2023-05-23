package com.in28minutes.springboot.Myfirstapplication.Todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


//make a to do static objects
@Service
public class TodoService {
	private static List<Todo> todos= new ArrayList<>();
	static {
		todos.add(new Todo(1, "in28 minutes", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "in28 minutes", "Learn DevOps", LocalDate.now().plusYears(2), false));
		todos.add(new Todo(3, "in28 minutes", "Learn FSE", LocalDate.now().plusYears(3), false));
	}
	public List<Todo> findByUsername(String username){
		return todos;
	}
}
