package edu.poniperro.isp.ejercicio.domain;

import edu.poniperro.isp.ejercicio.interfaces.ITexto;
import edu.poniperro.isp.ejercicio.interfaces.IIdioma;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTexto implements ITexto, IIdioma {

	private List<String> texto = new ArrayList<>();

	@Override
	public void añadirPalabra(String palabra) {
		texto.add(palabra);
	}

	@Override
	public String getTexto() {
		return texto.stream().collect(Collectors.joining(" "));
	}

	@Override
	public boolean comprobarIdioma(Idioma idioma) {
		for (String palabra: texto) {
			if (! idioma.diccionario.contains(palabra.toLowerCase())) {
				return false;
			}
		}
		return true;
	}
}
