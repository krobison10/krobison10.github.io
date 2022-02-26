import java.lang.*;
public class Activity2 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Employee fred = new Employee("Fred", 5);
        Employee fredsClone = (Employee) fred.clone();
        System.out.println(fred.toString() + fredsClone.toString());
        
    }
    
}
class Employee implements Cloneable
    {
        protected String name;
        protected int id;

        public Employee(String name, int id)
        {
            this.name = name;
            this.id = id;
        }
        @Override
        public Object clone() throws CloneNotSupportedException
        {
            return new Employee(name, id);
        }
    }
