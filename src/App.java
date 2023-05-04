public class App {
    public static void main(String[] args) throws Exception {

        Carro meuCarro = new Carro();

        meuCarro.marca = "Chevrolet";
        meuCarro.modelo = "Onix";
        meuCarro.ano = 2021;
        meuCarro.valor = 8000.0;

        meuCarro.acelelar();
        meuCarro.frear();

        System.out.println("O carro é um " + meuCarro.marca + " " + meuCarro.modelo + " ano " + meuCarro.ano);


    }
}
