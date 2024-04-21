package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class ToDoState {
	protected ToDoItem item;
	
	public ToDoState (ToDoItem item) {
		this.item = item;
	}
	
	public ToDoItem getItem () {
		return item;
	}
	
	public void start() {
		
	}
	
	public void togglePause() {
		throw new RuntimeException("The ToDoItem is not in progress or paused.");
	}
	
	public void finish() {
		
	}
	
	public void addComment(String comment) {
		item.appendComment(comment);
	}
	
	public Duration workedTime() {
		return Duration.between(item.getStart(), LocalDateTime.now());
	}
}
