import java.util.Scanner;

/**
 * Write a description of class day3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class math
{
   private double num1;
   private double num2;
   private String operator;
   public math(){
    this.num1 = 0;
    this.num2 =0;
    this.operator = operator;
    }
   public double add(){
    return(this.num1+this.num2);
    }
    public double subtract(){
    return(this.num1-this.num2);
    }
    public double multiply(){
    return(this.num1*this.num2);
    }
    public double divide(){
    return(this.num1/this.num2);
    }
    public double random(){
    return Math.abs((((Math.random())*(this.num1-this.num2))+this.num2));
    }
    public double calculate(){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter num1");
    this.num1=scan.nextDouble();
    System.out.println("enter num2");
    this.num2=scan.nextDouble();
    scan.nextLine();
    System.out.println("enter operator");
    this.operator=scan.nextLine();
    if(operator.equals("+")){
    return this.add();
    }
    else if(operator.equals("-")){
    return this.subtract();
    }
    else if(operator.equals("*")){
    return this.multiply();
    }
    else if(operator.equals("/")){
    return this.divide();
    }
    else if(operator.equals("r")){
    return this.random();
    }
    else{
    return 0;
    }
    }
}
