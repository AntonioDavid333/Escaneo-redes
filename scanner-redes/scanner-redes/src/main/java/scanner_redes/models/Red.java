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
    String ssid;
    @Column
    String password;
    @Column
    String nombre;
    @Column
    boolean dchpEnabled;
    @Column
    String ipAdress;
    @Column
    String subnetMask;
    @Column
    String defaultGetWay;
    @Column
    String hostname;
    @Column
    String dnsServerPrimary;


    public Red() {
    }


    public Red(String SSID, String password, String nombre, boolean dchpEnabled, String ipAdress, String subnetMask, String defaultGetWay, String dnsServerPrimary, String hostname) {
        this.ssid = SSID;
        this.password = password;
        this.nombre = nombre;
        this.dchpEnabled = dchpEnabled;
        this.ipAdress = ipAdress;
        this.subnetMask = subnetMask;
        this.defaultGetWay = defaultGetWay;
        this.dnsServerPrimary = dnsServerPrimary;
        this.hostname = hostname;
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

    public boolean isDchpEnabled() {
        return dchpEnabled;
    }

    public void setDchpEnabled(boolean dchpEnabled) {
        this.dchpEnabled = dchpEnabled;
    }

    public String getIpAdress() {
        return ipAdress;
    }

    public void setIpAdress(String ipAdress) {
        this.ipAdress = ipAdress;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    public String getDefaultGetWay() {
        return defaultGetWay;
    }

    public void setDefaultGetWay(String defaultGetWay) {
        this.defaultGetWay = defaultGetWay;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDnsServerPrimary() {
        return dnsServerPrimary;
    }

    public void setDnsServerPrimary(String dnsServerPrimary) {
        this.dnsServerPrimary = dnsServerPrimary;
    }
}
