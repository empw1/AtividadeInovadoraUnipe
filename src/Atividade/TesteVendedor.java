package Atividade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TesteVendedor {

    @Test
    public void calcularSalario(){
        Vendedor vendedor = new Vendedor();

        vendedor.setNome("Ricardo");
        vendedor.setVendas(1500);
        vendedor.setSalario(1200);
        vendedor.setFalta(3);

        vendedor.calcularSalario();

        vendedor.imprimirDados();

        Assertions.assertEquals(1230, vendedor.getSalario());
    }
}
