public class ThreadDemo {
    public static void main(String[] args) throws Exception
//as join may throw exception 
{
Thread t1 = new Thread( () -> 
{
for(int i = 1 ; i<= 5 ; i++)
        {
       System.out.println("Hi");
       try
       { Thread.sleep(1000);} catch(Exception e){}
	   }
} //till here its object of runnable
,"Hi Thread");
Thread t2 = new Thread( () ->
{ 
  for(int i = 1 ; i<= 5 ; i++)    
        {
         System.out.println("Hello");
       try{ Thread.sleep(1000);} catch(Exception e) {}     
    }
} //till this brace its an object of runnable 
,"Hello thread");
t1.setPriority(Thread.MIN_PRIORITY);
t2.setPriority(Thread.MAX_PRIORITY);
System.out.println(t1.getPriority());
System.out.println(t2.getPriority());

    t1.start();
		 try
       { Thread.sleep(10);}  catch(Exception e){}
        t2.start();	
t1.join();
t2.join(); // as they may throw exception so we will use throw Exception	
System.out.println("Bye");
    }
} 