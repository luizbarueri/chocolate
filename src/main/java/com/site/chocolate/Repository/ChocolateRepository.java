package com.site.chocolate.Repository;

import com.site.chocolate.Model.Chocolate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChocolateRepository extends JpaRepository<Chocolate, Long> {

}
