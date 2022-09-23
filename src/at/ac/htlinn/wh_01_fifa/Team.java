package at.ac.htlinn.wh_01_fifa;

import java.util.ArrayList;

public class Team
{
    private String name;
    private ArrayList<Member> members;

    public Team(String name)
    {
        this.name = name;
    }

    public void add(Member m)
    {
        members.add(m);
    }

}
