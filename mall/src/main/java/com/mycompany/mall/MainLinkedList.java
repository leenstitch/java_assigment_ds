
package com.mycompany.mall;

import java.time.Year;

public class MainLinkedList {
    int size;
   StoreNode head,tail;
  ShoppingCartList cart;
  
public  MainLinkedList(int size,StoreNode head,ShoppingCartList cart,StoreNode tail){
    this.cart=cart;
    this.size=size;
    this.head=head;
    this.tail=tail;
    
    
}
public MainLinkedList(StoreNode head,StoreNode tail,ShoppingCartList cart) {
        this.head=head;
        this.tail=tail;
        this.cart=cart;
    }    


 MainLinkedList() {
         
     }
  


   
public void add(ItemNode j){//to add item to the cart
    int arr[]=this.searchitem(j.name,j.ID);
    ItemNode k=this.searchAndReturnItemnode(j);
    
   if(j.quantity<=arr[1]){
    k.quantity-=j.quantity;
       this.cart.additem(j);

    }
     else{
        System.out.println("we cant");
    }
    
}
public void returnn(String name,int quantity){//to return item to  the cart
   ItemNode k=this.search1ByName(name);
   k.quantity+=quantity;
  this.cart.Return(name, quantity);

}
    public void add(int storenumber,ItemNode j){//to add item to a store
         StoreNode curr=this.head;
      for(int i=0;i<this.size;i++){
          if(curr.num==storenumber){
                curr.store.additem(j);
                break;
            }
            else{
               curr=curr.next;
  }
        }
    }
    public  int[] searchitem(String name,String id){//to search item
        ShoppingCartList c=new ShoppingCartList();
         ItemNode k=null;
        int arr[]=new int[3];
        StoreNode curr=head;
        for(int i=0;i<size;i++){
 if(curr.store!=null&&Character.getNumericValue(id.charAt(0))==Character.getNumericValue(curr.store.head.ID.charAt(0)))
{
     k=curr.store.head;
    
    for(int j=0;j<curr.store.size;j++){
        if(k.name.equals(name)){
            arr[0]=Character.getNumericValue(curr.store.head.ID.charAt(0));
            arr[1]=k.quantity;
            arr[2]=0;
           return arr;
        }
        else{
            k=k.next;
        }
    }
            }
 else{
    curr=curr.next;
 }
        }
        return arr;
    }
    public ItemNode searchAndReturnItemnode(ItemNode m){//return the node in the main linkedlist //helper method
    StoreNode curr=this.head;
     ItemNode k=null;
for(int i=0;i<this.size;i++){
   k=curr.store.head;
   
   for(int j=0;j<curr.store.size;j++){
       if(m.name.equals(k.name)){
          return k;
       }
       else{
           k=k.next;
       }
   }
   curr=curr.next;
}  
return k;
    }
    public ItemNode search1ByName(String s){//helper method
      StoreNode curr=this.head;
     ItemNode k=null;
     for(int i=0;i<this.size;i++){
   k=curr.store.head;
   for(int j=0;j<curr.store.size;j++){
       if(s.equals(k.name)){
           return k;
       }
       else{
           k=k.next;
       }
   }
   curr=curr.next;
}  
return k;
    }
    public double pur(){
        double m=0;
        ItemNode j=this.cart.head;
       int n=this.cart.size;
        for(int i=0;i<n;i++){
            m+=(j.price*j.quantity);
            j=j.next;
           this.cart.deleteitem();
       }
        return m;
    }

            
                  
       
      
   }
 

