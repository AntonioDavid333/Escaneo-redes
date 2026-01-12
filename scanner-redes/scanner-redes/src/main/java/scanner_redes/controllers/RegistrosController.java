package scanner_redes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import scanner_redes.dto.RedListResponseDTO;
import scanner_redes.dto.RedRequestDTO;
import scanner_redes.dto.RedResponseDTO;
import scanner_redes.models.Red;
import scanner_redes.repositories.RedRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/redes")
public class RegistrosController {
    List<RedRequestDTO> redes= new ArrayList<>();
    @Autowired
    RedRepository redRepository;

    /**
     *
     * @param red nueva red registrada
     * @return devuelve JSON con la red registrada
     */
    @PostMapping
    public ResponseEntity<?> addRed(@RequestBody RedRequestDTO red){
        //verificar que no sea null
        if(red==null){
            return ResponseEntity.badRequest().body("no se ha podido añadir la red");
        }
        if (redRepository.existsById(red.getSsid())){
            return ResponseEntity.badRequest().body("Esta red ya está registrada");
        }
//        boolean existe= redes
//                .stream()
//                .anyMatch(r->r.getSsid().equals(red.getSsid()));
//        //verificar que no exista
//        if (existe){
//            return ResponseEntity.badRequest().body("Esta red ya está registrada");
//        }
        //añadir a la lista

//        RedResponseDTO nuevaRed= new RedResponseDTO(red.getSsid(),
//                red.isDchpEnabled(),
//                red.getIpAdress(),red.getSubnetMask(),
//                red.getDefaultGetWay(),
//                red.getHostname(),
//                red.getDnsServerPrimary());
//        redes.add(red);
        Red redSave= new Red(red.getSsid(),
                red.getPassword(),
                red.isDchpEnabled(),
                red.getIpAdress(),red.getSubnetMask(),
                red.getDefaultGetWay(),
                red.getHostname(),
                red.getDnsServerPrimary());

        return  ResponseEntity.ok().body(redRepository.save(redSave));
    }
    /*JSON PARA PROBAR:
    * {
    "ssid":"SSID",
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
    @GetMapping
    public ResponseEntity<?> listadoRedes(){
        return ResponseEntity.ok().body(redRepository.findAll());
    }

}
