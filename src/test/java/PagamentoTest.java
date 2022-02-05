import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PagamentoTest {
    @Test
    void deveRetornarPagamento() {
        Pagamento pagamento = new Pagamento();
        pagamento.setPpv(1000000.0);
        pagamento.setSalarioBase(500000.0);

        assertEquals(515000  , Math.round(pagamento.calcularPagamento()*100.0)/100.0);
    }
}