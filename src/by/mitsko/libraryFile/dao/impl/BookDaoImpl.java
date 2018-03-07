package by.mitsko.libraryFile.dao.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import by.mitsko.libraryFile.bean.Author;
import by.mitsko.libraryFile.bean.Book;
import by.mitsko.libraryFile.dao.BookDao;

public class BookDaoImpl implements BookDao {

	public static final String FILE_PATH = "resources/Library.txt";
	@Override
	public Book [] readAll() {
		
		Book [] books = new Book[5];
		Author[] authors = new Author[5];
		
		for (int i = 0; i < 5; i++) {
			books[i] = new Book();
			authors[i] = new Author();
			
		}
		try (BufferedReader brd  = new BufferedReader(new FileReader(FILE_PATH))){
			String str;
			
			String [] lines = new String [5];
			
			while ((str = brd.readLine()) != null){
				
				
				for (int j = 0; j < 5; j++) {
				   lines[j] = str;
				   String [] strArray = lines[j].split(", ");
				   addBook(strArray, books, authors, j);
				
				}
				
				
			}
			}catch (IOException e) {
					e.printStackTrace();
					System.out.println("File not found");
				}
			return books;
}
			
	

    private void addBook(String[] book, Book[] books, Author[] authors, int j) {
    	
    	   System.out.println(book[j]);
	       books[j].setId(Integer.parseInt(book[0]));
	       books[j].setTitle(book[1]);
	       books[j].setYear( Integer.parseInt(book[2]));
	       books[j].setAuthor(authors[j]);
	       authors[j].setId(Integer.parseInt(book[0]));
	       authors[j].setName(book[3]);
	       authors[j].setSurname(book[4]);
}
}