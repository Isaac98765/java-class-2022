import java.util.Scanner;
public class day1
{
public static void main(String[] args)
{
   Scanner scan = new Scanner(System.in);
   boolean userCorect = true;
   boolean passwordCorect = true;
   int age;
   String name;
   System.out.println("enter your username");
   name = scan.nextLine();
   System.out.println("hi " + name);
   System.out.println("please enter a new password");

String password;
scan.nextLine();
password = scan.nextLine();
System.out.println(password + " is your new password how old are you");
scan.nextLine();
   if(scan.nextInt() >= 13){
       while(passwordCorect){ 
            System.out.println("enter your user");
        scan.nextLine();
        if(scan.nextLine().equals(name)){
            System.out.println("corect");
            userCorect = false;
           System.out.println("enter your password");
        scan.nextLine();
        if(scan.nextLine().equals(password)){
            System.out.println("corect");
            passwordCorect = false;
        }
        }
    }}
else{
System.out.println("you are too young");
}

}}
