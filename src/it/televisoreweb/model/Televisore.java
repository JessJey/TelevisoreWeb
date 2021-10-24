package it.televisoreweb.model;

public class Televisore {

	public Long id;
	public String marca;
	public String modello;
	public String numeroSeriale;
	public int prezzo;

	public Televisore() {
		// TODO Auto-generated constructor stub
	}

	public Televisore(String marca, String modello, String numeroSeriale, int prezzo) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.numeroSeriale = numeroSeriale;
		this.prezzo = prezzo;
	}

	public Televisore(Long id, String marca, String modello, String numeroSeriale, int prezzo) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.numeroSeriale = numeroSeriale;
		this.prezzo = prezzo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getNumeroSeriale() {
		return numeroSeriale;
	}

	public void setNumeroSeriale(String numeroSeriale) {
		this.numeroSeriale = numeroSeriale;
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
}
