/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.TiendaMariano.tienda.dao;

import com.TiendaMariano.tienda.domain.RequestMatcher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestMatcherDao extends JpaRepository<RequestMatcher, Long> {
    
}