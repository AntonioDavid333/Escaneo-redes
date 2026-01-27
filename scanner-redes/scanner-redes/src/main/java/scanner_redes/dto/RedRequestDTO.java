package scanner_redes.dto;

import lombok.*;

@NoArgsConstructor @AllArgsConstructor
@Getter @Setter
@EqualsAndHashCode
public class RedRequestDTO {

    private String ssid;
    private String password;
    private String usuario;
//    String nombre;
//    boolean dchpEnabled;
//    String ipAdress;
//    String subnetMask;
//    String defaultGetWay;
//    String hostname;
//    String dnsServerPrimary;
    private String seguridad;


//    public RedRequestDTO() {
//    }
//
//
//    public RedRequestDTO(String ssid, String password, String seguridad) {
//        this.ssid = ssid;
//        this.password = password;
//        this.seguridad = seguridad;
//    }
//
//    public String getSsid() {
//        return ssid;
//    }
//
//    public void setSsid(String ssid) {
//        this.ssid = ssid;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getSeguridad() {
//        return seguridad;
//    }
//
//    public void setSeguridad(String seguridad) {
//        this.seguridad = seguridad;
//    }
}
