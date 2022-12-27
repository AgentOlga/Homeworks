package ObjectsAndClasses;

public class Book {
   private String nameBook;
   private int yearOfPublishing;
   private  Author author;

   public Book(String nameBook, int yearOfPublishing, Author author) {
      this.nameBook = nameBook;
      this.yearOfPublishing = yearOfPublishing;
      this.author = author;
   }

   public String getNameBook() {
      return nameBook;
   }

   public int getYearOfPublishing() {
      return yearOfPublishing;
   }

   public void setYearOfPublishing(int yearOfPublishing) {
      this.yearOfPublishing = yearOfPublishing;
   }

   public Author getAuthor() {
      return author;
   }
}
