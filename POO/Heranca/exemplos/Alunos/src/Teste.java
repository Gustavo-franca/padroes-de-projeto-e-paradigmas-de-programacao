package exemplos.Alunos.src;

public class Teste {
    public static void main(String[] args) {


        /*Quando usamos Herança podemos instanciar a classe SpecialStudent porém precisamos passar os atributos
        necessários das classe aluno pelo construtor*/

        SpecialStudent specialstudent = new SpecialStudent("Pedro","especialidade");

        /*Note que nesse caso eu apenas instanciei a váriavel do tipo aluno com a classe SpecialStudent isso irá
        deixar visivel apenas os métodos do Student para uso. Funcionalidade interessante para usar polimorfismo.
         */
        Student student = new SpecialStudent("Dhow","especialidade2");

        System.out.println(specialstudent.getSpecialty() );
        // System.out.println(student.getSpecialty() );//note que este método não está disponivel e retorna erro
        System.out.println(student.getName());//por outro lado consigo acessar o nome
        System.out.println(specialstudent.getName());//e dessa forma tbm

        /*porém agora o aluno bolsista ao retornar seu nome deve indicar que é bolsista asism podemos rescrever
        métodos da classe pai.*/
        ScholarshipStudent scholarshipStudent = new ScholarshipStudent("Felipe",1500);
        Student student1 = new ScholarshipStudent("Pedro2",2000);

        System.out.println(student1.getName());//o que você acha que irá retornar aluno "pedro2" ou "bolsista:predro2"
        System.out.println(scholarshipStudent.getName()); //óbivio que é "bolsista: Felipe"
        /*Resultuado
        Bolsista:Pedro2
        Bolsista:Felipe
         */
        /* Show então quando rescrevo algum método as modificações permanecem mesmo se eu não utilizar o tipo StudentBolsita
        diretamente, mas e agora eu preciso apenas do nome? como eu faço? teria que duplicar os métodos
         para conseguir pegar apenas o nome
        */





    }
}