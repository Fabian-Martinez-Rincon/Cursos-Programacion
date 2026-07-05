import java.util.Vector;

// ==============================================================================
// SESIÓN 5: INTERFAZ Y DELEGACIÓN [1, 8]
// ==============================================================================

// Definimos la interfaz 'Motor' que servirá como contrato abstracto puro [8].
interface Motor {
    // Método que cualquier motor real deberá implementar obligatoriamente.
    void propulsar();
// Cierra la interfaz.
}

// Creamos una clase concreta que implementa la interfaz Motor [8].
class MotorElectrico implements Motor {
    // Implementamos el método propulsar para el motor eléctrico.
    public void propulsar() {
        // Imprimimos el comportamiento en consola.
        System.out.println("Zumbido eléctrico... propulsando con batería.");
    // Cierra el método.
    }
// Cierra la clase.
}

// ==============================================================================
// SESIONES 1, 3, 4, 6, 7 y 8: ARQUITECTURA BASE DEL VEHÍCULO [1]
// ==============================================================================

// SESIÓN 4: Clase abstracta. No se puede instanciar directamente [9].
// SESIÓN 6: Implementa Comparable para permitir ordenamiento [10].
// SESIÓN 7: Implementa Cloneable para permitir la creación de copias exactas [11, 12].
abstract class Vehiculo implements Comparable, Cloneable {

    // SESIÓN 1: Encapsulación. Ocultamos el estado interno [13].
    protected String marca;

    // ==========================================================================
    // SESIÓN 9 (ÉNFASIS): TIPOS DE ENVOLTURA (WRAPPERS) [1, 6]
    // ==========================================================================
    // En lugar de usar el tipo escalar primitivo 'double', usamos su clase Envoltura 'Double' [6].
    // Esto nos permite tratar a la velocidad como un Objeto real dentro del sistema [4].
    protected Double velocidadMaxima;

    // Constructor que inicializa el estado del vehículo.
    public Vehiculo(String marca, Double velocidadMaxima) {
        // Asignamos la marca.
        this.marca = marca;
        // Asignamos el objeto envoltorio (Wrapper) recibido [6].
        this.velocidadMaxima = velocidadMaxima;
    // Cierra el constructor.
    }

    // SESIÓN 1: Abstracción. Método getter para la marca [14].
    public String getMarca() { 
        return marca; 
    }

    // ==========================================================================
    // SESIÓN 9 (ÉNFASIS): DESENVOLTURA (UNWRAPPING) [1, 6]
    // ==========================================================================
    // Extraemos el valor primitivo escalar desde adentro del objeto 'Double' [6].
    public double getVelocidadPrimitiva() {
        // El método .doubleValue() extrae el primitivo 'double' para poder hacer cálculos matemáticos [6, 7].
        return velocidadMaxima.doubleValue();
    // Cierra el método.
    }

    // SESIÓN 4: Método abstracto. Las subclases están obligadas a definir cómo acelerar [2, 9].
    public abstract void acelerar();

    // SESIÓN 6: Interfaz Genérica Comparable. Define cómo comparar vehículos [10].
    public int compareTo(Object otro) {
        // Hacemos un casting seguro.
        Vehiculo v = (Vehiculo) otro;
        // SESIÓN 9: Podemos usar el método compareTo del propio objeto Wrapper 'Double'.
        return this.velocidadMaxima.compareTo(v.velocidadMaxima);
    // Cierra el método.
    }

    // SESIÓN 7: Clonación para evitar el problema de Aliasing [12, 15].
    @Override
    public Object clone() {
        try {
            // Delega la copia exacta a la máquina virtual de Java [16].
            return super.clone();
        // Captura si la clase no soportara la clonación.
        } catch (CloneNotSupportedException e) {
            // Retorna nulo en caso de error.
            return null;
        }
    // Cierra el método clone.
    }

    // SESIÓN 8: Prueba de Igualdad Lógica [1, 17].
    public boolean equals(Object obj) {
        // Convertimos el parámetro a tipo Vehiculo.
        Vehiculo v = (Vehiculo) obj;
        // SESIÓN 9: Comparamos el contenido de los objetos Wrappers usando .equals() [18, 19].
        return this.marca.equals(v.marca) && this.velocidadMaxima.equals(v.velocidadMaxima);
    // Cierra el método equals.
    }
// Cierra la clase Vehiculo.
}

// SESIÓN 3: Herencia. Coche hereda de Vehiculo [1, 20].
class Coche extends Vehiculo {
    
    // SESIÓN 5: Delegación. El coche guarda internamente el motor que hará el trabajo [1, 8].
    private Motor motorDelegado;

    public Coche() {
        
    }
    // Constructor de Coche. Notar que pedimos un escalar primitivo 'double' [18].
    public Coche(String marca, double velocidadEscalar, Motor motorDelegado) {
        // ==========================================================================
        // SESIÓN 9 (ÉNFASIS): ENVOLTURA (WRAPPING) EN LA CONSTRUCCIÓN [1, 6]
        // ==========================================================================
        // Convertimos el tipo primitivo a un Objeto mediante 'new Double()' al enviarlo a la clase padre [6].
        super(marca, new Double(velocidadEscalar));
        // Asignamos el delegado.
        this.motorDelegado = motorDelegado;
    // Cierra el constructor.
    }

    // SESIÓN 4: Polimorfismo. Redefinimos la aceleración [2].
    public void acelerar() {
        // Imprimimos la marca del coche que intenta acelerar.
        System.out.print(marca + " inicia su marcha: ");
        // SESIÓN 5: Delegamos la acción de propulsión al objeto motor [8, 21].
        motorDelegado.propulsar();
    // Cierra el método.
    }
// Cierra la clase Coche.
}

// ==============================================================================
// APLICACIÓN PRINCIPAL (CLASE DE PRUEBA Y LABORATORIO)
// ==============================================================================
public class Main {

    // Método main, punto de entrada de la aplicación Java [22].
    public static void main(String[] args) {

        System.out.println("--- REPASO SESIONES 1 A 8 ---");

        // SESIÓN 2: Creación de objetos. Construimos un motor eléctrico [16, 23].
        Motor motor = new MotorElectrico();
        // Construimos un Coche en memoria [16].
        Coche cocheOriginal = new Coche("Tesla Model S", 250.0, motor);

        // SESIÓN 7: Aliasing vs. Clonación [24, 25].
        // Creamos un Alias (ambas variables apuntan a la misma dirección física) [9].
        Coche cocheAlias = cocheOriginal;
        // Creamos un Clon (un objeto totalmente nuevo e independiente en memoria) [15, 26].
        Coche cocheClon = (Coche) cocheOriginal.clone();

        // SESIÓN 8: Pruebas de Igualdad Escalar vs. Referencia [1, 17].
        // Usando '==' comparamos si son la misma dirección de memoria [17, 18].
        System.out.print("cocheOriginal == cocheAlias (Alias): ");
        System.out.println(cocheOriginal == cocheAlias); // true
        
        // El clon está en otra dirección, el resultado es falso [18].
        System.out.print("cocheOriginal == cocheClon (Referencias distintas): ");
        System.out.println(cocheOriginal == cocheClon); // false
        
        // Usamos el método redefinido que compara lógicamente la marca y velocidad [17, 18].
        System.out.print("cocheOriginal.equals(cocheClon) (Mismo contenido): ");
        System.out.println(cocheOriginal.equals(cocheClon)); // true

        // SESIÓN 4: Envío de mensaje polimórfico [16].
        cocheOriginal.acelerar();

        System.out.println("\n--- SESIÓN 9 (ÉNFASIS): ENVOLTURAS (WRAPPERS) ---");

        // ==========================================================================
        // LA PROBLEMÁTICA: La clase genérica Vector no admite primitivos como 'double'.
        // Solamente acepta instancias de objetos formales [3, 4].
        // ==========================================================================
        Vector registroDeVelocidades = new Vector();

        // Declaramos un tipo escalar primitivo puro (no tiene clase ni métodos) [18, 27].
        double velPrimitiva1 = 120.5;

        // ENVOLTURA (WRAPPING): Convertimos el escalar a un Objeto instanciando su Wrapper [6, 7].
        Double velObjeto1 = new Double(velPrimitiva1);

        // A menudo las interfaces de usuario o archivos de texto devuelven Cadenas (Strings) [28].
        String velTexto = "305.8";
        // Podemos utilizar el Wrapper para crear un Objeto numérico a partir del String [28, 29].
        Double velObjeto2 = new Double(velTexto);

        // Ahora sí, el Vector admite los objetos sin ningún error de compilación [7, 29].
        // No podríamos haber ingresado 'velPrimitiva1' directamente.
        registroDeVelocidades.addElement(velObjeto1);
        registroDeVelocidades.addElement(velObjeto2);
        // También podemos envolver "al vuelo" directamente en la inserción [7].
        registroDeVelocidades.addElement(new Double(85.2));

        System.out.print("Se han almacenado " + registroDeVelocidades.size());
        System.out.println(" velocidades como Objetos en el Vector.");

        // Variable primitiva para almacenar una sumatoria matemática.
        double sumaTotalVelocidades = 0.0;

        // Bucle para iterar a través de los Objetos del contenedor Vector [30].
        for (int i = 0; i < registroDeVelocidades.size(); i++) {
            
            // Extraemos el elemento del vector, pero viene como un 'Object' genérico [3].
            // Debemos decirle al compilador que garantizamos que es un 'Double' (Casting).
            Double envoltorioExtraido = (Double) registroDeVelocidades.elementAt(i);

            // DESENVOLTURA (UNWRAPPING): 
            // Los objetos NO pueden usarse directamente en operaciones de suma (+, -, *, /).
            // Usamos el método '.doubleValue()' para extraer el valor escalar primitivo interno [6, 31].
            double valorPrimitivoListoParaMatematicas = envoltorioExtraido.doubleValue();

            // Ahora sumamos escalarmente.
            sumaTotalVelocidades += valorPrimitivoListoParaMatematicas;
            
            // Imprimimos el estado para validar visualmente la desenvoltura.
            System.out.print("Valor extraído y desenvuelto con éxito: ");
            System.out.println(valorPrimitivoListoParaMatematicas);
        // Cierra el bucle for.
        }

        // Imprimimos el cálculo aritmético exitoso.
        System.out.print("Suma total (calculada a partir de primitivos): ");
        System.out.println(sumaTotalVelocidades);

    // Cierra el método main.
    }
// Cierra la clase.
}