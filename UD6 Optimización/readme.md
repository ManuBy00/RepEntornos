# UD.6 Optimización y refactorización de código

En el proceso de desarrollo, la optimización y refactorización es un paso imprescindible. El trabajo no termina una vez funciona el código, sino cuando además de funcionar, el código es lo suficientemente limpio y coherente. Para ello, debemos buscar lo que llamamos "code smells", código que no tiene buena pinta a simple vista, y eliminarlos.

### 6.1 Refactorización

Las refactorizaciones son estrategias para reestructurar el código de forma que se resuelva un problema de diseño sin cambiar su funcionamiento. Utilizando estas estrategias podemos solucionar los code smells que encontremos. Encontramos diferentes estrategias de refactorización.

#### - Composing Methods

Estas refactorizaciones se centran en crear métodos y reducir código duplicado.

#### - Incline Methods

Esta refactorización se da cuan do un método existente es muy evidente o muy simple. En estos casos se debe usar su código directamente en lugar del método, y eliminarlo si es posible.

#### - Moving features between objects

Estas refactorizaciones consisten en mover elementos entre clases.


#### - Move Field

Esta refactorización se da cuando hay un atributo que está más relacionado con otra clase que con la clase a la que pertenece. La refactorización consiste en mover dicho atributo de una clase a otra.


#### - Extract class

Esa refactorización se da cuando una clase realiza varios trabajos distintos entre sí.
