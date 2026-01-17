package scanner_redes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import scanner_redes.dto.ComprobacionRequestDTO;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;
import scanner_redes.models.Comprobacion;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scanner_redes.dto.ComprobacionResponseDTO;
import scanner_redes.repositories.ComprobacionRepository;
import scanner_redes.repositories.RedRepository;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/configuracion-redes")
@CrossOrigin(origins = "http://localhost:5173")
public class TelemetriaController {

    List<ComprobacionResponseDTO> comprobaciones=new ArrayList<>();
    @Autowired
    ComprobacionRepository comprobacionRepository;
    @Autowired
    RedRepository redRepository;

    /**
     *
     * @param comprobacion comprobacion de red
     * @return devuelve un JSON de la comprobacion de la red añadida
     */
    @PostMapping
    public ResponseEntity<?> registrarTelemetria(@RequestBody ComprobacionRequestDTO comprobacion) {
        if (comprobacion == null) {
            return ResponseEntity.badRequest().body("No fue posible guardar la comprobación de red.");
        }
        if (!redRepository.existsBySsid(comprobacion.getSsid())){
            return ResponseEntity.badRequest().body("Esta red no está guardada en el sistema.");
        }
        ComprobacionResponseDTO compAdd = new ComprobacionResponseDTO(comprobacion.getSsid(), comprobacion.getEstado(), new Date());
        Comprobacion compSave = new Comprobacion(comprobacion.getSsid(), comprobacion.getEstado(), new Timestamp(new Date().getTime()));
//        if (comprobacionRepository.existsBySsid(compSave.getSsid())) {
//            return ResponseEntity.badRequest().body("Esta comprobación ya está guardada");
//        }
        comprobacionRepository.save(compSave);
        return ResponseEntity.ok().body(compSave);
    }


    /**
     *
     * @return devuelve una lista de comprobaciones de redes
     */
    @GetMapping
    public ResponseEntity<?> registrosTelemetria(){
        return ResponseEntity.ok().body(comprobacionRepository.findAll());
    }

}
