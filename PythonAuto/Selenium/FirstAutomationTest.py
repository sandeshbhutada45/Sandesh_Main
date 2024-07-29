from selenium import webdriver

driver= webdriver.Firefox()
driver.get("http://www.google.com")
print("Title is:"+driver.title)