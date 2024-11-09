public class TransportePublico extends Veiculo {

    @Override
    public String getMontadora(){
        return super.getMontadora() + " - Realmente a gente não repara nesse detalhe.";
    }

    @Override
    public void setMontadora(String montadora){
        if (montadora == null || montadora.isEmpty()){
            montadora = "Montadora de onibus padrão. ";
        }
        super.setMontadora(montadora);
    }

    @Override
    public String getModelo(){
        return super.getModelo() + " -  O que realmente importa é se ele está vazio ou cheio.";
    }

    @Override
    public void setModelo(String modelo){
        if (modelo == null || modelo.isEmpty()){
            modelo = "Modelo de ônibus comum. ";
        }
        super.setModelo(modelo);
    }

    @Override
    void ligar(){
        System.out.println("Pague a passagem ao cobrador.");
    }

}
