package scanner_redes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.*;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;
import scanner_redes.models.Red;
import scanner_redes.repositories.RedRepository;
=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scanner_redes.dto.ComprobacionRequestDTO;
import scanner_redes.dto.ComprobacionResponseDTO;
>>>>>>> ab20c0aaf24c84e7210fbd9917cc82dd3bfab2fa

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/telemetria")
public class TelemetriaController {
<<<<<<< HEAD
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
=======
    List<ComprobacionResponseDTO> redes=new ArrayList<>();

    /**
     *
     * @param red comprobacion de red
     * @return devuelve un JSON de la comprobacion de la red añadida
     */
    @PostMapping("/telemetria")
    public ResponseEntity<?> registrarTelemetria(@RequestBody ComprobacionRequestDTO red){
        if (red==null){
            return ResponseEntity.badRequest().body("No fue posible guardar la comprobación de red.");
        }
        ComprobacionResponseDTO redAdd=new ComprobacionResponseDTO(red.getNombre(), red.getEstado(),new Date());
>>>>>>> ab20c0aaf24c84e7210fbd9917cc82dd3bfab2fa
        redes.add(redAdd);

        return ResponseEntity.ok().body(redAdd);
    }

<<<<<<< HEAD
    @GetMapping
=======
    /**
     *
     * @return devuelve una lista de comprobaciones de redes
     */
    @GetMapping("/telemetria")
>>>>>>> ab20c0aaf24c84e7210fbd9917cc82dd3bfab2fa
    public ResponseEntity<?> registrosTelemetria(){
        return ResponseEntity.ok().body(redRepository.findAll());
    }

}
