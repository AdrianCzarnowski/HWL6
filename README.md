# Każdy test wchodzi na 5 różnych stron www i sprawdza ich tytuł. Strony:

*sii portal

*onet.pl

*http://kotuszkowo.pl/  - blog o kotach :-)

*https://www.filmweb.pl/

*https://www.selenium.dev/documentation/en/webdriver/ - dokumentacja Selenium

Testy są sparametryzowane (parametrem jest tytuł strony). Każdy test z tagiem "regresja" oraz dodatkowym tagiem odpowiadającym nazwie strony.


Do v1.1 dodano :
- plik csv jako source
- logger oparty na slf4j
