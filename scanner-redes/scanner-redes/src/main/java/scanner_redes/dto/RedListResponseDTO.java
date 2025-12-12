package scanner_redes.dto;

public class RedListResponseDTO {
    private String SSID;
    private  String password;

    public RedListResponseDTO() {
    }

    public RedListResponseDTO(String SSID, String password) {
        this.SSID = SSID;
        this.password = password;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
