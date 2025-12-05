package scanner_redes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegistrosController {
    List<RedRequestDTO> redes= new ArrayList<>();
    @PostMapping("/red")
    public ResponseEntity<?> addRed(@RequestBody RedRequestDTO red){
        if(red==null){
            return ResponseEntity.badRequest().body("no se ha podido añadir la red");
        }
        redes.add(red);
        RedResponseDTO nuevaRed= new RedResponseDTO(red.getSSID(),red.getNombre(),red.getDchpEnabled(),red.getIpAdress(),red.getSubnetMask(),red.getDefaultGetWay(),red.getHostname(),red.getDnsServerPrimary());
        return  ResponseEntity.ok().body(red);
    }

}
