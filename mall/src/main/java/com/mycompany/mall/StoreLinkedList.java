
package com.mycompany.mall;

public class StoreLinkedList {
      int size;
  ItemNode head,tail;  
  public  StoreLinkedList (int size,ItemNode head,ItemNode tail,int num){
      this.size=size;
      this.head=head;
      this.tail=tail;
             
  }
public StoreLinkedList(ItemNode head,ItemNode tail){
    this.head=head;
    this.tail=tail;
}
StoreLinkedList() {
    }
 
  public boolean additem(ItemNode j){//add item to the store
   if(head==null){
        head=tail=j;
          j.next=null;
          size++;
          return true;
      }
        ItemNode curr1=head;
      for(int i=0;i<this.size;i++){
          if(curr1.name.equals(j.name)){
              return false;
          }
          curr1=curr1.next;
      }
      ItemNode c=head;
      if(size==1){
          if(c.name.charAt(0)>j.name.charAt(0)){
              j.next=c;
              head=j;
              size++;
              return true;
              
          }
          else{
              c.next=j;
              tail=j;
              j.next=null;
              size++;
              return true;
                  
          }
      }
    
       int count=0;
       ItemNode curr=head;
       ItemNode pre=head;
       for(int i=0;i<this.size;i++){
          if(curr.name.charAt(0)>j.name.charAt(0)){
              if(curr.equals(this.head)){
             j.next=curr;
              this.head=j;
             this.size++;
              return true;
              
          }
              else if(count==this.size){
                  this.tail.next=j;
                  j.next=null;
                  size++;
              }
              else{
                  pre.next=j;
                  j.next=curr;
                  this.size++;
                  return true;
              }
              
          }
      else{
            if(count>0){
                if(count==this.size-1){
                     curr.next=j;
                        j.next=null;
                        this.tail=j;
                        size++;
                        return true;
               }
          curr=curr.next;
          pre=pre.next;
          count++;
          
              }
            else{
                curr=curr.next;
                count++;
            }
      }
          }
      return false;
  }
  public boolean deleteitem(String id){//to delete item from the store
      ItemNode curr=head;
      if(this.head.ID.equals(id)){
          this.head=curr.next;
          size--;
               return true;
      }
      for(int i=0;i<this.size;i++){
          if(curr.next.ID.equals(id)){
              if(i==size-2){
                  curr.next=null;
                  tail=curr;
                  size--;
                  return true;
              }
              curr.next=(curr.next.next);
              size--;
              return true;
          }
              else{
                curr=curr.next;
              }
          }
      return false;
      }
 
  public void tostring(){
    ItemNode curr1=this.head;
    for(int i=0;i<size;i++){
        System.out.print(curr1.name+" ");
        curr1=curr1.next;
    }
  }
  public boolean search(ItemNode j){//helper method to search
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

    
}
