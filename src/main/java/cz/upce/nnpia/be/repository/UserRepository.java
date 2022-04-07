package cz.upce.nnpia.be.repository;

import cz.upce.nnpia.be.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
