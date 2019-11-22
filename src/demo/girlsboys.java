package demo;

abstract class Person
{
    void Details()
    {
      System.out.println("person class");
    }
    abstract void getName();
    
}
class Girls extends Person
{
   
    void girlsname()
    {
         System.out.println("Entry the Girls name:-");
        System.out.println("Pradnya");
        System.out.println("vidya");
    }
    void getName()
    {
        System.out.println("this is a abstract method of abstract class implimented in Girls");
    }
}
class Boys extends Person
{

    void getName()
    {
        System.out.println("this is a abstract method of abstract class implimented in Boys");
    }
    void boysname()
    {
     System.out.println("Entry the Boys name :-");
    System.out.println("kiran");
    System.out.println("rahul");
    }
}

public class girlsboys {

	public static void main(String[] args) {
		Person p=new Girls();
	       p.Details();
	       p.getName();
	       Girls g=new Girls();
	       g.girlsname();

	      Person pe=new Boys();
	       p.Details();
	       p.getName();
	       Boys b=new Boys();
	       b.boysname();
		

	}

}
