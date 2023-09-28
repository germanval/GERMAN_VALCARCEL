package org.cibertec.edu.pe.controller;

import java.util.List;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class ProductoController {
	
	@Autowired
	private IProductoService servicio;
	@GetMapping("/listar")
	public String Listar(Model m) {
		List<Producto>lista=servicio.Listado();
		m.addAttribute("productos",lista);
		return "listar";
	}
	@GetMapping("/nuevo")
	public String agregar(Model m) {
		m.addAttribute("producto",new Producto());
		return "agregar";
	}
	@GetMapping("/guardar")
	public String guardar(@Validated Producto p,Model m) {
		servicio.grabar(p);
		return "redirect:/listar";
	}
}
