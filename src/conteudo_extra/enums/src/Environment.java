package conteudo_extra.enums.src;

public enum Environment {
	
	DES("https://des.domain.com:2134/"),
	HOMO("https://homo.domain.com:8080/"),
	PROD("https://prod.domain.com:1088/");

	private String url;

	Environment(String url) {
		this.url = url;
	}

	public String getValor() {
		return this.url;
	}

}