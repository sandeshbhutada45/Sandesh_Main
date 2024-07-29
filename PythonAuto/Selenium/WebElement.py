from selenium import webdriver
from selenium.webdriver.common.by import By
driver=webdriver.Firefox();
driver.get("https://www.saucedemo.com")
driver.find_element(By.ID, 'user-name').send_keys("problem_user")
driver.find_element(By.ID,'password').send_keys("secret_sauce")
driver.find_element(By.ID,'login-button').click()
print(driver.title)

    