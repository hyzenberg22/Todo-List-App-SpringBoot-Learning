package com.in28minutes.springboot.Myfirstapplication.Todo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	// list-todos

	// todo services

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}

	private TodoService todoService;

	// This is to show the list of the todos
	@RequestMapping("list-todos")
	public String listAllTodos(ModelMap map) {
		List<Todo> todos = todoService.findByUsername("in28minutes");
		map.addAttribute("todos", todos);
		return "listTodos";
	}

	// This is the get method to fetch the to do list
	@RequestMapping(value = "add-Todo", method = RequestMethod.GET)
	public String showNewTodoPage(ModelMap model) {
		String username = (String) model.get("name");
		Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
		model.put("todo", todo);
		return "todo";

	}

	// This is the for the post methode after adding the to do inthe list
	@RequestMapping(value = "add-Todo", method = RequestMethod.POST)
	public String addNewPage(ModelMap map, @Valid Todo todo, BindingResult result) {
		if (result.hasErrors()) {
			return "todo";
		}

		String username = (String) map.get("name");
		todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}

	// delete Todo
	@RequestMapping("delete-todo")
	public String deleteTodo(@RequestParam int id) {
		todoService.deleteById(id);
		return "redirect:list-todos";
	}

	// Update Todo only the get request
	@RequestMapping(value="update-todo", method = RequestMethod.GET)
	public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
		Todo todo = todoService.findById(id);
		model.addAttribute("todo", todo);
		return "todo";
	}
	// Update Todo only the post request
	@RequestMapping(value = "update-todo", method = RequestMethod.POST)
	public String updateTodo(ModelMap map, @Valid Todo todo, BindingResult result) {
		
		if (result.hasErrors()) {
			return "todo";
		}

		String username = (String)map.get("name");
		todo.setUsernameString(username);
		todoService.updateTodo(todo);
		return "redirect:list-todos";
	}

}
