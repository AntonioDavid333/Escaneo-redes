package scanner_redes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scanner_redes.dto.ComprobacionRequestDTO;
import scanner_redes.dto.ComprobacionResponseDTO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TelemetriaController {
    List<ComprobacionResponseDTO> redes=new ArrayList<>();

    @PostMapping("/telemetria")
    public ResponseEntity<?> registrarTelemetria(@RequestBody ComprobacionRequestDTO red){
        if (red==null){
            return ResponseEntity.badRequest().body("No fue posible guardar la comprobación de red.");
        }
        ComprobacionResponseDTO redAdd=new ComprobacionResponseDTO(red.getNombre(), red.getEstado(),new Date());
        redes.add(redAdd);

        return ResponseEntity.ok().body(redAdd);
    }

    @GetMapping("/telemetria")
    public ResponseEntity<?> registrosTelemetria(){
        return ResponseEntity.ok().body(redes);
    }

}
