package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import play.data.validation.Constraints.Required;
import play.libs.Json;


@Entity
public class Receta extends Model{
	
	@Id
	private Long id;
	
	@Required
	private String nombre;
	
	@Required
	private String descripcion;
	
	@Required
	private String categoria;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
	
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

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public JsonNode toJson(){
		return Json.toJson(this);
	}

	public static JsonNode toJsonList(List<Receta> recetas){
		ObjectNode result = Json.newObject();
		ArrayNode recetasNode = Json.newArray();
		for(Receta receta: recetas){
			recetasNode.addPOJO(receta);
		}
		result.putArray("recetas").addAll(recetasNode);
		return result;
	}
	
	
	public void addIngrediente(Ingrediente ing) {
		 this.ingredientes.add(ing);
		 ing.getRecetas().add(this);
		}
	
	
	public void addDatosReceta(Receta recetaAux){
		this.setNombre(recetaAux.getNombre());
		this.setDescripcion(recetaAux.getDescripcion());
		this.setCategoria(recetaAux.getCategoria());
	}
	
	private static final Find<Long, Receta> find = new Find<Long, Receta>() {
	};
	
	public static Receta findRecetaById(Long id) {
		return find.byId(id);
	}

	public static List<Receta> findRecetaByNombre(String nombreReceta) {
		return find.where().eq("nombre", nombreReceta).findList();
	}
	
	public static List<Receta> findRecetaByCategoria(String categoria) {
		return find.where().eq("categoria", categoria).findList();
	}

	public static List<Receta> findPage(Integer page, Integer count) {
		return find.setFirstRow(page * count).setMaxRows(count).findList();
	}
}
