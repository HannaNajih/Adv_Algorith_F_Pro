/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithms;

import com.mycompany.advanced_algorithm_project_two.MatrixGraph;

/**
 *
 * @author hnaji
 */
public class IDS {
    public boolean iterativeDeepningSearch(MatrixGraph graph, int startVertex,int goalVertex, int maxDepth)
    {
        for(int depth=0;depth<=maxDepth;depth++){
        if(depthLimitSearch(graph, startVertex,goalVertex, goalVertex)){
        return true;
        }
        }return false;
    }
    private boolean depthLimitSearch(MatrixGraph graph, int vertex, int goalVertex, int depth){
    if(depth==0 && vertex==goalVertex){
    return true;}
    if(depth>0){
    for(int i=0;i<graph.getVirtices();i++){
    if(graph.getAdgancecyMatrix()[vertex][i]==1){
    if(depthLimitSearch(graph, i, goalVertex, depth-1)){
    return true;}}
    }}
    return false;}
}
