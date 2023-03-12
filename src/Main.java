import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        Library library = new Library();
    
        library.isEmptyText();
        library.insert();
        
        library.isEmptyText();
        library.insert();
        library.show();
        
        library.insert();
        library.show();
        
        library.remove(5);
        library.show();
        
        library.remove(4);
        library.show();
    }
}
