package EjemploPractico;

import PatronMediador.IMediador;
import PatronMediador.Participante;

import java.util.ArrayList;
import java.util.List;

public class SalaChat extends Participante {

    public SalaChat(IMediador mediador) {
        super(mediador);
    }

    @Override
    public void ejecutar(String mensaje) {
        if (mensaje == null)
        {
            throw new RuntimeException();
        }
        System.out.println(mensaje);
    }
}
