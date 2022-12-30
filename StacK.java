import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class StacK{
  public static void main(String[]args) throws IOException{
    BufferedReader br=new BufferedReader(new 
			InputStreamReader(System.in));
	System.out.println("Enter the size of the stack");
		int s=Integer.parseInt(br.readLine());
		MyStack ms=new MyStack(s);
    boolean flag=true;
    while(flag){
    System.out.println("");
    System.out.println("1. push item to the stack"); 
    System.out.println("2. pop item from the stack"); 
    System.out.println("3. Status of stack"); 
    System.out.println("4. Retrive the elements of the stack"); 
    System.out.println("5. capacity of the stack"); 
    System.out.println("6. exit"); 
    System.out.println("Enter Your choice"); 
    int choice=Integer.parseInt(br.readLine());
    int position, val;
    switch(choice){
    case 1:
           System.out.println("Enter the value you want to push"); 
           val=Integer.parseInt(br.readLine());
           ms.push(val);
           break;
    case 2:
           System.out.println(ms.pop()+" is popped from the stack");
           break;
    case 3:
		   if(s==ms.getTop()+1)
           System.out.println("The stack is full");
		   if(ms.getTop()==-1)
		   System.out.println("the stack is empty");
		   else
		   System.out.println("currently the stack has "+(ms.getTop()+1)+" elements");
           break;
    case 4:
			System.out.println("the elements present in the stack are");
		   int x=ms.getTop();
		   while(x!=-1){
           System.out.print(ms.getArr(x)+" ");
			x--;
		   }
           break;
    case 5:
           System.out.println(ms.getArrSize()+" is the capacity of the stack");
           break;
    case 6:
           flag=false;
           break;
     default:
        System.out.println("Invalid choice"); 
    }
    }
   }
}