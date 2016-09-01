/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.List;
import javax.ejb.Remote;
import model.Coordinates;

/**
 *
 * @author oana
 */
@Remote
public interface MainControllerInterface {
    
    public void addCoordinates(Coordinates coordinates);
    public List<Coordinates> getAllCoordinatesFromDataBase();
    public void editCoordinates(Coordinates coordinates);
    
}
