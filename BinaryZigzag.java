/*Print a binary tree in a zigzag fashion*/

import java.util.*;
public class BinaryZigzag{

public static void main(String args[]){
 int a[]=new int[] {0,1,2,3,4,5,6,7,8,9,10};
int rightIndex;
for(int l=0;l<= (int)(Math.log(a.length)/Math.log(2));l++){
if(l==(int)(Math.log(a.length)/Math.log(2)))//last level's last index may not be ideal rightmost index
{ rightIndex=a.length-1;
} else
rightIndex=(int)(2*(Math.pow(2,l)-1)); //rightmost index of level l
if(l%2==0)//even level 0,2,4,..
{ 
for(int i=(int)(Math.pow(2,l)-1);i<=rightIndex;i++){ // leftmost to rightmost index
System.out.print(a[i]);
}
} else{
for(int i=rightIndex;i>=(int)(Math.pow(2,l)-1);i--){ // rightmost to leftmost index
System.out.print(a[i]);
}
}
}

}
}

