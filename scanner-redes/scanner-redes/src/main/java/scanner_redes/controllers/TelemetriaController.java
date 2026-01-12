package scanner_redes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;
import scanner_redes.models.Red;
import scanner_redes.repositories.RedRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/telemetria")
public class TelemetriaController {
    List<RedResponseDTO> redes=new ArrayList<>();
    @Autowired
    RedRepository redRepository;


    @PostMapping
    public ResponseEntity<?> registrarTelemetria(@RequestBody RedRequestDTO red){
        if (red==null){
            return ResponseEntity.badRequest().body("No fue posible guardar la comprobación de red.");
        }
        RedResponseDTO redAdd=new RedResponseDTO(red.getSsid(), red.getEstado(),new Date());
        Red redSave=new Red(red.getSsid(), red.getEstado(),new Date());
        if (redRepository.existsById(redSave.getSsid())){
            return ResponseEntity.badRequest().body("Esta red ya está guardada");
        }
        redRepository.save(redSave);
        redes.add(redAdd);

        return ResponseEntity.ok().body(redAdd);
    }

    @GetMapping
    public ResponseEntity<?> registrosTelemetria(){
        return ResponseEntity.ok().body(redRepository.findAll());
    }

}
