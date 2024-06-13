public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }
    public void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }
    public void selecionarMusica(String musica){
        System.out.println("SELECIONANDO MÚSICA " + musica);
    }
    
    public void ligar(String numero){
        System.out.println("FAZENDO LIGAÇÃO PARA " + numero);
    }
    public void atender(){
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    public void iniciarCorreioVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

    public void exibirPagina(String url){
        System.out.println("FAZENDO LIGAÇÃO");
    }
    public void adicionarNovaAba(){
        System.out.println("ATENDENDO LIGAÇÃO");
    }
    public void atualizarPagina(){
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
