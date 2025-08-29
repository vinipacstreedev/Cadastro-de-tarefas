package entities;

public class Task {
	
	
	private String description;
	private boolean completed;
	
	
	
	public Task(String description) {
		this.description = description;
		this.completed = false;
	}
	
	public void conclude() {
		this.completed = true;
	}

	@Override
	public String toString() {
		return "description=" + description + ", completed" + completed;
	}
	
	

}
