package com.generation.booking_service.Entity;


import com.generation.booking_service.Enum.TipoPasseggero;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Passeggero extends BaseEntity {

	int age;
	String name;
	String surname;
	String email;
	@Enumerated(EnumType.STRING)
	private TipoPasseggero tipoPasseggero;


}

