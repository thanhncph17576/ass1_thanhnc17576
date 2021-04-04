/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.gd1;

/**
 *
 * @author Admin
 */
public class Tomatos {
    
    private String idTomato;
    private String nameTomato;
    private String colorTomato;
    private String giaTomato;
    
    public Tomatos(){       
    }

    public Tomatos(String idTomato, String nameTomato, String colorTomato, 
            String giaTomato) {
        this.idTomato = idTomato;
        this.nameTomato = nameTomato;
        this.colorTomato = colorTomato;
        this.giaTomato = giaTomato;
    }

    public String getIdTomato() {
        return idTomato;
    }

    public void setIdTomato(String idTomato) {
        this.idTomato = idTomato;
    }

    public String getNameTomato() {
        return nameTomato;
    }

    public void setNameTomato(String nameTomato) {
        this.nameTomato = nameTomato;
    }

    public String getColorTomato() {
        return colorTomato;
    }

    public void setColorTomato(String colorTomato) {
        this.colorTomato = colorTomato;
    }

    public String getGiaTomato() {
        return giaTomato;
    }

    public void setGiaTomato(String giaTomato) {
        this.giaTomato = giaTomato;
    }

    @Override
    public String toString() {
        return "Tomatos{" + "idTomato=" + idTomato + ", nameTomato=" + 
                nameTomato + ", colorTomato=" + colorTomato + ", giaTomato=" + 
                giaTomato + '}';
    }
    
    public void display(){
        System.out.println(" ");
    }
    
}
