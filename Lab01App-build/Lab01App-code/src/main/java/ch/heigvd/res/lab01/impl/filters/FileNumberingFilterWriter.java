package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;
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

  private static final Logger LOG = Logger.getLogger(FileNumberingFilterWriter.class.getName());

  public FileNumberingFilterWriter(Writer out) {
    super(out);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
   // throw new UnsupportedOperationException("The student has not implemented this method yet.");
     
     
        String chaine= count + "\t" ;
        String chainetab;
       for (int i=off; i< len+off ; i++ ){
           
          // System.err.println("chine :" + chaine);
           if (str.charAt(i) != '\n'){
               chaine += Character.toString(str.charAt(i)); 
         //  System.err.print( chaine);
           }else{
              
               chaine += str.charAt(i); 
               out.write(chaine);
               // System.err.print( chaine);
               count++;
               chainetab = count + "\t" ;
               out.write(chainetab);
                      }
       }
      //chaine += count + "\t" ;
     // System.out.println( chaine);
    //  out.write(chaine);
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
   /* String chaine = cbuf.toString();
      write(chaine);
    /* 
    char[] chaine = null;
      int count=1;
      int j = off;
      for (int i=off; i< len + off; i++ ){
      if (cbuf[i]!= '\n'){
          chaine[j] = cbuf[i];
          j++;
      }
      else{
      count++;
      chaine[j] = (char) count;
      j++;
      chaine[j] = '\t';
              j++;
              chaine[j] = cbuf[i];
              j++;
      }
      }
      out.write(chaine);
    //
  */
      throw new UnsupportedOperationException("The student has not implemented this method yet.");
            
            }
            

  @Override
  public void write(int c) throws IOException {
    /*
      String chaine = Character.toString((char) c);
      write(chaine);
   
  */
       throw new UnsupportedOperationException("The student has not implemented this method yet.");
            } 

}
