package br.com.britto.hr_worker.repository;

import br.com.britto.hr_worker.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
