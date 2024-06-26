
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curos Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curos JS");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria java ");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria);
    }

}