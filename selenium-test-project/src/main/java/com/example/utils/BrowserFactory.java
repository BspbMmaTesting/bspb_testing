// package com.example.utils;

// import io.github.bonigarcia.wdm.WebDriverManager;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// public class BrowserFactory {
//     public static WebDriver getDriver() {
//         WebDriverManager.chromedriver().setup();
//         return new ChromeDriver();
//     }
// }

package com.example.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    public static WebDriver getDriver() {
        try {
            System.out.println("[BrowserFactory] Начинаем инициализацию ChromeDriver...");

            // Автоматическая настройка драйвера
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            System.out.println("[BrowserFactory] ChromeDriver успешно создан!");

            return driver;
        } catch (Exception e) {
            System.err.println("[BrowserFactory] Ошибка при создании ChromeDriver:");
            e.printStackTrace();
            return null;
        }
    }
}