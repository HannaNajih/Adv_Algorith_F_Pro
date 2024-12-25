/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_algorithm_project_two;

/**
 *
 * @author hnaji
 */
public class MatrixGraph {
    private int[][] adjacencyMatrix;
    private int vertices;
    public MatrixGraph(int vertices){
        this.vertices= vertices;
        adjacencyMatrix=new int[vertices][vertices];
    }
    public void addEdge(int src, int dest){
    adjacencyMatrix[src][dest]=1;
    adjacencyMatrix[dest][src]=1;}
    
    public int[][] getAdgancecyMatrix(){
    return adjacencyMatrix;
    }
    public int getVirtices(){
    return vertices;}
}
