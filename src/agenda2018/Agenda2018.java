
package agenda2018;

import javax.swing.JOptionPane;

public class Agenda2018 {

    public static void main(String[] args) {
        // TODO code application logic here
        //declarar variáveis        
        String resposta, nota;
        //int A, B, C, nota;
        //A=0; B=5; C=10;
                
        //AGENDA SEMANA 1
        //TAREFAS
        //("Fez o trabalho de arquitetura? ");
                
        //System.out.println("lista algoritmo half");
        //atividades matemática (0);
        //estudar p/ concurso (1/2);

        //ATIVIDADES
        //currículo lattes (1);

        //AGENDA SEMANA 2
        //TAREFAS
        resposta= JOptionPane.showInputDialog("Estudou UML 2.0?: a (Não) ou b (Half) ou c (Sim) ");
        nota= "Sua nota é: ";
        if (resposta.equals ("a")) {
        nota= nota + "0";
    }
        if (resposta.equals ("b")) {
        nota= nota + "5";
    }
        if (resposta.equals ("c")) {
        nota= nota + "10";
    }
        if (!resposta.equals ("a") && !resposta.equals ("b") && !resposta.equals ("c")) {
        nota= nota + "inválida!";
    }

    JOptionPane.showMessageDialog (null, nota);
    
        //trabalho arquitetura (c);
        //lista algoritmo (c);
        //lista matemática p/ 30.08 (c);
        //atividade Matemática Python
        //ver com Kesia se tem trabalho de arquitetura
        
        
        //ATIVIDADES
        //pagar anuidade (c);
        //curso internet 4.0 (a);
        //exercícios matemática (a);
        //estudar p/ concurso (a);
        //ler livro JAVA (b)
        //ler livro Engenharia (b)
        //entregar currículos
        //fazer lista Norma p/ exercitar algoritmos
    }
    
}
