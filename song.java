public class Song {

   public String name;
   public String artist;
   public String album;
   public int length;

   public Song(String songName, String artistName, String albumName, int trackLength) {
      this.name = name;
      this.artist = artist;
      this.album = album;
      this.length = length;
   }
   public void setName(String songName) {
      name = songName;
   }
   public String getName() {
      return name;
   }
   public void setArtist(String artistName) {
      artist = artistName;
   }
   public String getArtist() {
      return artist;
   }
   public void setAlbum(String albumName) {
      album = albumName;
   }
   public String getAlbum() {
      return album;
   }
   public void setLength(int trackLength) {
      length = trackLength; 
      }   
   }
   public int getLength() {
      return length;
   }

   public String toString() {
      return "Title: " + getName() + ", Artist: " + getArtist()
                + ", Album: " + getAlbum() + ", Track Length: " + getLength();
   }         

}       