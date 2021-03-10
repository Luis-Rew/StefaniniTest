package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// mostrar o caminho das features
		features = "src/test/resources/features/",
		// mostrar pacote estÃ£o os steps para execuÃ§Ã£o
		glue = "br.com.framework.step",
		// tags para direcionar a execuÃ§Ã£o dos testes
		tags = "@regressivos",
		// formataÃ§Ã£o do console cucumber | report html
		plugin = { "pretty", "html:target/report .html" },
		// monochrome deixa mais limpo o console, sem trazer caracteres especiais
		monochrome = true,
		// nÃ£o executa teste ele sÃ³ valida o mapeamento se falta terminar alguma
		// coisa,
		dryRun = false)
public class Executa {

}
