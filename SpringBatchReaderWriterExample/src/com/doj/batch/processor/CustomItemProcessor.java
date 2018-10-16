package com.doj.batch.processor;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author Dinesh Rajput
 *
 */

/*
To run Spring Batch application:
1. Open Run Configuration.
2. Create New instance of Java Application
3. Define Main class as : "org.springframework.batch.core.launch.support.CommandLineJobRunner"
4. In argument tab, define program argument as "simple-job.xml simpleDojJob"
5. Apply and Run.
*/

public class CustomItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String bookNameWithoutAuthor) throws Exception {
		String bookNameWithAuthor = "Book Name - "+bookNameWithoutAuthor+" | Author Name - ";
		if("Effective Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Joshua Bloch";
		}else if("Design Patterns".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Erich Gamma";
		}else if("Refactoring".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Martin Fowler";
		}else if("Head First Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Kathy Sierra";
		}else if("Thinking in Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += " Bruce Eckel";
		}
		return bookNameWithAuthor;
	}
}