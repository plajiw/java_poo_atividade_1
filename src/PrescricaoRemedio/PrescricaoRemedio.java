package PrescricaoRemedio;

import java.util.Date;
import java.util.List;

public class PrescricaoRemedio {
    public String usuario;
    public Date dataInicio;
    public int qtdDias;
    public int qtdVezesDia;
    public double dosagem;
    public String remedio;
    public List<HorarioRemedio> planilhaHorarios;

    public void sugerirHorarios() {
    }

    public void exibirPlanilhaHorarios(Date dataReferencia) {
    }
}
