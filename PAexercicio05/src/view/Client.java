package view;

import interfaces.IFabricaAbstract;
import models.fabrica.FabricaMobiliaArtDeco;
import models.fabrica.FabricaMobiliaModerna;
import models.fabrica.FabricaMobiliaVitoriano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Client {

    public static void main(String[] args) {
        Application app = null;
        IFabricaAbstract fabrica;
        fabrica = new FabricaMobiliaModerna();
        app = new Application(fabrica);
        app.print();
        fabrica = new FabricaMobiliaArtDeco();
        app = new Application(fabrica);
        app.print();  
        fabrica = new FabricaMobiliaVitoriano();
        app = new Application(fabrica);
        app.print();  
    }
}
