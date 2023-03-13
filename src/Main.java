import java.io.IOException;
import java.util.Scanner;

public class Main {
    public void startLibrary(Library library) throws IOException{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("SISTEMA BIBLIOTECÁRIO\n");
        int stop = 0;
        while(stop != 1){
            System.out.print("\n Ações disponíveis:\n" +
                    " [1] Listar livros da biblioteca\n" +
                    " [2] Verificar se a biblioteca possui ou não livros\n" +
                    " [3] Mostrar a quantidade de livros na biblioteca\n" +
                    " [4] Verificar se um livro está na biblioteca (pelo ID)\n" +
                    " [5] Adicionar livro à biblioteca\n" +
                    " [6] Remover livro da biblioteca\n" +
                    " [7] Encerrar sistema\n\n");
            System.out.print("Sua opção: ");
            int op = sc.nextInt();
            switch(op){
                case 1:
                    library.showBooks();
                    continue;
                case 2:
                    if (library.isEmpty()) System.out.println("A biblioteca está vazia.");
                    else System.out.println("A biblioteca possui livros.");
                    continue;
                case 3:
                    System.out.println("A biblioteca tem, nesse momento, " + library.length() + " livros.");
                    continue;
                case 4:
                    System.out.print("ID do livro: ");
                    int id = sc.nextInt();
                    if (library.existenceId(id)) System.out.println("O livro está na biblioteca.");
                    else System.out.println("O livro não está na biblioteca.");
                    continue;
                case 5:
                    library.insert();
                    continue;
                case 6:
                    System.out.print("ID do livro que deve ser removido: ");
                    int toRemoveID = sc.nextInt();
                    library.remove(toRemoveID);
                    continue;
                case 7:
                    System.out.println("Sistema encerrado.");
                    stop = 1;
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Library library = new Library();
        Main func = new Main();
        
        func.startLibrary(library);
    }
}
