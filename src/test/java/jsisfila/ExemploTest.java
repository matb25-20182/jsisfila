package jsisfila;

import static org.junit.Assert.assertThat;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import org.junit.Test;

public class ExemploTest {

	@Test
	public void deveConverterCodigoParaCaixaAlta() {
		Colegiado col = new Colegiado("bcc", "Bacharelado em Ciência da Computação");
		assertThat(col.getCodigo(), is("BCC"));
		assertTrue(col.isValido());
	}
	
}
