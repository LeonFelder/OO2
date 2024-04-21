package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDateTime;

public class Finished extends ToDoState {
	public Finished (ToDoItem item) {
		super(item);
	}
	
	public void addComment(String comment) {
		
	}
	
	public Duration workedTime() {
		return Duration.between(item.getStart(), item.getEnd());
	}
}
