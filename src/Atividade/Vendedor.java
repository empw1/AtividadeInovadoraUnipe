package Atividade;

public class Vendedor {

    private float vendas;
    private float salario;
    private String nome;
    private int falta;

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String getNome(String petros) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public void imprimirDados(){
        System.out.println("Nome do Funcionário: " + nome);
        System.out.println("Salário do Funcionário: " + salario);
        System.out.println("Total de Vendas: " + vendas);
        System.out.println("Número de Faltas no mês: " + falta);
    }

    public void calcularSalario(){
        salario = (salario + calcularComissao() - descontoFaltas());
    }

    public float calcularComissao(){
        if(vendas >= 1000 && vendas < 2000){
             return vendas * 0.1f;
        } else if(vendas >= 2000){
            return vendas * 0.15f;
        }
        return 0;
    }

    public float descontoFaltas(){
        return (salario/30)*falta;
    }

}

