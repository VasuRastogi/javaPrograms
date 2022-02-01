/* String Buffer Class */

/* The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
*
* Constructor	                 Description
* ___________                    ___________
* StringBuffer()              |	It creates an empty String buffer with the initial capacity of 16.
* StringBuffer(String str)	  | It creates a String buffer with the specified string.
* StringBuffer(int capacity)  | It creates an empty String buffer with the specified capacity as length.
* */

/*
*  Modifier and Type	                     Method	                                                        Description
*  ------------------                        -------                                                        ------------
* public synchronized StringBuffer | append(String s)	                               | It is used to append the specified string with this string. Append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.
* public synchronized StringBuffer | insert(int offset, String s)                      | It is used to insert the specified string with this string at the specified position. The insert() method is overloaded like insert(int, char), insert(int, boolean), insert(int, int), insert(int, float), insert(int, double) etc.
* public synchronized StringBuffer | replace(int startIndex, int endIndex, String str) | It is used to replace the string from specified startIndex and endIndex.
* public synchronized StringBuffer | delete(int startIndex, int endIndex)	           | It is used to delete the string from specified startIndex and endIndex.
* public synchronized StringBuffer | reverse()	                                       | is used to reverse the string.
* public int	                   | capacity()	                                       | It is used to return the current capacity.
* public void	                   | ensureCapacity(int minimumCapacity)	           | It is used to ensure the capacity at least equal to the given minimum.
* public char	                   | charAt(int index)	                               | It is used to return the character at the specified position.
* public int	                   | length()	                                       | It is used to return the length of the string i.e. total number of characters.
* public String	                   | substring(int beginIndex)	                       | It is used to return the substring from the specified beginIndex.
* public String	                   | substring(int beginIndex, int endIndex)	       | It is used to return the substring from the specified beginIndex and endIndex.
* */
package Java.LearningJava.String;

public class StringBuffer {

}
