package MultiThreadingProject;

import java.io.*;

 //Function to print Fibonacci series
   class fib extends Thread

    {
     public void run()
     {
   try

{

int a=0,b=1,c=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter The Number For Series");
int n=Integer.parseInt(br.readLine());
System.out.println("Fibonacci series:");
while(n>0)
{
  System.out.println(c);
a=b;
b=c;
c=a+b;
n=n-1;
}
}
   
// Exception handle
catch(Exception e)
{
}
}
}

//Function to print reverse
class rev extends Thread
{
 public void run()
{
try
{
System.out.println("Reverse is");
for(int i=10;i>=1;i--)
System.out.println(i);
}

//Exception handle
catch(Exception e)
{
 }
}
}


class FivoRevThread
{
public static void main(String args[])
{
 try
{
  fib t1=new fib();
t1.start();
t1.sleep(5000);
rev t2=new rev();
t2.start();
}
catch(Exception e)
{
}
}
}
