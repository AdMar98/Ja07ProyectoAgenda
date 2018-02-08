/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Adrian
 */
public class Pagina {
    private int dia;
    private int mes;
    
    private ArrayList<Cita> citas=new ArrayList<>();

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
    }
    
    public void anadirCita(Cita c){
        this.citas.add(c);
    }
    
    public void borrarCita(Cita c){
        for (Cita cita: citas) {
            if(cita.getHora()==c.getHora() && cita.getMinutos()==c.getMinutos()){
                this.citas.remove(cita);
                
            }
        }       
    }
    
    public Cita BuscarCita(int hora, int minutos){
        
        Cita busqueda = null, temp;
        int cont = 0;
        boolean encontrado = false;
        
        while (cont < this.citas.size() && encontrado == false) {
            temp = this.citas.get(cont++);
            if (temp.getHora() == hora && temp.getMinutos() == minutos) {
                busqueda = temp;
                encontrado = true;
            }
        }
        return busqueda;
    }
}
