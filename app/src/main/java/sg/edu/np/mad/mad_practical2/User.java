package sg.edu.np.mad.mad_practical2;

public class User {
    public String name,
        description;
    public int id;
    public boolean followed;
    public User(String name,
                String description,
                int id,
                boolean followed)
    {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }
}
