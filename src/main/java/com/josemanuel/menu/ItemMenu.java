package com.josemanuel.menu;

import java.util.Scanner;
import java.util.function.Function;

public class ItemMenu {

    private String mensajeMenu;
    private Menu subMenu;
    private Function<Scanner, Void> itemMenuFuncion;

    //Cada submenú con su mensaje
    public ItemMenu(String mensajeMenu, Menu subMenu) {
        this.subMenu = subMenu;
        this.mensajeMenu = mensajeMenu;        
    }

    //Cada opción del menú con su mensaje
    public ItemMenu(String mensajeMenu, Function<Scanner, Void> itemMenuFuncion) {
        this.mensajeMenu = mensajeMenu;
        this.itemMenuFuncion = itemMenuFuncion;
    }

    //Devuelve el submenú
    public Menu getSubMenu() {
        return subMenu;
    }

    //Se establece el submenú
    public void setSubMenu(Menu subMenu) {
        this.subMenu = subMenu;
    }

    //Devuelve el mensaje del menú
    public String getMensajeMenu() {
        return mensajeMenu;
    }

    //Se establece el mensaje del submenú
    public void setMensajeMenu(String mensajeMenu) {
        this.mensajeMenu = mensajeMenu;
    }

    //Devuelve la opción del menú
    public Function<Scanner, Void> getItemMenuFuncion() {
        return itemMenuFuncion;
    }

}
