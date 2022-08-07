import java.time.LocalDate;
import java.time.Period;

public class TituloDeCapitalizacao {

    private LocalDate dataInicial;
    private LocalDate dataFinal;
    private double deposito;

    //Tem que criar uma conta e depois usar o titulo
    public void contratarInvestimento(Conta conta, double deposito, LocalDate dataInicial, LocalDate dataFinal) {
        this.deposito = deposito;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public double resgatarInvestimento() throws TempoInsuficienteException {
        Period period = Period.between(dataInicial, dataFinal);
        int months = Math.abs(period.getMonths());

//        if (months < 12) {
//            throw new TempoInsuficienteException("Você não tem tempo suficiente de contribuição");
//        }
        return deposito * Math.pow((1 + 0.1), months);
    }

}


