interface Component {
    void traverse();
}

class Primitive implements Component {
    private int value;

    public Primitive(int val) {
        value = val;
    }

    public void traverse() {
        System.out.print( value + "  " );
    }
}

abstract class Composite implements Component {
    private Component[] children = new Component[9];
    private int total = 0;
    private int value;
    public Composite(int val) {
        value = val;
    }

    public void add(Component c) {
        children[total++] = c;
    }

    public void traverse() {
        System.out.print(value + "  ");
        for (int i=0; i < total; i++) {
            children[i].traverse();
        }
    }
}

class Row extends Composite {
    public Row(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Row");
        super.traverse();
    }
}

class Column extends Composite {
    public Column(int val) {
        super(val);
    }

    public void traverse() {
        System.out.print("Col");
        super.traverse();
    }
}

public class CompositeDemo {
    public static void main( String[] args ) {
        Composite first  = new Row( 1 );
        Composite second = new Column( 2 );
        Composite third  = new Column( 3 );
        Composite fourth = new Row( 4 );
        Composite fifth  = new Row( 5 );
        first.add(second);
        first.add(third);
        third.add(fourth);
        third.add(fifth);
        first.add(new Primitive(6));
        second.add(new Primitive(7));
        third.add(new Primitive(8));
        fourth.add(new Primitive(9));
        fifth.add(new Primitive(10));
        first.traverse();
    }
}