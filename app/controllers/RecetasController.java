package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.inject.Inject;

import com.avaje.ebean.annotation.Transactional;
import com.fasterxml.jackson.databind.JsonNode;

import models.Ingrediente;
import models.Receta;
import play.cache.CacheApi;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

public class RecetasController extends Controller{

	@Inject
	FormFactory formFactory;
	
	@Inject
	private CacheApi cache;

//================================================================================
//----------------------------GET RECETAS-----------------------------------------
//================================================================================
	
	//recetaId
	public Result recetaId(Long id)
	{
		Receta receta = cache.get("receta-" + id);
		if (receta == null) {
			receta = Receta.findRecetaById(id);
			cache.set("receta-" + id, receta, 30);
		}
		
		if (receta == null) {
			return notFound();
		}
		
		if (request().accepts("application/xml")) {
			List<Ingrediente> ingredientes = receta.getIngredientes();
			return ok(views.xml.receta.render(receta, ingredientes));
		}
		else if (request().accepts("application/json")) {
			JsonNode node = cache.get("usuario-" + id + "-json");
			if (node == null) {
				node = receta.toJson();
				cache.set("receta-" + id + "-json", node, 30);
			}
			return ok(node);
		}
		return Results.status(NOT_ACCEPTABLE);
	}
	
	//recetaNombre
	public Result recetaNombre(String nombre)
	{
		List<Receta> recetas = cache.get("recetasNom-" + nombre);
		if (recetas == null) {
			recetas = Receta.findRecetaByNombre(nombre);
			cache.set("recetasNom-" + nombre, recetas, 30);
		}
		
		if (recetas.isEmpty()) {
			return notFound();
		}
		
		if (request().accepts("application/xml")) {
			
			return ok(views.xml.recetas.render(recetas));
		}
		else if (request().accepts("application/json")) {
			JsonNode node = cache.get("recetasNom-" + nombre + "-json");
			if (node == null) {
				node = Receta.toJsonList(recetas);
				cache.set("recetasNom-" + nombre + "-json", node, 30);
			}
			return ok(node);
		}
		return Results.status(NOT_ACCEPTABLE);
	}
	
	//recetaCategoria
	public Result recetaCategoria(String categoria)
	{
		List<Receta> recetas = cache.get("recetasCat-" + categoria);
		if (recetas == null) {
			recetas = Receta.findRecetaByCategoria(categoria);
			cache.set("recetasCat-" + categoria, recetas, 30);
		}
		
		if (recetas.isEmpty()) {
			return notFound();
		}
		
		
		if (request().accepts("application/xml")) {
			return ok(views.xml.recetas.render(recetas));
		}
		else if (request().accepts("application/json")) {
			JsonNode node = cache.get("recetasCat-" + categoria + "-json");
			if (node == null) {
				node = Receta.toJsonList(recetas);
				cache.set("recetasCat-" + categoria + "-json", node, 30);
			}
			System.out.println(node);
			return ok(node);
		}
		return Results.status(NOT_ACCEPTABLE);
	}	
	
	
//================================================================================
//----------------------------GET INGREDIENTES------------------------------------
//================================================================================
	
	//ingredienteId
	public Result ingredienteId(Long id)
	{
		Ingrediente ingrediente = cache.get("ingrediente-" + id);
		
		if (ingrediente == null) {
			ingrediente = Ingrediente.findIngredienteById(id);
			cache.set("ingrediente-" + id, ingrediente, 30);
		}
		
		if (ingrediente == null) {
			return notFound();
		}
		
		
		if (request().accepts("application/xml")) {
			return ok(views.xml.ingrediente.render(ingrediente));
		}
		else if (request().accepts("application/json")) {
			JsonNode node = cache.get("ingrediente-" + id + "-json");
			if (node == null) {
				node = ingrediente.toJson();
				cache.set("ingrediente-" + id + "-json", node, 30);
			}
			return ok(node);
		}
		return Results.status(NOT_ACCEPTABLE);
	}
	
	//ingredienteNombre
	public Result ingredienteNombre(String nombre)
	{
		Ingrediente ingrediente = cache.get("ingredienteNom-" + nombre);
		
		if (ingrediente == null) {
			ingrediente = Ingrediente.findIngredienteByNombre(nombre);
			cache.set("ingredienteNom-" + nombre, ingrediente, 30);
		}
		
		if (ingrediente == null) {
			return notFound();
		}
		
		if (request().accepts("application/xml")) {
			return ok(views.xml.ingrediente.render(ingrediente));
		}
		else if (request().accepts("application/json")) {
			JsonNode node = cache.get("ingredienteNom-" + nombre + "-json");
			if (node == null) {
				node = ingrediente.toJson();
				cache.set("ingredienteNom-" + nombre + "-json", node, 30);
			}
			return ok(node);
		}
		return Results.status(NOT_ACCEPTABLE);
	}
	
	
	//ingredienteTipo
		public Result ingredientesTipo(String tipo)
		{
			List<Ingrediente> ingredientes = cache.get("ingredienteTipo-" + tipo);
			
			if (ingredientes == null) {
				ingredientes = Ingrediente.findIngredienteByTipo(tipo);
				cache.set("ingredienteTipo-" + tipo, ingredientes, 30);
			}
			
			if (ingredientes.isEmpty()) {
				return notFound();
			}
			

			if (request().accepts("application/xml")) {
				return ok(views.xml.ingredientes.render(ingredientes));
			}
			else if (request().accepts("application/json")) {
				JsonNode node = cache.get("ingredienteTipo-" + tipo + "-json");
				if (node == null) {
					node = Ingrediente.toJsonList(ingredientes);
					cache.set("ingredienteTipo-" + tipo + "-json", node, 30);
				}
				return ok(node);
			}
			return Results.status(NOT_ACCEPTABLE);
		}
		
//================================================================================
//----------------------------METODOS CREAR ---------------------------------------
//================================================================================
		
	
	//crearReceta
	public Result crearReceta()
	{	
		Form<Receta> f = formFactory.form(Receta.class).bindFromRequest();
		
		if(f.hasErrors()){
			return Results.badRequest(f.errorsAsJson());
		}
		
		Receta recetaJson = f.get();
		List<Ingrediente> ingredientesJson = recetaJson.getIngredientes(); 
		
		Receta recetaFinal =  new Receta();
		List<Ingrediente> ingredientesFinal = new ArrayList<Ingrediente>();
		
		for(Ingrediente ingrediente: ingredientesJson){
			if(Ingrediente.findIngredienteByNombre(ingrediente.getNombre()) != null)
			{
				Ingrediente ingredienteAux = Ingrediente.findIngredienteByNombre(ingrediente.getNombre());
				recetaFinal.addIngrediente(ingredienteAux);
			}
			else
			{
				ingrediente.save();
				recetaFinal.addIngrediente(ingrediente);
			}
		}
		recetaFinal.addDatosReceta(recetaJson);
		recetaFinal.save();
		
		return Results.status(CREATED, recetaFinal.toJson());
	}
	
	
	//crearIngrediente
	public Result crearIngrediente()
	{	
		Form<Ingrediente> f = formFactory.form(Ingrediente.class).bindFromRequest();
		
		if(f.hasErrors()){
			return Results.badRequest(f.errorsAsJson());
		}
		
		Ingrediente ingrediente = f.get();
		
		if(Ingrediente.findIngredienteByNombre(ingrediente.getNombre()) != null)
		{
			return Results.status(NOT_ACCEPTABLE);
		}
		ingrediente.save();
		
		return Results.status(CREATED, ingrediente.toJson());
	}
	
	
//================================================================================
//----------------------------METODOS ELIMINAR ---------------------------------------
//================================================================================
	
	//eliminarReceta
	public Result eliminarReceta(Long id)
	{	
		Receta receta = Receta.findRecetaById(id);
		
		if (receta == null) {
			return notFound();
		}
		
		receta.delete();
		return Results.status(OK);
	}
	
	
//================================================================================
//----------------------------METODOS ACTUALIZAR ---------------------------------------
//================================================================================

	//actualizarReceta
	@Transactional
	public Result actualizarReceta()
	{	
		Form<Receta> f = formFactory.form(Receta.class).bindFromRequest();
		
		if(f.hasErrors()){
			return Results.badRequest(f.errorsAsJson());
		}
		
		Receta recetaJson = f.get();
		if(recetaJson.getId() == null){
			return Results.status(CONFLICT);
		}
		
		if(Receta.findRecetaById(recetaJson.getId()) == null){
			return Results.status(NOT_FOUND);
		}
		
		List<Ingrediente> ingredientesJson = recetaJson.getIngredientes();
		
		Receta recetaFinal =  new Receta();
		List<Ingrediente> ingredientesFinal = new ArrayList<Ingrediente>();
		
		for(Ingrediente ingrediente: ingredientesJson){
			if(Ingrediente.findIngredienteByNombre(ingrediente.getNombre()) != null)
			{
				Ingrediente ingredienteAux = Ingrediente.findIngredienteByNombre(ingrediente.getNombre());
				ingrediente.setId(ingredienteAux.getId());
				if(ingredienteAux.equals(ingrediente)){
					recetaFinal.addIngrediente(ingredienteAux);
				}
				else
				{
					ingrediente.update();
					recetaFinal.addIngrediente(ingrediente);
				}
			}
			else
			{
				ingrediente.save();
				recetaFinal.addIngrediente(ingrediente);
			}
		}

		recetaFinal.addDatosReceta(recetaJson);
		recetaFinal.setId(recetaJson.getId());
		recetaFinal.update();
		return Results.status(OK, recetaFinal.toJson());
	}
	
	//actualizarIngrediente
	public Result actualizarIngrediente()
	{
		Form<Ingrediente> f = formFactory.form(Ingrediente.class).bindFromRequest();
		
		if(f.hasErrors()){
			return Results.badRequest(f.errorsAsJson());
		}
		
		Ingrediente ingrediente = f.get();
		
		if(ingrediente.getId() == null){
			return Results.status(CONFLICT);
		}
		
		if(Ingrediente.findIngredienteByNombre(ingrediente.getNombre()) != null)
		{
			return Results.status(CONFLICT);
		}
				
		if(Ingrediente.findIngredienteById(ingrediente.getId()) == null){
			return Results.status(NOT_FOUND);
		}
		
		ingrediente.update();
		
		return Results.status(OK, ingrediente.toJson());

		
	}
	
}
