package com.TiendaMariano.tienda.service;

import com.TiendaMariano.tienda.domain.RequestMatcher;
import java.util.List;


public interface RequestMatcherService {
    
    public List<RequestMatcher> getAllRequestMatchers();
    
    public RequestMatcher getRequestMatcher(RequestMatcher requestMatcher);
    
    public void save(RequestMatcher requestMatcher);
    
    public void delete(RequestMatcher requestMatcher);
	
}