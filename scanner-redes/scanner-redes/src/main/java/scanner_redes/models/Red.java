package scanner_redes.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import scanner_redes.dto.Estado;

import java.util.Date;
@Entity @Table(name = "Redes")
public class Red {
    @Id
    private String ssid;
    @Column
    private Estado estado;
    @Column
    private Date fecha;

    public Red() {
    }

    public Red(String ssid, Estado estado, Date fecha) {
        this.ssid = ssid;
        this.estado = estado;
        this.fecha=fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
