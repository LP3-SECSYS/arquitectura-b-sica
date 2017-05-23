/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Controller.ClsCategoria;
import Modell.Categoria;
import java.util.ArrayList;

/**
 *
 * @author LAB05
 */
public class server {

    static ClsCategoria clscat = new ClsCategoria();
    static ArrayList<Categoria> list = new ArrayList();
    
    public static void main(String[] args) {
        list = clscat.lista();
        for(int i =0;i<list.size();i++){
            Categoria s = list.get(i);
            System.out.println("obj: "+s.getName());
        }
    }
    
}
