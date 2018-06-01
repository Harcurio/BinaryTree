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
    
    public void deleteMin(){
        this.root = deleteMin(this.root);
    }
    
    private Node deleteMin(Node x){
        
        Node aux = x.leftNode;
    
        if(aux.leftNode ==  null){
            x.leftNode = null;
        }else{
            deleteMin(x.leftNode);
        }
        
        return x;
    }
    
    public void deleteMax(){
        this.root = deleteMax(this.root);
    }
    
    private Node deleteMax(Node x){
        
        Node aux = x.rightNode;
    
        if(aux.rightNode ==  null){
            x.rightNode = null;
        }else{
            deleteMax(x.rightNode);
        }
        
        return x;
    }
    
    public Object get(int key){
        //regresa el objeto asociado a una key
        //en caso de no encontrar nada lanza una excepcion
        return get(this.root,key);
    }
    
    private Object get(Node x,int key){
        
        Object aux =null;
        if(x==null)
            throw new IllegalArgumentException("key not found");
        
        if(key==x.key)
            return x.value;
        
        if(key < x.key){
            aux=get(x.leftNode,key);
        }else if(key > x.key){
            aux=get(x.rightNode,key);
        }
        
        return aux;

    }
    
    public void inOrder(){
        //imprime las keys del arbol en inOrder
        inOrder(this.root);
        System.out.println("\n");
    }
    
    private void inOrder(Node x){
 
        if(x == null){
            //return;
        }else{
        inOrder(x.leftNode);
        System.out.print(x.key+", ");
        inOrder(x.rightNode);
        }
    }

    public void preOrder(){
        //imprime las keys del arbol en preOrder
        preOrder(this.root);
        System.out.println("\n");
    }
    
    private void preOrder(Node x){
    
        if(x==null){
        
        }else{
            System.out.print(x.key+", ");
            preOrder(x.leftNode);
            preOrder(x.rightNode);
        }
    
    }
    
    public void postOrder(){
        //imprime las keys del arbol en postOrder
        postOrder(this.root);
        System.out.println("\n");
    }
    
    private void postOrder(Node x){
        
        if(x==null){
        }else{
            postOrder(x.leftNode);
            postOrder(x.rightNode);
            System.out.print(x.key+", ");
        }
    }
    
    public static void main(String[] args) {
        
        BinaryTree test = new BinaryTree();
        Object aux;
        
        test.put(5, "hola");
        test.put(3, "adios");
        test.put(1, "adios");
        test.put(8, "heheheh");
        test.put(6, "adios");
        test.put(10, "test");
        
        test.inOrder();
        
        test.deleteMin();
        
        test.inOrder();
        
        test.deleteMax();
        
        test.inOrder();
        
        //aux = test.get(10);
        //System.out.println("objecto: "+(String)aux);
    }
    
}
