import java.util.Scanner;

public class J3CellPhoneMessaging2006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter;
        char[] two = {'a', 'b', 'c'};
        char[] three = {'d', 'e', 'f'};
        char[] four = {'g', 'h', 'i'};
        char[] five = {'j', 'k', 'l'};
        char[] six = {'m', 'n', 'o'};
        char[] seven = {'p', 'q', 'r', 's'};
        char[] eight = {'t', 'u', 'v'};
        char[] nine = {'w', 'x', 'y', 'z'};

        while (true) {
            String input = sc.nextLine();
            if (input.equals("halt")) {
                break;
            }

            counter = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'd' || input.charAt(i) == 'g' || input.charAt(i) == 'j' || input.charAt(i) == 'm' || input.charAt(i) == 'p' || input.charAt(i) == 't' || input.charAt(i) == 'w') {
                    counter += 1;
                } else if (input.charAt(i) == 'b' || input.charAt(i) == 'e' || input.charAt(i) == 'h' || input.charAt(i) == 'k' || input.charAt(i) == 'n' || input.charAt(i) == 'q' || input.charAt(i) == 'u' || input.charAt(i) == 'x') {
                    counter += 2;
                } else if (input.charAt(i) == 'c' || input.charAt(i) == 'f' || input.charAt(i) == 'i' || input.charAt(i) == 'l' || input.charAt(i) == 'o' || input.charAt(i) == 'r' || input.charAt(i) == 'v' || input.charAt(i) == 'y') {
                    counter += 3;
                } else if (input.charAt(i) == 's' || input.charAt(i) == 'z') {
                    counter += 4;
                }

                if (i != input.length() - 1) {
                    if (input.charAt(i) == 'a' || input.charAt(i) == 'b' || input.charAt(i) == 'c') {
                        if (search(two, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'd' || input.charAt(i) == 'e' || input.charAt(i) == 'f') {
                        if (search(three, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'g' || input.charAt(i) == 'h' || input.charAt(i) == 'i') {
                        if (search(four, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'j' || input.charAt(i) == 'k' || input.charAt(i) == 'l') {
                        if (search(five, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'm' || input.charAt(i) == 'n' || input.charAt(i) == 'o') {
                        if (search(six, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'p' || input.charAt(i) == 'q' || input.charAt(i) == 'r' || input.charAt(i) == 's') {
                        if (search(seven, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 't' || input.charAt(i) == 'u' || input.charAt(i) == 'v') {
                        if (search(eight, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    } else if (input.charAt(i) == 'w' || input.charAt(i) == 'x' || input.charAt(i) == 'y' || input.charAt(i) == 'z') {
                        if (search(nine, input.charAt(i + 1))) {
                            counter += 2;
                        }
                    }
                }
            }
            System.out.println(counter);
        }
    }

    public static boolean search(char[] a, char c) {
        for (char temp : a) {
            if (temp == c) return true;
        }
        return false;
    }
}
