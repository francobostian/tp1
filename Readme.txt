1)	Cuantos consumidores son necesarios para llegar a 0 el stock. 
Por como est� planteado el sistema, con un solo consumidor alcanza.
2)	Bloques synchronized por que deben serlos
Para que los m�todos sepan cuando se est� usando el recurso y ejecutando un m�todo que lo est� utilizando. Sin synchronized puede pasar que un hilo no vea el cambio que realiz� otro hilo en el recurso compartido. Se accede en exclusi�n mutua al objeto o m�todo. Mientras haya un m�todo ejecut�ndose, otro m�todo no podr� ser capaz de acceder al recurso.
3)	Explicar el recurso compartido.
 Es un recurso, en nuestro ejercicio el objeto BeerHouse, que es accedido por varios hilos de ejecuci�n simult�neamente.
4)	Explicar las 3 formas de instanciar un Thread.
Hay dos formas, una es extender una clase de la clase Thread, la segunda forma es implementar la interfaz Runnable, crear un objeto de tipo Thread y pasarle por par�metro la clase que implementa Runnable. En ambos casos, se deber definir un m�todo run() que ser� el incluya las instrucciones que se ejecutar�n en el thread. 

