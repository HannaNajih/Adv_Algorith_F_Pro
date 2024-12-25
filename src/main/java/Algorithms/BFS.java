/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

import com.mycompany.advanced_algorithm_project_two.ListGraph;
import com.mycompany.advanced_algorithm_project_two.MatrixGraph;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author hnaji
 */
public class BFS {
    public void breadthFirstSearch(MatrixGraph graph, int startVertex){
    
    boolean[] visited= new boolean[graph.getVirtices()];
    Queue<Integer> queue=new LinkedList<>();
    queue.add(startVertex);
    
    while(!queue.isEmpty()){
    int vertex=queue.poll();
    if(!visited[vertex]){
    visited[vertex]=true;
    System.out.print(vertex+" ");
    for(int i=0;i<graph.getVirtices();i++){
    if(graph.getAdgancecyMatrix()[vertex][i]==1&& !visited[i]){
    queue.add(i);}}
    }}
    }
    public void breadthFirstSearch(ListGraph graph, int startVertex) { 
        boolean[] visited = new boolean[graph.getVertices()];
        Queue<Integer> queue = new LinkedList<>(); 
        queue.add(startVertex); 
        while (!queue.isEmpty()) 
        { int vertex = queue.poll(); 
        if (!visited[vertex])
        { visited[vertex] = true; System.out.print(vertex + " ");
        for (int neighbor : graph.getAdgancecyMatrix().get(vertex) ){ 
        if (!visited[neighbor]) { queue.add(neighbor); } } } } }
    
}
