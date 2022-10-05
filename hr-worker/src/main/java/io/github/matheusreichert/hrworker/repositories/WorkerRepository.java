package io.github.matheusreichert.hrworker.repositories;

import io.github.matheusreichert.hrworker.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
