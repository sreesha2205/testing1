package com.gic.invoice_manager.steps;

import com.gic.invoice_manager.utils.CommonFunctions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UpdateCustomerDeleteCustomer extends CommonFunctions {

    @Given("^I click on Customers$")
    public void i_click_on_Customers() throws InterruptedException {
       Thread.sleep(5000);
       driver.findElement(By.xpath("//body/div[2]/div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();

    }

    @Given("^I click on List Customers from the Customers drop down$")
    public void i_click_on_List_Customers_from_the_Customers_drop_down()  {

        driver.findElement(By.xpath("//a[@id='customers_index']")).click();

    }

    @Given("^I will redirect to customers list page$")
    public void i_will_redirect_to_customers_list_page() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]")).isDisplayed());
    }

        @Given("^I go to search for the particular customer \"(.*?)\"$")
    public void i_go_to_search_for_the_particular_customer(String customer)  {
        driver.findElement(By.xpath("//input[@id='search_table']")).sendKeys(customer);

    }

    @When("^I click on edit customer in Actions$")
    public void i_click_on_edit_customer_in_Actions()  {
        driver.findElement(By.xpath("//tbody/tr[4]/td[7]/center[1]/div[1]/a[3]/i[1]")).click();

    }

    @Then("^I will redirect to edit customer page$")
    public void i_will_redirect_to_edit_customer_page()  {
        Assert.assertTrue(driver.findElement(By.xpath("//body/div[3]/div[2]/h2[1]")).isDisplayed());
    }

    @Then("^I updated company name to \"(.*?)\"$")
    public void i_updated_company_name_to(String companyName) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys(companyName);

    }

    @Then("^I updated email address to \"(.*?)\"$")
    public void i_updated_email_address_to(String emailAddress) throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailAddress);

    }

    @Then("^I click on update customer$")
    public void i_click_on_update_customer()  {
        driver.findElement(By.xpath("//body/div[3]/div[4]/div[1]/form[1]/div[2]/div[1]/input[1]")).click();

    }

    @Then("^I will redirect to customers page and i'll get message that \"(.*?)\"$")
    public void i_will_redirect_to_customers_page_and_i_ll_get_message_that(String actualResult)  {
       WebElement expectedResult = driver.findElement(By.xpath("/html/body/div[3]/div[2]"));
       Assert.assertEquals(expectedResult,actualResult);

    }






}