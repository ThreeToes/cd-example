package com.stephengream.controllers;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephen
 */
public class HelloControllerTest {
    private HelloController controller;
    
    @Before
    public void setUp(){
        controller = new HelloController();
    }
    
    @Test
    public void checkCorrectHelloView(){
        assertEquals("hello/helloWorld", controller.getHelloWorld());
    }
}
