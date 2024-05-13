package Q4;

public class GenericsAndTernary {
    static class MyBox<T> {
        private T myVal;

        public MyBox(T thing) { myVal = thing; }
        public void setVal(T thing) { myVal = thing; }
        public T getVal() { return myVal; }
    }

    public static void main(String[] args) {
        var box = new MyBox<Integer>(5);
        String msg = (box.getVal() >= 5) ? "val >= 5" : "val < 5";
        System.out.println(msg);
        box.setVal(10);
        System.out.println(box.getVal());
        var sBox = new MyBox<String>("Hello");
        System.out.println(sBox);
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
