package cl.praxis.proyecto_hospital_post_pandemia.service;

import cl.praxis.proyecto_hospital_post_pandemia.model.Paciente;
import cl.praxis.proyecto_hospital_post_pandemia.repository.PacienteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {
    private static final Logger logger = LoggerFactory.getLogger(PacienteService.class);

    @Autowired
    private PacienteRepository pacienteRepository;

    public List<Paciente> listarPacientes() {
        logger.info("Listando todos los pacientes hospitalizados");
        return pacienteRepository.findAll();
    }
}