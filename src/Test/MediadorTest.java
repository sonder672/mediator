package Test;

import EjemploPractico.Jose;
import EjemploPractico.Maria;
import PatronMediador.Mediador;

public class MediadorTest {


    public static void main(String[] args) {
        //Instancia del mediador
        Mediador mediador = new Mediador();

        //Instancia de participantes
        Jose participanteJose = new Jose(mediador);
        Maria participanteMaria = new Maria(mediador);

        mediador.agregarParticipantes(participanteJose);
        mediador.agregarParticipantes(participanteMaria);

        participanteJose.ejecutar("hola");
    }
}
