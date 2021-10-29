import java.util.Arrays;

public class Zd5_3_KozhanOleksandra {
    public static void main(String[] args) {
        int[] mas_OleksandraKozhan = new int[10];

        for (int i_OleksandraKozhan = 0; i_OleksandraKozhan < 10; i_OleksandraKozhan++) {
            mas_OleksandraKozhan[i_OleksandraKozhan] = (int) (Math.floor(Math.random() * 100) + 1);
            System.out.println(mas_OleksandraKozhan[i_OleksandraKozhan]);
        }
        int min_OleksandraKozhan = Arrays.stream(mas_OleksandraKozhan).min().getAsInt();
        int max_OleksandraKozhan = Arrays.stream(mas_OleksandraKozhan).max().getAsInt();
        System.out.println("Min = " + min_OleksandraKozhan);
        System.out.println("Max = " + max_OleksandraKozhan);

    }
}
