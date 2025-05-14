import java.io.*;

public class Vowels {
    public static void main(String[] args) {
        String file_name = "demo.txt";
        int vowel_cnt = 0;
        int word_cnt = 0;
        int a_cnt = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file_name));
            String line;

            while ((line = br.readLine()) != null) {
                // Count vowels and occurrences of 'a'
                for (char ch : line.toLowerCase().toCharArray()) {
                    if ("aeiou".indexOf(ch) != -1) {
                        vowel_cnt++;
                    }
                    if (ch == 'a') {
                        a_cnt++;
                    }
                }

                // Count words
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    word_cnt += words.length;
                }
            }

            br.close();

            System.out.println("Total vowels: " + vowel_cnt);
            System.out.println("Total words: " + word_cnt);
            System.out.println("Occurrences of 'a': " + a_cnt);

        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

