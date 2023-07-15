package com.subrutin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subrutin.domain.Author;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext appCtx = new ClassPathXmlApplicationContext("application-context.xml");
        ApplicationContext appCtx = new FileSystemXmlApplicationContext("D:\\spring_boot\\book-catalog\\src\\main\\resources\\application-context.xml");
        BookService bs = (BookService) appCtx.getBean("bookService");
        BookDetailDTO dto = bs.findBookDetailById(1L);
        System.out.println("Book Detail: "+dto);
        
    }
}