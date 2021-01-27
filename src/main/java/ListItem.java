import java.util.Objects;

public class ListItem {

    private Animal value;
    private ListItem next;

    public ListItem(Animal value){
        this.value = value;
    }

    public void addItem(ListItem value){
        ListItem actual = this;

        while(actual.getNext() != null){
            actual = actual.getNext();
        }
        actual.setNext(value);
    }

    public String getList(ListItem value){
        ListItem actual = this;

        while(actual.getNext() != null){
            actual = actual.getNext();
        }
        actual.setNext(value);
        return ListItem;
    }

    public Animal getValue() {
        return value;
    }

    public void setValue(Animal value) {
        this.value = value;
    }

    public ListItem getNext() {
        return next;
    }

    public void setNext(ListItem next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListItem that = (ListItem) o;
        return Objects.equals(value, that.value) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }

    @Override
    public String toString() {
        return "AnimalListItem{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
