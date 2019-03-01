package chapter3;

/**
 *
 * @author Gerardo A A
 */
public class Painting {
    private String tile;
    private String artist;
    private String medium;
    private Double price;
    private Double gallery_commision;

    public Painting(String tile, String artist, String medium, Double price) {
        this.tile = tile;
        this.artist = artist;
        this.medium = medium;
        this.price = price;
        this.gallery_commision = price*.2;
    }
    
    public Painting(){
        this.tile = "Sin Titulo";
        this.artist = "Unknown";
        this.medium = "Desconocido";
        this.price = 0.0;
        this.gallery_commision = 0.0;
        
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
        this.gallery_commision = price*.2;
    }

    public Double getGallery_commision() {
        return gallery_commision;
    }
    
    
    
    
    
}
