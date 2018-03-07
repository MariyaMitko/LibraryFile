package by.mitsko.libraryFile.run;

import by.mitsko.libraryFile.bean.Book;
import by.mitsko.libraryFile.bean.Catalog;
import by.mitsko.libraryFile.logic.LibraryService;
import by.mitsko.libraryFile.logic.impl.LibraryServiceImpl;

public class Librarian {

	public static void main(String[] args){
		LibraryService service = new LibraryServiceImpl();
        Catalog boocCatalog = service.getMainCatalog();
        viewCatalogInfo(boocCatalog);
        
	}
    private static void viewCatalogInfo(Catalog catalog){
    	for (Book book: catalog.getBooks()){
    		System.out.println(book);
    	}
    }
}
