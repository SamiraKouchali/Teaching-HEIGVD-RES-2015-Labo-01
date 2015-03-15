package ch.heigvd.res.lab01.impl.filters;

import ch.heigvd.res.lab01.impl.Utils;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 * This class transforms the streams of character sent to the decorated writer.
 * When filter encounters a line separator, it sends it to the decorated writer.
 * It then sends the line number and a tab character, before resuming the write
 * process.
 *
 * Hello\n\World -> 1\Hello\n2\tWorld
 *
 * @author Olivier Liechti
 */
public class FileNumberingFilterWriter extends FilterWriter {
 
    private  int count = 1 ;
 // private char Char_precedent;

  private static final Logger LOG = Logger.getLogger(FileNumberingFilterWriter.class.getName());

  public FileNumberingFilterWriter(Writer out) {
    super(out);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
   // throw new UnsupportedOperationException("The student has not implemented this method yet.");
     
     String chaine = "";
     String prochain_ligne[]= Utils.getNextLine(str.substring(off, len+off));
     
     if (count ==1){
         chaine = (count++) + "\t" ;
         
     } 
     
   //  for (int i=0 ; i< prochain_ligne.length; i++)
         while ( ! prochain_ligne[0].isEmpty()){
             chaine += prochain_ligne[0] + (count++) + "/t";
            
             prochain_ligne = Utils.getNextLine(prochain_ligne[1]);
         }
         
         if ( !prochain_ligne[1].isEmpty())
             chaine +=  prochain_ligne[1];
             
         out.write(chaine);
  }
      /*     
          // System.err.println("chine :" + chaine);
           if (str.charAt(i) != '\n'){
               chaine += Character.toString(str.charAt(i)); 
         //  System.err.print( chaine);
           }else{
              
                      chaine += str.charAt(i); 
              
               // System.err.print( chaine);
             
               chainetab = (count++) + "\t" ;
               out.write(chainetab);
                      }
       }
      //chaine += count + "\t" ;
     // System.out.println( chaine);
    //  out.write(chaine);
       String nextLine[] = Utils.getNextLine(str.substring(off, off + len));
      String s = "";
      
      if(lineNumber == 1)
         s = (lineNumber++) + "\t";
      
      while(!nextLine[0].isEmpty()) {
         s += nextLine[0] + (lineNumber++) + "\t";
         nextLine = Utils.getNextLine(nextLine[1]);
      }     
      
      s += nextLine[1];
      out.write(s);
  }
*/

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
    /*
      String chaine = new String (Arrays.toString(cbuf).substring(off, len+off));
      write(chaine);
     */
      throw new UnsupportedOperationException("The student has not implemented this method yet.");
            
            }
            

  @Override
  public void write(int c) throws IOException {
    
      String chaine = Character.toString((char) c);
     if (count ==1){
      chaine += (count)+"/t";
      count++;
              }
     out.write(chaine);
  }
   
  
       //throw new UnsupportedOperationException("The student has not implemented this method yet.");
             
*/
}
}