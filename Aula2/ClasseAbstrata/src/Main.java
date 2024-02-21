public class Main {
    public static void main(String[] args) {
        PadroesDeProjeto disciplinaPadroesDeProjeto = new PadroesDeProjeto("Fernando", 6669);

        disciplinaPadroesDeProjeto.matricularAluno("Deborah");
        disciplinaPadroesDeProjeto.matricularAluno("Jean");
        disciplinaPadroesDeProjeto.matricularAluno("Thiago");

        disciplinaPadroesDeProjeto.exibirAlunos();
    }
}
