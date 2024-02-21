public class PadroesDeProjeto extends Disciplina {

    public PadroesDeProjeto(String professor, int codigo) {
        super(professor, codigo);
    }

    @Override
    public void matricularAluno(String aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno + " matriculado com sucesso.");
    }
}
