public class Aluno {
    String nome;
    double nota;
    double soma_notas = 0;
    int quantidade_notas = 0;
    double media;
    String situacao;
    
    public void somar_notas() {
       soma_notas += nota;
    }
    public void calcular_media() {
        media = soma_notas / quantidade_notas;
    }
    public void verificar_situacao() {
        if (media >= 70) {
            situacao = "aprovado/a";
        } else if (media >= 40 && media < 70) {
            situacao = "na final";
        } else if (media < 40) {
            situacao = "reprovado/a";
        }
    }
}
