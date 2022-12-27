package ObjectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Book sisterCarrie  = new Book("Sister Carrie", 1929, new Author("Theodore", "Dreiser"));

        sisterCarrie.setYearOfPublishing(1930);
        System.out.println("Name book  " + sisterCarrie.getNameBook() );
        System.out.println("Year of publishing " + sisterCarrie.getYearOfPublishing());
        System.out.println("Author " + sisterCarrie.getAuthor());


        Book theDarkTower = new Book ("The Dark Tower ", 1977, new Author("Stephen ", "King"));
        theDarkTower.setYearOfPublishing(1975);
        System.out.println("Name book " + theDarkTower.getNameBook());
        System.out.println("Year of publishing " + theDarkTower.getYearOfPublishing());
        System.out.println("Author " + theDarkTower.getAuthor());


    }
}