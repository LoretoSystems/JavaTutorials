package systems.loreto.java8.optionalclass;

import java.util.Optional;

class Calculator {

    public Optional<Integer> divide(int a, int b) {
        return (b == 0)
                ? Optional.empty()
                : Optional.of(a / b);
    }
}
