

import java.util.Scanner;


public class Sorting {

    public static void main(String[] args) {
       

        System.out.println("Enter the number of elements in the array");
        /*To keep a track on size of array*/
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b[]=new int[a];
        /*Initializing the array*/
        System.out.println("Enter the elements in the array");
        for(int i=0;i<a;i++)
        {
           b[i]=sc.nextInt();
        }
        SelectionSort(b, a); 
        /*Calling the Selection Sort algorithm*/
        
    }
    public static void SelectionSort(int b[],int a)
    {
        for(int i=0;i<a-1;i++)
        {
            int com=i;
            /*One by one each element of the array will be initialized to com*/
            for(int j=i+1;j<a;j++)
            {
                if(b[j]<b[com])
                    /*one by one each element of the array will be compared with com*/
                {
                    int temp=b[com];
                    b[com]=b[j];
                    b[j]=temp;
                    /*If the com turns out to be bigger than the element then they will be swapped*/
                    
                }
                
                
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("The sorted elements are:");
        for(int i=0;i<a;i++)
        {
            System.out.println("Elements after selection sort:" +b[i]);
            /*Sorted elements are printed*/
        }
        System.out.println("Enter the number of smallest elements needed");
        /*Enter the number of starting elements you want to print*/
        int k=sc.nextInt();
        for(int i=0;i<k;i++)
        {
            System.out.println("first k smallest elements are:" +b[i]);
            /*Printing the elements*/
            
        }
        
        int c[]=new int[k];
        
        for( int i=0;i<k;i++)
        {
            c[i]=b[i];
            
        }
        float m;
        /*initializing the variable for median*/
        if(k%2==0)
        {
            m = (float) ((c[k/2] + c[(k/2) - 1])/2.0);
            /*if the number of elements is even use this formula for median*/
        }
        else
        {
              m =  c[k/2];
              /*formula for finding the median when number of elements are odd*/
        }
        System.out.println("Median is:" +m);
        /*Printing the median*/
}
}

    

