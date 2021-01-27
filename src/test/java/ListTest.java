import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

        @Test
        @DisplayName("addItemToList")
        public void addItem(){

            //Prüfe ob Elemente in der Liste enthalten sind
            //Füge ein Element hinzu

            //Given
            ListItem listItemA =  new ListItem(new Animal("Dog"));
            ListItem listItemB =  new ListItem(new Animal("Cat"));
            ListItem listItemC =  new ListItem(new Animal("Elephant"));

            //When

            listItemA.addItem(listItemB);
            listItemA.addItem(listItemC);

            String result = "Dog -> Cat -> Elephant";

            //Then
            assertEquals(listItemA.getList(), result);
        }

}
