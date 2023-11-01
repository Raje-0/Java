package compareAndComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ComparableExample implements Comparable<ComparableExample> {
    private int value;

    public ComparableExample(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public int compareTo(ComparableExample other) {
        return Integer.compare(this.value, other.value);
    }

    public static void main(String[] args) {
        List<ComparableExample> examples = new ArrayList<>();
        examples.add(new ComparableExample(5));
        examples.add(new ComparableExample(2));
        examples.add(new ComparableExample(8));

        Collections.sort(examples);

        for (ComparableExample example : examples) {
            System.out.println(example.getValue());
        }
    }
}

