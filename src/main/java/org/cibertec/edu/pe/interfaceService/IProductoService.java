package org.cibertec.edu.pe.interfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.model.Producto;

public interface IProductoService {

	public List<Producto> Listado();
	public Optional<Producto> buscar(int id);
	public int grabar(Producto ObjP);
}
