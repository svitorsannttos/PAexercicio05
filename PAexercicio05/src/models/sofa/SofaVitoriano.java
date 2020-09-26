package models.sofa;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author George
 */
import interfaces.ISofa;
public class SofaVitoriano implements ISofa{
    @Override
    public void print() {
        System.out.println("Sofa vitoriano");
    }
}
