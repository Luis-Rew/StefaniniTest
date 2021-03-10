package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.Metodos;

public class Steps {
	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	// CT01
	@Dado("que eu acesse {string}")
	public void que_eu_acesse(String appUrl) {
		metodos.abrirNavegador(appUrl, "Acessando o site");

	}

	@Quando("escrever meu nome {string}")
	public void escrever_meu_nome(String MeuNome) {
		metodos.preencher(el.getBarranome(), MeuNome);
	}

	@Quando("escrever meu e-mail {string}")
	public void escrever_meu_e_mail(String MeuEmail) {
		metodos.preencher(el.getBarraemail(), MeuEmail);

	}

	@Quando("digitar uma nova senha")
	public void digitar_uma_nova_senha() throws InterruptedException {
		metodos.preencher(el.getMinhasenha(), "stefanini123");
		metodos.pausa(1000);
	}

	@Quando("clicar em cadastrar")
	public void clicar_em_cadastrar() throws InterruptedException {
		metodos.clicar(el.getCadastrar());
		metodos.pausa(1000);

	}

	@Então("meu nome deverá aparecer na lista de Usuários Cadastrados {string}")
	public void meu_nome_deverá_aparecer_na_lista_de_usuários_cadastrados(String ID1)
			throws InterruptedException, IOException {
		metodos.pausa(1000);
		metodos.rolarPagina();
		metodos.validarMensagem(ID1, el.getId1());
		metodos.screenShoot("Usuário Cadastrado");
		metodos.pausa(1000);
		metodos.fecharNavegador();
	}

//CT02
	@Dado("que eu acesso {string}")
	public void que_eu_acesso(String appUrl) {
		metodos.abrirNavegador(appUrl, "Abrindo Navegador");

	}

	@Quando("escrever meu nome incompleto {string}")
	public void escrever_meu_nome_incompleto(String NomeIncompleto) {
		metodos.preencher(el.getBarranome(), NomeIncompleto);

	}

	@Quando("escrever meu e-mail incompleto {string}")
	public void escrever_meu_e_mail_incompleto(String EmailInvalido) throws InterruptedException {
		metodos.preencher(el.getBarraemail(), EmailInvalido);
		metodos.clicar(el.getCadastrar());
		metodos.pausa(2000);
	}

	@Então("deverá aparecer mensagem de erro no nome {string}")
	public void deverá_aparecer_mensagem_de_erro_no_nome(String NomeInvalido) throws InterruptedException {
		metodos.validarMensagem(NomeInvalido, el.getNomeinvalido());
		metodos.pausa(1000);

	}

	@Então("mensagem de erro no e-mail {string}")
	public void mensagem_de_erro_no_e_mail(String EmailInvalido) throws InterruptedException {
		metodos.validarMensagem(EmailInvalido, el.getEmailinvalido());
		metodos.pausa(1000);
	}

	@Então("mostrar que é obrigatório o uso de senha  {string}")
	public void mostrar_que_é_obrigatório_o_uso_de_senha(String SenhaObrigatoria)
			throws IOException, InterruptedException {
		metodos.validarMensagem(SenhaObrigatoria, el.getSenhaobrigatoria());
		metodos.pausa(1000);
		metodos.screenShoot("Erro ao Cadastrar");
		metodos.fecharNavegador();
	}

//CT03 
	@Quando("digitar um novo nome {string}")
	public void digitar_um_novo_nome(String SegundoNome) {
		metodos.preencher(el.getBarranome(), SegundoNome);
	}

	@Quando("escrever um novo e-mail {string}")
	public void escrever_um_novo_e_mail(String NovoEmail) {
		metodos.preencher(el.getBarraemail(), NovoEmail);
	}

	@Então("deverá aparecer os usuários cadastrados {string}")
	public void deverá_aparecer_os_usuários_cadastrados(String UsuariosCadastrados) throws InterruptedException {
		metodos.rolarPagina();
		metodos.pausa(1000);
		metodos.validarMensagem(UsuariosCadastrados, el.getUsuarioscadastrados());
		metodos.pausa(1000);
	}

	@Então("clico em excluir o primeiro usuário")
	public void clico_em_excluir_o_primeiro_usuário() throws InterruptedException {
		metodos.clicar(el.getExclusao());
		metodos.pausa(2000);
	}

	@Então("valido que o segundo nome permaneceu na lista {string}")
	public void valido_que_o_segundo_nome_permaneceu_na_lista(String ID2) throws IOException {
		metodos.validarMensagem(ID2, el.getId2());
		metodos.screenShoot("ID2");
		metodos.fecharNavegador();

	}

}
