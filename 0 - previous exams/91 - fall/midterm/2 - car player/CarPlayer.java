public class CarPlayer implements DVDPlayer, CassettePlayer {

    @Override
    public void play() {
        System.out.println("play");
    }
}