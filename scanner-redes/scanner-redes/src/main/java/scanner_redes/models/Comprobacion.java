package scanner_redes.models;

import jakarta.persistence.*;
import scanner_redes.dto.Estado;

import java.sql.Timestamp;
import java.util.Date;
@Entity @Table(name = "historial_estados")
public class Comprobacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ssid;

    @Column(nullable = false)
    private Estado estado;

    @Column(nullable = false)
    private Timestamp fecha;

    public Comprobacion() {
    }

    public Comprobacion(String ssid, Estado estado, Timestamp fecha) {
        this.ssid = ssid;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }
}
