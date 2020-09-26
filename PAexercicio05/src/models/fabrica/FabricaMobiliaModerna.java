package models.fabrica;
import interfaces.IFabricaAbstract;
import interfaces.ICadeira;
import interfaces.IMesaDeCentro;
import interfaces.ISofa;
import models.cadeira.CadeiraModerna;
import models.mesaDeCentro.MesaDeCentroModerna;
import models.sofa.SofaModerna;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class FabricaMobiliaModerna implements IFabricaAbstract{

    @Override
    public ICadeira CriarCadeira() {
        return new CadeiraModerna();
    }

    @Override
    public IMesaDeCentro CriarMesaDeCentro() {
        return new MesaDeCentroModerna();
    }

    @Override
    public ISofa CriarSofa() {
        return new SofaModerna();
    }

}
