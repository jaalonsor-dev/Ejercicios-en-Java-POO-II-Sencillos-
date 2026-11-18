# Creación de Clase abstracta cliente con Java

# Definimos las clases que vamos a crear dentro de nuestro archivo : 
En este caso es 1 clase asbtracta que va a llamar a las clases menores dentro del programa, primero en la clase abstracta vamos a colocar los componentes principales que llaman a las subclases.

**Creamos la clase abstracta**

```java
package clasepago;

public abstract class ClientePago {

    // Método abstracto (sin implementación)
    public abstract void TipoPago();

    // Método concreto (con implementación)
    public void TipoFlujo() {
        System.out.println("Este Tipo de pago es: ");
    }
}
```
**Creamos la clase de cliente de credito**
```java
package clasepago;

public class ClienteCredito1 extends ClientePago {

    // Implementación del método abstracto TipoPago()
    @Override
    public void TipoPago() {
        System.out.println("El tipo de pago es con crédito.");
    }
}

```

### Creamos la clase contado

``` java

package clasepago;

public class ClienteContado extends ClientePago {

    // Implementación del método abstracto TipoPago()
   
    public void TipoPago() {
        System.out.println("El tipo de pago es en contado.");
    }
}

```
### Creamos la Clase "pago con nequi"
```java
package clasepago;

public class ClienteNequi extends ClientePago {

    // Implementación del método abstracto TipoPago()
   
    public void TipoPago() {
        System.out.println("El tipo de pago es Nequi.");
    }
```

### Creamos la Clase "pago con efectivo"
```java
package clasepago;

public class ClienteEfectivo extends ClientePago {

    // Implementación del método abstracto TipoPago()
   
    public void TipoPago() {
        System.out.println("El tipo de pago es efectivo.");
    }
```


lo impotante es que nuestro programa sirva para diferencia la clase de pago que se realicen dentro de este hipotetico programa aplicando las herencias y las clases principales.






