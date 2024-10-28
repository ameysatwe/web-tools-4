package com.mycompany.homework4.controller;

import com.mycompany.homework4.dao.BooksDAO;
import com.mycompany.homework4.dao.BooksDaoImpl;
import com.mycompany.homework4.model.Book;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class BookController extends AbstractController {

    private BooksDAO booksDAO = new BooksDaoImpl();
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        String action = httpServletRequest.getParameter("action") == null ? "" :httpServletRequest.getParameter("action") ;
        List<Book> listBooks;
        switch(action){
            case "add":
                int i =0;
                while(true){
                    String isbn = httpServletRequest.getParameter("isbn"+i);
                    String author = httpServletRequest.getParameter("author"+i);
                    String title = httpServletRequest.getParameter("title"+i);
                    String price = httpServletRequest.getParameter("price"+i);

                    if(isbn == null || author==null || title==null || price==null)
                        break;

                    Float fprice = Float.parseFloat(price);

                    booksDAO.addBook(new Book(isbn,title,author,fprice));
                    i++;
                }
                listBooks = booksDAO.getAllBooks();
                mv.addObject("listBooks", listBooks);
                mv.setViewName("browseBooks");
                break;
            case "addBooks":
                mv.setViewName("addBooks");
                break;
            case "numBooks":
                String num = httpServletRequest.getParameter("numberOfBooks");
                mv.addObject("numberOfBooks",Integer.valueOf(num));
                mv.setViewName("bookForms");
                break;
            default:
                listBooks = booksDAO.getAllBooks();
                mv.addObject("listBooks", listBooks);
                mv.setViewName("browseBooks");
                break;
        }
        return mv;
    }
}
