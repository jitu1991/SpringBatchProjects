package com.dineshonjava.batch.hello;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

/**
 * 
 * @author Dinesh Rajput
 *
 */

/*
To run Spring Batch application:
1. Open Run Configuration.
2. Create New instance of Java Application
3. Define Main class as : "org.springframework.batch.core.launch.support.CommandLineJobRunner"
4. In argument tab, define program argument as "config/simpleJob.xml mySimpleJob"
5. Apply and Run.
*/


public class HelloWorldTasklet implements Tasklet {
	
	private String message;
	 
    public void setMessage(String message) {
        this.message = message;
    }
    
	@Override
	public RepeatStatus execute(StepContribution contribution, ChunkContext context)
			throws Exception {
		System.out.println(message);
		return RepeatStatus.FINISHED;
	}

}
