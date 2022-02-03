package guild;

import java.util.*;


public class Guild {
    private String name;
    private int capacity;
    private Map<String, Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (this.capacity > this.roster.size()) {
            this.roster.put(player.getName(), player);
        }
    }

    public int count() {
        return this.roster.size();
    }

    public boolean removePlayer(String name) {
       /* if (this.roster.containsKey(name)) {
            this.roster.remove(name);
            return true;
        }
        return false;*/
        return this.roster.remove(name) != null;
    }

    public void promotePlayer(String name) {
       /* if (!this.roster.get(name).getRank().equals("Member")) {
            this.roster.get(name).setRank("Member");
        }*/
        this.roster.get(name).setRank("Member");
    }

    public void demotePlayer(String name) {
        if (!this.roster.get(name).getRank().equals("Trial")) {
            this.roster.get(name).setRank("Trial");
        }
    }

   /*public String[] kickPlayersByClass(String clazz) {
        List<String> namesRemoved = new ArrayList<>();

        for (Player player : roster.values()) {
            if (player.getClazz().equals(clazz)) {
                namesRemoved.add(player.getName());
            }
        }
        String[] names = new String[namesRemoved.size()];
        for (int i = 0; i < namesRemoved.size(); i++) {
            names[i] = namesRemoved.get(i);
            this.roster.remove(names[i]);
        }
        return names;
    }*/

    public Player[] kickPlayersByClass(String clazz) {
        List<String> namesRemoved = new ArrayList<>();


        for (var entry : roster.entrySet()) {
            if (entry.getValue().getClazz().equals(clazz)) {
                namesRemoved.add(entry.getKey());
            }
        }
        /* с стреам апи по мапа:
        Player[] playersToRemove = roster.values().stream()
                .filter(p -> p.getClazz().equals(clazz)).toArray(Player[]::new);*/

        Player[] names = new Player[namesRemoved.size()];
        for (int i = 0; i < namesRemoved.size(); i++) {
            String name = namesRemoved.get(i);
            names[i] = this.roster.get(name);
            this.roster.remove(name);
        }
        return names;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append("Players in the guild: ").append(this.name).append(":").append("\n");
        for (Player player : roster.values()) {
            sb.append(player).append("\n");
        }
        return sb.toString().trim();
    }
}
