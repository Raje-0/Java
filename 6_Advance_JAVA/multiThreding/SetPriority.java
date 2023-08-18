package multiThreding;

public class SetPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        SetPriority t1=new SetPriority();    
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY);    
        // call the run() method  
        t1.start();    
    }    
}  