/**
 * This version:
 * @author Ricky Chu
 * @version December 2018
 */
package Items;

import People.Person;

public interface Item {
    void addtoInventory(Person person);
    String toString();

}
