Java Arrays

-  Arrays are java objects

....................................................................
Declaring Array
....................................................................
int a[]= new int [5];  OR  int [] a= new int[7];
a.length  5

int a[][]=new int [3][4];
....................................................................
Initializing Array
....................................................................
int[] a= { 100, 200, 300,400, 500, 600,700, 800, 900, 1000};
........................................................................
 built-in length property to determine the size of any array
  int a[]= new int [8];
  System.out.println(a.length); // it will print 8 


.......................................................................
Example 1
Implement Linear and Binary search in java

class Search{
static boolean linearSearch(int a[],int key){
    int i=0;
    while ((i<a.length) &&(a[i]!=key))
              i++;
    if(i<a.length)
       return true;
    else
       return false;
}
static boolean binarySearch(int a[],int key){
     int low=0;
     int high=a.length;
     int mid=(low+high)/2;
     while((low<high)&&(a[mid]!=key)){
           if (key>a[mid])
               low=mid+1;
           else
               high=mid-1;
            mid=(low+high)/2;
     }
     if(low<high)
       return true;
    else
       return false;
}
}

class Test {
public static void main(String o[]){
int a[]={10,20,30,40,50};
int key=40;
if (Search.linearSearch(a,key))
      System.out.println("Found ");
else
     System.out.println(" Not Found ");

}
}
..........................................................
 Practice 2
   Matrix Class
 import java.util.*;
 class Matrix {
   int row;
   int col;
   int a[][];
  public Matrix(int r, int c){
            row=r;
            col=c;
            a=new int[row][col];
  }
  public void getValues() {
       Scanner s=new Scanner(System.in);
       for (int i=0;i<row;i++)
           for (int j=0;j<col;j++)
                 a[i][j]=s.nextInt();           
  }
  public void printValues() {
       for (int i=0;i<row;i++)
           for (int j=0;j<col;j++)
      System.out.println(a[i][j]);
  }
 public Matrix mul(Matrix p){
       Matrix c=new Matrix(row,p.col);
       if (col==p.row){
          for (int i=0;i<row;i++)
           for (int j=0;j<p.col;j++) 
               for (int k=0;k<col;k++)
c.a[i][j]=c.a[i][j]+a[i][k]*p.a[k][j];
}
return c;      
 
 } 
 }

class Test {
public static void main (String o[]){
 Matrix a=new Matrix(2,3);
 Matrix b=new Matrix(3,2);
 Matrix c=new Matrix(2,2);
 a.getValues(); 
 b.getValues(); 
 c=a.mul(b);
 c.printValues();
}
}


Jagged Array
..........................................................
   int a[][]= new [3][]
     a[0]= new int[2];
     a[1]= new int [3];
     a[2]= new int [4];









 


