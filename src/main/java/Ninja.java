public class Ninja {
    private String nome;
    private int chakra = 100;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu){
        this.nome = nome;
        this.jutsu = jutsu;
    }

    public String getNome(){
        return nome;
    }
    public int getChakra(){
        return chakra;
    }

    public void atacar( Ninja ninjaOponente){
        chakra -= jutsu.qtdChakra;
        ninjaOponente.receberGolpe(jutsu.qtdDano);
    }

    public void receberGolpe(int qtdDano){
       chakra -= qtdDano;
    }

}
