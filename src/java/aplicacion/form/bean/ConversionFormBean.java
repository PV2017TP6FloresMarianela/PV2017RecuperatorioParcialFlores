/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.dominio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Severa
 */
@ManagedBean
@RequestScoped
public class ConversionFormBean implements Serializable {

    private Numero numero;
    private String tipo;
    private ArrayList<String> tipos;
    private double valor;
    private double resultado;

    /**
     * Creates a new instance of ConversionFormBean
     */
    public ConversionFormBean() {
        numero = new Numero();
        tipos=new ArrayList();
        tipos.add("DOLAR");
        tipos.add("PESO");
    }
    
    public void convertirMoneda(){
    setResultado(getNumero().convertirMoneda(getTipo(), getValor()));
    }

    /**
     * @return the numero
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
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
     * @return the tipos
     */
    public ArrayList<String> getTipos() {
        return tipos;
    }

    /**
     * @param tipos the tipos to set
     */
    public void setTipos(ArrayList<String> tipos) {
        this.tipos = tipos;
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
     * @return the resultado
     */
    public double getResultado() {
        return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

    /**
     * @return the unNumero
     */
   