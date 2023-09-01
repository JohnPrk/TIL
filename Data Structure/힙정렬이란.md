# Heap-Sort

### Heap-Sort란?

- Heap-Sort는 이진 힙 데이터 구조를 사용하여 배열을 정렬하는 알고리즘입니다.
- 이 때, 이진 힙 데이터 구조는 2가지 조건(Heap-Property)을 만족해야 합니다.
    1. 힙 데이터 구조는 Complete Binary Tree 구조를 만족해야 하며, 이는 아래의 3가지 조건을 가지고 있습니다.
        1. Complete Binary Tree는 이진 트리(Binary Tree)의 구조를 가지고 있습니다.
        2. Complete Binary Tree는 맨 아래 층을 제외하고는 이진 트리 형태로 완전히 채워져 있는 형태를 가지고 있습니다.
        3. Complete Binary Tree는 맨 아래 층은 왼쪽부터 채워져 있는 구조를 의미합니다.
    2. 두 번째로 최대 힙 같은 경우에는 부모 노드의 값은 왼쪽, 오른쪽 자식의 노드의 값 보다 커야하는 구조이고, 최소 힙은 반대로 부모 노드의 값은 왼쪽, 오른쪽 자식의 노드의 값 보다 작아야하는 구조입니다.
- 아래의 트리가 Heap-Property(최소 힙)을 만족하는지 아래의 예를 통해서 알아 보겠습니다.
    - (a)는 이진 트리 형태를 가지며, 맨 아랫층을 제외하고는 완전히 채워 있고, 맨 아랫층은 왼쪽부터 채워져 있고, 부모 노드의 값은 왼쪽, 오른쪽 자식 노드의 값보다 작기 때문에 이진 힙 데이터 구조(최소 힙)라고 할 수 있습니다.
    - (b)는 다른 모든 부분은 만족하지만, 부모 노드의 값 중 하나(8)가 왼쪽 자식 노드의 값(6)이 크기 때문에 힙 데이터 구조라고 할 수 없습니다.
    - (c)는 다른 모든 부분은 만족하지만, 맨 아랫층이 왼쪽부터 채워져 있지 않기 때문에 힙 데이터 구조라고 할 수 없습니다.
      <img width="1000" alt="image" src="https://github.com/JohnPrk/TIL/assets/88137420/4a897b1f-b2cf-4c68-95b4-b927afe8b1c8">

    
- Heap-Sort는 다음과 같은 3가지 순서로 진행 됩니다.
    1. 오름차순으로 정렬할 배열을 이진 힙 데이터 구조로 만듭니다(Heapify).
    2. 최대 힙 데이터 구조에서는 루트 노드(가장 위에 있는 노드)가 최댓값이므로 루트 노드를 범위 안에서 마지막 리프 노드와 바꿉니다.
    3. 범위를 하나를 줄이고, 1-2번 작업을 재귀적으로 수행합니다.
- 따라서, Heap-Sort의 시간 복잡도는 Heapify 작업 + 루트 노드와 마지막 리프 노드를 변경하는 작업(상수 시간) + 범위를 하나씩 줄이고 위의 작업을 재귀적으로 수행하는 작업이라는 것을 알 수 있습니다.
- 이러한 과정을 자세히 알아보자면 다음과 같습니다.
    
    1-1. 첫 번째로 기존에 이진 힙 데이터 구조가 아닌 상태에서 Heapify 작업을 통해 힙 데이터 구조를 만드는 것은 맨 아랫층의 부모 노드부터 루트 노트까지 자신의 자식 노드와의 비교(최대 힙 같은 경우, 자식 노드의 값이 부모 노드의 값보다 크다면 왼쪽 자식과 오른쪽 자식 중의 더 큰 값이 선택됨)하고 바꾸는 작업이 필요합니다.
    
    1-2. 이 때, 자식 노드와 부모 노드의 값이 바꼈다면, 자식 노드의 자식이 있는지 확인하고 존재한다면 위의 작업을 재귀적으로 수행합니다. 
    
    1-3. 아래는 이진 힙 데이터 구조가 아닌 배열에서 Heapify 작업을 수행하는 과정을 표현한 이미지입니다.
      <img width="1000" alt="image1" src="https://github.com/JohnPrk/TIL/assets/88137420/1446b78b-a8d5-49b3-b90d-ab037c680645">

    
    1-4. 이진 힙 데이터 구조가 아닌 배열에서 Heapify 작업은 필수적으로 맨 아랫층의 부모 노드부터 루트 노트까지 Heapfiy 작업을 수행해야 하며, 노드가 n개라고 가정 한다면 Heapify 작업의 횟수는$⎣n/2⎦$번이 되며 다음과 같이 그림으로 간단히 알 수 있습니다.
        <img width="1000" alt="image2" src="https://github.com/JohnPrk/TIL/assets/88137420/01774a2e-b459-4f54-b6e7-611f5a0bdfb4">

    
    1-5. 이렇게 선택된 노드는 자식의 노드의 값과 비교(상수 시간)를 하고, 자식의 자식이 있다면 자식의 노드에서 비교 작업이 재귀적으로 수행이 된다고 할 수 있습니다.
    
    1-6. 따라서 자식의 자식으로 내려가는 작업은 트리의 높이만큼 비례 하므로 최악의 경우인 루트 노드의 경우는 시간 복잡도는 $log(n)$이고 그 외의 경우는 `상수 시간`(왼쪽 or 왼쪽, 오른쪽 노드만 있는 경우) < x  < `log(n)`의 시간 복잡도라고 할 수 있습니다.
    
    1-7. 즉, Heapify 작업을 수행 해야하는 횟수[ ⇒ $⎣n/2⎦$ ]와 자식의 노드와 재귀적으로 비교하는 작업[ ⇒ $< log(n)$ ]의 곱 연산의 시간 복잡도를 가진다고 할 수 있습니다.
    
    1-8. 이를 수학적으로 계산하기는 매우 어려우므로 쉽게 자식의 노드와 재귀적으로 비교하는 작업을 모두가 $log(n)$이라고 가정하면 $⎣n/2⎦ * log(n)$, 즉 $O(nlog(n))$보다 작다고 할 수 있습니다.
    
    2-1. 위의 작업이 끝이 나면 최소 힙의 경우 루트 노드에 가장 작은 값이 위치 되어지고, 최고 힙의 경우 루트 노드에 가장 큰 값이 위치 되어집니다.
    
    2-2. 따라서, 최대값 혹은 최소값을 배열과 분리하기 위해서 루트 노드와 범위의 마지막 리프 노드와 바꿔주고 범위를 하나 줄여줌으로써 동일한 배열을 사용하더라도 정렬을 진행할 수 있습니다.
    
    2-3. 이 과정에서 루트 노드와 변경해야할 노드를 마지막 노드로 선정한 이유는 Complete Binary Tree 구조를 깨뜨리지 않기 위함입니다.
    
    2-4. heapify 작업을 수행하는 노드를 찾는 작업과 heapify를 수행하는 자바 코드는 다음과 같습니다.
    
    ```java
    public static void heapsort(int[] array) {
        // 1-4번 설명
    		for(int i = array.length/ 2 -1; i >= 0; i--) {
          minHeapify(array, i, array.length);
        }
    }
    	
    public static void minHeapify(int[] array, int index, int size) {
        int parent = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
    		// 왼쪽 자식이 사이즈를 초과하는 경우 : 왼쪽 자식이 없을 경우, 왼쪽 자식이 있지만 범위가 줄어들어서 사이즈 보다 작아진 경우
        if(leftChild < size && array[leftChild] > array[parent]) {
          parent = leftChild;
        }
    		// 오른쪽 자식이 사이즈를 초과하는 경우 : 오른쪽 자식이 없을 경우, 오른쪽 자식이 있지만 범위가 줄어들어서 사이즈 보다 작아진 경우
        if(rightChild < size && array[rightChild] > array[parent]) {
          parent = rightChild;
        }
    		// 부모 노드의 값보다 자식 노드의 값이 크거나 작음으로 인해서 바껴야할 때 수행되는 작업
        if(parent != index) {
          int temp = array[index];
          array[index] = array[parent];
          array[parent] = temp;
          minHeapify(array, parent, size);
        }
      }
    ```
    
    3-1. 범위가 하나 줄어든 배열에서 마지막 리프 노드가 루트 노드로 올라갔기 때문에 위의 범위의 배열은 Complete Binary Tree의 특징은 만족하지만, 루트 노드가 자식 노드보다 무조건 작기 때문에 Heap-Property를 위반하게 됩니다.
    
    3-2. 따라서, 이를 해결하기 위해서 Heapify를 수행하게 되는데, 이 때는 루트 노드의 자식 노드는 모두 Heap-Property를 만족 시키므로, 단 한 번의 Heapify만 수행하면 원하는 최소값 혹은 최대값을 찾을 수 있게 됩니다.
    
    3-3. 이 과정을 n-1번 수행하게 되면 배열은 정렬된 상태를 가지게 됩니다.
    
    3-4. 위 작업의 시간 복잡도는   $(n-1) * log(n)$, 즉 $O(nlog(n))$이라고 할 수 있습니다.
    
    3-5. 위의 작업을 수행하는 자바 코드는 다음과 같습니다.
    
    ```java
    public static void heapsort(int[] array) {
        // 2-2번 설명
        for(int i = array.length -1; i > 0; i--) {
          moveRootNodeToEndOfArray(array, i);
        }
      }
    
    public static void moveRootNodeToEndOfArray(int[] array, int index){
    		int maximum = array[0];
        array[0] = array[index];
        array[index] = maximum;
        minHeapify(array, 0, index);
      }
    ```
    
- 즉, 1-3번 작업의 수행 결과 $O(nlog(n)) + 1 + O(nlog(n))$보다 작은 값이 나오게 되는데, 사실 시간복잡도에서 앞의 상수는 작업에 크게 영향을 주지 않기 때문에, Heap-Sort의 시간복잡도는 $O(log(n)$이라고 할 수 있습니다.
- 이러한 Heap-Sort는 백준의 [수 정렬하기 2](https://www.acmicpc.net/problem/2751) 문제를 통해서 확인할 수 있고, 전체 코드는 다음과 같습니다.
    
    ```java
    import java.util.*;
    import java.io.*;
    
    class Main {
    
      public static void removeFirst(int[] array, int index){
        int minimum = array[0];
        array[0] = array[index];
        array[index] = minimum;
        heapify(array, 0, index);
      }
      
      public static void heapify(int[] array, int index, int size) {
        int parent = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
    
        if(leftChild < size && array[leftChild] > array[parent]) {
          parent = leftChild;
        }
        if(rightChild < size && array[rightChild] > array[parent]) {
          parent = rightChild;
        }
        if(parent != index) {
          int temp = array[index];
          array[index] = array[parent];
          array[parent] = temp;
          heapify(array, parent, size);
        }
      }
      
      public static void heapsort(int[] array) {
        for(int i = array.length/ 2 -1; i >= 0; i--) {
          heapify(array, i, array.length);
        }
        for(int i = array.length -1; i > 0; i--) {
          removeFirst(array, i);
        }
      }
      public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];
        for(int i =0; i < count; i++) {
          array[i] = Integer.parseInt(br.readLine());
        }
        heapsort(array);
    
        for(int i = 0; i < array.length ; i++) {
          bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
      }
    }
    ```
    
- Heap-Sort뿐만 아니라, $O(nlog(n))$의 시간복잡도를 가진 정렬(Merge-Sort, Quick-Sort)들도 함께 테스트 한다고 시도했던 흔적들이 제 TMI입니다. >.<
    <img width="1000" alt="image3" src="https://github.com/JohnPrk/TIL/assets/88137420/4cbf3b48-093f-4057-9f4f-ad3ee2463bd5">

    
<br>
<br>

### *<참고 자료>*

- [THE Algorithm Design MANUAL Third Edition - Steven S. Skiena](https://www.algorist.com/)
- [쉽게 배우는 알고리즘 개정판:관계 중심의 사고법 - 문병로](https://product.kyobobook.co.kr/detail/S000001743653)
- [영리한 프로그래밍을 위한 알고리즘 강좌 - 권오흠](https://www.inflearn.com/course/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EA%B0%95%EC%A2%8C/dashboard)
