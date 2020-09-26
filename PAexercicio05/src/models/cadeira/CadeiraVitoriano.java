package models.cadeira;

import interfaces.ICadeira;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
public class CadeiraVitoriano implements ICadeira{
    @Override
    public void print() {
        System.out.println("Cadeira vitoriano");
    }
}
