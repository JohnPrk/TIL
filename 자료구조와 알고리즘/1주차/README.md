# 1주차

### 코드의 품질

- 코드의 품질은 유지 보수성, 효율성으로 측정할 수 있습니다.
    - 유지 보수성 : 요구사항이 변경될 때, 더 유연하게 코드를 수정할 수 있는지를 의미합니다.
    - 효율성 : 원하는 결과를 내는 코드 중에서 시간적으로 공간(메모리)적으로 더 빠르고 효율적인지를 의미합니다.

### 알고리즘 vs 자료구조

- 알고리즘
    - 알고리즘은 문제 해결을 위한 절차(풀이법)로서 일반적으로 컴퓨터 프로그램으로 그 절차를 구현 합니다.
    - 대부분의 알고리즘은 연산을 위해 데이터를 정리 혹은 조직화하는 작업을 필요로 합니다.
    - 이렇게 데이터를 조직화 하는 방법은 자료 구조라고 합니다.
- 자료구조
    - 자료 구조는 알고리즘 구현에 필요한 요소이자 산출물이 될 수 있습니다.
    - 풀어야 할 문제가 작다면 어떠한 자료구조를 사용해도 상관이 없지만, 풀어야 할 문제가 크다면 컴퓨터의 자원인 시간(CPU 연산)과 공간(메모리)을 효율적으로 사용하는 것이 중요합니다.
    - 같은 문제를 풀 수 있는 여러 해결 방법이 존재 한다면, 이는 자료구조 혹은 알고리즘이 다른 것을 의미하고, 이에 따라서 시간과 공간의 사용량이 달라질 수 있습니다.
    - 따라서 사용할 수 있는 자료구조의 시간과 공간 사용량을 고려해서 알고리즘을 만드는 것이 중요합니다.
    - 즉, 개발자는 특정한 자료구조를 사용하는 알고리즘이 가지는 사용량 차이를 이해하고 비교할 수 있는 안목을 길러야합니다.
    
    ### ****BigO 표기법****
    
    - BigO 표기법은 자료구조 및 알고리즘의 시, 공간의 사용량을 분석할 때 사용하는 표기법입니다.
    - 특히 시간 복잡도나 공간 복잡도를 나타낼 때 사용합니다.
    - BigO 표기법은 데이터의 개수가 늘어날 때마다 시간과 공간의 사용량이 어떻게 변하는지 수학적 개념을 사용해서 표현합니다.
    - 이를 통해서 특정 자료구조 및 알고리즘의 시간과 공간의 사용량 차이를 쉽게 비교할 수 있어서 각 자료구조의 시간과 공간의 효율성을 판단할 수 있습니다.
    - BigO 표기법은 다음과 같습니다.
        - $O(1)$ : 시간 복잡도의 경우 데이터의 개수와 상관 없이 특정 값에 대해서 바로 접근할 수 있습니다.
        - $O(n)$ : 시간 복잡도의 경우 데이터의 개수와 비례해서 특정 값에 접근할 수 있는 시간이 점근적으로 증가합니다.
        - $O(logn)$ : 시간 복잡도의 경우 일반적으로 이진 탐색이 가능한 경우를 의미하기 때문에, 특정 값에 접근할 수 있는 시간이 데이터의 개수의 로그만큼 줄어듭니다.
        - $O(n^2)$ : 시간 복잡도의 경우 일반적으로 각각의 배열의 크기가 n인 이중 배열에서 특정한 x, y값을 찾는데 사용되는 경우이기 때문에, 특정한 두 값을 찾기 위해 이중 배열을 전체 탐색하기 때문에 각 배열의 크기의 곱 연산만큼의 시간이 필요합니다.
        

### 재귀

- 재귀는 다음과 같은 두 가지 케이스 작업으로 나뉩니다.
    - Base Case : 특정한 조건에 의해서 함수가 반복되지 않는 지점이며, 이를 통해 모든 재귀 함수가 무한으로 호출(stackoverflow)되지 않을 수 있도록 합니다.
    - Recursive Case : 자기 자신을 호출하는 지점이며, 특정 변수를 조절해서 더 작은 부분으로 문제로 분해합니다.
- 컴퓨터는 stack을 사용해서 어떤 함수를 호출 중인지를 기록하고 이를 콜스택이라고 합니다.
- 이러한 콜스택을 통해서 각 재귀(자식) 함수의 반환값을 재귀(부모) 함수로 전달하게 됩니다.
- 재귀로 해결하기 좋은 문제는 특정 문제를 풀기 위해 필요한 각 작업을 특정할 수 없거나 몇 단계나 들어가야 하는지 모르는 상황에서 사용하면 좋습니다.
- 또한, 재귀로 해결하기 좋은 문제는 하위의 문제의 계산 결과에 기반 해서 계산할 수 있는 경우입니다.
- 재귀는 재귀 함수를 호출할 때마다 콜스택이 쌓이므로 메모리를 추가적으로 사용하게 됩니다.

### 다이나믹 프로그래밍(DP)

- 다이나믹 프로그래밍이란 큰 문제를 작은 문제로 나누어 해결하고 작은 문제의 결과를 재사용하면서 중복 계산을 피하게 함으로써 효율적으로 문제를 해결하는 방법입니다.
- 이 때, 동일한 함수를 호출하지 않기 위해서 함수 호출시 그 결과를 자료구조에 저장해둡니다.
- 이에 대한 예시로 피보나치 수열을 들 수 있습니다.
    - 피보나치 수열의 코드(자바 스크립트)는 다음과 같습니다.
        
        ```jsx
        const fibonacci = (n) => {
          if (n === 0) {
            return 0;
          }
        
          if (n === 1) {
            return 1;
          }
        
          return fibonacci(n - 2) + fibonacci(n - 1);
        }
        ```
        
    - 이때, n이 5라고 가정하고, 코드가 동작하는 것을 확인 한다면 각 노드가 하나의 함수 호출을 의미하는 다음과 같은 형태가 됩니다.
        
        ![Untitled](https://github.com/JohnPrk/TIL/assets/88137420/351f5469-a412-4e90-884c-d2d0a7a397c2)

        
    - 이러한 형태에서 알 수 있다시피 n의 증가에 따른 함수 호출의 증가는 선형 시간(O(n))보다는 훨씬 크고  평방 시간(O(n^2))보다는 작기 때문에, n의 값이 커지게 되면 연산이 급속도로 증가합니다.
    - 또한 위의 형태에서 알 수 있듯이 동일한 함수의 호출이 많다는 것을 알 수 있는데, 이 때 동일한 함수 호출을 줄여준다면 연산을 대폭 줄일 수 있다는 것을 알 수 있습니다.
    
    ### 문제 풀이
    
    - **1번 문제**
        1. **구현**
            
            ```java
            public class Problem1 {
            	
            	// 분할정복으로 숫자 배열의 총합 구하기
            	public int solution1(int[] input) {
            	  if (input.length == 0) {
            	    return 0;
                }
                if (input.length == 1) {
            	    return input[0];
                }
                int mid = input.length / 2;
                return solution1(Arrays.copyOfRange(input, 0, mid)) + solution1(Arrays.copyOfRange(input, mid, input.length));
              }
            	
            	// 재귀로 숫자 배열의 총합 구하기
            	public int solution2(int[] input) {
            		return plus(input, input.length - 1);
            	}
            
            	private int plus(int[] input, int index) {
                if (index < 0) {
                  return 0;
                }
                return input[index] + plus(input, index - 1);
              }
            }
            
            ```
            
        2. **구현 하면서 든 생각**
            - 재귀를 사용하기 좋은 조건이 '알고리즘이 얼마나 깊이 들어가야 하는지 모르는 상황에서 문제를 여러 단계로 파고들어야 하는 경우'와 '하위 문제의 계산 결과에 기반해 계산할 수 있는 경우'라고 할 수 있는데, '1주차 첫 번째 문제에서 배열의 총합을 구하는 경우는 2번 조건에 맞는가?'라는 고민이 들었습니다.
            - 2번 조건을 만족하는 재귀를 구현하기 위해서 재귀를 사용하는 분할정복(solution2_1 메서드)을 사용 했습니다.
            - 하지만 '분할정복은 꼬리재귀를 만들 수 없겠다'라는 생각을 했고, 맞는지는 모르겠지만 일반적인 재귀(solution2_2)를 사용해서 구현하고 꼬리 재귀와 꼬리 재귀 최적화를 구현 했습니다.
            - 하지만, 과제를 진행 하면서 '1번 문제가 과연 재귀로 풀 수 있는 좋은 문제인가?'라는 궁금증이 들었습니다.
            - 그리고 재귀를 사용하는 것이 콜스택으로 인해서 메모리적으로나 연산적인 측면에서 좋지 않다는 생각이 들었는데, 사실 컴퓨터는 매우 빠르고 캐시(공간 지역성) 때문에 정확히 이들 간에 얼마나 차이가 나는지 알 수 없다고 느꼈습니다.
            - 혹시 이를 측정할 수 있거나 어느정도의 차이가 있는지 알 수 있는 방법이 있을까 궁금했습니다.
        3. **풀이(강의 참조)**
            
            ```java
            /**
            * 베이스 케이스를 찾습니다.
            * 베이스 케이스 이전의 단계를 찾습니다.
            * 베이스 케이스 이전의 이전의 단계를 찾습니다.
            * 즉, 거꾸로 문제를 해결해 나가야합니다.
            */
            
            public class Problem1 {
            	
              public Problem1() {}
            
            	// 재귀 적용
            	public int solution1(int[] numbers) {	
            		// 베이스 케이스
            		if(numbers.length == 0) {
            			return 0;
            		}
            		// 베이스 케이스 이전의 단계
            		return numbers[0] + solution(Arrays.copyOfRange(numbers, 1, numbers.length));
            	}
            
            	// 꼬리 재귀 적용
            	public int solution2(int[] numbers, int output) {	
            		// 베이스 케이스
            		if(numbers.length == 0) {
            			return 0;
            		}
            		// 베이스 케이스 이전의 단계
            		return solution(Arrays.copyOfRange(numbers, 1, numbers.length, output + numbers[0]));
            	}
            }
            
            // 꼬리 재귀 최적화
                public int solution3(int[] numbers) {
                  // 파라미터로 들어가는 int 배열은 레퍼런스 타입이라서 가능하면 바꿔주지 않는 것이 좋다고 한다.
            			// 이를 위해서 깊은 복사로 새로운 메모리 공간에 배열을 새롭게 할당해서 처리한다.
            			int[] copy = input.clone();
                  int output = 0;
                  while (true) {
                      // 베이스 케이스
                      if (copy.length == 0) {
                          return output;
                      }
                      // 베이스 케이스 이전의 단계
                      output += copy[0];
                      copy = Arrays.copyOfRange(copy, 1, copy.length);
                  }
                }
            
            public class Problem1Test {
            	
            	private final int[] input1 = {1, 2, 3, 4};
              private final int[] input2 = {-1, 3, 8, 9, 10, 11};
              private final int[] input3 = {};
              private final int output1 = 10;
              private final int output2 = 40;
              private final int output3 = 0;
            	
            	private final Problem1 problem1 = new Problem1();	
            
            	@Test
              void 숫자의_배열을_받아서_총합을_구한다_재귀_배열의_크기가_작을_경우() {
            		Assertions.assertAll(
            	    "총합 계산(재귀)",
                  () -> Assertions.assertEquals(output1, problem1.solution1(input1)),
                  () -> Assertions.assertEquals(output2, problem1.solution1(input2)),
                  () -> Assertions.assertEquals(output3, problem1.solution1(input3)),
            	}
            
            	@Test // 실패 - stackoverflow
              void 숫자의_배열을_받아서_총합을_구한다_재귀_배열의_크기가_클_경우() {
            		// 강의에서는 배열의 크기가 10000인 배열에서 stackoverflow가 생겼는데, 자바에서는 배열의 크기 13000 정도 되어야지 stackoverflow가 생겼다.
            		int[] array = new int[13000];
            	  for (int i = 0; i < array.length; i++) {
            	    array[i] = i;
            	  }
            		Assertions.assertEquals(84493500, problem1.solution1(array))
            	}
            
            	@Test
              void 숫자의_배열을_받아서_총합을_구한다_꼬리_재귀_배열의_크기가_클_경우() {
            		// 강의에서는 자바스크립트는 꼬리 재귀 최적화가 되어있지 않아서 stackoverflow가 발생하지만, 자바는 배열의 크기 14500까지 조금 더 늘려도 stackoverflow가 발생하지 않았다.
            		// 하지만, 몇 번 더 시도 해보니 가끔은 stackoverflow가 발생하고, 가끔은 성공한다(?) => 왜 그런지 잘 모르겠다.
            		int[] array = new int[13000];
            	  for (int i = 0; i < array.length; i++) {
            	    array[i] = i;
            	  }
            		Assertions.assertEquals(84493500, problem1.solution2(array))
            	}
            
            	@Test
              void 숫자의_배열을_받아서_총합을_구한다_꼬리_재귀_최적화_배열이_큰_경우() {
            		// 풀이법이 꼬리 재귀 최적화가 되었을 경우 무조건 반복문으로 바꿀 수 있다.
            		// 그렇기 때문에 특정 언어(kotlin, ...)은 컴파일 시점에 반복문으로 스스로 바꿔주기도 한다.
            		// 하위 함수 호출을 안하기 때문에 콜스택으로 인한 stackoverflow 문제가 사라져서 메모리 한도 내에서 배열의 크기가 커져도 상관없다.
                int[] array = new int[50000];
                for (int i = 0; i < array.length; i++) {
                    array[i] = i;
                }
                Assertions.assertEquals(1249975000, problem1.solution3(array));
              }
            }
            
            ```
            
        4. **느낀점**
            - 재귀를 어떻게 사용 하는지에 이제야 감이 잡히는 것 같습니다.
            - 처음에는 피보나치처럼 상위 함수가 여러 개의 하위 함수를 호출하는 경우에만 사용할 수 있는 것이라고 생각했는데, 간단한 for문과 같은 연산에도 사용할 수 있다는 것을 알게 되었습니다.
            - 물론, 아직까진 재귀를 사용하는 것에 대한 장점은 찾지 못했지만, 문제에 대한 다양한 풀이(알고리즘)에 대해서 배우고 있는 것 같습니다.
            - 콜스택이라는 것을 처음 보게 되었는데, 나중에 기회가 된다면 JVM 내에서 힙 메모리와 스택 메모리에 대한 추가 학습을 하면 좋을 것 같다고 느낍니다.
    - **2번 문제**
        1. **구현**
            
            ```java
            public class Problem2 {
            
              public Problem2() {}
            	
            	// 가장 익숙한 방법 = 상향식 다이나믹 프로그래밍
              public int solution1(int input) {
                if (input < 2) {
                    return input;
                }
                int[] dp = new int[input + 1];
                dp[0] = 0;
                dp[1] = 1;
                for (int i = 2; i <= input; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
                return dp[input];
              }
            	
            	// 재귀
              public int solution2(int input) {
                if (input == 0 || input == 1) {
                    return input;
                }
                return solution2(input - 1) + solution2(input - 2);
              }
            
            }
            ```
            
        2. **구현 하면서 든 생각**
            - 피보나치 문제는 재귀로 풀기에 좋은 문제라고 생각 했습니다.
            - 다만, 중복된 연산을 없애기 위해 상향식 다이나믹 프로그래밍을 사용해서 구현을 했습니다.
        3. **풀이(강의 참조)**
            
            ```java
            /**
            * 베이스 케이스를 찾습니다.
            * 베이스 케이스 이전의 단계를 찾습니다.
            * 베이스 케이스 이전의 이전의 단계를 찾습니다.
            * 즉, 거꾸로 문제를 해결해 나가야합니다.
            */
            
            public class Problem2 {
            	
              public Problem2() {}
            
            	//재귀
              public int solution2(int input) {
                if (input == 0 || input == 1) {
                    return input;
                }
                return solution2(input - 1) + solution2(input - 2);
            	}
            
            	// 꼬리 재귀
              public int solution2_1(int input, int current, int a, int b) {
                if (input == 0 || input == 1) {
                  return input;
                }
                if (input == current) {
                  return a + b;
                }
                return solution2_1(input, current + 1, b, a + b);
              }
            
            	// 꼬리 재귀 최적화
              public int solution2_2(int input) {
                int current = 2;
                int a = 0;
                int b = 1;
                while (true) {
                  if (input == 0 || input == 1) {
                    return input;
                  }
                  if (input == current) {
                    return a + b;
                  }
                  int swap = a;
                  a = b;
                  b = swap + b;
            			current++;
            	    }
            	  }
              }
            }
            
            public class Problem2Test {
            	
            	private final Problem2 problem2 = new Problem2();
            
            	@ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "2:1", "3:2", "4:3", "5:5", "6:8"}, delimiter = ':')
              void 피보나치_수를_구한다_재귀_값이_작은_경우(int input, int output) {
                Assertions.assertEquals(output, problem2.solution2(input));
              }
            
            	@Test // 연산 시간 = 44s(<참고 이미지1> 참조)
              void 피보나치_수를_구한다_재귀_값이_큰_경우() {
                int input = 50;
                int output = 1; // 이미 int 범위 벗어남
                Assertions.assertEquals(output, problem2.solution2(input));
              }
            	
            	@Test // 연산 시간 = 28ms(<참고 이미지2> 참조 - 재귀에 비해서 약 1,571배 빠름)
              void 피보나치_수를_구한다_꼬리_재귀_값이_큰_경우() {
            		int input = 50;
                int output = 1; // 이미 int 범위 벗어남
                Assertions.assertEquals(output, problem2.solution2_1(input, 2, 0, 1));  
            	}
            
            	@Test // 실패 - stackoverflow(<참고 이미지3> 참조)
              void 피보나치_수를_구한다_꼬리_재귀_값이_더_큰_경우() {
            		// input 값에 따른 연산의 증감폭이 크기 때문에 시간이 크게 늘어날 줄 알았는데, 그렇지 않았다.
            		// 하지만, input을 1000000까지 높여보니, 콜스택으로 인한 stackoverflow이 발생했다.
            		int input = 1000000;
                int output = 1; // 이미 int 범위 벗어남
                Assertions.assertEquals(output, problem2.solution2_1(input, 2, 0, 1));  
            	}
            
            	@Test
              void 피보나치_수를_구한다_꼬리_재귀_값이_더_큰_경우() {
            		// 하위 함수 호출을 안하기 때문에 콜스택으로 인한 stackoverflow 문제가 사라져서 메모리 한도 내에서 input의 값이 커져도 상관없다.
            		int input = 1000000;
                int output = 1; // 이미 int 범위 벗어남
                Assertions.assertEquals(output, problem2.solution2_1(input, 2, 0, 1));  
            	}
            }
            
            ```
            
            <참고 이미지1>
            
            <img width="1680" alt="Untitled1" src="https://github.com/JohnPrk/TIL/assets/88137420/b2d83779-bcd5-480c-9292-bd79348f2917">

            
            <참고 이미지2>
            
            <img width="1680" alt="Untitled2" src="https://github.com/JohnPrk/TIL/assets/88137420/bf950eb4-04d2-4f4f-a229-93b58423efae">

            
            <참고 이미지3>
            
            <img width="1680" alt="Untitled3" src="https://github.com/JohnPrk/TIL/assets/88137420/3145e2b5-a728-4c5b-aca3-1f6aba5003b1">

            
        4. **느낀점**
        - 피보나치 수 같은 경우에는 재귀까지는 구현이 어렵지 않지만, 꼬리 재귀는 아예 다르게 생각하고 코드를 구현해야 한다는 것을 알았습니다.
        - 꼬리 재귀의 경우, 함수 내에서 결과값을 파라미터로 보관해야 하는데, 이 전의 문제처럼 하나의 파라미터가 아닌 전에 있던 값과 그 이 전에 있던 값을 기억하기 위해서 파라미터가 두개가 될 수 있다는 것을 알았습니다.
        - 또한, 베이스케이스를 만들기 위해서 임의의 값을 하나씩 카운트하고 이를 input 값과 비교하는 것이 조금 신기하게 느껴졌습니다.
        - 사실 이와 같은 구현은 시간이 지나면 까먹게 되긴 하지만, 재귀로도 이렇게도 구현할 수 있다는 생각은 추후에도 날 것 같다고 느낍니다.
    - **3번 문제**
        - **구현**
            
            ```java
            public class Problem3 {
            
              public Problem3() {}
            
              public String solution1(int input) {
                if (input == 0) {
                  return "0";
                }
                ArrayDeque<Integer> stack = new ArrayDeque<>();
                while (input > 0) {
                  stack.push(input % 2);
                  input /= 2;
                }
                StringBuilder stringBuilder = new StringBuilder();
                while (!stack.isEmpty()) {
                  stringBuilder.append(stack.pop());
                }
                return stringBuilder.toString();
              }
            }
            
            ```
            
        - **구현 하면서 든 생각**
            - 3번 문제에서 2로 나눈 나머지를 통해서 구현하는 것은 가능 했으나, 이를 재귀로 어떻게 풀어야할지 답을 찾지 못했습니다.
            - 재귀로 구현하기 위해서는 하나의 작업이 하위의 여러 개의 작업의 연산으로 이루어진 것으로 이해를 했는데, 그러면 '2로 나눈 나머지가 0보다 작아질 때까지 찾는 작업을 재귀로 바꿔야하나?'라는 생각이 들었습니다.
            - 하지만, 이 것은 상위 함수를 하위 함수를 호출하는 반복적인 작업이 아니라는 느낌이 아니라 상위 함수에 대한 연산 작업이라고 느꼈습니다.
            - 다만, 이 내용을 적다보니 상위 함수에서 연산한 값을 하위 함수로 넘겨서 처리할 수 있다는 생각은 들긴 하는데, 그러면 연산한 값과 몫은 어떻게 함께 하위 함수로 전달하고 보관할까?라는 고민이 들었습니다.
        - **풀이(강의 참조)**
            
            ```java
            /**
            * 베이스 케이스를 찾습니다.
            * 베이스 케이스 이전의 단계를 찾습니다.
            * 베이스 케이스 이전의 이전의 단계를 찾습니다.
            * 즉, 거꾸로 문제를 해결해 나가야합니다.
            */
            
            public class Problem3 {
            	
              public Problem3() {}
            
            	// 재귀
              public String solution2(int input) {
                if (input == 0 || input == 1) {
                  return String.valueOf(input);
                }
                int quotient = input / 2;
                int remainder = input % 2;
                return solution2(quotient) + remainder;
              }
                
              // 꼬리 재귀
              public String solution3(int input, String output) {
                if (input == 0 || input == 1) {
                  return input + output;
                }
                return solution3(input / 2, String.valueOf(input % 2) + output);
              }
                
              // 꼬리 재귀 최적화
              public String solution4(int input) {
                String output = "";
                while (true) {
                  if (input == 0 || input == 1) {
                    return input + output;
                  }
            	    output = input % 2 + output;
            	    input /= 2;
            	  }
              }
            }
            
            public class Problem3Test {
            	
            	private final Problem3 problem3 = new Problem3();
            
            	@ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "2:10", "3:11", "4:100", "5:101", "6:110", "7:111", "8:1000"}, delimiter = ':')
              void 십진수를_이진수로_만든다_재귀(int input, String output) {
                Assertions.assertEquals(output, problem3.solution2(input));
              }
              
            	@ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "2:10", "3:11", "4:100", "5:101", "6:110", "7:111", "8:1000"}, delimiter = ':')
              void 십진수를_이진수로_만든다_꼬리_재귀(int input, String output) {
                Assertions.assertEquals(output, problem3.solution3(input, ""));
              }
            	
            	@ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "2:10", "3:11", "4:100", "5:101", "6:110", "7:111", "8:1000"}, delimiter = ':')
              void 십진수를_이진수로_만든다_꼬리_재귀_최적화(int input) {
                Assertions.assertEquals(output, problem3.solution4(input));
              }
            }
            
            ```
            
        - **느낀점**
            - 처음에는 ‘2로 나눈 나머지를 어떻게 자료구조로 보관할까?’만 고민 했습니다.
            - 이렇게 생각한 이유는 재귀를 통해 값을 넘기는 것이 사칙연산 수준이라고 제한 했는데, 이 문제를 통해서 문자열의 합연산도 가능하다는 것을 알게 되었습니다.
            - 즉, 이제서야 어떠한 문제를 재귀로 푸는지 조금은 이해한 것 같다고 느꼈습니다.
            - 재귀로 푼다는 것은 함수 입장에서는 상위 함수에서 하위 함수를 호출하는 것이고, 하위 함수에 상위 함수의 값이 재귀적으로 포함(연산) 되도록 넘기는 것입니다.
            - 재귀를 꼬리 재귀로 만들 때 베이스 케이스에서 input과 output을 더 해주는 것과 2로 나눈 나머지 문자열의 앞 쪽으로 붙여주는 것이 조금 낯설었습니다.
    - **4번 문제**
        - **구현**
            
            ```java
            public class Problem4 {
            
              public Problem4() {}
            
              public int solution1(String input) {
            	  int output = 0;
                String[] split = input.split("");
                for (int i = 0; i < split.length; i++) {
                  output += Integer.parseInt(split[i]) * Math.pow(2, split.length - i - 1);
                }
            	  return output;
              }
            }
            
            ```
            
        - **구현 하면서 든 생각**
            - 3번 문제와 동일하게 구현은 가능하지만, 재귀로 어떻게 구현할지 감을 못잡았습니다.
        - **풀이(강의 참조)**
            
            ```java
            public class Problem4 {
            
              public Problem4() {}
            
              // 재귀
              public int solution2(String input) {
                if (input.length() == 0) {
                  return 0;
                }
                String substring = input.substring(0, 1);
                return solution2(input.substring(1)) + (int) (Integer.parseInt(substring) * Math.pow(2, input.length() - 1));
              }
            
              // 꼬리 재귀
              public int solution3(String input, int output) {
                if (input.length() == 0) {
                  return output;
                }
                String substring = input.substring(0, 1);
                return solution3(input.substring(1), output + (int) (Integer.parseInt(substring) * Math.pow(2, input.length() - 1)));
              }
            
              // 꼬리 재귀 최적화
              public int solution4(String input) {
                int output = 0;
                while (true) {
                  if (input.length() == 0) {
                    return output;
                  }
                  String substring = input.substring(0, 1);
                  output += (int) (Integer.parseInt(substring) * Math.pow(2, input.length() - 1));
                  input = input.substring(1);
                }
              }
            }
            
            class Problem4Test {
            
              private Problem4 problem4 = new Problem4();
            
              @ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "10:2", "11:3", "100:4", "101:5", "110:6", "111:7", "1000:8"}, delimiter = ':')
              void 이진수를_십진수으로_바꾼다_재귀(String input, int output) {
                Assertions.assertEquals(output, problem4.solution2(input));
              }
            
              @ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "10:2", "11:3", "100:4", "101:5", "110:6", "111:7", "1000:8"}, delimiter = ':')
              void 이진수를_십진수으로_바꾼다_꼬리_재귀(String input, int output) {
                Assertions.assertEquals(output, problem4.solution3(input, 0));
              }
            
              @ParameterizedTest
              @CsvSource(value = {"0:0", "1:1", "10:2", "11:3", "100:4", "101:5", "110:6", "111:7", "1000:8"}, delimiter = ':')
              void 이진수를_십진수으로_바꾼다_꼬리_재귀_최적화(String input, int output) {
                Assertions.assertEquals(output, problem4.solution4(input));
              }
            }
            ```
            
        - **느낀점**
            - 이제서야 강의를 보지 않고 구현할 수 있겠다는 생각이 들었습니다.
            - 하지만, 베이스 케이스의 return이나 재귀가 꼬리 재귀로 바뀔 때 형태가 많이 달라진다면 고민할 시간이 더 걸릴 것 같다는 생각이 들었습니다.
    - **5번 문제**
        - **구현**
            
            ```java
            public class Problem5 {
            
                public Problem5() {}
            
                public int solution1(int a, int b) {
                    int max = Math.max(a, b);
                    int min = Math.min(a, b);
                    int r = max % min;
                    if (r == 0) {
                        return min;
                    }
                    return solution1(min, r);
                }
            }
            ```
            
        - **구현 하면서 든 생각**
            - 유클리드 호제법 역시 3, 4번 문제와 마찬가지로 구현하는 것은 설명 그대로 구현을 했으나, 이를 재귀로 어떻게 풀어야할지 답을 찾지 못했습니다.
        - **풀이(강의 참조)**
            
            ```java
            package main.java.week1.problem5;
            
            public class Problem5 {
            
              public Problem5() {}
            
              // 재귀(=꼬리 재귀)
              public int solution1(int a, int b) {
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                int r = max % min;
                if (r == 0) {
                  return min;
                }
                return solution1(min, r);
              }
            
              // 꼬리 재귀 최적화
              public int solution2(int a, int b) {
                int max = Math.max(a, b);
                int min = Math.min(a, b);
                int r = max % min;
                while(true) {
                  if (r == 0) {
            	      return min;
                  }
                  max = min;
                  min = r;
                  r = max % min;
                }
              }
            }
            
            class Problem5Test {
            
                private Problem5 problem5 = new Problem5();
            
                @ParameterizedTest
                @CsvSource(value = {"4:12:4", "3:7:1", "16:72:8", "9:12:3"}, delimiter = ':')
                void 유클리드_호제법을_사용하여_최대_공약수를_구한다_재귀(int a, int b, int output) {
                    Assertions.assertEquals(output, problem5.solution1(a, b));
                }
            
                @ParameterizedTest
                @CsvSource(value = {"4:12:4", "3:7:1", "16:72:8", "9:12:3"}, delimiter = ':')
                void 유클리드_호제법을_사용하여_최대_공약수를_구한다_꼬리_재귀_최적화(int a, int b, int output) {
                    Assertions.assertEquals(output, problem5.solution2(a, b));
                }
            }
            
            ```
            
        - **느낀점**
            - 재귀로 어떻게 풀지 몰라서 어렵게 느꼈는데, ‘이미 재귀로 구현한게 아닌가?라는 생각이 들었습니다.’
            - 또한, 사칙연산과 같은 연산 작업이 없었기 때문에 그렇게 느껴졌던 것 같습니다.
            - 그리고 연산 작업이 없다보니 이미 재귀가 꼬리 재귀 형태를 가지고 있다고 느꼈습니다.
    - **6번 문제**
        - **구현**
            - 구현하지 못했습니다.
        - **구현 하면서 든 생각**
            - 다이나믹 프로그래밍의 경우, 직접 케이스들을 해보면서 규칙성을 찾는 것이 중요하다고 생각 했는데, 시간이 부족해서 규칙성을 찾지도 못했고, 이를 재귀로는 어떻게 풀어야할지 감조차 못 잡은 것 같습니다.
        - **풀이(강의 참조)**
            
            ```java
            public class Problem6 {
            
              public Problem6() {}
            
              // 재귀
              public int solution1(int input) {
                if (input == 1) {
                  return 1;
                }
                if (input == 2) {
                  return 2;
                }
                if (input == 3) {
                  return 4;
                }
                return solution1(input - 1) + solution1(input - 2) + solution1(input - 3);
              }
            
            	// 상향식 다이나믹 프로그래밍
              public int solution2(int input) {
                int[] output = new int[1001];
                output[1] = 1;
                output[2] = 2;
                output[3] = 4;
                for (int i = 4; i <= input; i++) {
                  output[i] = output[i - 1] + output[i - 2] + output[i - 3];
                }
                return output[input];
              }
            }
            
            class Problem6Test {
            
              private final Problem6 problem6 = new Problem6();
            
              @ParameterizedTest
              @CsvSource(value = {"1:1", "2:2", "3:4", "4:7", "5:13", "6:24"}, delimiter = ':')
              void n개의_계단이_있을_때_1칸_2칸_3칸의_조합으로_올라갈_수_있는_방법의_개수를_구한다(int input, int output) {
                Assertions.assertEquals(output, problem6.solution1(input));
              }
            
            	@ParameterizedTest
              @CsvSource(value = {"1:1", "2:2", "3:4", "4:7", "5:13", "6:24"}, delimiter = ':')
              void n개의_계단이_있을_때_1칸_2칸_3칸의_조합으로_올라갈_수_있는_방법의_개수를_구한다_상향식_다이나믹_프로그래밍(int input, int output) {
                Assertions.assertEquals(output, problem6.solution2(input));
              }
            }
            
            ```
            
        - **느낀점**
            - 다행히 강의를 보기 전에 규칙성을 찾았습니다.
            - 다이나믹 프로그래밍 문제는 직접 손으로 먼저 해결하면서 규칙성을 찾았어야 했는데, 이 전에 그러지 못하는 환경이였고, 접근법도 틀렸던 것 같았습니다.
            - 재귀에서 상향식 다이나믹 프로그램으로 코드를 리팩토링 하다보니 마치 꼬리 재귀 최적화랑 되게 비슷하다는 생각도 들었습니다.
    
