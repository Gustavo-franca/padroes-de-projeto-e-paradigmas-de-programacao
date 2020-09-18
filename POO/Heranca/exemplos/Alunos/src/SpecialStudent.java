package exemplos.Alunos.src;
class SpecialStudent extends Student {
    private String specialty;

    public SpecialStudent(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }
}