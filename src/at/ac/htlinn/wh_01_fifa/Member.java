package at.ac.htlinn.wh_01_fifa;

public class Member
{
    private String fullName;
    private int age;
    private String photoUrl;

    public Member(String fullName, int age, String photoUrl)
    {
        super();
        this.fullName = fullName;
        this.age = age;
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString()
    {
        return String.format("%s (%d): %s", fullName, age, photoUrl);
    }

    @Override
    public boolean equals(Object obj)
    {
        Member m = (Member)obj;
        return this.fullName.equals(m.fullName) && this.age == m.age && this.photoUrl.equals(m.photoUrl);
    }
}
