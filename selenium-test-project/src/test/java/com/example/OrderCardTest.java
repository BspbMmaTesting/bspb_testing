package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
// import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.WebDriverWait;

// импорт драйвера
import org.openqa.selenium.WebDriver;

import com.example.utils.BrowserFactory;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OrderCardTest {
    
    private WebDriver driver;
    private WebDriver wait;

    // @BeforeEach
    @BeforeEach
    public void setUp() {
        driver = BrowserFactory.getDriver();

        driver.get("https://www.bspb.ru/");
    }


    @Test
    public void testMeta() {
        // driver.get("https://www.bspb.ru/");

        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("meta[name='apple-mobile-web-app-title']")));

        // Найти meta-тег
        WebElement metaTag = driver.findElement(
            By.cssSelector("meta[name='apple-mobile-web-app-title']")
        );

        String contentValue = metaTag.getAttribute("content");

        assertEquals("БСПБ", contentValue, "Значение meta не содержит БСПБ");
    }

    @Test
    public void testClickButtonEnter() {

        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.xpath("//button[.//text()='Войти']"))
        ));

        button.click();

        WebElement BankFL_Link = new WebDriverWait(driver, Duration.ofSeconds(10))
        .until(ExpectedConditions.elementToBeClickable(
                driver.findElement(By.linkText("Интернет-банк ФЛ"))
        ));
        BankFL_Link.click();

        // 3. Переключиться на новую вкладку
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        // Опционально: проверить URL новой вкладки
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(d -> !driver.getTitle().isEmpty());

        System.out.println("Текущая страница: " + driver.getTitle());
        System.out.println("URL новой вкладки: " + driver.getCurrentUrl());


            
        // 5. Ищем ссылку с текстом "Стать клиентом"
        WebElement becomeClientLink = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[.//text()='Стать клиентом']")
        ));

        assertTrue(becomeClientLink.isDisplayed(), "Ссылка 'Стать клиентом' не отображается");
        assertTrue(becomeClientLink.isEnabled(), "Ссылка 'Стать клиентом' не кликабелен");


    }

    

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
}

