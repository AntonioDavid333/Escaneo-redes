package scanner_redes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import scanner_redes.models.Comprobacion;
import scanner_redes.models.Red;

@Repository
public interface RedRepository extends JpaRepository<Red,String> {
}
