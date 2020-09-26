package models.fabrica;

import interfaces.IFabricaAbstract;
import interfaces.ICadeira;
import interfaces.IMesaDeCentro;
import interfaces.ISofa;
import models.cadeira.CadeiraVitoriano;
import models.mesaDeCentro.MesaDeCentroVitoriano;
import models.sofa.SofaVitoriano;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class FabricaMobiliaVitoriano implements IFabricaAbstract{

    @Override
    public ICadeira CriarCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public IMesaDeCentro CriarMesaDeCentro() {
        return new MesaDeCentroVitoriano();
    }

    @Override
    public ISofa CriarSofa() {
        return new SofaVitoriano();
    }

}
