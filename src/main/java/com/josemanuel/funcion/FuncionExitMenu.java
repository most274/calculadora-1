package com.josemanuel.funcion;

import java.util.Scanner;
import java.util.function.Function;

import com.josemanuel.menu.ExitMenuException;

//Sirve para salir del menu
public class FuncionExitMenu implements Function<Scanner, Void>{

    @Override
    public Void apply(Scanner t) {
        
        throw new ExitMenuException();

        //return null;
    }
    
}
