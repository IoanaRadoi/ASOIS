/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oana
 */
@Entity
@Table(name = "coordinates")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoordinatesDB.findAll", query = "SELECT c FROM CoordinatesDB c"),
    @NamedQuery(name = "CoordinatesDB.findById", query = "SELECT c FROM CoordinatesDB c WHERE c.id = :id"),
    @NamedQuery(name = "CoordinatesDB.findByCurrentLatitude", query = "SELECT c FROM CoordinatesDB c WHERE c.currentLatitude = :currentLatitude"),
    @NamedQuery(name = "CoordinatesDB.findByCurrentLongitude", query = "SELECT c FROM CoordinatesDB c WHERE c.currentLongitude = :currentLongitude"),
    @NamedQuery(name = "CoordinatesDB.findByTimestamp", query = "SELECT c FROM CoordinatesDB c WHERE c.timestamp = :timestamp"),
    @NamedQuery(name = "CoordinatesDB.findByAndroidId", query = "SELECT c FROM CoordinatesDB c WHERE c.androidId = :androidId")})
public class CoordinatesDB implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currentLatitude")
    private double currentLatitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currentLongitude")
    private double currentLongitude;
    @Basic(optional = false)
    @NotNull
    @Column(name = "timestamp")
    private double timestamp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "android_id")
    private String androidId;

    public CoordinatesDB() {
    }

    public CoordinatesDB(Integer id) {
        this.id = id;
    }

    public CoordinatesDB(Integer id, double currentLatitude, double currentLongitude, double timestamp, String androidId) {
        this.id = id;
        this.currentLatitude = currentLatitude;
        this.currentLongitude = currentLongitude;
        this.timestamp = timestamp;
        this.androidId = androidId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getCurrentLatitude() {
        return currentLatitude;
    }

    public void setCurrentLatitude(double currentLatitude) {
        this.currentLatitude = currentLatitude;
    }

    public double getCurrentLongitude() {
        return currentLongitude;
    }

    public void setCurrentLongitude(double currentLongitude) {
        this.currentLongitude = currentLongitude;
    }

    public double getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(double timestamp) {
        this.timestamp = timestamp;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoordinatesDB)) {
            return false;
        }
        CoordinatesDB other = (CoordinatesDB) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "db.CoordinatesDB[ id=" + id + " ]";
    }
    
}
