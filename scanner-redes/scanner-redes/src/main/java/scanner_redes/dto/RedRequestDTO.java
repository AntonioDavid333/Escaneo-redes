package scanner_redes.dto;

import java.util.Date;

public class RedRequestDTO {
    private String nombre;
    private Estado estado;

    public RedRequestDTO() {
    }

    public RedRequestDTO(String nombre, Estado estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
