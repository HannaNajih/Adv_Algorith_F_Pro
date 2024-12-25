/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.advanced_algorithm_project_two;

import Algorithms.BFS;
import Algorithms.DFS;
import Algorithms.IDS;

/**
 *
 * @author hnaji
 */
public class Advanced_Algorithm_Project_Two {

    public static void main(String[] args) {
int vertices=5;
MatrixGraph matrixGraph=new MatrixGraph(vertices);
ListGraph listGraph=new ListGraph(vertices);
matrixGraph.addEdge(0, 1); matrixGraph.addEdge(0, 4); 
matrixGraph.addEdge(1, 2); 
matrixGraph.addEdge(1, 3); 
matrixGraph.addEdge(1, 4); 
matrixGraph.addEdge(2, 3); 
matrixGraph.addEdge(3, 4); 

listGraph.addEdge(0, 1); 
listGraph.addEdge(0, 4); 
listGraph.addEdge(1, 2); 
listGraph.addEdge(1, 3); 
listGraph.addEdge(1, 4); 
listGraph.addEdge(2, 3); 
listGraph.addEdge(3, 4); 
DFS dfs = new DFS(); 
BFS bfs = new BFS(); 
IDS ids = new IDS();
    }
    
    
    
}
