public class Main {
    public static void main(String[] args) {
        Automovel automovel = new Automovel();
        double diferenca;
        boolean diferenca1;
        boolean maior;
        String matricula;
        String marca;
        int cilindrada =0;
        int total =0;
        automovel.setCilindrada(1500);
        automovel.setMarca("Renault");
        automovel.setMatricula("99-AA-99");
        Automovel a2 = new Automovel("AA-99_ZZ", "Renault", 1500);
        diferenca = automovel.calcularDiferencaCilindrada(a2);
        diferenca1=automovel.isCilindradaMaior(a2);
        maior= automovel.isCilindradaMaior(a2);
        total= Automovel.getTotalAutomoveis();
    }
}