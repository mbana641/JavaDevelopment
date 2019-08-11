//----------------------------------------------------------------------------
// UseStringLog.java           by Dale/Joyce/Weems                   Chapter 2
//
// Simple example of the use of a StringLog.
//----------------------------------------------------------------------------
package edu.uwsp.lab01;

public class UseStringLog
{
  public static void main(String[] args)
  { 
    StringLogInterface sample;
    sample = new ArrayStringLog("Example Use");
    sample.insert("Callie");
    sample.insert("Megan");
    sample.insert("Dan");
    sample.insert("Jenessa");
    sample.insert("Callie");
    System.out.println(sample);
    System.out.println(sample.isEmpty());
    System.out.println(sample.smallest());
    System.out.println(sample.delete("Callie"));
    System.out.println(sample);
    System.out.println(sample.howMany("Callie"));
  }
}