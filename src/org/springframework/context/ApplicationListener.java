/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.context;

/**
 *
 * @author dmalahov
 */
public interface ApplicationListener<E> {

    void onApplicationEvent(E event);
}
