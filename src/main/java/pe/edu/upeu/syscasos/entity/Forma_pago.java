package pe.edu.upeu.syscasos.entity;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "forma_pago")
public class Forma_pago {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id")
	private long id;
	@Column (name="nombre_pago",length = 50)
	private String nombre_pago;
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "forma_pago")
	@JsonIgnore
	private Set<Orden> ordenes;
}