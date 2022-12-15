package med.voll.api.paciente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
