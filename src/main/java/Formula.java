public class Formula {

    public static String formula = "ppv * 0.015 + salarioBase";

    public static double calcularPagamento(double salarioBase, double ppv) {
        String expressao;
        expressao = formula.replace("salarioBase", Double.toString(salarioBase));
        expressao = expressao.replace("ppv", Double.toString(ppv));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}