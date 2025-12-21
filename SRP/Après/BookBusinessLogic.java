package Après;

public class BookBusinessLogic {
    public void emprunter(BookSRP book, String lecteur){
        System.out.println("\nEmprunter du livre '" + book.getTitle() + "'par" + lecteur);

    }
    public void autreService(BookSRP book){
          System.out.println("\nAutre logique métier sur le livre '" + book.getTitle());

    }

}
