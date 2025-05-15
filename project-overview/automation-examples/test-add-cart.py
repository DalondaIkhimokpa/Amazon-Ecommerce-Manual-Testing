# test_add_to_cart.py

from selenium import webdriver
from selenium.webdriver.common.by import By
import time

def test_add_product_to_cart():
    driver = webdriver.Chrome()
    driver.get("https://www.amazon.com")

    search = driver.find_element(By.ID, "twotabsearchtextbox")
    search.send_keys("wireless mouse")
    search.submit()

    time.sleep(3)
    first_item = driver.find_elements(By.CSS_SELECTOR, ".s-search-results .s-result-item h2 a")[0]
    first_item.click()

    time.sleep(3)
    add_to_cart = driver.find_element(By.ID, "add-to-cart-button")
    add_to_cart.click()

    time.sleep(3)
    cart_count = driver.find_element(By.ID, "nav-cart-count").text
    assert int(cart_count) >= 1

    driver.quit()
