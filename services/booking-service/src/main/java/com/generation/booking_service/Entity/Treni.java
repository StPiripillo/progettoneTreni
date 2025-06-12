package com.generation.booking_service.Entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Treni extends BaseEntity
{
	boolean partenza;
	boolean ritardo;
	int orario;
	int velocita;
	String posti;
	String vagone;
}
