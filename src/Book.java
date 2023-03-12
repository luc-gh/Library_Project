public class Book {
    public String name;
    public Integer id;
    public Book previous;
    public Book next;
    
    public Book(String name, Integer id){
        this.name = name;
        this.id = id;
        this.previous = null;
        this.next = null;
    }
}
