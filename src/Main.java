import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.DesafioCodigo;
import br.com.dio.desafio.dominio.DesafioProjeto;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.FaseDesafioCodigo;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        FaseDesafioCodigo fase1 = new FaseDesafioCodigo();
        fase1.setTitulo(
            "Serviço de Enrega de Comida com JavaScript"
        );
        fase1.setDesafio(
            """
            Crie uma função que calcule o custo de entrega de um pedido com base em seu peso e 
            a distância a ser percorrida sabendo que "Preço = Peso x Distância / 100" e que os argumentos
            passados são, respectivamente, peso em gramas e distância em kilometros.
            """
        );
        fase1.setExemplos(
            """
            Entrada |   Saida
            500     |   O custo de entrega é de R$ 10.00
            20      |
            """
        );
        fase1.setCodigoInicial(
            """
            const peso = parseFloat();
            const distancia = parseFloat();
            //TODO: imprimir o custo
            print(""); 
            """
        );
        DesafioCodigo desafioCodigo1 = new DesafioCodigo();
        desafioCodigo1.setTitulo("Treinando lógica com JavaScript");
        desafioCodigo1.setDescricao("Treine sua lógica de programação com JavaScript");
        desafioCodigo1.setDificuldade(1);
        desafioCodigo1.setCargaHoraria(1);
        desafioCodigo1.getFases().add(fase1);

        DesafioProjeto desafioProjeto1 = new DesafioProjeto();
        desafioProjeto1.setTitulo("Projeto POO");
        desafioProjeto1.setDescricao("Treine POO com Java na prática desenvolvendo o sistema de bootcamp da DIO");
        desafioProjeto1.setCargaHoraria(3);
        desafioProjeto1.setDificuldade(2);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(desafioCodigo1);
        bootcamp.getConteudos().add(desafioProjeto1);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }

}
