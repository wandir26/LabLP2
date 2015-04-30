package lab04;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class TestaAlbum {

	@Test
	public void testaAlbum() {
		try {
			Album chandelier = new Album("Chandelier", 3, "Pop");
			Album elasticHeart = new Album("Elastic Heart", 3, "Pop");
			Album cellophane = new Album("Cellophane", 4, "Pop");

			Assert.assertEquals("Chandelier", chandelier.getArtista());
			Assert.assertEquals(3, chandelier.getTitulo());
			Assert.assertEquals("Pop", chandelier.getAnodelancamento());

			Assert.assertEquals("Elastic Heart", elasticHeart.getArtista());
			Assert.assertEquals(3, elasticHeart.getTitulo());
			Assert.assertEquals("Pop", elasticHeart.getAnodelancamento());

			Assert.assertEquals("Cellophane", cellophane.getArtista());
			Assert.assertEquals(4, cellophane.getTitulo());
			Assert.assertEquals("Pop", cellophane.getAnodelancamento());

			Album chandelierRemix = new Album("Chandelier", 3, "Pop");
			Assert.assertEquals(chandelier, chandelierRemix);
			Assert.assertFalse(chandelier.equals(cellophane));

		} catch (Exception e) {
			Assert.fail();// nao deveria ter lancado nenhuma Exception nesse
							// teste.
		}
	}

	@Test
	public void testAlbumInvalido() {
		try {
			Album artistaInvalido = new Album("", 3, "Pop");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals("Titulo da musica nao pode ser vazio.",
					e.getMessage());
		}

		try {
			Album tituloInvalido = new Album("Elastic Heart", -5, "Pop");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals("Duracao da musica nao pode ser negativa.",
					e.getMessage());
		}

		try {
			Album anodeduracaoInvalido = new Album("Cellophane", 4, "");
			Assert.fail(); // se chegar aqui da erro, pois deveria lancar
							// exception.
		} catch (Exception e) {
			Assert.assertEquals("Genero da musica nao pode ser vazio.",
					e.getMessage());
		}

	}
}
