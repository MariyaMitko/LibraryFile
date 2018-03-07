package by.mitsko.libraryFile.logic.impl;

import by.mitsko.libraryFile.bean.Book;
import by.mitsko.libraryFile.bean.Catalog;
import by.mitsko.libraryFile.dao.BookDao;
import by.mitsko.libraryFile.dao.impl.BookDaoImpl;
import by.mitsko.libraryFile.logic.LibraryService;

public class LibraryServiceImpl implements LibraryService {
	
	   private BookDao dao = new BookDaoImpl();
			   
		@Override
		public Catalog getMainCatalog() {
			
			Catalog catalog = new Catalog();
			
			Book[] books = dao.readAll();
			catalog.setBooks(books);
			catalog.setTitle("HTP_TAT_BOOKS_CATALOG");
			
			return catalog;
		}

	}
