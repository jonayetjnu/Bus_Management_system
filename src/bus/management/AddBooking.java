/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus.management;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Administrator
 */
@Entity
@Table(name = "add_booking", catalog = "bus_management", schema = "")
@NamedQueries({
    @NamedQuery(name = "AddBooking.findAll", query = "SELECT a FROM AddBooking a")
    , @NamedQuery(name = "AddBooking.findById", query = "SELECT a FROM AddBooking a WHERE a.id = :id")
    , @NamedQuery(name = "AddBooking.findByBusNo", query = "SELECT a FROM AddBooking a WHERE a.busNo = :busNo")
    , @NamedQuery(name = "AddBooking.findBySeatNo", query = "SELECT a FROM AddBooking a WHERE a.seatNo = :seatNo")
    , @NamedQuery(name = "AddBooking.findByPassengerName", query = "SELECT a FROM AddBooking a WHERE a.passengerName = :passengerName")
    , @NamedQuery(name = "AddBooking.findByContactNo", query = "SELECT a FROM AddBooking a WHERE a.contactNo = :contactNo")
    , @NamedQuery(name = "AddBooking.findByDepartureDate", query = "SELECT a FROM AddBooking a WHERE a.departureDate = :departureDate")})
public class AddBooking implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "seat_no")
    private int seatNo;
    @Basic(optional = false)
    @Column(name = "passenger_name")
    private String passengerName;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "departure_date")
    @Temporal(TemporalType.DATE)
    private Date departureDate;

    public AddBooking() {
    }

    public AddBooking(Integer id) {
        this.id = id;
    }

    public AddBooking(Integer id, String busNo, int seatNo, String passengerName, String contactNo) {
        this.id = id;
        this.busNo = busNo;
        this.seatNo = seatNo;
        this.passengerName = passengerName;
        this.contactNo = contactNo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        int oldSeatNo = this.seatNo;
        this.seatNo = seatNo;
        changeSupport.firePropertyChange("seatNo", oldSeatNo, seatNo);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        String oldPassengerName = this.passengerName;
        this.passengerName = passengerName;
        changeSupport.firePropertyChange("passengerName", oldPassengerName, passengerName);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        String oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        Date oldDepartureDate = this.departureDate;
        this.departureDate = departureDate;
        changeSupport.firePropertyChange("departureDate", oldDepartureDate, departureDate);
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
        if (!(object instanceof AddBooking)) {
            return false;
        }
        AddBooking other = (AddBooking) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.AddBooking[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
