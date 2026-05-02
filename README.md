# UDP Communication

Programma didattico che implementa una semplice comunicazione **UDP (User Datagram Protocol)** tra un client e un server.

## Cos'è UDP?

UDP è un protocollo di trasporto molto semplice e veloce che permette di inviare e ricevere dati su una rete. A differenza di TCP (Transmission Control Protocol), UDP è **non orientato alla connessione**, il che significa che:
- Non necessita di una connessione stabile tra client e server
- I messaggi (detti datagrammi) vengono inviati singolarmente
- Non garantisce l'arrivo dei dati, ma è molto più veloce
- Ideale per applicazioni dove la velocità è più importante dell'affidabilità (streaming, VoIP, giochi online)

## Descrizione

- **MainServer.java**: Crea un server UDP che rimane in ascolto sulla porta 12345, riceve i messaggi dai client e invia una risposta.
- **MainClient.java**: Crea un client UDP che si connette al server localhost sulla porta 12345, invia il messaggio "Ciao Server!" e riceve la risposta.

## Come funziona

1. Il **server** crea un socket UDP sulla porta 12345 e rimane in attesa di ricevere datagrammi
2. Il **client** crea un socket UDP e invia un datagramma con il messaggio "Ciao Server!" verso l'indirizzo localhost (stesso computer)
3. Il **server** riceve il datagrammi e ottiene l'indirizzo IP e porta del client
4. Il **server** rispedisce i dati ricevuti al client come risposta
5. Il **client** riceve la risposta dal server e stampa il messaggio

## Utilizzo

1. Eseguire prima **MainServer.java** per avviare il server
2. Eseguire **MainClient.java** per inviare il messaggio al server



