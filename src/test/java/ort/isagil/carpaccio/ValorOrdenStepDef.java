/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ort.isagil.carpaccio;
import static org.junit.Assert.*;
import cucumber.api.java.es.*;
import ort.isagil.carpaccio.model.CalculadoraValor;


/**
 *
 * @author alumnoFI
 */
public class ValorOrdenStepDef {
     
    CalculadoraValor calculadora;
    int resultado;
    
    @Dado("^la cantidad  (\\d+) y el precio (\\d+)$")
    public void dadasLaCantidadYPrecio(int cantidad,
                                                int precio) throws Throwable {
        calculadora = new CalculadoraValor();
        calculadora.setCantidad(cantidad);
        calculadora.setPrecio(precio);
    }

    @Cuando("^calculo el valor")
    public void calculo() throws Throwable {        
        resultado = calculadora.calcular();
    }

    @Entonces("^el resultado es (\\d+)$")
    public void reciboPorElCalculo(int valorEsperado) throws Throwable {
        assertEquals(resultado, valorEsperado);
    }
}
