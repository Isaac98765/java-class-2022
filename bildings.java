
/**
 * Write a description of class bildings here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bildings
{
   protected String coler;
   protected int age;
   public bildings(String coler,int age){
    this.coler = coler;
    this.age = age;
    }
    public String toString(){
    return(this.coler +" "+this.age);
    }
}
