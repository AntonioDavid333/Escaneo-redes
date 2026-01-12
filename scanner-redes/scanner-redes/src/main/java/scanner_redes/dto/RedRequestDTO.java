package scanner_redes.dto;

import java.util.Date;

public class RedRequestDTO {
    private String ssid;
    private Estado estado;

    public RedRequestDTO() {
    }

    public RedRequestDTO(String ssid, Estado estado) {
        this.ssid = ssid;
        this.estado = estado;
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

}
