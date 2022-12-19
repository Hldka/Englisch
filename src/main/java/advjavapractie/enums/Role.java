package advjavapractie.enums;

public enum Role {
    ROLE_ADMIN("admin"),
    ROLE_TEACHER("teacher"),
    ROLE_STUDENT("student");

    public String getName() {
        return name;
    }

    private final String name;

    Role(String name) {
        this.name = name;
    }
}
