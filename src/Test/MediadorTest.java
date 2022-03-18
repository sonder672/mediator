package Test;

import EjemploPractico.Jose;
import EjemploPractico.SalaChat;
import PatronMediador.Mediador;

public class MediadorTest {


    public static void main(String[] args) {
        //Instancia del mediador
        Mediador mediador = new Mediador();

        //Instancia de participantes
        Jose participanteJose = new Jose(mediador);
        SalaChat salaChat = new SalaChat(mediador);

        mediador.agregarParticipantes(participanteJose);
        mediador.agregarParticipantes(salaChat);

        participanteJose.ejecutar("hola");
    }
}
