package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // 打开登录页面
        driver.get("http://localhost/Student-Management-System/login.php");

        // 输入用户名和密码
        driver.findElement(By.name("username")).sendKeys("github_user");
        driver.findElement(By.name("password")).sendKeys("guser");

        // 点击登录按钮（确保 name 或 id 是正确的）
        driver.findElement(By.name("login")).click();

        // 等待一会看结果
        Thread.sleep(60000);

        // 打印页面标题
        System.out.println("页面标题是：" + driver.getTitle());

        driver.quit();
    }
}


