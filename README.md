# Test wchodzi na 5 różnych stron www i sprawdza ich tytuł. 

*sii portal

*onet.pl

*http://kotuszkowo.pl/  - blog o kotach :-)

*https://www.filmweb.pl/

*https://www.selenium.dev/documentation/en/webdriver/ - dokumentacja Selenium

Testy są sparametryzowane (parametrem jest tytuł strony). Każdy test z tagiem "regresja" oraz dodatkowym tagiem odpowiadającym nazwie strony.


# v1.1 zawiera nowe rozwiązania : 
- plik csv jako source
- testy wywoływany z jednej linii kodu w klasie testowej
- logger slf4j
- appender do wysyłania email z error logami, na chwile obecną zakomentowany
- buffer do ilości logów w wiadomości email
- dependency potrzebne do maila (javax)
- kolor do threada
- kolory do logów
- wyróżnienie logów, które są związane bezpośrednio z testem poprzez linię  "♛" na starcie i końcu logów testu jednostkowego w konsoli
- appender HTML do wyświetlania logów w przeglądarce (kolory i znaki szczególne nie są obsługiwane, przez co czytelność jest mniejsza niż w konsoli)

