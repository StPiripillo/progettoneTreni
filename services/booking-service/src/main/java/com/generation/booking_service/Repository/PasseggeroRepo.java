package com.generation.booking_service.Repository;

import com.generation.booking_service.Entity.Passeggero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasseggeroRepo extends JpaRepository<Passeggero, Long>
{
}
