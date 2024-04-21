package ar.edu.unlp.info.oo2.ejercicio8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

public class ToDoItem {
	private ToDoState state;
	private String name;
	private List<String> comments;
	private LocalDateTime start;
	private LocalDateTime end;
	
	public ToDoItem(String name) {
		this.name = name;
		comments = new ArrayList<>();
		state = new Pending(this);
	}
	
	public void start() {
		state.start();
	}
	
	public void togglePause() {
		state.togglePause();
	}
	        
	public void setState (ToDoState state) {
		this.state = state;
	}
	
	public void appendComment (String comment) {
		comments.add(comment);
	}
	
	public void finish() {
		state.finish();
	}
	
	public void addComment(String comment) {
		state.addComment(comment);
	}
	
	public Duration workedTime() {
		return state.workedTime();
	}
	
	public LocalDateTime getStart () {
		return start;
	}
	
	public LocalDateTime getEnd () {
		return end;
	}
	
	public void setEnd (LocalDateTime end) {
		this.end = end;
	}
	
	public void setStart (LocalDateTime start) {
		this.start = start;
	}
}
