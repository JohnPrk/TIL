package com.java.java8to11;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
        int baseNumber = 10;

        /**
         * case1: 함수의 인터페이스를 사용하면 다음과 같이 람다식으로 코드를 줄일 수 있다.
         */
        RunSomething runSomething = () -> System.out.println("runSomething.doIt() = Hello");
        runSomething.doIt();

        /**
         * case2: 함수의 인터페이스를 순수한 형태로 가져가야한다.(아직 100% 이해 못 함)
          */
        RunSomething_int runSomething_int = number -> baseNumber + number;
        System.out.println("runSomething_int.doIt() = " + runSomething_int.doIt(1));

        /**
         * case3: 자바에서 기본으로 제공하는 Function<> 사용
         */
        Plus10 plus10 = new Plus10();
        System.out.println("plus10 = " + plus10.apply(1));

        /**
         * case4: Function을 바로 사용하기
         */
        Function<Integer, Integer> plus20 = (n) -> n + 20;
        System.out.println("plus20 = " + plus20.apply(2));

        /**
         * case5: compose 사용하기(Function보다 먼저 적용)
         */
        Function<Integer, Integer> multiply2 = (n) -> n * 2;

        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println("multiply2AndPlus10 = " + multiply2AndPlus10.apply(2));

        /**
         * case5: andThen 사용하기(Function보다 뒤에 적용)
         */

        Function<Integer, Integer> Plus10Andmultiply2 = plus10.andThen(multiply2);
        System.out.println("Plus10Andmultiply2 = " + Plus10Andmultiply2.apply(2));
    }
}
