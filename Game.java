public class Game 
{
    public void startGame()
    {
        class Player
        {
            private String name;
            private int score;
            public Player(String name,int score)
            {
                this.name=name;
                this.score=score;
            }
            public void displayScore()
            {
                System.out.println("Player:"+name+"\nscore:"+score);
            }
        }
        Player p=new Player("Dhoni",100);
        p.displayScore();
    }
    public static void main(String[] args) 
    {
        Game g=new Game();
        g.startGame();
    }
}
