# Każdy test wchodzi na 5 różnych stron www i sprawdza ich tytuł. Strony:

*sii portal

*onet.pl

*http://kotuszkowo.pl/  - blog o kotach :-)

*https://www.filmweb.pl/

*https://www.selenium.dev/documentation/en/webdriver/ - dokumentacja Selenium

Testy są sparametryzowane (parametrem jest tytuł strony). Każdy test z tagiem "regresja" oraz dodatkowym tagiem odpowiadającym nazwie strony.


Do v1.1 dodano :
- plik csv jako source
- testy wywoływany z jednej linii kodu w klasie testowej
- logger slf4j
- appender do wysyłania maily, na chwile obecną zakomentowany
- dependency potrzebne do maila (javax)
- kolor do threada
- kolory do logów
- wyróżnienie logów, które są związane bezpośrednio z testem poprzez linię  "♛" na starcie i końcu logów testu jednostkowego w konsoli
- appender HTML do wyświetlania logów w przeglądarce

