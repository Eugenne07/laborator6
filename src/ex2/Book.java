package ex2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Book {
    static Scanner scanner = new Scanner(System.in);
    String title,author,ISBN;
    public Book(String title, String author, String ISBN){
        this.author = author;
        this.title = title;
        this.ISBN = ISBN;
    }
    public static class Library{
        List<Book> list = new ArrayList<>();
        public void adauga(){
            System.out.print("Nume carte:");
            String nume = scanner.next();
            System.out.print("Autor:");
            String autor = scanner.next();
            System.out.print("ISBN:");
            String ISBN = scanner.next();
            Book book = new Book(nume,autor,ISBN);
            this.list.add(book);
        }
        public void sterge(){
            for (Book book: list
                 ) {
                System.out.println(list.indexOf(book)+ "." + book.title);
            }
            System.out.println("Indexul cartii de sters:");
            int index = scanner.nextInt();
            list.remove(index);
        }
        public void afisare(){
            System.out.println("Cartile din librarie sunt:");
            for (Book book: list
            ) {
                System.out.println(list.indexOf(book)+ "." + book.title);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        int option;
        do{
            System.out.println("\n1.Adauga");
            System.out.println("2.Sterge");
            System.out.println("3.Afisare");
            System.out.println("4.Iesire");
            System.out.print("Optiunea:");
            option = scanner.nextInt();
            switch (option){
                case 1:
                    library.adauga();
                    break;
                case 2:
                    library.sterge();
                    break;
                case 3:
                    library.afisare();
                    break;
                case 4:
                    System.out.println("Iesire meniu...");
                    break;
                default:
                    System.out.println("Nu exista optiunea");
                    break;
            }

        }while(option != 4);

    }
}
