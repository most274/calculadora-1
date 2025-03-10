package com.josemanuel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;

public class SuperCalculadoraTest {
    
    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    private ByteArrayOutputStream testOut;

    //Antes de iniciar el test
    @BeforeEach
    public void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    private String getOutput() {
        return testOut.toString();
    }

    //Se realiza el test de problemas aritméticos
    //El test será exitoso si el resultado es 43
    @Test
    @DisplayName("Test entrada a Menú de Aritmética, opción A")
    public void testCasoMenuAritmetica() {
       
        provideInput("A\n1\n10\n33\nX\nX");
        
        SuperCalculadora.main(new String[0]);
        assertThat(getOutput(), containsString("Resultado: 43") );
        
    }

    //Después del test
    @AfterEach
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }



}
