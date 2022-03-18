package PatronMediador;

import java.util.ArrayList;
import java.util.List;

public class Mediador implements IMediador {
    private List<Participante> listaParticipante = new ArrayList<Participante>();

    public void agregarParticipantes(Participante participante)
    {
        listaParticipante.add(participante);
    }

    public void notificarEvento(String evento, Participante participante)
    {
        for(Participante participantes : this.listaParticipante)
        {
            if (participantes != participante)
            {
                participantes.ejecutar(evento);
            }
        }
    }
}
