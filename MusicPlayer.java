public class MusicPlayer 
{
    public static class Song
    {
        private String title;
        private String artist;
        public Song(String title,String artist)
        {
            this.title=title;
            this.artist=artist;
        }
        public void play()
        {
            System.out.println("Now Playing "+title+" by "+artist);
        }
    }
    public static void main(String[] args) 
    {
        Song s1=new Song("ilu baby","xyz");
        Song s2=new Song("oh oh oh","abc");
        s1.play();
        s2.play();
    }
}
