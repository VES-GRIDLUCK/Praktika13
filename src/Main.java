import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Scanner scanner = new Scanner(System.in);

        String fio = scanner.nextLine();
        LocalDate birthday = LocalDate.ofEpochDay(scanner.nextInt());
        String telephone = scanner.nextLine();

        human.setFio(String.valueOf(fio));
        human.setBirthday(LocalDate.parse(String.valueOf(birthday)));
        human.setTelephone(String.valueOf(telephone));

        System.out.println(human.getFio());
        System.out.println(human.getBirthday());
        System.out.println(human.getTelephone());
        System.out.println(human.getCity());
        System.out.println(human.getCountry());
        System.out.println(human.getAddress());

    }
}