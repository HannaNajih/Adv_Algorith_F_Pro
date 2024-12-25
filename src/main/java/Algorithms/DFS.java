/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

import com.mycompany.advanced_algorithm_project_two.MatrixGraph;
import java.util.Stack;

/**
 *
 * @author hnaji
 */
public class DFS {
    public void depthFirtsearch(MatrixGraph graph, int sratVertex){
        boolean[] visited=new boolean[graph.getVirtices()];
        Stack<Integer> stack=new Stack<>();
        stack.push(sratVertex);
        
        while(!stack.isEmpty()){
        int vertex=stack.pop();
        if(!visited[vertex]){
        visited[vertex]=true;
        System.out.print(vertex+" ");
        for(int i=0; i<graph.getVirtices();i++){
        if(graph.getAdgancecyMatrix()[vertex][i]==1&&!visited[i]){
        stack.push(i);}}
        
        }}
        
        
    }
}
