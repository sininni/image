package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {

    private String name;
    private String mail;
    private Gender sex;
    private int age;
    private int id;
    private static int counter = 0;

    public Client(String name, String mail, Gender gender, int age){
        this.name = name;
        this.mail = mail;
        this.age = age;
        sex = gender;
        id = counter;
        counter++;
    }
}
