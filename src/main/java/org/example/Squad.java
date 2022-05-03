package org.example;



public class Squad {
    private String squadName;
    private String squadImage;

    private int id;

    public Squad(String name, String image){
        this.squadName = name;
        this.squadImage = image;
    }

    public String getSquadName() {
        return squadName;
    }

    public void setSquadName(String squadName) {
        this.squadName = squadName;
    }

    public String getSquadImage() {
        return squadImage;
    }

    public void setSquadImage(String squadImage) {
        this.squadImage = squadImage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
