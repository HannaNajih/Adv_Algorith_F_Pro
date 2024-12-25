/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.advanced_algorithm_project_two;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author hnaji
 */
public class ListGraph {
    private List<List<Integer>> adjacencyList;
    private int vertices;
    public ListGraph(int vertices){
    this.vertices=vertices;
    adjacencyList=new ArrayList<>(vertices);
    for (int i=0; i<vertices;i++){
    adjacencyList.add(new LinkedList<>());}
    }
    public void addEdge(int src, int dest){
    adjacencyList.get(src).add(dest);
    adjacencyList.get(dest).add(src);
    }
    public List<List<Integer>> getadjacencyList(){return adjacencyList;}
    public int getVertices(){return vertices;}

    public Object getAdgancecyMatrix() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
