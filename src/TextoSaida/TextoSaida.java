package TextoSaida;

public class TextoSaida {
    public String texto;
    public TipoComponente tipoComponente;
    public int tamanhoFonte;
    public Cor corFonte;
    public Cor corFundo;

    public TextoSaida(String texto, TipoComponente tipoComponente, int tamanhoFonte, Cor corFonte, Cor corFundo) {
        this.texto = texto;
        this.tipoComponente = tipoComponente;
        this.tamanhoFonte = tamanhoFonte;
        this.corFonte = corFonte;
        this.corFundo = corFundo;
    }
    public void cadastrar() { }

    public void exibirTexto() { }
}
