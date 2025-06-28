# TALLER-S11
#### Integrantes
- Oliver Quila
- Dereck Perez
#### Descripcion Actividad
En este taller vamos a desarrollar un sistema de entidades personalizado inspirado en el mundo del videojuego Minecraft. Cada entidad representará un personaje del juego y tendrá características específicas como nombre, salud y un comportamiento de interacción. Las entidades se estructuran utilizando los principios de la programación orientada a objetos mediante una interfaz común (**EntidadMinecraft**), una clase abstracta base (**EntidadBase**) y clases hijas concretas (**Jugador**, **Zombi**,**Aldeano**).

El programa debe permitir mostrar cuando una entidad aparece, cómo interactúa según su tipo y qué tipo de entidad es. Además, cada clase puede tener atributos o comportamientos personalizados, como inventario para el jugador, nivel de agresividad para el zombi o profesión para el aldeano.
Es importante tener en cuenta el uso correcto del polimorfismo y la sobreescritura de métodos, así como aplicar buenas prácticas de diseño y legibilidad del código.
#### Codigo
##### Clase Main
La clase **Main** es el punto de entrada del programa y se encarga de crear instancias de las entidades **Jugador**, **Zombi** y **Aldeano**, asignándoles atributos como nombre, salud y otros propios (inventario, nivel de agresividad o profesión). Luego, llama a sus métodos para simular que aparecen en el mundo e interactúan según su tipo, mostrando así el comportamiento específico de cada entidad.

![S11 MAIN](https://github.com/user-attachments/assets/3a585f03-b6aa-490a-b12b-e06904df9581)
##### Clase Aldeano 
La clase **Aldeano** extiende a **EntidadBase** y representa a un personaje aldeano dentro del sistema. Añade un atributo propio llamado **profesion** y sobrescribe el método **interactuar()** para mostrar un mensaje personalizado indicando su profesión. Además, sobrescribe el método **obtenerTipo()** para devolver el tipo específico de entidad ("Aldeano").

![S11 ALDEANO ](https://github.com/user-attachments/assets/d689b50a-dab9-414f-91ec-f47a2288b32c)
##### Clase Zombi
La clase **Zombi** extiende a **EntidadBase** y representa una entidad hostil con un atributo específico llamado **nivelDeAgresividad**. En su método **interactuar()**, muestra un mensaje indicando que el zombi ataca con un nivel de agresividad determinado. Además, sobrescribe el método **obtenerTipo()** para devolver su tipo como "Zombi".

![S11 ZOMBI](https://github.com/user-attachments/assets/edbbbf9c-b756-4cdd-b139-b142479219eb)
##### Clase Jugador
La clase **Jugador** extiende a **EntidadBase** y representa a un jugador con un atributo adicional llamado **inventario**, que almacena una lista de objetos. Sobrescribe el método **interactuar()** para simular que el jugador abre su inventario y el método **obtenerTipo()** para devolver "Jugador". Además, incluye un método propio **agregarItem(String item)** que permite añadir objetos al inventario e imprime un mensaje confirmando la accion.

![S11 JUGADOR ](https://github.com/user-attachments/assets/353da817-9329-4548-9d1e-c5ae41960635)
##### Clase EntidadBase 
La clase abstracta **EntidadBase** implementa la interfaz **EntidadMinecraft** y sirve como base para todas las entidades del sistema. Define atributos comunes como **nombre** y **salud**, e implementa el método **aparecer()** para mostrar un mensaje cuando una entidad aparece. También deja **interactuar()** como método abstracto (obligando a las subclases a definirlo) y proporciona una implementación genérica de **obtenerTipo()**, que puede ser sobrescrita por las clases hijas.

![S11 ENTIDAD ](https://github.com/user-attachments/assets/7d6beebb-03b7-468a-815a-b57458319030)
##### Interfaz EntidadMinecraft 
La interfaz **EntidadMinecraft** define el contrato que deben cumplir todas las entidades del sistema. Establece tres métodos: **aparecer()**, **interactuar()** y **obtenerTipo()**, los cuales deben ser implementados por cualquier clase que represente una entidad en el mundo de Minecraft, asegurando así una estructura común y coherente en el comportamiento de todas ellas.

![S11 ENTIDAD MINECRAFT ](https://github.com/user-attachments/assets/82f928c4-4e97-4ba1-a0ea-4e74f3ee8021)

##### COMPILACIÓN DE CODIGO
La salida por consola muestra el resultado del comportamiento de las entidades definidas en el programa. Primero, el jugador llamado Steve aparece con 100 puntos de salud, agrega un ítem a su inventario y lo abre. Luego, el zombi Zombi1 aparece con 50 puntos de salud e interactúa atacando con un nivel de agresividad 3. Finalmente, el aldeano Aldeano1 aparece con 70 puntos de salud y se presenta indicando que trabaja como agricultor. Cada mensaje demuestra que los métodos **aparecer()** e **interactuar()** están correctamente sobrescritos según el tipo de entidad, validando el uso adecuado de herencia y polimorfismo.

![S11 RUN CODE](https://github.com/user-attachments/assets/a3468a2d-0147-40a3-a089-ea362166d732)
