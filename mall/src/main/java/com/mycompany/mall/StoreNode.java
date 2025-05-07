
package com.mycompany.mall;

public class StoreNode {
   StoreLinkedList store;
    StoreNode next;
   int num;
  public  StoreNode(int num,StoreLinkedList store,StoreNode next){
       this.store=store;
       this.next=next;
       this.num=num;
   }

    StoreNode() {
    }

    StoreNode(StoreLinkedList store, StoreNode n) {
        this.store=store;
        this.next=n;
    }

    
   
}
