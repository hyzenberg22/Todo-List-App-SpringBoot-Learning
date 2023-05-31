package com.in28minutes.springboot.Myfirstapplication.Todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public String showNewTodoPage(ModelMap model) {
		String username = (String)model.get("name");
		Todo todo = new Todo(0, username, "" ,LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";
		
	}
	
	
	@RequestMapping(value="add-Todo", method = RequestMethod.POST)
	public String addNewPage(ModelMap map, Todo todo) {
		String username = (String)map.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
}
