package org.testleaf.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("DemoCSR");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harish");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        WebElement sourcElement =driver.findElement(By.id("createLeadForm_dataSourceId"));
        Select sourceDD=new Select(sourcElement);
        sourceDD.selectByIndex(2);
        WebElement sourcIndElement =driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select sourceInd=new Select(sourcIndElement);
        sourceInd.selectByIndex(2);
        driver.findElement(By.className("smallSubmit")).click();
    }

}
