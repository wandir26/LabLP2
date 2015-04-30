package lab04;

import java.util.ArrayList;
import java.util.Arrays;

public class Album {
	
	private String artista;
	private String titulo;
	private int anodelancamento;
	
	public Album(String artista, String titulo, int anodelancamento){
		
		this.artista = artista;
		this.titulo = titulo;
		this.anodelancamento = anodelancamento;
		
		
	}

	public String getArtista() {
		// TODO Auto-generated method stub
		return artista;
	}

	public String getTitulo() {
		// TODO Auto-generated method stub
		return titulo;
	}

	public int getAnodelancamento() {
		// TODO Auto-generated method stub
		return anodelancamento;
	}

}
