public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone("iPhone 2007");

        // Testa ReprodutorMusical
        meuIPhone.tocarMusica();
        meuIPhone.selecionarMusica("Teatro dos Vampiros");
        meuIPhone.pausarMusica();

        // Testa AparelhoTelefonico
        meuIPhone.ligar("91234-1234");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testa NavegadorInternet
        meuIPhone.exibirPagina("https://web.dio.me/lab/desafio-de-projeto-1/learning/undefined");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}