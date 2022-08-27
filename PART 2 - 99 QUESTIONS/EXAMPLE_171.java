/**Write a program to open a notepad.*/

import java.util.*;
import java.io.*;
public class EXAMPLE_171
{
public static void main(String[]args)
{
Runtime rs=Runtime.getRuntime();
try
{
rs.exec("Notepad");
}
catch(IOException e)
{
System.out.println(e);
}
}
}
