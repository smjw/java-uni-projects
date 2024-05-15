import java.util.*;

/**
 * Write a description of class LibraryClass here.
 *
 * Sophia
 * 04/11/21
 */
public class Library
{
    // instance variables - replace the example below with your own
    private TextBook[] bookShelf;
    private int nextAvailable;
    private int numBorrowers;

    public Library(int sizeBookShelf, TextBook book)
    {
        bookShelf = new TextBook[sizeBookShelf];
        nextAvailable = 0;
        numBorrowers = 0;
        for (int i = 0; i < bookShelf.length; i++) 
        {
            /**what i wanted to do was make it take 
             * a new arguement for each item
             * in the array but nothing i do works*/
            bookShelf[i] = book;
        }
    }

    public LibraryCard issueCard()
    {
        LibraryCard issuedCard = new LibraryCard(5, numBorrowers);
        numBorrowers++;
        return issuedCard;   
    }

    public TextBook borrowBook(LibraryCard card)
    {
        TextBook book;
        if (!card.expired() && nextAvailable != -1){
            card.swipe();
            TextBook temp;
            temp = bookShelf[nextAvailable];
            bookShelf[nextAvailable] = null;
            book = temp;
            nextAvailable--;
        } else {
            System.out.println("Card has expired/no books on shelf");
            book = null;
        }
        return book;
    }

    public void returnBook(TextBook book) 
    {
        bookShelf[nextAvailable+1] = book;
        nextAvailable++;
    }

    public void  describe()
    {
        System.out.println("The library has "+nextAvailable+" books left on the shelf and has issued "+numBorrowers+" library cards.");
    }
}
