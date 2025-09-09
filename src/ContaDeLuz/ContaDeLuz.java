package ContaDeLuz;
import java.util.Date;

public class ContaDeLuz {
    public Date dataLeitura;
    public int numeroLeitura;
    public int qtdKwGasto;
    public double valorPagar;
    public Date dataPagamento;
    public double mediaConsumo;

    public ContaDeLuz(Date dataLeitura, int numeroLeitura, int qtdKwGasto, double valorPagar, Date dataPagamento) {
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.qtdKwGasto = qtdKwGasto;
        this.valorPagar = valorPagar;
        this.dataPagamento = dataPagamento;
        this.mediaConsumo = 0;
    }

    public void cadastrarConta()
    {
        // Conta Cadastrada
    }

    public String verificaMesMenorConsumo()
    {
        return "Menor Consumo"; // Exemplo
    }

    public String verificaMesMaiorConsumo()
    {
        return "Maior Consumo"; // Exemplo
    }
}