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
public class BinaryTree {
    
    Node root;
    
    public void put(int key,Object value){
        if(value == null)
            throw new IllegalArgumentException("value can't be null");
        
        this.root = put(this.root,key,value);
    }
    
    public Node put(Node x,int key,Object value){
        

        if(x == null)
            return new Node(key,value);
        if(key < x.key){
            x.leftNode = put(x.leftNode,key,value);
        }else if(key > x.key){
            x.rightNode = put(x.rightNode,key,value);
        }else{
            x.value = value;
        }
        return x;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BinaryTree test = new BinaryTree();
        
        test.put(2, "hola");
        test.put(3, "adios");

        System.out.println("codigo");
    }
    
}
