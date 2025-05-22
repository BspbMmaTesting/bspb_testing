// package com.example;

// import static org.junit.jupiter.api.Assertions.assertTrue;

// // import org.junit.Before;
// // import org.junit.After;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.Test;


// // импорт драйвера
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// import com.example.utils.BrowserFactory;

// import io.github.bonigarcia.wdm.WebDriverManager;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest {

//     private WebDriver driver;

//     @BeforeEach
//     public void setUp() {
//         driver = BrowserFactory.getDriver();
//         // WebDriverManager.chromedriver().setup();
//         // driver = new ChromeDriver();
//     }

//     /**
//      * Rigorous Test :-)
//      */
//     // @Test
//     // public void shouldAnswerWithTrue() {
//     //     assertTrue(true);
//     // }


//     // @Test
//     // public void testGooglePageTitle() {
//     //     driver.get("https://www.google.com ");
//     //     String title = driver.getTitle();
//     //     System.out.println("Page title is: " + title);
//     //     assertTrue(title.contains("Google"));
//     // }

//     @AfterEach
//     public void tearDown() {
//         if (driver != null) {
//             driver.quit();
//         }
//     }
// }
