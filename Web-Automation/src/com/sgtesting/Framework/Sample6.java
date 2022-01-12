package com.sgtesting.Framework;

public class Sample6
{
    
    static void evenOdd(int num)
    {
          if(num % 2 == 0)
          {
                System.out.println("Given number is even.");
          }
          else
          {
                System.out.println("Given number is odd.");
          }
    }

    public static void main(String args[])
    {
        
          evenOdd(123);
    }
}