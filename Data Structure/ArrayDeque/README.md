# ArrayDeque

<br>

### ArrayDeque

- ArrayDeque 클래스는 이름에서도 알 수 있듯이 Deque와 관련된 클래스인 것을 알 수 있습니다.
    
    ```java
    public class ArrayDeque<E> extends AbstractCollection<E>
                               implements Deque<E>, Cloneable, Serializable {}
    ```
    
- ArrayDeque의 내부 구현에 들어가보니 Deque 인터페이스를 구현하고 있는 클래스인 것을 알 수 있습니다.

<br>

### LIFO ?

- 기억은 잘 나지 않겠지만, 이 전에 Stack에 대한 내부 구현에 들어가봤을 때, LIFO를 구현할 때 ArrayDeque를 사용하라는 내용을 본 적 있을겁니다.
    
    ```java
    
    A more complete and consistent set of LIFO stack operations is provided by the Deque interface and its implementations, which should be used in preference to this class. For example:
    Deque<Integer> stack = new ArrayDeque<Integer>();
    
    public
    class Stack<E> extends Vector<E> {
        /**
         * Creates an empty Stack.
         */
        public Stack() {
        }
    ```
    
- 또한, ArrayDeque의 세부 구현을 보면 ArrayDeque는 `Stack 자료구조`로 사용하면 `Stack 클래스`보다 빠르고, `큐 자료구조`로 사용하면 `LinkedList 클래스`보다 빠르다고 합니다.
    
    ```java
    (...)
    This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.
    (...)
    public class ArrayDeque<E> extends AbstractCollection<E>
                               implements Deque<E>, Cloneable, Serializable
    {
    ```
    
- 이렇게 성능적으로도 떨어지고 LIFO를 구현할 수 없는 Stack이 무엇이 문제일까요?
- 결론적으로 이러한 이유는 Stack 클래스는Vector 클래스를 잘못 상속 받았기 때문입니다.
- 따라서 스택 클래스에는 큰 문제점 3가지가 존재하는데 어떤 것인지 살펴보겠습니다.

<br>

### Stack 클래스의 문제점 3가지

- Stack 클래스의 단점 3가지를 정리하면 아래와 같습니다.
    - 모든 메소드에 synchronized가 있기 때문에 단일 스레스 환경에서는 성능이 떨어집니다.
    - Vector 클래스를 상속받았기 때문에 LIFO 구조를 유지하는 것이 아니라 중간에서 데이터를 삭제하고 삽입하는 것이 가능합니다.
    - Stack 클래스를 만들 때 초기 용량을 설정할 수 없습니다.

⇒ 이 중에 Vector 클래스의 메서드 중에 배열의 중간에 데이터를 삽입하거나 삭제할 수 있는 기능을 상속 받아서 사실 정확한 LIFO 형태로 구현을 할수 없다는 것을 알 수 있습니다.

<br>

### ArrayDeque의 특징

- LIFO 자료 구조를 구현하는 ArrayDeque 클래스입니다.
- 하지만 `ArrayDeque`는 `Thread-Safe`하지 않다는 단점이 있습니다.
    - 즉, `멀티 쓰레드` 환경에서는 문제가 있습니다.
    - 따라서 ArrayDeque를 상속 받는 새로운 클래스를 만들고 모든 메서드에 synchronized를 넣어줘야 합니다.
- 공식 문서에 보면 ArrayDeque는 용량 제한이 없다고 말합니다.
    - 내부적으로 ArrayDeque의 크기를 지정하는 매개변수 없이 인스턴스를 생성했을 때, 기본 용량은 16인 배열의 형태를 띕니다.
    - 여기에서 기본 용량을 넘으면 자신의 용량의 2배인 배열을 만들고 이동하는 작업을 하게 됩니다.

<br>

*<참고 자료>*

- [Thread Safe LIFO Data Structure Implementations](https://www.baeldung.com/java-lifo-thread-safe)
- [ArrayDeque란?](https://github.com/wjdrbs96/Today-I-Learn/blob/master/Java/Collection/Queue/ArrayDeque%EB%9E%80%3F.md)

<br>
