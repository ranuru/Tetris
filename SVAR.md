For å fullføre laben, ber vi deg om å svare på følgende spørsmål. Svar på spørsmålene ved å fylle ut denne filen.

## Hva har du lært om Java og objekt-orientert programmering under arbeidet med denne oppgaven? Beskriv hvilke deloppgave(r) du jobbet med i læringsøyeblikket.

Det jeg har lært om Java og objekt-orientert programmering under arbeidet med denne oppgaven er som følger:
1. Jeg har lært om modularitet og å lage egne klasser. Når jeg arbeidet med oppgaven så hadde jeg alltid modularitet i bakhodet, og flyttet store mengder kode inn i egne klasser som kunne brukes senere. Dette ga også mye bedre oversikt over koden. Et eksempel på dette er å lagre alle de forskjellige Tetromino-formene i en egen klasse, og så lage et objekt av hver form. Dette gjorde det mye enklere å lage en ny form, og det var også enklere å endre på eksisterende former.
2. Jeg har lært om dokumentasjon av metoder, og hvordan å bare skrive hva en metode skal gjøre er veldig effektivt for å kode inn funksjonaliteten senere. Jeg har også lært om hvordan å skrive gode kommentarer som gjør koden mer lesbar.
3. Jeg har lært å skrive egne tester, og viktigheten av at testene er grundige og nøye. Testing gjør det mye enklere å feilsøke koden i stedet for å kjøre Main hver eneste gang for å sjekke om alle mulige tilfeller fungerer som de skal. 

## Hva er det neste du ønsker å lære om Java og programmering?

Det neste jeg har lyst å lære om Java og programmering er bare generelt sett mer avanserte ting, å kunne lage mer avanserte programmer. Jeg har også lyst til å lære å lage programmer som kan sendes og 'publiseres'. Jeg har også lyst til å lære å skrive så effektiv kode som mulig.

## Hvilke grep gjør vi for å øke modulariteten i koden? Gi noen eksempeler.

Grepene vi gjør for å øke modulariteten i koden er:
1. Å dele opp koden i flere klasser, sortert til hvilken del av spillet det representerer. For eks. en klasse for Tetromino-formene, en klasse for Tetromino-brikken, en klasse for alle farger som noensinne blir brukt, osv. 
2. Vi har delt koden inn i 3 hoveddeler: View, Model og Controller. Dette gjør det veldig lett å modifisere koden senere, og det er også veldig lett å se hva som er hva. Controller påvirker model, og model påvirker view.
3. Vi har delt opp koden i flere små metoder og variabler, som gjør det enklere å lese koden og forstå hva som skjer. Det åpner også koden opp for enkel modifisering og debugging, ettersom man kan lett spore ned hvor feilen skjer og fortere løse problemer.
