1)	Cuantos consumidores son necesarios para llegar a 0 el stock. 
Por como está planteado el sistema, con un solo consumidor alcanza.
2)	Bloques synchronized por que deben serlos
Para que los métodos sepan cuando se está usando el recurso y ejecutando un método que lo está utilizando. Sin synchronized puede pasar que un hilo no vea el cambio que realizó otro hilo en el recurso compartido. Se accede en exclusión mutua al objeto o método. Mientras haya un método ejecutándose, otro método no podrá ser capaz de acceder al recurso.
3)	Explicar el recurso compartido.
 Es un recurso, en nuestro ejercicio el objeto BeerHouse, que es accedido por varios hilos de ejecución simultáneamente.
4)	Explicar las 3 formas de instanciar un Thread.
Hay dos formas, una es extender una clase de la clase Thread, la segunda forma es implementar la interfaz Runnable, crear un objeto de tipo Thread y pasarle por parámetro la clase que implementa Runnable. En ambos casos, se deber definir un método run() que será el incluya las instrucciones que se ejecutarán en el thread. 

