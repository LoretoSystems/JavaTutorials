package systems.loreto.java8.defaultmethods;

interface Calculator {
    int add(int a, int b);

    default int subtract(int a, int b) {
        return a - b;
    }
}
