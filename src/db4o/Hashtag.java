
package db4o;

public class Hashtag {
    
    private int id;
    private String hashtag;

    public Hashtag() {
    }

    public Hashtag(int id, String hashtag) {
        this.id = id;
        this.hashtag = hashtag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }
    
    public Hashtag(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hashtag{" + "id=" + id + ", hashtag=" + hashtag + '}';
    }    
    
}
