/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import model.Coordinates;
import db.CoordinatesDB;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author oana
 */
@Stateless
@Remote(MainControllerInterface.class) 
public class MainController implements MainControllerInterface{
    @EJB
    private CoordinatesDBJpaController coordinatesDBJpaController;
    
    @Override
    public void addCoordinates(Coordinates coordinates) {
       
            try {
                coordinatesDBJpaController.create(new CoordinatesDB(0, coordinates.getCurrentLatitude(), coordinates.getCurrentLongitude(), coordinates.getTimestamp(), coordinates.getAndroid_id()));
            } catch (Exception ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }    
    }
    
    @Override
    public List<Coordinates> getAllCoordinatesFromDataBase(){
        
        List<CoordinatesDB> coordinatesFromDatabase = coordinatesDBJpaController.findCoordinatesDBEntities();
        List<Coordinates> coordinates = new ArrayList<>();

        for (CoordinatesDB cdb : coordinatesFromDatabase) {
            coordinates.add(new Coordinates(cdb.getId(), cdb.getCurrentLatitude(), cdb.getCurrentLongitude(), cdb.getTimestamp(), cdb.getAndroidId()));
        }
        return coordinates;
   
    
    }
    
    
    @Override
    public void editCoordinates(Coordinates coordinates){
   
        List<CoordinatesDB> coordinatesFromDatabase = coordinatesDBJpaController.findCoordinatesDBEntities();
        boolean exista = false;
        for (CoordinatesDB c: coordinatesFromDatabase){
            //verific daca telefonul cu acest id a mai fost inregistrat
            if(c.getAndroidId().equals(coordinates.getAndroid_id())){                
                c.setTimestamp(coordinates.getTimestamp());
                coordinatesDBJpaController.update(c);
                //am specificat ca id-ul telefonului a fost identificat
                exista = true;
            }
        }
        //daca este o inregistrare noua, adaugam telefonul
        if (exista == false){
            addCoordinates(coordinates);
        }

   
        
    
    }
    
}
