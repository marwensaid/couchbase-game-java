package pl.altconnect.beans;

public class Message {

    private String game;
    private String team;
    private String content;

    public Message() {

    }

    public Message(String geam, String team, String content) {
        this.game = geam;
        this.team = team;
        this.content = content;
    }

    public String getGeam() {
        return game;
    }

    public void setGeam(String geam) {
        this.game = geam;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
