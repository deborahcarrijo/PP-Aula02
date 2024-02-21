import java.util.ArrayList;
import java.util.List;

public class PadroesDeProjeto implements Disciplina {
    String professor;
    int codigo;
    List<String> alunos;

    public PadroesDeProjeto(String professor, int codigo) {
        this.professor = professor;
        this.codigo = codigo;
        this.alunos = new ArrayList<>();
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<String> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<String> alunos) {
        this.alunos = alunos;
    }

    @Override
    public void matricularAluno(String aluno) {
        alunos.add(aluno);
        System.out.println("Aluno " + aluno + " matriculado com sucesso.");
    }

    @Override
    public void exibirAlunos() {
        System.out.println("Alunos matriculados na disciplina:");
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
