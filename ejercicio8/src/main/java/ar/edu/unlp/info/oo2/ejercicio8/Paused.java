package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.LocalDateTime;

public class Paused extends ToDoState {
	public Paused (ToDoItem item) {
		super(item);
	}
	
	public void togglePause() {
		item.setState(new InProgress(item));
	}
	
	public void finish() {
		item.setState(new Finished(item));
		item.setEnd(LocalDateTime.now());
	}
}
