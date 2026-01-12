package scanner_redes.dto;

public class RedResponseDTO {
<<<<<<< HEAD
    private String ssid;
    private Estado estado;
    private Date fecha;
=======
    String SSID;
    String nombre;
    boolean dchpEnabled;
    String ipAdress;
    String subnetMask;
    String defaultGetWay;
    String hostname;
    String dnsServerPrimary;
>>>>>>> ab20c0aaf24c84e7210fbd9917cc82dd3bfab2fa

    public RedResponseDTO() {
    }

<<<<<<< HEAD
    public RedResponseDTO(String ssid, Estado estado, Date fecha) {
        this.ssid = ssid;
        this.estado = estado;
        this.fecha=fecha;
=======
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
>>>>>>> ab20c0aaf24c84e7210fbd9917cc82dd3bfab2fa
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
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
