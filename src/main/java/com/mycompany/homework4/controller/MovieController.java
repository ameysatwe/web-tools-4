package com.mycompany.homework4.controller;

import com.mycompany.homework4.dao.MovieDAO;
import com.mycompany.homework4.dao.MovieDaoImpl;
import com.mycompany.homework4.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


public class MovieController extends AbstractController {


    private final MovieDAO movieDAO = new MovieDaoImpl();

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        List<Movie> movieList;
        ModelAndView mv = new ModelAndView();

        String action = httpServletRequest.getParameter("action")!= null ? httpServletRequest.getParameter("action") : "" ;

        switch (action){
            case "addMovieForm":
                mv.setViewName("addMovie");
                break;
            case "addMovie":
                String title = httpServletRequest.getParameter("title");
                String director = httpServletRequest.getParameter("director");
                String genre = httpServletRequest.getParameter("genre");
                String year = httpServletRequest.getParameter("releaseYear");
                Integer iYear = Integer.valueOf(year);
                movieDAO.addMovie(new Movie(title,genre,director,iYear));
                movieList = movieDAO.getAllMovies();
                mv.setViewName("movies");
                mv.addObject("movies",movieList);
                break;
            case"searchMovie":
                String keyword = httpServletRequest.getParameter("keyword");
                movieList = movieDAO.searchMovies(keyword);
                mv.setViewName("searchMovie");
                mv.addObject("movies",movieList);
                System.out.println("controller search"+movieList.size());
                break;
            default:
                movieList = movieDAO.getAllMovies();
                mv.setViewName("movies");
                mv.addObject("movies",movieList);
                break;

        }
        return mv;
    }
}
