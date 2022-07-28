import java.util.Scanner;
/**
 * Write a description of class dffbrtbjk here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
         boolean runing = true;
        while(runing){
        math math1 = new math(){};
        System.out.println(math1.calculate());
        System.out.println("do you whant to keepruning y for yes n for no");
        if(scan.nextLine().equals("n")){
        runing = false;
        }
        }
    }
        
        
        
    
        
        }

