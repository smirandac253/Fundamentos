/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inclassui.Logica;

import inclassui.Modelo.Movies;
import java.util.ArrayList;
import java.util.List;


public class LogicaMovies {
    public List<Movies> obtenerMovies(){
        List<Movies> list = new ArrayList<Movies>();
        list.add(new Movies("David", 27));
        list.add(new Movies("Pepe", 25));
        list.add(new Movies("Juan", 24));
        list.add(new Movies("Andres", 29));
        return list;
    }
}
