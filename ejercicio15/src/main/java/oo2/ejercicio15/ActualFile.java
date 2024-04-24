package oo2.ejercicio15;

import java.time.LocalDate;

public class ActualFile extends FileOO2{
	private String name;
	private String extension;
	private double size;
	private LocalDate creationDate;
	private LocalDate modificationDate;
	private int permissions;
	
	
	public ActualFile(String name, String extension, double size, LocalDate creationDate, LocalDate modificationDate,
			int permissions) {
		super();
		this.name = name;
		this.extension = extension;
		this.size = size;
		this.creationDate = creationDate;
		this.modificationDate = modificationDate;
		this.permissions = permissions;
	}
	
	public String prettyPrint() {
		return "File aspects: ";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDate getModificationDate() {
		return modificationDate;
	}
	public void setModificationDate(LocalDate modificationDate) {
		this.modificationDate = modificationDate;
	}
	public int getPermissions() {
		return permissions;
	}
	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}
}
