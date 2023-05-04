**Manual de Usuario**
---
---
Cuando se inicia el programa aparecerá un menú con varias
opciones, pulsar el número que aparece junto a la opción
hará que se realize la opción

Las opciones son las siguientes:

*Opción 1*: Esta opción abrirá la caja, y comprobará con un
*if* si no estaba ya abierta.

*Opción 2*: Esta opción vuelve a comprobar si la caja está
abierta,si no lo está mostrará un mensaje de error, y creará
un objeto *Cliente* con un nombre al azar, y usando el método
de un objeto Random , nos generará un número al azar que 
guardaremos en una variable entera, para que en un bucle
*for* añada productos hasta el número al azar generado. Una
vez acabado esto, lo añadirá a la cola del objeto *Cajero*
llamada *filaCliente*.

*Opción 3*: Está opción atiende un cliente, primero 
asegurandose de que la cola no esté vacía usando el método
*isEmpty* de *Cajero* que devuelve verdadero o falso si
está vacío o no, y luego llama al método *atenderCliente* 
de *Cajero* también, que consiste en hacer un *poll* 
quitando el primero en la cola y mostrándolo por pantalla.
Si la cola está vacía mostrará un mensaje.

*Opción 4*: Está opción muestra la información del cajero
mediante el *Override* del método *toString*.

*Opción 5*: Está opción cierra la caja y termina el programa.

 