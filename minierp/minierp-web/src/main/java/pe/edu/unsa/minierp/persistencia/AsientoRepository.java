package pe.edu.unsa.minierp.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.unsa.minierp.dominio.Cuenta;

@Repository
public interface AsientoRepository extends JpaRepository<Cuenta, Integer> {
}
