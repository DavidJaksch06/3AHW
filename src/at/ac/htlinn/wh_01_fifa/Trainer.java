package at.ac.htlinn.wh_01_fifa;

import java.util.Objects;

public class Trainer extends Member
{
    private String role;

    public Trainer(String fullName, int age, String photoUrl, String role)
    {
        super(fullName, age, photoUrl);
        this.role = role;
    }

    @Override
    public String toString()
    {
        return "Trainer [role=" + role + ", toString()=" + super.toString() + "]";
    }

    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj) && this.role.equals(((Trainer)obj).role);
    }
}
