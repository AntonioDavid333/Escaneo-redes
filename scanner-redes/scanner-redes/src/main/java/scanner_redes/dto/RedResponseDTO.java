package scanner_redes.dto;

public class RedResponseDTO {
    String SSID;
    String nombre;
    boolean dchpEnabled;
    String ipAdress;
    String subnetMask;
    String defaultGetWay;
    String hostname;
    String dnsServerPrimary;

    public RedResponseDTO() {
    }

    public RedResponseDTO(String SSID, String nombre, boolean dchpEnabled, String ipAdress, String subnetMask, String defaultGetWay, String hostname, String dnsServerPrimary) {
        this.SSID = SSID;
        this.nombre = nombre;
        this.dchpEnabled = dchpEnabled;
        this.ipAdress = ipAdress;
        this.subnetMask = subnetMask;
        this.defaultGetWay = defaultGetWay;
        this.hostname = hostname;
        this.dnsServerPrimary = dnsServerPrimary;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
