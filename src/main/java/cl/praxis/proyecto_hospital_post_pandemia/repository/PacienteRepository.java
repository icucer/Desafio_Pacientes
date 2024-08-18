package cl.praxis.proyecto_hospital_post_pandemia.repository;

import cl.praxis.proyecto_hospital_post_pandemia.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}