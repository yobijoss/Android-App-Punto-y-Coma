package mx.unam.saic.puntoycoma.objetos;

import com.parse.ParseClassName;
import com.parse.ParseObject;
import com.parse.ParseUser;

/**
 * Created by jagspage2013 on 28/08/14.
 */
@ParseClassName("RegistroAlumno")
//todo esto es un objeto del tipo parse
//put sirve para guardar 
//getParseUser sirve para sacar datos guardados
public class RegistroAlumno extends ParseObject {

    public RegistroAlumno(){

    }

    public void setParseUser(ParseUser user){
        put("usuario",user);//guardamos una variable usuario
    }
    public ParseUser getParseUser(){
        return getParseUser("usuario");//regresa el usuario que hemos guardado
    }

    public void setEscuela(String escuela){
        put("escuela",escuela);
    }

    public String getEscuela(){
        return getString("escuela");
    }

    public void setCarrera(String carrera){
        put("carrera",carrera);
    }

    public String getCarrera(){
        return getString("carrera");
    }

    public void setNombre(String nombre){
        put("nombre",nombre);
    }
    public String getNombre(){
        return getString("nombre");
    }
}
