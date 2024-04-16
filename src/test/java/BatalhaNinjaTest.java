import org.junit.Assert;
import org.junit.Test;

public class BatalhaNinjaTest {

    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(5,10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5,8);
        Ninja ninjaDois = new Ninja("Gara",jutsuNinjaDois);

        Batalha batalha = new Batalha();
        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        System.out.println(ninjaVencedor.getNome());
        //Assert
        Assert.assertSame(ninjaUm,ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar(){
        //Arrange
        Jutsu jutsuNinjaUm = new Jutsu(5,10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5,8);
        Ninja ninjaOponente = new Ninja("Gara",jutsuNinjaDois);


        int chakraEsperado = 90;

        //Act

        ninjaAtacante.atacar(ninjaOponente);

        System.out.println("o chakra de " +ninjaOponente.getNome() + " é "  + ninjaOponente.getChakra());
        //Assert
        Assert.assertEquals(chakraEsperado,ninjaOponente.getChakra(), 0.01);


    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi(){
        //Arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5,50);
        Ninja ninjaUm = new Ninja("itachi",jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5,600);
        Ninja ninjaDois = new Ninja("Gaara",jutsuSegundoNinja);
        String vencedorEsperado = "itachi";
        Batalha batalha = new Batalha();
        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm,ninjaDois);

        System.out.println(ninjaVencedor.getNome());
        //Assert
        Assert.assertSame(vencedorEsperado,ninjaVencedor.getNome());
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi(){
        //Arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5,60);
        Ninja ninjaUm = new Ninja("Gaara",jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5,40);
        Ninja ninjaDois = new Ninja("itachi",jutsuSegundoNinja);
        String vencedorEsperado = "itachi";
        Batalha batalha = new Batalha();
        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm,ninjaDois);

        System.out.println(ninjaVencedor.getNome());
        //Assert
        Assert.assertSame(vencedorEsperado,ninjaVencedor.getNome());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar(){
        //Arrange
        Jutsu jutsuPrimeiroNinja = new Jutsu(5,10);
        Ninja ninjaUm = new Ninja("naruto",jutsuPrimeiroNinja);

        Jutsu jutsuSegundoNinja = new Jutsu(5,10);
        Ninja ninjaDois = new Ninja("Gaara",jutsuSegundoNinja);

        Batalha batalha = new Batalha();

        String ninjaEsperado = "naruto";
        //Act
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);
        System.out.println(ninjaVencedor.getNome());

        //Assert
        Assert.assertEquals(ninjaEsperado, ninjaVencedor.getNome());


    }


}
