package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {
	// Elementos
	private By barranome = By.id("name");
	private By barraemail = By.id("email");
	private By minhasenha = By.id("password");
	private By cadastrar = By.id("register");
	private By id1 = By.id("tdUserId1");
	private By nomeinvalido = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(1) > p");
	private By emailinvalido = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(2) > p");
	private By senhaobrigatoria = By.cssSelector("#root > div > div > div.register-form > form > div:nth-child(3) > p");
	private By usuarioscadastrados = By.cssSelector("#root > div > div > div.register-form.expanded > h2.table-title");
	private By exclusao = By.id("removeUser1");
	private By id2 = By.id("tdUserId2");

	// Getter

	public By getBarranome() {
		return barranome;
	}

	public By getBarraemail() {
		return barraemail;
	}

	public By getMinhasenha() {
		return minhasenha;
	}

	public By getCadastrar() {
		return cadastrar;
	}

	public By getId1() {
		return id1;
	}

	public By getNomeinvalido() {
		return nomeinvalido;
	}

	public By getEmailinvalido() {
		return emailinvalido;
	}

	public By getSenhaobrigatoria() {
		return senhaobrigatoria;
	}

	public By getUsuarioscadastrados() {
		return usuarioscadastrados;
	}

	public By getExclusao() {
		return exclusao;
	}

	public By getId2() {
		return id2;
	}

}
