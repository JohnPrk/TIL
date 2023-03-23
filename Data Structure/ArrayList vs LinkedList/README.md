# ArrayList vs LinkedList 차이

<br>


- 자바에서 List 인터페이스의 구현체는 `Stack`, `Vector`, `ArrayList`, `LinkedList`가 있습니다.
- 이 중에서도 대표적인 클래스인 `ArrayList`, `LinkedList`의 개념과 차이에 대해 정리해보겠습니다.
<br>

### List란 ?

- 자료구조 관점에서 List는 `값`(Value)들을 저장하는 자료구조입니다.
- List는 순서가 있고, 중복을 허용한다는 특징을 가지고 있습니다.
<br>

### ArrayList와 LinkedList 차이

- ArrayList와 LinkedList는 모두 `Java Collections`의 리스트 인터페이스의 구현체이지만, 내부 구현 방식에 따라 차이가 있습니다.
- ArrayList는 내부적으로 `연속적인 메모리 공간`에 `배열`(Array)을 사용하여 데이터를 저장합니다.
- ArrayList의 가장 큰 특징은 인덱스를 통해 데이터에 바로 접근 가능하다는 점과 배열의 크기가 동적으로 할당된다는 점입니다.
- 전자의 경우, 데이터 접근 시간이 상수 시간 내에 이루어진다는 장점을 가지고 있습니다.
- 후자의 경우에는 기본 배열의 크기가 데이터의 개수에 따라서 변한다는 특징을 가지고 있습니다.
- 먼저 ArrayList는 배열의 크기가 고정되어 있는 특징을 가지고 있는데,
- 이 때 배열의 크기를 초과하는 삽입의 작업이 있을 때 내부적으로 현재 배열의 크기보다 큰 배열을 만들어서 기존의 배열의 원소를 옮기는 작업을 처리하게 됩니다.
- 또한, 반대의 경우에도 데이터의 개수가 매우 작아질 때도 배열의 크기를 조정하는 특징을 가지고 있습니다.
- 이 때문에 삽입과 삭제 작업이 빈번하게 일어나는 경우에는 성능 저하가 일어날 수 있는 단점을 가지고 있습니다.
- 반면, LinkedList는 내부적으로 `노드`(Node)를 사용하여 요소를 저장합니다.
- 각 노드는 `데이터`와 `다음 노드의 주소값`를 저장하고 있습니다.
- 즉, LinkedList의 노드들은 비연속적인 메모리공간에 저장되어 있고 포인터를 통해서 각 노드에 대해서 접근을 하게 됩니다.
- 따라서, 데이터의 위치에 상관 없이 삽입, 삭제가 있더라도 필요한 `참조값`만 변경하면 되기 때문에, ArrayList보다 빠르다는 장점을 가지고 있습니다.
- 또한 메모리가 무한하다면, LinkedList는 무한히 데이터를 삽입할 수 있는 특징을 가지고 있습니다.
- 하지만, 각각의 노드 객체를 생성하는 점에 있어서는 메모리 사용량이 ArrayList보다 더 크다는 단점을 가지고 있습니다.
- 또한 LinkedList는 인덱스로 데이터를 찾을 때, 각 노드들을 차례대로 찾아가기 때문에 시간이 오래 걸린다는 단점을 가지고 있습니다.
- 결론적으로,
    - 데이터의 삽입, 삭제가 빈번하거나 배열의 중간의 삽입, 삭제가 발생하는 경우에는 LinkedList를 사용하는 것이 좋습니다.
    - 인덱스를 통해 데이터를 자주 검색하는 경우에는 ArrayList를 사용하는 것이 좋습니다.
<br>

### 장단점, 비교 정리

|  | 장점 | 단점 |
| --- | --- | --- |
| ArrayList | * 인덱스를 통해 데이터를 바로 찾을 수 있다. <br> * 연속적인 메모리 공간에 위치해있기 때문에 CPU Cache의 이점을 사용할 수 있다. | * 배열의 크기를 초과해서 삽입하거나 데이터가 너무 부족하면 배열의 크기를 조정해야한다. <br> * 배열의 중간에 위치한 데이터의 삽입과 삭제의 경우 다른 자료의 위치이동이 불가피하다. |
| LinkedList | * 데이터의 위치에 관계 없이 자료의 삽입과 삭제가 용이하다. <br> * 리스트 내에서 자료의 이동이 필요하지 않다. | * 특정 자료의 탐색 시간이 많이 소요된다. <br> * 포인터의 사용으로 인해 저장 공간의 낭비가 있다. |

<br>

### 시간 복잡도

|  | ArrayList | LinkedList |
| --- | --- | --- |
| add at last index | O(1) | O(1) |
| add at given index | O(N) | O(1) |
| remove by index | O(N) | O(1) |
| remove by value | O(N) | O(1) |
| get by index | O(1) | O(N) |
| search by value | O(N) | O(N) |
<br>

*<참고자료>*

- [자료구조: Linked List 대 ArrayList](https://www.nextree.co.kr/p6506/)
- [리스트(list)를 아시나요? array list와 linked list의 개념과 차이를 한방에 정리합니다! 2년 전 영상보다 더욱 업그레이드된 영상을 지금 만나보세요!!](https://www.youtube.com/watch?v=xvi-n11kym0&list=PLcXyemr8ZeoR82N8uZuG9xVrFIfdnLd72&index=5)
- [ArrayList vs LinkedList 차이](https://github.com/wjdrbs96/Today-I-Learn/blob/master/Java/Collection/List/ArrayList%20vs%20LinkedList.md)
