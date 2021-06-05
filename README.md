## OODesing
### Miguel Ángel Rodríguez Siachoque
### 5 de Junio de 2021

## Ejecución de OoDesing.java
<p>
Debe ser ejecutado de la siguiente manera:<br>
<ul>
  <li>La entrada es el nombreTexto.extension
  <li>La dirección del archivo tipo: Example1.txt y se ubican en la carpeta TestText en test.
</ul>
</p>

## Diagrama de Clases
![Diagrama de Clases](Diagrama.jpg)
<p>
<ul>
  <li>OoDesing
    <p>
       Esta clase se encargada de obtener el nombre del archivo para poder generar los datos en Nodos para organizar la LinkedList, posteriormente mostrar la media y desviación con los datos obtenidos.
    <!p>
  <li>LinkedList<E>
    > <p>
       Esta clase generica se encarga de establecer las reglas basicas para poder generar una LinkedList donde se puede agregar,obtener los Nodos y longitud de esta LinkedList.
    <!p>
  <li>LinkedListNode<T>
    <p>
      Esta clase se encarga de manejar al Nodo de la LinkedList, pues se puede obtener su posición, siguiente Nodo a este, valor que contiene y enlazar dicho nodo a su sucesor.
    <!p>
  <li>Calculator
    <p>
      Esta clase se encarga de realizar los calculos de la media y desviacion, con los valores de los Nodos en la LinkedList. 
    <!p>
</ul>
<!p>

## Test
![Test App](Test.jpg)
<p>
Se realizarón cuatro pruebas con mediante al comando: mvn test.<br>
En estos test se encuentra 3 testOk con los archivos en la carpeta test y un testNoOk.
<!p>

## JavaDoc:
[JavaDoc - OODesing](JavaDocs/index.html)

## Tiempo de Lineas LOC: 
<p> 
El archvivo OoDesing.java:<br>
45 lineasLOC. <br>
El archvivo LinkedList.java:<br>
174 lineasLOC. <br>
El archvivo LinkedListNode.java:<br>
24 lineasLOC. <br>
El archvivo Calculator.java:<br>
35 lineasLOC. <br>
El archvivo OoDesingTest.java:<br>
43 lineasLOC.
</p>

### Tiempo total:
<p>
321/9 = 35.66 lineasLOC/horas.
</p>
