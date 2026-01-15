package scanner_redes.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Past;
import scanner_redes.dto.Estado;

import java.util.Date;
@Entity @Table(name = "redes")
public class Red {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String ssid;

    @Column(nullable = false)
    String password;

    @Column(nullable = true)
    private String seguridad;
//    @Column
//    String nombre;
//    @Column
//    boolean dchpEnabled;
//    @Column
//    String ipAdress;
//    @Column
//    String subnetMask;
//    @Column
//    String defaultGetWay;
//    @Column
//    String hostname;
//    @Column
//    String dnsServerPrimary;


    public Red() {
    }


    public Red(String ssid, String password, String seguridad) {
        this.ssid = ssid;
        this.password = password;
        this.seguridad = seguridad;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
}
