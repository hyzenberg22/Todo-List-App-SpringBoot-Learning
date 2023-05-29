package com.in28minutes.springboot.Myfirstapplication.Todo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	//list-todos
	
	//todo services
	
	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	private TodoService todoService;
	
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap map) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		map.addAttribute("todos", todos);
		return "listTodos";
	}
	
	
	@RequestMapping(value="add-Todo", method = RequestMethod.GET)
	public String showNewTodoPage() {
		return "todo";
	}
	@RequestMapping(value="add-Todo", method = RequestMethod.POST)
	public String addNewPage() {
		return "redirect:list-todos";
	}
}
