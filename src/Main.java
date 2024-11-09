public class Main {
    public static void main(String[] args) {

        Carro meuSonho = new Carro();
        meuSonho.setModelo("Lancer");
        meuSonho.setMontadora("Mitsubishi");
        meuSonho.setAno(2024);

        System.out.println("Modelo:" + meuSonho.getModelo());
        System.out.println("Montadora: "+ meuSonho.getMontadora());
        System.out.println("Ano:" + meuSonho.getAno());
        System.out.print("Ligando o veículo: ");
        meuSonho.ligar();

        System.out.println("___________________________________________________________________");// para melhorar a legibilidade no terminal

        TransportePublico minhaRealidade = new TransportePublico(); // por enquanto rs
        minhaRealidade.setMontadora("Volvo");
        minhaRealidade.setModelo("Millenium V");
        minhaRealidade.setAno(2024);

        System.out.println("Modelo:" + minhaRealidade.getModelo());
        System.out.println("Montadora: "+ minhaRealidade.getMontadora());
        System.out.println("Ano:" + minhaRealidade.getAno());
        System.out.print("Ligando o veículo: ");
        minhaRealidade.ligar();


    }
}