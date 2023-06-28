//take  a matrix as input from the user search for a given number x and print the indices at which it occurs
import java.util.*;
public class search_in_2darray {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter rows:");
        int row=sc.nextInt();
        System.out.print("\nenter colums:");
        int col=sc.nextInt();
        int[][] arr=new int[row][col];
        int i,j;
        for(i=0;i<row;i++)
          for(j=0;j<col;j++)
             arr[i][j]=sc.nextInt();

        System.out.print("enter number to search");
        int x=sc.nextInt();    
        for(i=0;i<row;i++){
          for(j=0;j<col;j++){
            if(arr[i][j]==x)
            {
               System.out.print(i+" ");
               System.out.print(j+""); 
            }  
          }
        }
    } 
}
