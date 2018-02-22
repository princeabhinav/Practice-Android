package flappybird.failedcoder.com.demo;


public class Album {
    private String name;
    private int numOfSongs;
    private int thumbnail;
    public Album(){
    }
    public Album(String name,int numOfSongs,int thumbnail){
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
    }
    public String getName(){
        return name;
    }
    public int getNumOfSongs(){
        return getNumOfSongs();
    }
    public int getThumbnail(){
        return thumbnail;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumOfSongs(int numOfSongs){
        this.numOfSongs = numOfSongs;
    }
    public void setThumbnail(int thumbnail){
        this.thumbnail = thumbnail;
    }
}