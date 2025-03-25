public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligarTv()
    {
        this.ligada = true;
    }

    public void desligarTv()
    {
        this.ligada = false;
    }

    public void aumentarVolume()
    {
        this.volume++;
    }

    public void diminuirVolume()
    {
        this.volume--;
    }

    public void avancarCanal()
    {
        this.canal++;
    }

    public void recuarCanal()
    {
        this.canal--;
    }

    public void mudarCanal(int canal)
    {
        this.canal = canal;
    }

}