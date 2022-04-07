package cz.upce.nnpia.be.repository;

import cz.upce.nnpia.be.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant,Integer> {
}
