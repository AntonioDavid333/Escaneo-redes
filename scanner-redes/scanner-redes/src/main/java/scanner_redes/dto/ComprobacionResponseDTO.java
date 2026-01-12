package scanner_redes.dto;

import java.util.Date;

public class ComprobacionResponseDTO {
    private String nombre;
    private Estado estado;
    private Date fecha;

    public ComprobacionResponseDTO() {
    }

    public ComprobacionResponseDTO(String nombre, Estado estado, Date fecha) {
        this.nombre = nombre;
        this.estado = estado;
        this.fecha=fecha;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
