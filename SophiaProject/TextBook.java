
/** 
 * Sophia Williams
 * 01/11/21
 */

import java.util.*;

public class TextBook
{
    private String title;
    private int length;
    private int latest;

    
    public TextBook(String booktitle, int chapters)
    {
        title = booktitle;
        length = chapters;
        latest = 0;
    }

    public String getTitle()
    {
        return title;
    }

    public void readNextChapter()
    {
        if (latest < length){
            latest++;
        } else {
            System.out.println("You've finished reading");
        }
    }
    
    public boolean isFinished()
    {
        return latest >= length;
    }
    
    public void closeBook()
    {
        latest = 0;
    }
    
    public void describe()
    {
     System.out.println(title+" with "+(length-latest)+" chapters left to read");   
    }

}
