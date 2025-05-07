
package com.mycompany.mall;


import java.util.Scanner;

public class Mall {

    public static void main(String[] args) {
         MainLinkedList main=new MainLinkedList();
    Scanner n=new Scanner(System.in);

   int k=0;
   int m=4;//assume that the nuber of stores is 4
   while(k!=m){
              StoreLinkedList l=new StoreLinkedList();
               StoreNode s=new StoreNode((k+1),l,null);
               if(k==0){
                   main.head=s;
                   main.tail=s;
                   main.size++;
               }
               else{
                   main.tail.next=s;
                   main.tail=s;
                   main.size++;
               }
               System.out.println("enter num");
               int num=n.nextInt();
               for(int i=0;i<num;i++){
                  System.out.println("enter the name");
            String name=n.next();
            //item.ID=""+(i+1)+(k+1);
             System.out.println("enter the price");
             int price=n.nextInt();
             System.out.println("enter the quantity");
             int qua=n.nextInt();
            // item.storeNumber=k+1;
          ItemNode item=new ItemNode(name,""+(k+1)+(i+1),price,qua,k+1); 
               l.additem(item);
               
     }
k++;
   
}
    
ShoppingCartList c=new ShoppingCartList();
main.cart=c;
     ItemNode c1=new ItemNode("d","41",1,1,4);
     ItemNode c2=new ItemNode("c","31",1,1,3);
     ItemNode  c3=new ItemNode("a","11",1,1,1);
       ItemNode  c33=new ItemNode("aa","42",1,1,1);
     ItemNode c4=new ItemNode("b","21",1,1,2);

System.out.println("befor="+main.head.store.head.quantity);
    main.add(c1);
    main.add(c2);
    main.add(c3);
    main.add(c4);
   main.add(c33);
      System.out.println("after 1="+main.head.store.head.quantity);
   main.returnn("a",1);
   System.out.println("after 2="+main.head.store.head.quantity);
    System.out.println(main.pur());
    main.tail.store.deleteitem("42");
     main.tail.store.tostring();


    }
}






         
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     

     
     


    

