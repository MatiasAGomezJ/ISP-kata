package edu.poniperro.isp.ejercicio.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTextoTest {

    @Test
    public void test_simple() {

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.añadirPalabra("No");
        procesador.añadirPalabra("himporta");
        procesador.añadirPalabra("la");
        procesador.añadirPalabra("hortografia");

        assertEquals("No himporta la hortografia", procesador.getTexto());
    }

    @Test
    public void test_con_idioma() {

        ProcesadorTexto procesador = new ProcesadorTexto();

        procesador.añadirPalabra("Tengo");
        procesador.añadirPalabra("hambre");

        assertEquals("Tengo hambre", procesador.getTexto());

        assertTrue(procesador.comprobarIdioma(Idioma.ES));
    }
}