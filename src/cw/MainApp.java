package cw;

/* Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep.
 * Warn the sheep in front of the wolf that it is about to be eaten.
 * Remember that you are standing at the front of the queue which is at the end of the array.
 * If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep".
 * Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.
 * Note: there will always be exactly one wolf in the array.
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println(warnTheSheep(new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"wolf", "sheep", "sheep", "sheep", "sheep", "sheep", "sheep"}));
        System.out.println(warnTheSheep(new String[]{"sheep", "wolf", "sheep"}));
    }

    public static String warnTheSheep(String[] arr) {
        int l = arr.length;
        String str = "";

        if (arr[l - 1].equals("wolf")) {
            str = "Pls go away and stop eating my sheep";
        } else {
            for (int i = l - 2, j = 2; i >= 0; i--, j++) {
                if (arr[i].equals("wolf")) {
                    str = "Oi! Sheep number " + (j - 1) + "! You are about to be eaten by a wolf!";
                    break;
                }
            }
        }
        return str;
    }

}
