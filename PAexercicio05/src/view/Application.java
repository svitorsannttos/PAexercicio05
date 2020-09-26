package view;

import interfaces.ICadeira;
import interfaces.IFabricaAbstract;
import interfaces.IMesaDeCentro;
import interfaces.ISofa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class Application {

    private ICadeira cadeira;
    private IMesaDeCentro mesaDeCentro;
    private ISofa sofa;

    Application(IFabricaAbstract fabrica) {
        this.cadeira = fabrica.CriarCadeira();
        this.mesaDeCentro = fabrica.CriarMesaDeCentro();
        this.sofa = fabrica.CriarSofa();
    }

    void print() {
        this.cadeira.print();
        this.mesaDeCentro.print();
        this.sofa.print();
    }
}
