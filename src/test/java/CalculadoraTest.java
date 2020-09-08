
import junit.framework.TestCase;
import org.junit.Assert;

public class CalculadoraTest extends TestCase {

    Calculadora calculadora;

    public void setUp() throws Exception {
        calculadora = new Calculadora();
    }

    public void testSuma() {
        // Arrange
        double n1 = 0;
        double n2 = 1;
        double resultadoEsperado = 1;
        double deltaEsperado = 0;
        //Act
        double resultadoActual = calculadora.suma(n1, n2);

        //Assert
        Assert.assertEquals("La resta realizada no coincide: Se esperaba: " + resultadoEsperado + " resulto:" + resultadoActual, resultadoEsperado, resultadoActual, deltaEsperado);
    }

    public void testMultiplicacion() {
        // Arrange
        double n1 = 4;
        double n2 = 5;
        double resultadoEsperado = 20;
        double deltaEsperado = 0;
        //Act
        double resultadoActual = calculadora.multiplicacion(n1, n2);
        //Assert
        Assert.assertEquals("La multiplicación realizada no coincide: Se esperaba: "+resultadoEsperado + " resulto:" + resultadoActual,resultadoEsperado,resultadoActual,deltaEsperado);
}
public void testDivision() {
        // Arrange
        double n1 = 3;
        double n2 = 3;
        double resultadoEsperado = 1;
        double deltaEsperado = 0;
        //Act
        double resultadoActual = calculadora.division(n1, n2);
        //Assert
        Assert.assertEquals("La division realizada no coincide: Se esperaba: "+resultadoEsperado + " resulto:" + resultadoActual,resultadoEsperado,resultadoActual,deltaEsperado);
}


}
