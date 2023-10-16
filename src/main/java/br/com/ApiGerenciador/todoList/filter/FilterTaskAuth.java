package br.com.ApiGerenciador.todoList.filter;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class FilterTaskAuth implements Filter {


    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
//        throw new UnsupportedEncodingException("Unimolemented method 'do filter'");
        chain.doFilter(request, response);

    }


}
