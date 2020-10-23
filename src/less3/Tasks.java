package less3;

public class Tasks {
    public static void main(String[] args) {
        taskOne();
    }

    private static void taskOne() {
        int[] mas = new int[5];
        for (int i = 0; i < 5; i++) {
            mas[i] = (int) (Math.random() * 44);
        }

        for(int j = 0; j < 5; j++) {
            System.out.println("Element is " + mas[j]);
        }
    }
}

