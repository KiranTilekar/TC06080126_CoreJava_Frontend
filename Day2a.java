//------------------- Assignment ------------------------------
//Assignment 1:employee detail: id,name,age,city,salary
//Assignment 2:bank details: user acc,user id,user name,cibil score
//Assignment 3:check greatest num from 5 nums , if all values are equal -> print "All values are same"
//Assignment 4:
//1. if sal>=80000 & sal<=1 lakh then bonus=10000
//2. if sal>50 & sal<80 then bonus=5000
//3.. if sal>=25 & sal<50 then bonus=2000

//  ------------------------------------- Assignment 1,4 ---------------------------
// Assignment 1:employee detail: id,name,age,city,salary

// import java.util.Scanner;

// class Main
// {
//     public static void main(String args[]) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int id,age,salary;
//         String name,city;

//         System.out.println("Enter id:");
//         id = sc.nextInt();
//         System.out.println("Enter Name:");
//         name = sc.next();
//         System.out.println("Enter age:");
//         age = sc.nextInt();
//         System.out.println("Enter city:");
//         city = sc.next();
//         System.out.println("Enter salary:");
//         salary = sc.nextInt();

//         System.out.println("--- Employee Details ---"+"\n"+"ID:"+id+"\n"+"Name:"+name+"\n"+"Age:"+age+"\n"+"City:"+city+"\n"+"Salary:"+salary);
        
//         if((salary>=80000) && (salary<=100000))
//         {
//             System.out.println("Bonus awarded:10000");
//         }
//         else if((salary>=50000) && (salary<80000))
//         {
//             System.out.println("Bonus awarded:5000");
//         }
//         else if((salary>=25000) && (salary<50000))
//         {
//             System.out.println("Bonus awarded:2000");
//         }
//         else
//         {
//             System.out.println("Better luck next time!");
//         }
//     }
// }

//----------------------------------- Assignment 2 ---------------------------
//Assignment 2:bank details: user acc,user id,user name,cibil score

// import java.util.Scanner;

// class Main
// {
//     public static void main(String args[]) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int user_acc,user_id,cibil_score;
//         String user_name;

//         System.out.println("Enter user_account:");
//         user_acc = sc.nextInt();
//         System.out.println("Enter user_id:");
//         user_id = sc.nextInt();
//         System.out.println("Enter user_name:");
//         user_name = sc.next();
//         System.out.println("Enter cibil_score:");
//         cibil_score = sc.nextInt();

//         System.out.println("--- Bank Details ---"+"\n"+"user_account:"+user_acc+"\n"+"user_ID:"+user_id+"\n"+
//                            "user_name:"+user_name+"\n"+"Cibil_score:"+cibil_score);

//     }
// }

//----------------------------------- Assignment 3 ---------------------------
//Assignment 3:check greatest num from 5 nums , if all values are equal -> print "All values are same"

// import java.util.Scanner;

// class Main
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter 5 numbers:");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = sc.nextInt();
//         int e = sc.nextInt();

//         if((a>b) && (a>c) && (a>d) && (a>e))
//         {
//             System.out.println("Greatest number is:"+a);
//         }
//         else if((b>c) && (b>d) && (b>e))
//         {
//             System.out.println("Greatest number is:"+b);
//         }
//         else if((c>d) && (c>e))
//         {
//             System.out.println("Greatest number is:"+c);
//         }
//         else if(d>e)
//         {
//             System.out.println("Greatest number is:"+d);
//         }
//         else
//         {
//             System.out.println("Greatest number is:"+e);
//         }

//     }
// }
