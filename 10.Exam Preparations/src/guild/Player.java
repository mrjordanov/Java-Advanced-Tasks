package guild;

public class Player {
    private String name;
    private String clazz;
    private String rank;
    private String description;


    public Player(String name, String clazz) {
        this.name = name;
        this.clazz = clazz;
        this.rank = "Trial";
        this.description = "n/a";
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getClazz() {
        return clazz;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player ").append(this.name).append(": ").append(this.clazz).append("\n");
        sb.append("Rank: ").append(this.rank).append("\n");
        sb.append("Description: ").append(this.description);
        return sb.toString();
    }
}
