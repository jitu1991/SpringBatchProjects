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
