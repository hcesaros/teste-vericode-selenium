//Autor: Henrique Cesar
//Data: 28/09/2024

package steps;

import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.E;

import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;


/**
 * Classe que define os passos de teste para o formulário da Tricentis,
 * simulando interações do usuário com a aplicação web.
 */
public class FormularioTricentisSteps {

    public WebDriver browser;

    /**
     * Construtor da classe, responsável por configurar o driver do Chrome.
     */
    public FormularioTricentisSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	    browser = new ChromeDriver();
    }

    /**
     * Passo que navega para a URL especificada.
     * @param string URL do site a ser acessado.
     */
    @Dado("^que eu estou no site \"([^\"]*)\"$")
    public void que_eu_estou_no_site(String string) {
        browser.get(string);
    }

    /**
     * Passo que verifica se o site foi carregado com sucesso,
     * tirando um screenshot da página e fechando o navegador.
     * @throws IOException Caso ocorra um erro ao capturar o screenshot.
     */
    @Entao("o site é exibido")
    public void oSiteÉExibido() throws IOException {
        // Cria um objeto TakesScreenshot para capturar o screenshot.
        TakesScreenshot ts = (TakesScreenshot) browser;
        // Captura o screenshot e salva em um objeto File.
        File source = ts.getScreenshotAs(OutputType.FILE);
        // Copia o screenshot para o diretório especificado.
        FileUtils.copyFile(source, new File("./screenshots/site_tricentis.png"));

        // Fecha o navegador.
        browser.quit();
    }

    /**
     * Passo que clica no dropdown "Make" no formulário.
     */
    @Dado("clico na opcao Make")
    public void clico_na_opcao_Make() {
        WebElement input = browser.findElement( By.cssSelector("#make"));
        input.click();
    }

    /**
     * Passo que seleciona a opção "Honda" no dropdown "Make".
     */
    @Entao("seleciono a opcao Honda")
    public void seleciono_a_opcao_Honda() {
        WebElement input = browser.findElement( By.cssSelector("option[value='Honda']"));
        input.click();
    }

    /**
     * Passo que clica no dropdown "Model" no formulário.
     */
    @Dado("clico na opcao Model")
    public void clico_na_opcao_Model() {
        WebElement input = browser.findElement( By.cssSelector("#make"));
        input.click();
    }
    
    /**
     * Passo que seleciona a opção "Scooter" no dropdown "Model".
     */
    @Entao("seleciono a opcao Scooter")
    public void seleciono_a_opcao_Scooter() {
        WebElement input = browser.findElement( By.cssSelector("option[value='Scooter']"));
        input.click();
    }

    /**
     * Passo que digita o valor "300" no campo "Cylinder Capacity".
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("digito no campo Cylinder Capacity o valor 300")
    public void clico_na_opcao_Cylinder_Capacity() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#cylindercapacity"));
        input.sendKeys("300");
    }

    /**
     * Passo que digita o valor "150" no campo "Engine Performance".
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @Entao("digito no campo Engine Performance o valor 150")
    public void clico_na_opcao_Engine_Performance() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#engineperformance"));
        input.sendKeys("150");

    }

    /**
     * Passo que digita a data "12/28/2023" no campo "Date of Manufacture".
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @Entao("digito no campo Date of Manufacture 12/28/2023")
    public void clico_na_opcao_Date_of_Manufacture() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#dateofmanufacture"));
        input.sendKeys("12/28/2023");

    }

    /**
     * Passo que seleciona a opção "2" no dropdown "Number of Seats".
     */
    @Entao("clico na opcao Number of Seats")
    public void clico_na_opcao_Number_of_Seats() {
        WebElement input = browser.findElement( By.cssSelector("#numberofseats"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("2");
    }

    /**
     * Passo que clica na opção "Yes" no campo "Right Hand Drive".
     */
    @Entao("seleciono no campo Right Hand Drive a opcao Yes")
    public void seleciono_na_campo_Right_Hand_Drive_a_opcao_Yes() {
        WebElement input = browser.findElement( By.cssSelector(".ideal-radiocheck-label"));
        input.click();
    }

    /**
     * Passo que seleciona a opção "2" no campo "Number of Seat".
     */
    @Entao("seleciono a opcao 2 no campo Number of Seat")
    public void seleciono_a_opcao_campo_Number_of_Seat() {
        WebElement input = browser.findElement( By.cssSelector("#numberofseatsmotorcycle"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("2");

    }

    /**
     * Passo que seleciona a opção "Petrol" no campo "Fuel Type".
     */
    @Entao("seleciono a opcao Petrol no campo Fuel Type")
    public void seleciono_opcao_no_campo_Fuel_Type() {
        WebElement input = browser.findElement( By.cssSelector("#fuel"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Petrol");
    }

    /**
     * Passo que digita o valor "250" no campo "Payload".
     */
    @Entao("digito no campo Payload o valor 250")
    public void digito_no_campo_Payload_valor() {
        WebElement input = browser.findElement( By.cssSelector("#payload"));
        input.sendKeys("250");
    }


    /**
     * Passo que digita o valor "250" no campo "Total Weight".
     */
    @Entao("digito no campo Total Weight o valor 250")
    public void digito_no_campo_Total_Weight() {
        WebElement input = browser.findElement( By.cssSelector("#totalweight"));
        input.sendKeys("250");
    }

    /**
     * Passo que digita o valor "5000" no campo "List Price".
     */
    @Entao("digito no campo List Price o valor 5000")
    public void digito_no_campo_List_Price() {
        WebElement input = browser.findElement( By.cssSelector("#listprice"));
        input.sendKeys("5000");
    }


    /**
     * Passo que digita o valor "DCO7657" no campo "License Plate Number".
     */
    @Entao("digito no campo License Plate Number o valor DCO7657")
    public void digito_no_campo_License_Plate_Number() {
        WebElement input = browser.findElement( By.cssSelector("#licenseplatenumber"));
        input.sendKeys("DCO7657");
    }

    /**
     * Passo que digita o valor "230" no campo "Annual Mileage",
     * tira um screenshot da página e salva no diretório especificado.
     * @throws IOException Caso ocorra um erro ao capturar o screenshot.
     */
    @Entao("digito no campo Annual Mileage o valor 230")
    public void digito_no_campo_Annual_Mileage() throws IOException {
        WebElement input = browser.findElement( By.cssSelector("#annualmileage"));
        input.sendKeys("230");

        TakesScreenshot ts = (TakesScreenshot) browser;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenshots/aba_enter_vehicle_data.png"));
    }

    /**
     * Passo que clica no botão "Next" para prosseguir para a próxima aba.
     */
    @Quando("clico no botao Next")
    public void clicoNoBotaoNext() {
        WebElement nextButton = browser.findElement(By.xpath("//button[contains(text(),'Next')]"));
        nextButton.click();
    }

    /**
     * Passo que verifica se o usuário foi redirecionado para a aba "Enter Insurant Data",
     * e fecha o navegador.
     * @throws IOException Caso ocorra um erro ao capturar o screenshot.
     */
    @Entao("sou redirecionado pra aba Enter Insurant Data")
    public void redirecionado_para_aba() throws IOException {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterinsurantdata']"));
        String actualTabName = tabElement.getText();
        Assert.assertEquals("Enter Insurant Data", actualTabName);
        browser.quit();
    }

    /**
     * Passo que clica na aba "Enter Insurant Data".
     */
    @E("clico na aba Enter Insurant Data")
    public void clicoNaAbaEnterInsurantData() {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterinsurantdata']"));
        tabElement.click();
    }

    /**
     * Passo que digita o nome "Henrique" no campo "First Name".
     * @param arg0 Argumento passado pelo arquivo .feature (não utilizado).
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("digito no campo First Name o nome \"([^\"]*)\"")
    public void digitoNoCampoFirstNameONome(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#firstname"));
        input.sendKeys("Henrique");
    }

    /**
     * Passo que digita o sobrenome "Cesar" no campo "Last Name".
     * @param arg0 Argumento passado pelo arquivo .feature (não utilizado).
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("digito no campo Last Name o sobrenome \"([^\"]*)\"")
    public void digitoNoCampoLastNameOSobrenomeCesar(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#lastname"));
        input.sendKeys("Cesar");
    }

    /**
     * Passo que digita a data "04/16/1985" no campo "Date of Birth".
     * @param arg0 Argumento passado pelo arquivo .feature (não utilizado).
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("digito no campo Date of Birth a data \"([^\"]*)\"")
    public void digitoNoCampoDateOfBirthAData(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#birthdate"));
        input.sendKeys("04/16/1985");
    }

    /**
     * Passo que clica na opção "male" no campo "Gender".
     */
    @E("clico na opcao male no campo Gender")
    public void clicoNaOpcaoMaleNoCampoGender() {
        WebElement radiobutton = browser.findElement( By.cssSelector(".ideal-radiocheck-label"));
        radiobutton.isSelected();
    }

    /**
     * Passo que seleciona a opção "Brazil" no campo "Country".
     */
    @Entao("seleciono a opcao Brazil no campo Country")
    public void selecionoAOpcaoBrazilNoCampoCountry() {
        WebElement input = browser.findElement( By.cssSelector("#country"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Brazil");
    }

    /**
     * Passo que digita o CEP "03178000" no campo "Zip Code".
     * @param arg0 Argumento passado pelo arquivo .feature (não utilizado).
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("digito no campo Zip Code o cep \"([^\"]*)\"")
    public void digitoNoCampoZipCodeOCep(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#zipcode"));
        input.sendKeys("03178000");
    }

    /**
     * Passo que digita a cidade "Sao Paulo" no campo "City".
     * @param arg0 Argumento passado pelo arquivo .feature (não utilizado).
     * @throws Throwable Caso ocorra um erro durante a execução.
     */
    @E("no campo City digito \"([^\"]*)\"")
    public void noCampoCityDigito(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#city"));
        input.sendKeys("Sao Paulo");
    }

    /**
     * Passo que seleciona a opção "Employee" no campo "Occupation".
     */
    @E("no campo Occupation seleciono a opcao Employee")
    public void noCampoOccupationSelecionoAOpcaoEmployee() {
        WebElement input = browser.findElement( By.cssSelector("#occupation"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Employee");
    }


    /**
     * Passo que realiza o upload de uma foto no formulário,
     * tira um screenshot da página e salva no diretório especificado.
     * @throws IOException Caso ocorra um erro ao capturar o screenshot ou fazer o upload.
     */
    @E("faço o uplod da minha foto")
    public void façoOUplodDaMinhaFoto() throws IOException {
        WebElement input = browser.findElement(By.cssSelector("input[type='file']"));
        input.sendKeys("/Users/henrique_cesar/Downloads/TesteVericodeSelenium/images/foto.png");

        TakesScreenshot ts = (TakesScreenshot) browser;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenshots/aba_enter_insurant_data.png"));
    }

    /**
     * Passo que clica no botão "Next" para prosseguir para a próxima aba.
     */
    @Quando("clico em Next")
    public void clicoEmNext() {
        WebElement nextButton = browser.findElement(By.id("nextenterproductdata"));
        nextButton.click();
    }

    /**
     * Passo que verifica se o usuário foi redirecionado para a aba "Enter Product Data",
     * e fecha o navegador.
     */
    @Entao("sou redirecionado para a aba Enter Product Data")
    public void souRedirecionadoParaAAbaEnterProductData() {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterproductdata']"));
        String actualTabName = tabElement.getText();
        Assert.assertEquals("Enter Product Data", actualTabName);
        browser.quit();
    }
}
