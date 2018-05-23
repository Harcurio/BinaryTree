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
        //ingresa la key y el valor a ingresar en el arbol
        if(value == null)
            throw new IllegalArgumentException("value can't be null");
        
        this.root = put(this.root,key,value);
    }
    
    public Node put(Node x,int key,Object value){
        //con recursividad busca el nodo al que corresponde la nueva key
        //o actualiza el valor de una key ya existente

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
    
    public void inOrder(){
        inOrder(this.root);
    }
    
    private void inOrder(Node x){
 
        if(x == null){
            //return;
        }else{
        inOrder(x.leftNode);
        System.out.println(x.key);
        inOrder(x.rightNode);
        }
    }

    public void preOrder(){
        preOrder(this.root);
    }
    
    private void preOrder(Node x){
    
        if(x==null){
        
        }else{
            System.out.println(x.key);
            preOrder(x.leftNode);
            preOrder(x.rightNode);
        }
    
    }
    
    public void postOrder(){
        postOrder(this.root);
    }
    
    private void postOrder(Node x){
        
        if(x==null){
        }else{
            postOrder(x.leftNode);
            postOrder(x.rightNode);
            System.out.println(x.key);
        }
    }
    
    public static void main(String[] args) {
        
        BinaryTree test = new BinaryTree();
        
        test.put(5, "hola");
        test.put(3, "adios");
        test.put(1, "adios");
        test.put(8, "adios");
        test.put(6, "adios");
        test.put(10, "adios");
        
        test.postOrder();

        //System.out.println("codigo");
    }
    
}
