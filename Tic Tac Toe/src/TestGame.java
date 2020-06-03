public class TestGame {

    public static void main(String[] args){

        GameRule game= new GameRule(3);

        System.out.println(game.getBoard());

        game.getBoard().Omove(1,1);

        game.getBoard().Xmove(2,0);

        game.getBoard().Omove(0,2);

        System.out.println(game.getBoard());

        game.WinCondition();

    }


}
