
/** 
 * Sophia Williams
 * 04/11/21
 */
public class LibraryCard
{
    private int limit;
    private int borrowed;
    private String cardRef;

   
    public LibraryCard(int maxBookNum, int IDNum)
    {
        limit = maxBookNum;
        cardRef = "cardID " + IDNum;
        borrowed = 0;
    }
    
    public void swipe()
    {
        borrowed = borrowed +1;
    }
    
    public boolean expired()
    {
     return borrowed >= limit;   
    }
    
    public String getCardRef()
    {
        return cardRef;
    }
    
    public void describe()
    {
        System.out.println("Library card "+cardRef+" with "+(limit-borrowed)+" books left");
    }
    
}
