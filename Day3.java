import java.util.Scanner;
public class Day3 {
    public static void main(String args[])
    {
        // ---------------------------- Looping Statements -----------------------

        //if we want to repeat same code repeatedly then we use loops
        //without loop program will become lengthy

        // ================================= For loop =======================

        // for loop,labled for loop: for(initi,condn,update)

        Scanner sc = new Scanner(System.in);
        //Example:Factorial
        // int value,fact=1; //fact=1 coz if 0 them multiplication 0
        // System.out.println("Enter value to find factorial:");
        // value = sc.nextInt();
        // for(int i=value;i>=1;i--)
        // {
        //     fact = fact*i;
        // }
        // System.out.println("factorial:"+fact);

        //Example:Prime Number
        //i=2,start dividing by 2
        //i<value -> not <= coz if = then remender=0 

        // ============================ while loop ====================
        //Example:Prime Number
        // int val;
        // System.out.println("Enter:");
        // val = sc.nextInt();
        // boolean flag = true;
        // int i = 2;
        // while(i<val/2)
        // {
        //     if(val%i==0)
        //     {
        //         flag = false;
        //         break;
        //     }
        //     i++;
        // }
        // if(flag==true)
        // {
        //     System.out.println("Prime");
        // }
        // else{
        //     System.out.println("Not");

        // }

        //================================ do-while loop =================
        // init;
        //do
        // {
        //     //body
        //     //update
        // }while(condn)

        //Example : print from 1 to 10
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<=10);

        // Example:Factorial
        

        //------------------------------ nested loop -----------------------
        //to represent data int matrix form (rows and columns)
        


    }
}

//--------------------------------- Assignment -----------------------------
//1. how to close infinite looping
//2. Pattern : 
// 1
// 12
// 123

//3. Pattern:
//1
//22
//333
