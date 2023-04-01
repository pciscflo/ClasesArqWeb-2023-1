package basicfunction;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassFriend classFriend = new ClassFriend() {
            @Override
            public String sayMessage(String msg) {
                return msg + " Bienvenido!";
            }
        };

        System.out.println(classFriend.sayMessage("Carlos"));

    }
}
