package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.LocalDateTime;

public class InProgress extends ToDoState {
	public InProgress (ToDoItem item) {
		super(item);
	}
	
	public void togglePause() {
		item.setState(new Paused(item));
	}
	
	public void finish() {
		item.setState(new Finished(item));
		item.setEnd(LocalDateTime.now());
	}
}
