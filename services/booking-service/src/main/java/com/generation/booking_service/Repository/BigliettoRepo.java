package com.generation.booking_service.Repository;

import com.generation.booking_service.Entity.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigliettoRepo extends JpaRepository<Biglietto,Long>
{
}
