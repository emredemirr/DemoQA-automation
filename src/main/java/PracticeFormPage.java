import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage
{

    private WebDriver driver;
    private final By firstName= By.id("firstName");
    private final By lastName= By.id("lastName");
    private final By userEmail= By.id("userEmail");

    public PracticeFormPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setFirstName(String firstNameText)
    {
        WebElement nameSpace= driver.findElement(firstName);
        nameSpace.click();
        nameSpace.sendKeys(firstNameText);
    }
    public void setLastName(String lastNameText)
    {
        WebElement nameSpace= driver.findElement(lastName);
        nameSpace.click();
        nameSpace.sendKeys(lastNameText);
    }
    public void setEmail(String emailText)
    {
        WebElement nameSpace= driver.findElement(userEmail);
        nameSpace.click();
        nameSpace.sendKeys(emailText);
    }

    public String getFirstName()
    {
        WebElement nameSpace = driver.findElement(firstName);
        return nameSpace.getAttribute("value");
    }
    public String getLastName()
    {
        WebElement nameSpace = driver.findElement(lastName);
        return nameSpace.getAttribute("value");
    }
    public String getEmail()
    {
        WebElement nameSpace = driver.findElement(userEmail);
        return nameSpace.getAttribute("value");
    }
}
