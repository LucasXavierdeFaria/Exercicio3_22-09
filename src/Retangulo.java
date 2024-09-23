public class Retangulo {
    private double altura;
    private double comprimento;
    private double resultado;

    public Retangulo(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public void calcularArea(double altura, double comprimento){
        if(altura == 0 || comprimento == 0){
            System.out.println("Não é possível calcular com valor zero!!!");
        }
        resultado = altura * comprimento;
        System.out.println("A Área do retângulo é: " + resultado);
    }

    public void calcularPerimetro(double altura, double comprimento){
        if(altura == 0 || comprimento == 0){
            System.out.println("Não é possível calcular com valor zero!!!");
        }
        resultado = (altura * 2) * (comprimento * 2);
        System.out.println("A Perímetro do retângulo é: " + resultado);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}
