package hu.progmatic;

public class MatchesAll {
private String year;
private String stage;
private String date;
private String team_a;
private String team_b;
private int goals_a;
private int goals_b;
private int penalties_a;
private int penalties_b;




    public MatchesAll(String lines) {
        String[] data = lines.split(";");
if (data.length > 7) {


    this.year = data[0];
    this.stage = data[1];
    this.date = data[2];
    this.team_a = data[3];
    this.team_b = data[4];
    this.goals_a = Integer.parseInt(data[5]);
    this.goals_b = Integer.parseInt(data[6]);
    this.penalties_a = Integer.parseInt(data[7]);
    this.penalties_b = Integer.parseInt(data[8]);

}else{
    this.year = data[0];
    this.stage = data[1];
    this.date = data[2];
    this.team_a = data[3];
    this.team_b = data[4];
    this.goals_a = Integer.parseInt(data[5]);
    this.goals_b = Integer.parseInt(data[6]);

}


    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String teamA) {
        this.team_a = team_a;
    }

    public String getTeam_b() {
        return team_b;
    }

    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    public int getGoals_a() {
        return goals_a;
    }

    public void setGoals_a(int goals_a) {
        this.goals_a = goals_a;
    }

    public int getGoals_b() {
        return goals_b;
    }

    public void setGoals_b(int goals_b) {
        this.goals_b = goals_b;
    }

    public int getPenalties_a() {
        return penalties_a;
    }

    public void setPenalties_a(int penalties_a) {
        this.penalties_a = penalties_a;
    }

    public int getPenalties_b() {
        return penalties_b;
    }

    public void setPenalties_b(int penalties_b) {
        this.penalties_b = penalties_b;
    }
}
