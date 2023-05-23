package com.in28minutes.springboot.Myfirstapplication.Todo;

import java.time.LocalDate;

public class Todo {
	private int id;
	private String usernameString;
	private String description;
	private LocalDate targetdate;
	private boolean done;

	public Todo(int id, String usernameString, String description, LocalDate targetdate, boolean done) {
		super();
		this.id = id;
		this.usernameString = usernameString;
		this.description = description;
		this.targetdate = targetdate;
		this.done = done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { 
		this.id = id;
	}

	public String getUsernameString() {
		return usernameString;
	}

	public void setUsernameString(String usernameString) {
		this.usernameString = usernameString;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTargetdate() {
		return targetdate;
	}

	public void setTargetdate(LocalDate targetdate) {
		this.targetdate = targetdate;
	}

	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", usernameString=" + usernameString + ", description=" + description
				+ ", targetdate=" + targetdate + ", done=" + done + "]";
	}
}
