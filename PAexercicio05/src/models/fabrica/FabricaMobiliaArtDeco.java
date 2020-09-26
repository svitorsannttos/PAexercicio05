package models.fabrica;
import interfaces.IFabricaAbstract;
import interfaces.ICadeira;
import interfaces.IMesaDeCentro;
import interfaces.ISofa;
import models.cadeira.CadeiraArtDeco;
import models.mesaDeCentro.MesaDeCentroArtDeco;
import models.sofa.SofaArtDeco;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class FabricaMobiliaArtDeco implements IFabricaAbstract{

    @Override
    public ICadeira CriarCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public IMesaDeCentro CriarMesaDeCentro() {
        return new MesaDeCentroArtDeco();
    }

    @Override
    public ISofa CriarSofa() {
        return new SofaArtDeco();
    }

}
