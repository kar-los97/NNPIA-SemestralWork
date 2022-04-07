package cz.upce.nnpia.be.repository;

import cz.upce.nnpia.be.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
