//----------------------------------------------------------------------
// LinkedStringLog.java       by Dale/Joyce/Weems              Chapter 2
//
// Implements StringLogInterface using a linked list 
// of LLStringNode to hold the log strings.
//----------------------------------------------------------------------

package edu.uwsp.lab01;

public class LinkedStringLog implements StringLogInterface 
{
  protected LLStringNode log; // reference to first node of linked 
                              // list that holds the StringLog strings
  protected String name;      // name of this StringLog
  protected int index = 0;
  
  public LinkedStringLog(String name)
  // Instantiates and returns a reference to an empty StringLog object 
  // with name "name".
  {
    log = null;
    this.name = name;
  }

  public void insert(String element)
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.
  {      
    LLStringNode newNode = new LLStringNode(element);
    newNode.setLink(log);
    log = newNode;
  }

  public boolean isFull()
  // Returns true if this StringLog is full, false otherwise.
  {              
    return false;
  }
  
  public int size()
  // Returns the number of Strings in this StringLog.
  {
    int count = 0;
    LLStringNode node;
    node = log;
    while (node != null)
    {
      count++;
      node = node.getLink();
    }
    return count;
  }
  
  public boolean contains(String element)
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case difference when doing string comparison.
  {                 
    LLStringNode node;
    node = log;

    while (node != null) 
    {
      if (element.equalsIgnoreCase(node.getInfo()))  // if they match
        return true;
      else
        node = node.getLink();
    }

   return false;
  }
  
  public void clear()
  // Makes this StringLog empty.
  { 
    log = null;
  }

  public String getName()
  // Returns the name of this StringLog.
  {
    return name;
  }
  
  public int howMany(String element) {
	  // Precondition: StringLog is not empty.
	  //
	  // Postcondition: Returns how many times a certain element occurs in the LinkedList.
	  int count = 0;
	  LLStringNode node = log;
	  while(node != null){
		  if(element.equalsIgnoreCase(node.getInfo())) {
			  count++;
		  }
		  node = node.getLink();
	  }  
	  return count;
  }
  
  public boolean isEmpty() { 
	  // Precondition: StringLog has been initialized.
	  //
	  // Postcondition: Returns true if the LinkedList is empty, otherwise returns false.
	  	return (this.size()==0);
	}
  
  public String smallest() {
	  // Precondition: StringLog is not empty.
	  //
	  // Postcondition: Returns the smallest element in the LinkedList
	  LLStringNode node = log;
	  String smallest = node.getInfo();
	  while(node != null){
		  if(node.getInfo().compareTo(smallest) < 0) {
			  smallest = node.getInfo();
		  }
		  node = node.getLink();
	  }
	  return smallest;
	}
  
  public boolean delete(String element){
	  // Precondition: StringLog is not empty.
	  //
	  // Postcondition: Deletes the first occurrence of an element in the LinkedList.
	  return false;
	}
  
  public String toString()
  // Returns a nicely formatted string representing this StringLog.
  {
    String logString = "Log: " + name + "\n\n";
    LLStringNode node;
    node = log;
    int count = 0;
    
    while (node != null)
    {
      count++;
      logString = logString + count + ". " + node.getInfo() + "\n";
      node = node.getLink();
    }
      
    return logString;
  }
}