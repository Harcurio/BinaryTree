/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author johor
 */
public class Node {
    
    int key;
    Object value;
    Node leftNode = null;
    Node rightNode = null;
    
    public Node(int key,Object value){
        this.key = key;
        this.value = value;

    }
    
    
}
