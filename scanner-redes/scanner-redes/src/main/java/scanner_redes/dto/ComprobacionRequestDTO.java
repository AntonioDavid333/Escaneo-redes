package scanner_redes.dto;

public class ComprobacionRequestDTO {
    private String ssid;
    private Estado estado;

    public ComprobacionRequestDTO() {
    }

    public ComprobacionRequestDTO(String ssid, Estado estado) {
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
