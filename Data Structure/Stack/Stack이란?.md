# Stack

- 한 쪽 끝이 막혀있는 선형 자료구조
- 한 쪽 끝에서만 데이터의 삽입과 출력/삭제가 이루어짐
- LIFO(Last In, First Out)
- 시간 복잡도
    - 데이터의 삽입과 삭제의 시간 복잡도는 O(1)
    - 데이터의 읽기 시간 복잡도는 O(1)
    - 데이터 검색의 시간 복잡도는 최악의 경우 O(n)
- 사용처 : 웹 브라우저의 뒤로가기, jvm이 메모리를 할당할 때 스택 메모리 사용
<br>

## java.utils의 Stack<E> 구현

### 1. Stack 클래스란?
    
![Untitled](https://user-images.githubusercontent.com/88137420/218746033-407e4bb6-c1f9-4e8d-9775-d7de4a4028a2.png)
<br>
  
  > Stack 클래스는 `java.util 패키지`에 포함된 클래스입니다. <br>
  > Stack은 객체(데이터)의 후입선출(LIFO)을 나타냅니다. <br>
  > 5개의 작업을 처리할 수 있도록 `Vector 클래스`를 상속 받았습니다. <br>
  > 작업(기능) : `push`, `pop`, `peek`, `empty`, `search` <br>
  > 시간 복잡도 <br> 
    - 삽입push): 맨 위에 데이터를 넣으면 되기 때문에 O(1) 입니다. <br>
    - 삭제(pop): 맨 위에 데이터를 삭제하면 되기 때문에 O(1) 입니다. <br>
    - 읽기(peek): 맨 위의 데이터를 읽으면 되기 때문에 O(1) 입니다. <br>
    - 탐색(search): 맨 위의 데이터부터 하나씩 찾아야 하기 때문에 시간복잡도는 최악의 경우 O(n)입니다. <br>
  > 정확한 LIFO를 사용하기 위해서는 ArrayDeque<Element>를 사용해야합니다.
<br>
  
###  2. Stack 클래스의 문제점
- Stack 클래스는 Vector 클래스를 잘못 확장한 자바의 큰 실수입니다. 왜냐하면 Stack은 LIFO 구조를 이용해야 하는데 Vector 클래스를 확장하면 중간에서 데이터를 삽입, 변경, 삭제를 할 수 있기 때문입니다.
> 코드
            
```java
  // 중간에 데이터가 넣어지는 오류
            
  import java.util.Stack;
            
  public class Main {
            
    public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.add(1, 4);
                    
      for(Integer i : stack) {
        System.out.print(i + " ");
      }			
    }
  }
           
  // 출력값 : 1 4 2 3
  ```
            
```java
  // 중간에 데이터가 수정되는 오류
            
  import java.util.Stack;
            
  public class Main {
            
    public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.set(1, 4);
                    
      for(Integer i : stack) {
        System.out.print(i + " ");
      }			
    }
  }
            
  // 출력값 : 1 4 3
```
            
```java
  // 중간에 데이터가 삭제되는 오류
            
  import java.util.Stack;
            
  public class Main {
            
    public static void main(String[] args) {
      Stack<Integer> stack = new Stack<>();
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.remove(1);
                    
      for(Integer i : stack) {
        System.out.print(i + " ");
      }			
    }
  }
            
  // 출력값 : 1 3
```
            
 - Stack 클래스는 `synchronized` 키워드가 붙어있기 때문에 `Thread-safe` 하다는 특징을 가지고 있습니다. 즉, 멀티스레드 환경이 아닐 때 사용하면 lock을 거는 작업 때문에 많은 오버헤드가 발생하게 됩니다.
        ![Untitled](https://user-images.githubusercontent.com/88137420/218746216-8149542d-c006-4722-8319-a49370d78167.png)
        
- Stack 클래스는 `초기 용량(기본 10)을 설정할 수 있는 생성자가 없다` 보니 데이터의 삽입을 많이 하게 되면 배열을 복사해야 하는 일이 빈번하게 발생할 수 있다는 단점도 존재합니다.
    - Vector
        ![Untitled](https://user-images.githubusercontent.com/88137420/218746287-6c03775b-afdb-451b-8927-0ee22fc61c42.png)
<br>
  
### 3. Stack 클래스 대신 ArrayDeque를 사용(권장)
<br>
   
### 참고
  - [Thread Safe LIFO Data Structure Implementations](https://www.baeldung.com/java-lifo-thread-safe)
  - [Stack 클래스란 무엇인가?](https://github.com/wjdrbs96/Today-I-Learn/blob/master/Java/Collection/Stack%20%ED%81%B4%EB%9E%98%EC%8A%A4%EB%9E%80%3F.md)
