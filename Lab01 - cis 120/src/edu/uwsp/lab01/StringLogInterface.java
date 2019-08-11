//----------------------------------------------------------------------
// StringLogInterface.java     by Dale/Joyce/Weems             Chapter 2
//
// Interface for a class that implements a log of Strings.
// A log "remembers" the elements placed into it.
//
// A log must have a "name".
//----------------------------------------------------------------------

package edu.uwsp.lab01;

public interface StringLogInterface
{
  void insert(String element);
  // Precondition:   This StringLog is not full.
  // 
  // Places element into this StringLog.

  boolean isFull();
  // Returns true if this StringLog is full, otherwise returns false.

  int size();
  // Returns the number of Strings in this StringLog.

  boolean contains(String element);
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case differences when doing string comparison.
  
  void clear();
  // Makes this StringLog empty.

  String getName();
  // Returns the name of this StringLog.
  
  int howMany(String element);
  // Returns how many times an element is in the StringLog.
  
  boolean isEmpty();
  // Returns true if StringLog is empty, otherwise returns false.
  
  String smallest();
  // Returns the smallest String in StringLog.
  
  boolean delete(String element);
  // Returns true or false for whether the element was deleted (first occurrence).

  String toString();
  // Returns a nicely formatted string representing this StringLog.
}
