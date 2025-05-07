
package com.mycompany.mall;

public class ShoppingCartList {
   int size;
   ItemNode head,tail;

    ShoppingCartList() {
    }


  
  public ShoppingCartList (int size,ItemNode head,ItemNode tail){
      this.size=size;
      this.head=head;
      this.tail=tail;
              
  }
  
 
  public void additem(ItemNode j){//to add item to cart
      if(head==null){
           head=tail=j;
       j.next=null;
        size++;
      }
      else{
          tail.next=j;
          tail=j;
          j.next=null;
          size++;
      }
 }
  public void tostring(){
      
    ItemNode curr1=this.head;
    for(int i=0;i<size;i++){
        System.out.println(curr1.name);
        curr1=curr1.next;
    }
  }
   public boolean searhitem(ItemNode j){
    ItemNode curr=this.head;
      for(int i=0;i<size;i++){
        if(curr.name.equals(j.name)){
           return false; 
        }
        else{
            curr=curr.next;
        }
          
      }
      return true;
  }
   public ItemNode search(String s){//helper method
       ItemNode curr=this.head;
          for(int i=0;i<this.size;i++){
            if(s.equals(curr.name)){
                return curr;
            }
            else{
          curr=curr.next;
        }
        }
        
        return curr;
   }
   public void Return(String name,int quantity){//to return an  item
  ItemNode m= this.search(name);
  m.quantity-=quantity;
   }
   public void deleteitem(){
      ItemNode curr=head;
     head=curr.next;
     size--;
      
   }
}
