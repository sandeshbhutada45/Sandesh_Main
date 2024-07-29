from selenium.webdriver.common.by import By
from selenium import webdriver
driver=webdriver.Firefox()
driver.get("https://www.google.com")
links= driver.find_elements(By.TAG_NAME,'a')
print(len(links))
for link in links:
    href= link.get_attribute("href")
    print("URL: "+href)