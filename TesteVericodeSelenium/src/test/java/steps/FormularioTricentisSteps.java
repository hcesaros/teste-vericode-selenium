//Autor: Henrique Cesar
//Data: 28/09/2024

package steps;

import cucumber.api.PendingException;
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


public class FormularioTricentisSteps {
    public FormularioTricentisSteps(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
	    browser = new ChromeDriver();
    }
    public WebDriver browser;

    @Dado("^que eu estou no site \"([^\"]*)\"$")
    public void que_eu_estou_no_site(String string) {
        browser.get(string);
}

    @Entao("o site é exibido")
    public void oSiteÉExibido() throws IOException {

        TakesScreenshot ts = (TakesScreenshot) browser;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenshots/site_tricentis.png"));

        browser.quit();
    }

@Dado("clico na opcao Make")
public void clico_na_opcao_Make() {
    WebElement input = browser.findElement( By.cssSelector("#make"));
    input.click();
}

@Entao("seleciono a opcao Honda")
public void seleciono_a_opcao_Honda() {
    WebElement input = browser.findElement( By.cssSelector("option[value='Honda']"));
    input.click();
    }

    @Dado("clico na opcao Model")
    public void clico_na_opcao_Model() {
        WebElement input = browser.findElement( By.cssSelector("#make"));
        input.click();
    }
    
    @Entao("seleciono a opcao Scooter")
    public void seleciono_a_opcao_Scooter() {
        WebElement input = browser.findElement( By.cssSelector("option[value='Scooter']"));
        input.click();
    }

    @E("digito no campo Cylinder Capacity o valor 300")
    public void clico_na_opcao_Cylinder_Capacity() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#cylindercapacity"));
        input.sendKeys("300");
    }

    @Entao("digito no campo Engine Performance o valor 150")
    public void clico_na_opcao_Engine_Performance() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#engineperformance"));
        input.sendKeys("150");

    }

    @Entao("digito no campo Date of Manufacture 12/28/2023")
    public void clico_na_opcao_Date_of_Manufacture() throws Throwable {
        WebElement input = browser.findElement( By.cssSelector("#dateofmanufacture"));
        input.sendKeys("12/28/2023");

    }
    @Entao("clico na opcao Number of Seats")
    public void clico_na_opcao_Number_of_Seats() {
        WebElement input = browser.findElement( By.cssSelector("#numberofseats"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("2");
    }

    @Entao("seleciono no campo Right Hand Drive a opcao Yes")
    public void seleciono_na_campo_Right_Hand_Drive_a_opcao_Yes() {
        WebElement input = browser.findElement( By.cssSelector(".ideal-radiocheck-label"));
        input.click();
    }

    @Entao("seleciono a opcao 2 no campo Number of Seat")
    public void seleciono_a_opcao_campo_Number_of_Seat() {
        WebElement input = browser.findElement( By.cssSelector("#numberofseatsmotorcycle"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("2");

    }

    @Entao("seleciono a opcao Petrol no campo Fuel Type")
    public void seleciono_opcao_no_campo_Fuel_Type() {
        WebElement input = browser.findElement( By.cssSelector("#fuel"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Petrol");
    }

    @Entao("digito no campo Payload o valor 250")
    public void digito_no_campo_Payload_valor() {
        WebElement input = browser.findElement( By.cssSelector("#payload"));
        input.sendKeys("250");
    }


    @Entao("digito no campo Total Weight o valor 250")
    public void digito_no_campo_Total_Weight() {
        WebElement input = browser.findElement( By.cssSelector("#totalweight"));
        input.sendKeys("250");
    }

    @Entao("digito no campo List Price o valor 5000")
    public void digito_no_campo_List_Price() {
        WebElement input = browser.findElement( By.cssSelector("#listprice"));
        input.sendKeys("5000");
    }


    @Entao("digito no campo License Plate Number o valor DCO7657")
    public void digito_no_campo_License_Plate_Number() {
        WebElement input = browser.findElement( By.cssSelector("#licenseplatenumber"));
        input.sendKeys("DCO7657");
    }

    @Entao("digito no campo Annual Mileage o valor 230")
    public void digito_no_campo_Annual_Mileage() throws IOException {
        WebElement input = browser.findElement( By.cssSelector("#annualmileage"));
        input.sendKeys("230");

        TakesScreenshot ts = (TakesScreenshot) browser;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenshots/aba_enter_vehicle_data.png"));
    }

    @Quando("clico no botao Next")
    public void clicoNoBotaoNext() {
        WebElement nextButton = browser.findElement(By.xpath("//button[contains(text(),'Next')]"));
        nextButton.click();
    }

    @Entao("sou redirecionado pra aba Enter Insurant Data")
    public void redirecionado_para_aba() throws IOException {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterinsurantdata']"));
        String actualTabName = tabElement.getText();
        Assert.assertEquals("Enter Insurant Data", actualTabName);
        browser.quit();
    }

    @E("clico na aba Enter Insurant Data")
    public void clicoNaAbaEnterInsurantData() {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterinsurantdata']"));
        tabElement.click();
    }

    @E("digito no campo First Name o nome \"([^\"]*)\"")
    public void digitoNoCampoFirstNameONome(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#firstname"));
        input.sendKeys("Henrique");
    }

    @E("digito no campo Last Name o sobrenome \"([^\"]*)\"")
    public void digitoNoCampoLastNameOSobrenomeCesar(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#lastname"));
        input.sendKeys("Cesar");
    }

    @E("digito no campo Date of Birth a data \"([^\"]*)\"")
    public void digitoNoCampoDateOfBirthAData(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#birthdate"));
        input.sendKeys("04/16/1985");
    }

    @E("clico na opcao male no campo Gender")
    public void clicoNaOpcaoMaleNoCampoGender() {
        WebElement radiobutton = browser.findElement( By.cssSelector(".ideal-radiocheck-label"));
        radiobutton.isSelected();
    }

    @Entao("seleciono a opcao Brazil no campo Country")
    public void selecionoAOpcaoBrazilNoCampoCountry() {
        WebElement input = browser.findElement( By.cssSelector("#country"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Brazil");
    }

    @E("digito no campo Zip Code o cep \"([^\"]*)\"")
    public void digitoNoCampoZipCodeOCep(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#zipcode"));
        input.sendKeys("03178000");
    }

    @E("no campo City digito \"([^\"]*)\"")
    public void noCampoCityDigito(String arg0) throws Throwable {
        WebElement input = browser.findElement(By.cssSelector("#city"));
        input.sendKeys("Sao Paulo");
    }

    @E("no campo Occupation seleciono a opcao Employee")
    public void noCampoOccupationSelecionoAOpcaoEmployee() {
        WebElement input = browser.findElement( By.cssSelector("#occupation"));
        Select dropdown = new Select(input);
        dropdown.selectByVisibleText("Employee");
    }


    @E("faço o uplod da minha foto")
    public void façoOUplodDaMinhaFoto() throws IOException {
        WebElement input = browser.findElement(By.cssSelector("input[type='file']"));
        input.sendKeys("/Users/henrique_cesar/Downloads/TesteVericodeSelenium/images/foto.png");

        TakesScreenshot ts = (TakesScreenshot) browser;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./screenshots/aba_enter_insurant_data.png"));
    }

    @Quando("clico em Next")
    public void clicoEmNext() {
        WebElement nextButton = browser.findElement(By.id("nextenterproductdata"));
        nextButton.click();
    }

    @Entao("sou redirecionado para a aba Enter Product Data")
    public void souRedirecionadoParaAAbaEnterProductData() {
        WebElement tabElement = browser.findElement(By.cssSelector("a[id='enterproductdata']"));
        String actualTabName = tabElement.getText();
        Assert.assertEquals("Enter Product Data", actualTabName);
        browser.quit();
    }
}