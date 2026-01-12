package scanner_redes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import scanner_redes.dto.RedListResponseDTO;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RegistrosController {
    List<RedRequestDTO> redes= new ArrayList<>();

    /**
     *
     * @param red nueva red registrada
     * @return devuelve JSON con la red registrada
     */
    @PostMapping("/red")
    public ResponseEntity<?> addRed(@RequestBody RedRequestDTO red){
        //verificar que no sea null
        if(red==null){
            return ResponseEntity.badRequest().body("no se ha podido añadir la red");
        }
        boolean existe= redes
                .stream()
                .anyMatch(r->r.getSSID().equals(red.getSSID()));
        //verificar que no exista
        if (existe){
            return ResponseEntity.badRequest().body("Esta red ya está registrada");
        }
        //añadir a la lista

        RedResponseDTO nuevaRed= new RedResponseDTO(red.getSSID(),
                red.getNombre(),red.isDchpEnabled(),
                red.getIpAdress(),red.getSubnetMask(),
                red.getDefaultGetWay(),
                red.getHostname(),
                red.getDnsServerPrimary());
        redes.add(red);
        return  ResponseEntity.ok().body(nuevaRed);
    }
    /*JSON PARA PROBAR:
    * {
    "SSID":"SSID",
    "password":"password",
    "nombre": "red-01",
    "dchpEnabled": true,
    "ipAdress":"192.13.108.01",
    "subnetMask":"192.13.0.0",
    "defaultGetWay":"127.0.0.1",
    "hostname": "host-name",
    "dnsServerPrimary":"escanerRedes.com"
    }*/

    /*EndPoint que permite consultar la lista de redes*/

    /**
     *
     * @return devuelve una lista de redes
     */
    @GetMapping("/red")
    public ResponseEntity<?> listadoRedes(){
        return ResponseEntity.ok().body(redes);
    }

}
