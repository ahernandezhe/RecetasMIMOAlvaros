package models;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.avaje.ebean.Model.Find;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;

@Entity
public class Ingrediente extends Model{

	@Id
	private Long id;
	
	@Required
	private String nombre;
	
	@Required
	private String descripcion;
	
	@Required
	private String tipo;
	
	@ManyToMany(mappedBy = "ingredientes")
	@JsonIgnore
	private Set<Receta> recetas; 
	
	public Set<Receta> getRecetas() {
		return recetas;
	}

	public void setRecetas(Set<Receta> recetas) {
		this.recetas = recetas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public JsonNode toJson(){
		return Json.toJson(this);
	}
	
	public static JsonNode toJsonList(List<Ingrediente> ingredientes){
		ObjectNode result = Json.newObject();
		ArrayNode ingredientesNode = Json.newArray();
		for(Ingrediente ingrediente: ingredientes){
			ingredientesNode.addPOJO(ingrediente);
		}
		result.putArray("ingredientes").addAll(ingredientesNode);
		return result;
	}
	
	private static final Find<Long, Ingrediente> find = new Find<Long, Ingrediente>() {
	};
	
	public static Ingrediente findIngredienteById(Long id) {
		return find.byId(id);
	}

	public static Ingrediente findIngredienteByNombre(String nombreIngrediente) {
		return find.where().eq("nombre", nombreIngrediente).findUnique();
	}

	public static List<Ingrediente> findPage(Integer page, Integer count) {
		return find.setFirstRow(page * count).setMaxRows(count).findList();
	}
	
	public static List<Ingrediente> findIngredienteByTipo(String tipoIngrediente) {
		return find.where().eq("tipo", tipoIngrediente).findList();
	}
	

	
}
