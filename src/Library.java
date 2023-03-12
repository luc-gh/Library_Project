import java.util.Objects;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Library {
    public Book first;
    public Book last;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public Library(){
        this.first = null;
        this.last = null;
    }
    
    public boolean isEmpty(){
        return this.first == null;
    }
    
    public void isEmptyText(){
        if (this.isEmpty()) System.out.println("Não há livros na biblioteca.");
        else System.out.println("A biblioteca tem " + this.length() + " livros.");
    }
    
    public int length(){
        if(this.isEmpty()){
            return 0;
        }
        
        Book n = this.first;
        int x = 0;
        
        while(n != null){
            x += 1;
            n = n.next;
        }
        
        return x;
    }
    
    public boolean existenceId(Integer id) {
        Book current = this.first;
        while(current != null) {
            if(Objects.equals(current.id, id)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public void insert() throws IOException{
        Book book;
        
        String s = "";
        Integer i = -1;
        
        try{
            System.out.print("\n - Digite o nome do livro: ");
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try{
            System.out.print(" - Digite a ID do livro: ");
            i = Integer.parseInt(br.readLine());
            if(this.existenceId(i)) {
                System.out.println("Já existe um livro com esse ID.");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Número inválido.");
            return;
        }
        
        book = new Book(s,i);
        System.out.println("Criação do novo livro -- ");
        System.out.println("Nome: " + book.name);
        System.out.println(("ID: " + book.id));
        
        if(this.first == null){
            this.first = book;
            this.last = book;
            return;
        }
        this.last.next = book;
        book.previous = this.last;
        this.last = book;
    }
    
    public void remove(int id){
        if(this.first == null){
            return;
        }
        
        Book toRemove = this.first;
        int len = this.length();
        for(int i = 0; i < len; i++){
            if(toRemove.id == id){
                if(i == 0 && toRemove.next == null){  //first and only
                    this.first = null;
                    System.out.println("Livro " + toRemove.name + " excluído.");
                    return;
                }
                if(i == 0){  //first and not the only one
                    toRemove.next.previous = null;
                    this.first = toRemove.next;
                    System.out.println("Livro " + toRemove.name + " excluído.");
                    return;
                }
                if(i == len - 1){  //last
                    toRemove.previous.next = null;
                    System.out.println("Livro " + toRemove.name + " excluído.");
                    return;
                }
                toRemove.previous.next = toRemove.next;
                toRemove.next.previous = toRemove.previous;
                System.out.println("Livro " + toRemove.name + " excluído.");
                break;
            }
        }
        
        System.out.println("O ID digitada não existe na base de livros.");
    }
    
    public void show(){
        Book current = this.last;
    
        System.out.print("\nLivros disponíveis: \n");
        while(current != null){
            System.out.println(" -> " + current.name);
            current = current.previous;
        }
    }
}
