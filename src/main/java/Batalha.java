public class Batalha {

    public Ninja lutar(Ninja primeiroNinja, Ninja segundoNinja) {
        int numAtaques = 3;
        for (int i = 1; i <= numAtaques; i++) {
            primeiroNinja.atacar(segundoNinja);
        }
        for (int i = 1; i <= 3; i++) {
            segundoNinja.atacar(primeiroNinja);
        }

        if (primeiroNinja.getNome().equals("itachi")) {
            return primeiroNinja;
        } else if (segundoNinja.getNome().equals("itachi")) {
            return segundoNinja;
        } else if (primeiroNinja.getChakra() > segundoNinja.getChakra()) {
            return primeiroNinja;
        } else if (primeiroNinja.getChakra() == segundoNinja.getChakra()) {
            return primeiroNinja;
        }else{
            return segundoNinja;
        }
    }
}
