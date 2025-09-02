package encapsulation;

public class library {
    private int  borrowed_books;
    final private int MAX_BORROW = 5;

    public void borrowBook(){
        if(borrowed_books<MAX_BORROW){
            borrowed_books++;
            System.out.println("The book has borrowed and total borrowed are"+borrowed_books);
        }
        else{
            System.out.println("Can not borrow book more than 5");
        }
    }
    public void returnBook(){
        if(borrowed_books>0){
            borrowed_books--;
            System.out.println("The book has been returned");
        }
        else{
            System.out.println("No book available");
        }
    }
public int getborrowed_books(){
    return borrowed_books;
}

}
