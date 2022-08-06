package test;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fill_in_form {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.atv.com.tr/milyoner/form");


        /* Fotoğraf yüklemesi webdriver dışında yükleme yapmak gerektiğinden selenium ile yazılamadı.Fotoğrafın yüklenebilmesi için
         * belirli bir süre koyuldu. */
        Thread.sleep(15000);
        driver.findElement(By.id("MilyonerForm_TCNo")).sendKeys("53182476590");
        driver.findElement(By.id("MilyonerForm_NameSurname")).sendKeys("Abc Abc");
        driver.findElement(By.id("MilyonerForm_LivingCity")).sendKeys("İstanbul");
        driver.findElement(By.id("MilyonerForm_BornCity")).sendKeys("İstanbul");
        driver.findElement(By.id("MilyonerForm_BirthDate")).sendKeys("22-05-1998");
        driver.findElement(By.xpath("(//label[@class='secim trkvzbnr'])[1]//em")).click();
        driver.findElement(By.id("MilyonerForm_MobilePrefix")).sendKeys("554");
        driver.findElement(By.id("MilyonerForm_MobileFirst")).sendKeys("432");
        driver.findElement(By.id("MilyonerForm_MobileSecond")).sendKeys("34");
        driver.findElement(By.id("MilyonerForm_MobileLast")).sendKeys("06");
        driver.findElement(By.id("MilyonerForm_PhonePrefix")).sendKeys("212");
        driver.findElement(By.id("MilyonerForm_PhoneFirst")).sendKeys("432");
        driver.findElement(By.id("MilyonerForm_PhoneSecond")).sendKeys("12");
        driver.findElement(By.id("MilyonerForm_PhoneLast")).sendKeys("06");
        driver.findElement(By.id("MilyonerForm_Email")).sendKeys("abcd@gmail.com");
        driver.findElement(By.id("MilyonerForm_EducationSchoolName")).sendKeys("Kocaeli Üniversitesi");
        driver.findElement(By.id("MilyonerForm_Job")).sendKeys("Çalışıyor");
        driver.findElement(By.id("MilyonerForm_Married")).sendKeys("Bekar");
        driver.findElement(By.id("MilyonerForm_Hobbies")).sendKeys("Futbol oynamak");
        driver.findElement(By.xpath("(//input[@class='isCapability'])[1]//..//em")).click();
        driver.findElement(By.xpath("(//input[@id='MilyonerForm_IsInterview'])[2]//..//em")).click();
        driver.findElement(By.xpath("(//input[@id='IsJoin0'])//..//em")).click();
        driver.findElement(By.id("MilyonerForm_WhatDo")).sendKeys("1 Milyon. Gezip eğlenmek istiyorum.");
        driver.findElement(By.id("MilyonerForm_Info")).sendKeys("Sabırlı,disiplinli,çözüm odaklı.");
        driver.findElement(By.id("MilyonerForm_Languages")).sendKeys("İngilizce");
        driver.findElement(By.id("MilyonerForm_VisitCountryCity")).sendKeys("Yurtdışına çıkmadım.");
        driver.findElement(By.id("MilyonerForm_Writers")).sendKeys("Serenad,İnce Memed,Da Vinci Şifresi");
        driver.findElement(By.id("MilyonerForm_MostMoviesBooks")).sendKeys("Prestij,Esaretin Bedeli,Eternals.");
        driver.findElement(By.xpath("(//input[@id='IsHealth0'])//..//em")).click();
        driver.findElement(By.xpath("(//input[@id='IsHealthPermission1'])//..//em")).click();
        driver.findElement(By.xpath("(//input[@id='chkPermissionPersonalData'])//..//em")).click();

        /* Site key'i bilinmediğinden captcha geçilemedi.Site keyi üzerinden captcha otomatik onaylanabilir.
         * Captcha işaretlenebilmesi için belirli bir süre koyuldu.*/
        Thread.sleep(25000);
        driver.findElement(By.id("btnSend")).click();
        WebElement success = driver.findElement(By.className(".sub-title"));
        if (success.isDisplayed()){
            System.out.println("Başarılı");
        }
        else
        {
            System.out.println("Başarısız");
        }

    }

}



