public class User {
    public static void main(String[] args) throws Exception {
     
        SmartTv smartTv = new SmartTv();

        System.out.println("Estado da TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.ligarTv();

        System.out.println("Estado da TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("Estado da TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);

        smartTv.mudarCanal(42);

        System.out.println("Estado da TV: "+smartTv.ligada);
        System.out.println("Canal: "+smartTv.canal);
        System.out.println("Volume: "+smartTv.volume);
    }
}
