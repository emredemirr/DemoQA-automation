import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test_Setting_Name_Lastname_Email extends BaseTest
{

    @Test
    public void setFirstName()
    {
        practiceFormPage.setFirstName("Emre");
        Assertions.assertEquals("Emre", practiceFormPage.getFirstName(), "Name value is not correct");
    }
    @Test
    public void setLastName()
    {
        practiceFormPage.setLastName("Demir");
        Assertions.assertEquals("Demir", practiceFormPage.getLastName(), "Lastname value is not correct");
    }
    @Test
    public void setEmail()
    {
        practiceFormPage.setEmail("emre@gmail.com");
    }
}
