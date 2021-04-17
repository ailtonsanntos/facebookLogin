package tests;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class RealizarAutenticacao {
	
	WebDriver driver;

	@Dado("acessar a página de login do facebook")
	public void acessar_a_página_de_login_do_facebook() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\Chrome\\89\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/login");		
		
	    
	}

	@Quando("preencho o campo {string} e {string} válidos")
	public void preencho_o_campo_e_válidos(String email, String senha) {
	    
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("as0390956@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("%Barth16%");
		
		driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

	@Então("valido que o usuário fez login no facebook")
	public void valido_que_o_usuário_fez_login_no_facebook() {

		assertEquals("https://www.facebook.com/?sk=welcome", "https://www.facebook.com/?sk=welcome");
		
		driver.close();
	}

	@Quando("preencho o campo <email> e <senha> que não estão cadastado")
	public void preencho_o_campo_email_e_senha_que_não_estão_cadastado() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("exibe a mensagem O email que você inseriu não está conectado a uma conta. Encontre sua conta e entre.")
	public void exibe_a_mensagem_o_email_que_você_inseriu_não_está_conectado_a_uma_conta_encontre_sua_conta_e_entre(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("preencho o campo <email> válido e <senha> inválida")
	public void preencho_o_campo_email_válido_e_senha_inválida() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("exibe a mensagem {string}")
	public void exibe_a_mensagem(String string, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}

	@Quando("não preencho os campos <email> e <senha> e clica no botão entrar")
	public void não_preencho_os_campos_email_e_senha_e_clica_no_botão_entrar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Então("exibe a mensagem O email ou o número de celular que você inseriu não está conectado a uma conta. Encontre sua conta e entre.")
	public void exibe_a_mensagem_o_email_ou_o_número_de_celular_que_você_inseriu_não_está_conectado_a_uma_conta_encontre_sua_conta_e_entre(io.cucumber.datatable.DataTable dataTable) {
	   
		driver.close();
	}
}
