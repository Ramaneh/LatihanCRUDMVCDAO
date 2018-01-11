/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ramaandyyasril.latihanmvcjdbc.event;

import edu.ramaandyyasril.latihanmvcjdbc.entity.Pelanggan;
import edu.ramaandyyasril.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author ASUS X
 */
public interface PelangganListener {
    
    public void onChange  (PelangganModel model);
    public void onInsert  (Pelanggan pelanggan );
    public void onDelete  ();
    public void onUpdate  (Pelanggan pelanggan);
    
    
    
    
}
