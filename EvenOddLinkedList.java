/*Given a linked list arrange the nodes in alternating even odd manner*/

import java.util.*;
class EvenOddLinkedList{


public class Node{
int info;
Node next;


Node(int i){
info=i;
next=null;
}
}


public static void main(String args[]){

Scanner sc=new Scanner(System.in);
EvenOddLinkedList e=new EvenOddLinkedList();
int no=sc.nextInt();
Node head=null;
Node prev=null;
while(no--!=0){
Node n=e.new Node(sc.nextInt());
if(head==null){head=n;}
else prev.next=n;
prev=n;
}
prev=head;
Node lastEven=null;
Node lastOdd=null;
Node firstOdd=null;
while(prev!=null){
while(prev.info%2==0){
lastEven=prev;
if(prev.next!=null) prev=prev.next;
else break;
} //while 2

if(prev.next==null && lastEven==prev)
break;

while(prev.info%2!=0){//odd
if(lastOdd!=null) lastOdd.next=prev;
lastOdd=prev;
if(prev.next!=null)prev=prev.next;
else break;
}// while 3

if(prev.next==null && lastOdd==prev)
break;

//connect 
if(lastEven!=null){
if(firstOdd==null)
firstOdd=lastEven.next;
lastEven.next=lastOdd.next;
prev=lastEven.next;
} 

else{
if(firstOdd==null)
firstOdd=head;
lastEven=lastOdd.next;
head=lastEven;
prev=lastEven.next;
}
}// while 1

if(lastEven!=null && firstOdd!=null)
lastEven.next=firstOdd;

if(lastOdd!=null)
lastOdd.next=null;

prev=head;
while(prev!=null){
System.out.println(prev.info);
prev=prev.next;}
}
}
