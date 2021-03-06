/**
 * This version:
 * @author Ricky Chu
 * @version December 2018
 */
package People;

public class Robot extends Creature{
    public Robot(int health, String name) {
        super(health, name);
    }


    @Override
    public String getImage(){
        return "                        /[-])//  ___\n" +
        "                     __ --\\ `_/~--|  / \\\n" +
        "                   /_-/~~--~~ /~~~\\\\_\\ /\\\n" +
        "                   |  |___|===|_-- | \\ \\ \\\n" +
        " _/~~~~~~~~|~~\\,   ---|---\\___/----|  \\/\\-\\\n" +
        " ~\\________|__/   / // \\__ |  ||  / | |   | |\n" +
        "          ,~-|~~~~~\\--, | \\|--|/~|||  |   | |\n" +
        "          [3-|____---~~ _--'==;/ _,   |   |_|\n" +
        "                      /   /\\__|_/  \\  \\__/--/\n" +
        "                     /---/_\\  -___/ |  /,--|\n" +
        "                     /  /\\/~--|   | |  \\///\n" +
        "                    /  / |-__ \\    |/\n" +
        "                   |--/ /      |-- | \\\n" +
        "                  \\^~~\\\\/\\      \\   \\/- _\n" +
        "                   \\    |  \\     |~~\\~~| \\\n" +
        "                    \\    \\  \\     \\   \\  | \\\n" +
        "                      \\    \\ |     \\   \\    \\\n" +
        "                       |~~|\\/\\|     \\   \\   |\n" +
        "                      |   |/         \\_--_- |\\\n" +
        "                      |  /            /   |/\\/\n" +
        "                       ~~             /  /\n" +
        "                                     |__/\n";
    }
}
