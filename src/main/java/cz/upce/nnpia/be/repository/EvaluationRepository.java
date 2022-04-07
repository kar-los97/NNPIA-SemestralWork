package cz.upce.nnpia.be.repository;

import cz.upce.nnpia.be.entity.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation,Integer> {
}
