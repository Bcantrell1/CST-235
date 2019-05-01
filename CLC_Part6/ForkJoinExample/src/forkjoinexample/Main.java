/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forkjoinexample;

import java.util.concurrent.ForkJoinPool;
/**
 *
 * @author Cantrell
 */
public class Main{
public static void main(String[] args) {
		ForkJoinExample myExample = new ForkJoinExample((long) 256);
		ForkJoinPool example = new ForkJoinPool();
		long mergedResult = example.invoke(myExample);
		System.out.println("Result = " + mergedResult);
    }
}