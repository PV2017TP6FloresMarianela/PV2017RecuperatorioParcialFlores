/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.datos;

import aplicacion.modelo.dominio.Figura;
import java.util.ArrayList;

/**
 *
 * @author Severa
 */
public class ColeccionFiguras {
      private ArrayList<Figura> figuras;

    public ColeccionFiguras() {
        figuras=new ArrayList();
    }
public void agregarFiguras(Figura unaFigura){
    getFiguras().add(unaFigura);
}


    /**
     * @return the figuras
     */
    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }
}
