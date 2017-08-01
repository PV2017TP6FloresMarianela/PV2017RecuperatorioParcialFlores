/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author Severa
 */
public class Numero implements Serializable{
   private double valor;
   private String tipo;
   

    public Numero() {
    }

    public double convertirMoneda(String unTipo , double unValor){
        double result;
        if("PESO".equals(unTipo)){
            result = (unValor/16.5);
        }
        else{
            if("DOLAR".equals(unTipo)){
                result = (unValor*16.5);
            }
            else{
                result = 0;
            }
        }
        return result;
    }
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the convertido
     */
   
}
