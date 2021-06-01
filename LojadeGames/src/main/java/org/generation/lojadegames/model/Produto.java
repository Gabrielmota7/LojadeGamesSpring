package org.generation.lojadegames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.generation.lojadegames.model.Produto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	private String Genero;
	
	@NotNull
	private Long Valor;
	
	public Long getValor() {
		return Valor;
	}

	public void setValor(Long valor) {
		Valor = valor;
	}

	@ManyToOne(MappedBy = "Categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("Categoria")
	private List<Categoria> Plataforma;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public List<Categoria> getPlataforma() {
		return Plataforma;
	}

	public void setPlataforma(List<Categoria> plataforma) {
		Plataforma = plataforma;
	}

}
