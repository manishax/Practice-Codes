class PassByReferenceTest{

static void show(A b, int arr2[]){

b.var=20;
arr2[0]=4;

}

public static void main(String args[]){
A a=new A();
a.var=10;
int arr1[]={3};

System.out.println(a.var+" "+ arr1[0]);

show(a,arr1);

System.out.println(a.var+" "+arr1[0]);

}
}


class A{

int var;

}
