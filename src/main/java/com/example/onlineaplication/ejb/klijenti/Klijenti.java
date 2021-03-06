package com.example.onlineaplication.ejb.klijenti;

import com.example.onlineaplication.ejb.aplikacija.Aplikacija;
import com.example.onlineaplication.ejb.grad.Grad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author SEJO
 */
@Entity
@Table(name = "klijenti")
@NamedQueries({
        @NamedQuery(name = "Klijenti.findAll", query = "SELECT k FROM Klijenti k"),
        @NamedQuery(name = "Klijenti.findByKlijentId", query = "SELECT k FROM Klijenti k WHERE k.klijentId = :klijentId"),
        @NamedQuery(name = "Klijenti.findByIme", query = "SELECT k FROM Klijenti k WHERE k.ime = :ime"),
        @NamedQuery(name = "Klijenti.findByPrezime", query = "SELECT k FROM Klijenti k WHERE k.prezime = :prezime"),
        @NamedQuery(name = "Klijenti.findByTelefon", query = "SELECT k FROM Klijenti k WHERE k.telefon = :telefon"),
        @NamedQuery(name = "Klijenti.findByJmbg", query = "SELECT k FROM Klijenti k WHERE k.jmbg = :jmbg"),
        @NamedQuery(name = "Klijenti.findByIdGrad", query = "SELECT k FROM Klijenti k WHERE k.idGrad = :idGrad"),
        @NamedQuery(name = "Klijenti.findByEmail", query = "SELECT k FROM Klijenti k WHERE k.email = :email"),
        @NamedQuery(name = "Klijenti.findByUsername", query = "SELECT k FROM Klijenti k WHERE k.username = :username"),
        @NamedQuery(name = "Klijenti.findByPassword", query = "SELECT k FROM Klijenti k WHERE k.password = :password")})
public class Klijenti implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "klijent_id")
    private Integer klijentId;
    @Basic(optional = false)
    @Column(name = "ime")
    private String ime;
    @Basic(optional = false)
    @Column(name = "prezime")
    private String prezime;
    @Column(name = "telefon")
    private Integer telefon;
    @Basic(optional = false)
    @Column(name = "jmbg")
    private int jmbg;
    @Basic(optional = false)
    @Column(name = "id_grad")
    private Grad idGrad;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idKlijenta")
    private List<Aplikacija> aplikacijaList;

    public Klijenti() {
    }

    public Klijenti(Integer klijentId) {
        this.klijentId = klijentId;
    }

    public Klijenti(Integer klijentId, String ime, String prezime, int jmbg, Grad idGrad, String email, String username, String password) {
        this.klijentId = klijentId;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.idGrad = idGrad;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public Integer getKlijentId() {
        return klijentId;
    }

    public void setKlijentId(Integer klijentId) {
        this.klijentId = klijentId;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public Integer getTelefon() {
        return telefon;
    }

    public void setTelefon(Integer telefon) {
        this.telefon = telefon;
    }

    public int getJmbg() {
        return jmbg;
    }

    public void setJmbg(int jmbg) {
        this.jmbg = jmbg;
    }

    public Grad getIdGrad() {
        return idGrad;
    }

    public void setIdGrad(Grad idGrad) {
        this.idGrad = idGrad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Aplikacija> getAplikacijaList() {
        return aplikacijaList;
    }

    public void setAplikacijaList(List<Aplikacija> aplikacijaList) {
        this.aplikacijaList = aplikacijaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (klijentId != null ? klijentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Klijenti)) {
            return false;
        }
        Klijenti other = (Klijenti) object;
        if ((this.klijentId == null && other.klijentId != null) || (this.klijentId != null && !this.klijentId.equals(other.klijentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.onlineaplication.ejb.klijenti.Klijenti[ klijentId=" + klijentId + " ]";
    }

}

