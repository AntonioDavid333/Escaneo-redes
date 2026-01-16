package scanner_redes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scanner_redes.models.Comprobacion;

@Repository
public interface ComprobacionRepository extends JpaRepository<Comprobacion,String> {
    boolean existsBySsid(String ssid);
}
