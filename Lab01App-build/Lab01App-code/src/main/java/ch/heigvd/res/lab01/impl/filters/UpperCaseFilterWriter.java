package ch.heigvd.res.lab01.impl.filters;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/**
 *
 * @author Olivier Liechti
 */
public class UpperCaseFilterWriter extends FilterWriter {
  
  public UpperCaseFilterWriter(Writer wrappedWriter) {
    super(wrappedWriter);
  }

  @Override
  public void write(String str, int off, int len) throws IOException {
      for (int indice = off; indice < len + off ; indice++){
     
      write(str.charAt(indice));
      }
     
   // throw new UnsupportedOperationException("The student has not implemented this method yet.");
  }

  @Override
  public void write(char[] cbuf, int off, int len) throws IOException {
       for (int indice = off; indice < len + off ; indice++){
       write(cbuf[indice]);
       }
      //throw new UnsupportedOperationException("The student has not implemented this method yet.");
  }

  @Override
    public void write(int c) throws IOException {
        if (Character.isLowerCase(c)) {
            c = Character.toUpperCase(c);
        }
        out.write(c);
        //throw new UnsupportedOperationException("The student has not implemented this method yet.");
    }

}
