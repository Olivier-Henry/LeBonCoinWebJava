/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.oh.tests;

import fr.oh.entities.Ville;

/**
 *
 * @author formation
 */
public class TestReflexivite {
    
    public static void main(String[] args) {
        Ville v = new Ville();
        System.out.println(v.getNbAttributes());
    }
}
