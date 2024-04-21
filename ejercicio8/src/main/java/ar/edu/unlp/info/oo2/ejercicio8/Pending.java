package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Pending extends ToDoState {
	public Pending (ToDoItem item) {
		super(item);
	}
	
	public void start() {
		this.item.setState(new InProgress(item));
		this.item.setStart(LocalDateTime.now());
	}
	
	public Duration workedTime() {
		throw new RuntimeException("The ToDoItem has not been started.");
	}
}
