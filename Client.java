package com.kgfsl.abc;
import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.PropertyConfigurator;
 



public class Client
{
   
   
static Logger l=Logger.getLogger(Client.class.getName());
public static void main(String args[])

{
    Layout l1=new SimpleLayout();
    Appender c=new ConsoleAppender(l1);
    try
    {
       Appender a=new FileAppender(l1,"my.txt",false);
        l.addAppender(a);
        l.addAppender(c);
    }
    catch(Exception e)
    {}
      l.debug("This is debug message");
      l.info("This is info message");
      l.warn("This is warn message");
      l.fatal("This is fatal message");
      l.error("This is error message");
    // l.fatal("this is error msg");
    System.out.println("executed successfully");
    
}
     
}