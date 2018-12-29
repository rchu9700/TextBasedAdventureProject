package Items;

import People.Person;

public class Bomb implements Item {
    public void addtoInventory(Person person) {
        for(int i = 0; i < person.getInventory().length; i++){
            if(person.getInventory()[i] == null){
                person.getInventory()[i] = "Bomb";
                break;
            }
        }
    }
    @Override
    public String toString() {
        return "You found a bomb...something you wouldn't use unless things came down to it.";
    }
}
