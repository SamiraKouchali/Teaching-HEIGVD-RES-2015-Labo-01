package ch.heigvd.res.lab01.impl;

import java.util.logging.Logger;

/**
 *
 * @author Olivier Liechti
 */
public class Utils {

  private static final Logger LOG = Logger.getLogger(Utils.class.getName());

  /**
   * This method looks for the next new line separators (\r, \n, \r\n) to extract
   * the next line in the string passed in arguments. 
   * 
   * @param lines a string that may contain 0, 1 or more lines
   * @return an array with 2 elements; the first element is the next line with
   * the line separator, the second element is the remaining text. If the argument does not
   * contain any line separator, then the first element is an empty string.
   */
  public static String[] getNextLine(String lines) {
    //throw new UnsupportedOperationException("The student has not implemented this method yet.");
    String tab_string[] = new String[2]; 
   //  String[] str = {"", ""};
     tab_string[0]="";
      tab_string[1]="";
     
        if (lines.contains("\r")) 
            tab_string[0] += lines.split("\r")[0] + "\r";
         
        else if (lines.contains("\n")) 
           tab_string[0] += lines.split("\n")[0] + "\n";
    
        else if (lines.contains("\r\n")) 
            tab_string[0] += lines.split("\r\n")[0] + "\r\n";
        
        tab_string[1] = lines.substring(tab_string[0].length());
        return tab_string;
  
  
  }
  


}