/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.form.bean;

import aplicacion.modelo.datos.ColeccionFiguras;
import aplicacion.modelo.dominio.Figura;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Severa
 */
@ManagedBean
@SessionScoped
public class FiguraFormBean implements Serializable{
private ColeccionFiguras figuras;
   private Figura figura;   
   private String unNombre;
   private ArrayList<String> nombres;
   private boolean cat;
   private double lado;
   private double perimetro;
    /**
     * Creates a new instance of FiguraFormBean
     */
    public FiguraFormBean() {
        figuras= new ColeccionFiguras();
        nombres=new ArrayList();
        nombres.add("TRIANGULO EQUILATERO");
        nombres.add("CUADRADO");
        nombres.add("PENTAGONO");
        cat=false;
    }
    public void agregarFiguras(){
        if(null != unNombre)switch (unNombre) {
        case "TRIANGULO EQUILATERO":
            setPerimetro(lado*3);
            break;
        case "CUADRADO":
            setPerimetro(lado*4);
            break;
        default:
            setPerimetro(lado*5);
            break;
    }
        //setFigura(new Figura(getUnNombre(),getLado(),getPerimetro()));
        //getFiguras().agregarFiguras(getFigura());
        figura=new Figura(getUnNombre(),getLado(),getPerimetro());
        figuras.agregarFiguras(figura);
        
    }
    
    
    /**
     * @return the figuras
     */
    public ColeccionFiguras getFiguras() {
        return figuras;
    }

    /**
     * @param figuras the figuras to set
     */
    public void setFiguras(ColeccionFiguras figuras) {
        this.figuras = figuras;
    }

    /**
     * @return the figura
     */
    public Figura getFigura() {
        return figura;
    }

    /**
     * @param figura the figura to set
     */
    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    /**
     * @return the unNombre
     */
    public String getUnNombre() {
        return unNombre;
    }

    /**
     * @param unNombre the unNombre to set
     */
    public void setUnNombre(String unNombre) {
        this.unNombre = unNombre;
    }

    /**
     * @return the nombres
     */
    public ArrayList<String> getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(ArrayList<String> nombres) {
        this.nombres = nombres;
    }

    /**
     * @return the cat
     */
    public boolean isCat() {
        return cat;
    }

    /**
     * @param cat the cat to set
     */
    public void setCat(boolean cat) {
        this.cat = cat;
    }

    /**
     * @return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
    
    
    
}
