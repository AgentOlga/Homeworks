package ObjectsAndClasses;

import java.util.Objects;

public class Book {
   private String nameBook;
   private int yearOfPublishing;
   private final Author author;

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

   @Override
   public String toString() {
      return "Название книги: " + nameBook + ", автор: " + getAuthor() + ", год издания: " + yearOfPublishing;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return yearOfPublishing == book.yearOfPublishing && Objects.equals(nameBook, book.nameBook);
   }

   @Override
   public int hashCode() {
      return Objects.hash(nameBook, yearOfPublishing);
   }
}
