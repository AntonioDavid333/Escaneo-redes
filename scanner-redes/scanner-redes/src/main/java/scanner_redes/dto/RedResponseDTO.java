package scanner_redes.dto;

public class RedResponseDTO {

    private String ssid;
//    String nombre;
//    boolean dchpEnabled;
//    String ipAdress;
//    String subnetMask;
//    String defaultGetWay;
//    String hostname;
//    String dnsServerPrimary;
    private String seguridad;


    public RedResponseDTO() {
    }


    public RedResponseDTO(String ssid, String seguridad) {
        this.ssid = ssid;
        this.seguridad = seguridad;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
}
