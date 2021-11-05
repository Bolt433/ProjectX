# ProjectX
main

Jeg begynte med å åpne intellij deretter koblet jeg opp den med github brukeren min. Dette måtte jeg gjøre for å commite og pushe filene mine.
deretter lagde jeg workflow i action på github. 
yml filen min fungerte ikke på starten, etter noen youtube video og googling. fant jeg en yml som fungerte for meg. 
ved bruk av gradle måtte jeg legge til testLogging {
    events "passed", "skipped", "failed", "standardOut", "standardError"
} for at testene mine skulle kjøre på github. 
testene kjører fint på github. der kan du se:

Testing > not_divisble_by_4() STANDARD_OUT
    2021 is not a leap year!!

Testing > not_divisble_by_4() PASSED

Testing > Divisible_by_400() STANDARD_OUT
    leap year!!: 2000
