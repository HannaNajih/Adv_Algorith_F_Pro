/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_algorithm_project_two;

/**
 *
 * @author hnaji
 */
public class PerformanceEvaluator {
    public static long measureTime(Runnable algorithm){
        long startTime=System.nanoTime();
        algorithm.run();
        long endTime=System.nanoTime();
        return endTime-startTime;    }
    public static long meatureMemory(Runnable algorithm){
    Runtime runtime=Runtime.getRuntime();
    long beforeMemory=runtime.totalMemory()-runtime.freeMemory();
    algorithm.run();
long afterMemory=runtime.totalMemory()-runtime.freeMemory();
    return afterMemory-beforeMemory;
}
}
