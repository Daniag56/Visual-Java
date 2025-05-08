package utilidades;

public class CalculadorPuntuación {
    public static float calcularPuntuación(int carta, int dado) {
        float bonoPenalización = (carta % 2 == 0) ? carta * 0.1f : carta * -0.05f;
        return dado + carta + bonoPenalización;
    }
}
