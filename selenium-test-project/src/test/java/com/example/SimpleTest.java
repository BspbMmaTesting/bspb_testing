// package com.example;

// import static org.junit.jupiter.api.Assertions.assertTrue;

// import org.junit.jupiter.api.*;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import io.github.bonigarcia.wdm.WebDriverManager;

// import com.example.utils.BrowserFactory;

// public class SimpleTest {

//     private WebDriver driver;

//     @BeforeEach
//     public void setUp() {
//         driver = BrowserFactory.getDriver();
//         // WebDriverManager.chromedriver().setup();
//         // driver = new ChromeDriver();
//     }

//     @Test
//     public void shouldAnswerWithTrue() {
//         assertTrue(true);
//     }

//     @Test
//     public void testGooglePageTitle() {
//         driver.get("https://www.google.com ");
//         String title = driver.getTitle();
//         System.out.println("Page title is: " + title);
//         assertTrue(title.contains("Google"));
//     }

//     @AfterEach
//     public void tearDown() {
//         if (driver != null) {
//             driver.quit();
//         }
//     }
// }