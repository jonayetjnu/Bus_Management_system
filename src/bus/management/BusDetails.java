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
@Table(name = "bus_details", catalog = "bus_management", schema = "")
@NamedQueries({
    @NamedQuery(name = "BusDetails.findAll", query = "SELECT b FROM BusDetails b")
    , @NamedQuery(name = "BusDetails.findByBid", query = "SELECT b FROM BusDetails b WHERE b.bid = :bid")
    , @NamedQuery(name = "BusDetails.findByBusNo", query = "SELECT b FROM BusDetails b WHERE b.busNo = :busNo")
    , @NamedQuery(name = "BusDetails.findBySource", query = "SELECT b FROM BusDetails b WHERE b.source = :source")
    , @NamedQuery(name = "BusDetails.findByDestination", query = "SELECT b FROM BusDetails b WHERE b.destination = :destination")
    , @NamedQuery(name = "BusDetails.findByTotalSeat", query = "SELECT b FROM BusDetails b WHERE b.totalSeat = :totalSeat")
    , @NamedQuery(name = "BusDetails.findByAvailableSeat", query = "SELECT b FROM BusDetails b WHERE b.availableSeat = :availableSeat")
    , @NamedQuery(name = "BusDetails.findByBookedSeat", query = "SELECT b FROM BusDetails b WHERE b.bookedSeat = :bookedSeat")
    , @NamedQuery(name = "BusDetails.findByUpdatedDate", query = "SELECT b FROM BusDetails b WHERE b.updatedDate = :updatedDate")
    , @NamedQuery(name = "BusDetails.findByBusTime", query = "SELECT b FROM BusDetails b WHERE b.busTime = :busTime")})
public class BusDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bid")
    private Integer bid;
    @Basic(optional = false)
    @Column(name = "bus_no")
    private String busNo;
    @Basic(optional = false)
    @Column(name = "source")
    private String source;
    @Basic(optional = false)
    @Column(name = "destination")
    private String destination;
    @Basic(optional = false)
    @Column(name = "total_seat")
    private String totalSeat;
    @Basic(optional = false)
    @Column(name = "available_seat")
    private int availableSeat;
    @Column(name = "booked_seat")
    private Integer bookedSeat;
    @Column(name = "updated_date")
    @Temporal(TemporalType.DATE)
    private Date updatedDate;
    @Basic(optional = false)
    @Column(name = "bus_time")
    private String busTime;

    public BusDetails() {
    }

    public BusDetails(Integer bid) {
        this.bid = bid;
    }

    public BusDetails(Integer bid, String busNo, String source, String destination, String totalSeat, int availableSeat, String busTime) {
        this.bid = bid;
        this.busNo = busNo;
        this.source = source;
        this.destination = destination;
        this.totalSeat = totalSeat;
        this.availableSeat = availableSeat;
        this.busTime = busTime;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        Integer oldBid = this.bid;
        this.bid = bid;
        changeSupport.firePropertyChange("bid", oldBid, bid);
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        String oldBusNo = this.busNo;
        this.busNo = busNo;
        changeSupport.firePropertyChange("busNo", oldBusNo, busNo);
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        String oldSource = this.source;
        this.source = source;
        changeSupport.firePropertyChange("source", oldSource, source);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        String oldDestination = this.destination;
        this.destination = destination;
        changeSupport.firePropertyChange("destination", oldDestination, destination);
    }

    public String getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(String totalSeat) {
        String oldTotalSeat = this.totalSeat;
        this.totalSeat = totalSeat;
        changeSupport.firePropertyChange("totalSeat", oldTotalSeat, totalSeat);
    }

    public int getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(int availableSeat) {
        int oldAvailableSeat = this.availableSeat;
        this.availableSeat = availableSeat;
        changeSupport.firePropertyChange("availableSeat", oldAvailableSeat, availableSeat);
    }

    public Integer getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(Integer bookedSeat) {
        Integer oldBookedSeat = this.bookedSeat;
        this.bookedSeat = bookedSeat;
        changeSupport.firePropertyChange("bookedSeat", oldBookedSeat, bookedSeat);
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        Date oldUpdatedDate = this.updatedDate;
        this.updatedDate = updatedDate;
        changeSupport.firePropertyChange("updatedDate", oldUpdatedDate, updatedDate);
    }

    public String getBusTime() {
        return busTime;
    }

    public void setBusTime(String busTime) {
        String oldBusTime = this.busTime;
        this.busTime = busTime;
        changeSupport.firePropertyChange("busTime", oldBusTime, busTime);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bid != null ? bid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BusDetails)) {
            return false;
        }
        BusDetails other = (BusDetails) object;
        if ((this.bid == null && other.bid != null) || (this.bid != null && !this.bid.equals(other.bid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bus.management.BusDetails[ bid=" + bid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
