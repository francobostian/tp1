1)	Cuantos consumidores son necesarios para llegar a 0 el stock. 
Por como está planteado el sistema, con un solo consumidor alcanza.
2)	Bloques synchronized por que deben serlos
Java permite definir secciones críticas (fragmentos de código que sólo puede estar ejecutando un solo hilo) mediante la palabra reservada synchronized. 
Si tenemos un objeto cuyo estado queremos actualizar desde distintas hebras de forma coordinada, podemos etiquetar con synchronized todos aquellos métodos cuya ejecución concurrente podría causar algún tipo de error.
Cuando se está ejecutando un método synchronized asociado a un objeto, el objeto se bloquea y no se puede ejecutar ningún otro método synchronized del objeto hasta que termine la ejecución del método que bloqueó el acceso al objeto. 
3)	Explicar el recurso compartido.
Es un recurso, en nuestro ejercicio el objeto BeerHouse, que es accedido por varios hilos y por lo tanto es necesario coordinar el acceso al recurso para que no se produzcan errores. La coordinación de su uso se realiza mediante métodos synchronized.
4)	Explicar las 3 formas de instanciar un Thread.
Hay dos formas, una es extender una clase de la clase Thread, la segunda forma es implementar la interfaz Runnable, crear un objeto de tipo Thread y pasarle por parámetro la clase que implementa Runnable. En ambos casos, se deber definir un método run() que será el incluya las instrucciones que se ejecutarán en el thread. 


