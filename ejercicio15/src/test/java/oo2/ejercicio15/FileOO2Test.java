/**
 * 
 */
package oo2.ejercicio15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileOO2Test {
	private FileOO2 file;
	private FileOO2 name;
	private FileOO2 extension;
	private FileOO2 size;
	private FileOO2 dateCreated;
	private FileOO2 dateModified;
	private FileOO2 permissions;
	
	@BeforeEach
	void setUp() throws Exception {
		this.file = new ActualFile ("The Next Best American Record", ".mp3", 10.5, LocalDate.of(2019, 8, 30), LocalDate.of(2019, 8, 30), 101);
		
	}

	@Test
	void testPrettyPrintOption1() { 
		//name - extension
		this.name = new AspectName(file);  
		this.extension = new AspectExtension(name);
		
		assertEquals("File aspects: "
				+ "\nName: The Next Best American Record"
				+ "\nExtension: .mp3",this.extension.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption2() { 
		//name - extension - date created
		this.name = new AspectName(file);  
		this.extension = new AspectExtension(name);
		this.dateCreated = new AspectCreationDate(extension);
		
		assertEquals("File aspects: "
				+ "\nName: The Next Best American Record"
				+ "\nExtension: .mp3"
				+ "\nCreation date: 2019-08-30",this.dateCreated.prettyPrint());
	}
	
	@Test
	void testPrettyPrintOption3() { 
		//permissions - name - extension - size
		this.permissions = new AspectPermissions(file);  
		this.name = new AspectName (permissions);
		this.extension = new AspectExtension(name);
		this.size = new AspectSize(extension);
		
		assertEquals("File aspects: "
				+ "\nPermissions: 101"
				+ "\nName: The Next Best American Record"
				+ "\nExtension: .mp3"
				+ "\nSize: 10.5 MB",this.size.prettyPrint());
	}
}
