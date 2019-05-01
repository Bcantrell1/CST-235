/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoinexample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;
/**
 *
 * @author Cantrell
 */
public class ForkJoinExample extends RecursiveTask<Long>{

    private static final long serialVersionUID = 1L;
	//Set field to store workload
	private Long work = (long) 0;
	
	public ForkJoinExample (Long work){
		this.work = work;
	}

    @Override
    protected Long compute() {      
    //Set minimum for work to be broken down into
		if (this.work > 16){
			System.out.println("Automated Split : " + this.work);

            List<ForkJoinExample> subtasks =
                new ArrayList<ForkJoinExample>();
            subtasks.addAll(createSubtasks());

            for(ForkJoinExample subtask : subtasks){
                subtask.fork();
            }

            long result = 0;
            for(ForkJoinExample subtask : subtasks) {
                result += subtask.join();
            }
            return result;
		}
		else{
			System.out.println("Automated Work: " + this.work);
            return work * 3;
		}
	}

	private List<ForkJoinExample> createSubtasks() {
        List<ForkJoinExample> subtasks = new ArrayList<ForkJoinExample>();

        ForkJoinExample subtask1 = new ForkJoinExample(this.work / 2);
        ForkJoinExample subtask2 = new ForkJoinExample(this.work / 2);

        subtasks.add(subtask1);
        subtasks.add(subtask2);

        return subtasks;
    }
}