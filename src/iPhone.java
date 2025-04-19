import aparelho_telefonico.AparelhoTelefonico;
import navegador_internet.NavegadorInternet;
import reprodutor_musical.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;

    public iPhone(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música no " + modelo);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música no " + modelo);
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica + " no " + modelo);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " do " + modelo);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no " + modelo);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no " + modelo);
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url + " no " + modelo);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no " + modelo);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no " + modelo);
    }
}
