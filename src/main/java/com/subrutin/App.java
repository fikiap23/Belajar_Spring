package com.subrutin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.subrutin.config.AppConfig;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext appCtx;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bs = (BookService) appCtx.getBean("bookService");
        BookDetailDTO dto = bs.findBookDetailById(2L);
        System.out.println("Book Detail: "+dto);
        
    }
}