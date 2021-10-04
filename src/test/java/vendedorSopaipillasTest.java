import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class vendedorSopaipillasTest {

    @Test
    void precioFinal() {
        vendedorSopaipillas miVendedorTest= new vendedorSopaipillas("Juan",4);
        assertEquals(1000,miVendedorTest.precioFinal());


    }

    @Test
    void devolverVuelto() {
        vendedorSopaipillas miVendedorTest= new vendedorSopaipillas("Juan",4);
        miVendedorTest.setMontoRecivido(3000);
        assertEquals(2000,miVendedorTest.devolverVuelto());

    }
}