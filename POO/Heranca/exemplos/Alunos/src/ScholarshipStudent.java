package exemplos.Alunos.src;

class ScholarshipStudent extends Student {

    private float scholarshipValue;

    public ScholarshipStudent(String name, float scholarshipValue) {
        super(name);
        this.scholarshipValue = scholarshipValue;
    }

    @Override
    public String getName() {
        /*note que uso super para chamar o método da classe pai,
         porém para usar corretamente preciso saber se a implementação
        daquele método não irá quebrar o que fiz o que perde pontos em
        relação ao encapsulamento, imagina se tive-se uma árvore complexa :(
         */
        return "Bolsista:"+ super.getName();
    }

    public float getScholarshipValue() {
        return scholarshipValue;
    }

    public void setScholarshipValue(float scholarshipValue) {
        this.scholarshipValue = scholarshipValue;
    }
}