package homework1;

public class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        while (x < 3) {
           myBooks[x] = new Books();
            x++;
        }
        x = 0;
        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов no Java";
        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";
        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(", автор");
            System.out.println(myBooks[x].author) ;
           x++;
        }
    }
}
