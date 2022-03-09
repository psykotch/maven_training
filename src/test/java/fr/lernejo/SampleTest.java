package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void fact_test() {
        int n = 4;
        Assertions.assertThat(new Sample().fact(n)).isEqualTo(24);
    }

    @Test
    void fact_test_negative() {
        int n = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new Sample().fact(n));
    }

    @Test
    void addition_test() {
        Sample.Operation operation = Sample.Operation.ADD;
        int a = 5;
        int b = 3;
        Assertions.assertThat(new Sample().op(operation, a, b)).isEqualTo(8);
    }

    @Test
    void mult_test() {
        Sample.Operation operation = Sample.Operation.MULT;
        int a = 2;
        int b = 5;
        Assertions.assertThat(new Sample().op(operation, a, b)).isEqualTo(10);
    }
}
