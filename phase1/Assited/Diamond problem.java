public class Diamondproblem implements class1, class2  
{  
public void output()   
{  
class1.super.output();  
class2.super.output();  
}  
public static void main(String args[])   
{  
Diamondproblem obj = new Diamondproblem();  
obj.output();  
}  
}

interface class1  
{  
public default void output()   
{  
System.out.println("the output() method of DemoInterface1 invoked");  
}  
}  
interface class2  
{  
public default void output()   
{  
System.out.println("the output() method of DemoInterface2 invoked");  
}  
}  
	
