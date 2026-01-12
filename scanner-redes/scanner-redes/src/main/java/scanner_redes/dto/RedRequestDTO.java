package scanner_redes.dto;

public class RedRequestDTO {

    String ssid;
    String password;
    String nombre;
    boolean dchpEnabled;
    String ipAdress;
    String subnetMask;
    String defaultGetWay;
    String hostname;
    String dnsServerPrimary;


    public RedRequestDTO() {
    }


    public RedRequestDTO(String SSID, String password, String nombre, boolean dchpEnabled, String ipAdress, String subnetMask, String defaultGetWay, String dnsServerPrimary, String hostname) {
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
