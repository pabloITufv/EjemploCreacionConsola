package com.ufv.lop;

public class Persona {

    private String nombre;
    private String apellido;
    private int dniSinLetra;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDniSinLetra() {
        return dniSinLetra;
    }

    public int getEdad() {
        return edad;
    }

    //_nombre es el valor que vas a meter en la variable nombre
    public void setNombre(String _nombre) {
        this.nombre = _nombre;
    }

    public void setApellido(String _apellido) {
        this.apellido = _apellido;
    }

    public void setDniSinLetra(int _dniSinLetra) {
        this.dniSinLetra = _dniSinLetra;
    }

    public void setEdad(int _edad) {
        if (_edad < 18){
            System.out.println("Estás hecho un chaval."); //Devuelve este mensaje y guarda la edad con lo de fuera de la condición.
        }
        else{
            System.out.println("OkGoogle"); //Devuelve este mensaje y guarda la edad con lo de fuera de la condición.
        }
        this.edad = _edad;  //La edad que ingresas en _edad se guarda en edad también.
    }
}
