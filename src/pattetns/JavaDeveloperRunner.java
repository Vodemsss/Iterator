package pattetns;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "PostgreSQL"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Vadim Sadenov", skills);

        Iterator iterator = javaDeveloper.gerIterator();
        System.out.println("Developer:" + javaDeveloper.getName());
        System.out.println("Skills:");

        while (iterator.hasNext()){
            System.out.print(iterator.next().toString() + " ");
        }
    }
}
