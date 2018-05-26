import com.company.Conversao;
import org.junit.Test;
import static org.junit.Assert.*;


public class ConversaoTests {
    Conversao conversao = new Conversao();

    //A conversão é de Celsius >> Kelvin
    @Test
    public void testTemperatura(){
        float valor1 = 30;
        float resultado = conversao.conversaoTemperatura(valor1);
        assertEquals(303,resultado,0.1);
    }

    //A conversão é de KMs por hora >> Milhas por hora
    @Test
    public void testVelocidade(){
        float valor1 = 10;
        float resultado = conversao.conversaoVelocidade(valor1);
        assertEquals(6.214,resultado,0.1);
    }

    //A conversão é de quilômetro >> centímetro - Visto que 1km tem mil metros, e 1 metro tem 100 centímetros
    @Test
    public void testDistancia(){
        double valor1 = 5.8;
        double resultado = conversao.conversaoDistancia((float) valor1);
        assertEquals(580000,resultado,0.1);
    }

    //A conversão é de horas >> segundos
    @Test
    public void testTempo(){
        double valor1 = 2.5;
        double resultado = conversao.conversaoTempo((float) valor1);
        assertEquals(9000,resultado,0.1);
    }
}
