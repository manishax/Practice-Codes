class MinEditDistance{


static int minimum(int x, int y, int z){
int min=x<y?x:y;
min=min<z?min:z;
return min;

}
static int editDistance(String a, String b){

int m=a.length()+1;
int n=b.length()+1;
int i,j;
int edit[][]=new int[m][n];

for(i=0;i<m;i++){
for(j=0;j<n;j++){
if(i==0 && j==0)
	edit[i][j]=0;
else if(i==0)
	edit[i][j]=j;
else if (j==0)
	edit[i][j]=i;
else
	edit[i][j]=minimum(edit[i-1][j-1]+(a.charAt(i-1)==b.charAt(j-1)?0:1), edit[i-1][j]+1, edit[i][j-1]+1);

}
}

return edit[m-1][n-1];
}


public static void main(String args[]){


String a="SATURDAY";
String b="SUNDAY";

System.out.println(editDistance(a,b));


}


}
