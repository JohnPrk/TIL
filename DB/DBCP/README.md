# DBCP

<br>

### 데이터베이스와 서버의 통신

- `백엔드 서버`와 `데이터베이스`는 `쿼리`를 통해 데이터를 주고 받을 때, `TCP 네트워크 통신 과정`을 거치게 됩니다.
- 따라서 데이터베이스 통신 과정에서 TCP 통신의 특성인 `연결 지향성`인 장점이자 단점을 갖게 된다고 할 수 있습니다.
- 쉽게 설명하자면, `DB connection`을 맺고 끊는 과정을 통해서 데이터가 전달 되기 때문에 안정적인 데이터 전송은 가능하나, connection을 맺고 끊음에 있어서 `비용`이나 `오버헤드`가 크다고 할 수있습니다.
- 따라서 `각 요청에 대한 connection`이 아니라 `요청들의 묶음 단위`로 connection을 사용해서 connection을 열고 닫는 작업을 최소화 한다고 할 수 있습니다.
- 이러한 개념에서 요청들의 묶음을 하나의 `Pool`이라고 지칭하고, 이를  `DBCP`(DataBase Connection Pool)라고 할 수 있습니다.
- 즉, 요청에 대한 하나의 DB Connection 단위가 아니라 DBCP 단위로 TCP 통신을 한다고 할 수 있습니다.

<br>

### DBCP

- 일반적으로 `DBCP`는 데이터베이스가 아닌 백엔드 애플리케이션에서 데이터베이스에 대한 연결을 관리하는 주체라고 할 수 있습니다.
- Spring Boot 2.0부터는 `HikariCP`를 `default 커넥션 풀`로 채택하고 있습니다.
- `DBCP`는 데이터베이스와 연결된 커넥션을 미리 만들어 놓고, 필요할 때마다 커넥션 풀의 `DB 커넥션`을 이용해서 `쿼리 작업`을 수행하고 `DB 커넥션`을 반환하는 기법이라고 할 수 있습니다.
- DBCP의 `동작 원리`를 간단하게 본다면,
    - 먼저 `Thread`가 DB 커넥션을 요청하면 DBCP인 `HikariCP`는 쓰레드가 이 전에 사용했던 Connection 목록을 확인하고
        - Connection이 유후 상태라면 Connection을 쓰레드에게 할당 해줍니다.
        - 그렇지 않으면 전체 Connection 목록에서의 유후 상태의 Connection을 쓰레드에게 할당해준다고 할 수 있습니다.
    - 하지만 전체 Connection 목록에서 유후 상태의 Connection이 없는 경우에는 `HandOffQueue`로 보내서 다른 Thread가 Connection을 반납하기를 기다리게 된다고 할 수 있습니다.

<br>

### DBCP 설정

- `HikariCP`에 대한 설정 명시적으로 하기 위해서 `.propeties`, `.yml`의 코드 수준의 레벨에서 설정할 수 있습니다.
- 일반적으로 DBCP의 최소와 최대 커넥션 수를 `minimumPoolSize`와 `maximumPoolSize` 변수를 통해 결정할 수 있습니다.
- 하지만, `HikariCP`는 `minimumPoolSize`보다 더 많은 요청이 들어왔을 때, DB Connection을 만드는게 오래 걸리기 때문에 `minimumPoolSize`와 `maximumPoolSize`를 동일하게 세팅하는 것을 권장하고 있습니다.
- 또한 DBCP의 커넥션을 요청하는 대기시간의 한계를 `connetionTimeout` 변수로 설정할 수 있습니다.
- 이는 이미 모든 DBCP의 커넥션을 사용하고 있는 상황에서 Thread가 DBCP 커넥션을 무한정 기다릴 수는 없기 때문에 `connetionTimeout`시간동안 커넥션이 할당되지 않으면 `예외`를 발생한다고 할 수 있습니다.

<br>

### 데이터베이스의 connections

- 데이터베이스 같은 경우에는 여러 DBCP의 커넥션 및 사용자와 직접적으로 연결될 수 있기 때문에 총 커넥션의 개수를 `max_connections`으로 설정할 수 있습니다.
- 사실 MySQL 같은 경우에는 멀티 스레드 방식으로 작업이 수행된다고 할 수 있기 때문에 `max_connections` 시스템 변수를 설정하는 것은 서버가 생성할 수 있는 `최대 스레드 수`를 결정한다는 의미라고 할 수 있습니다.
- 즉, 쿼리 작업의 요청이 들어오게 되면 `max_connections` 범위 내에서 새로운 스레드를 생성하거나 기존의 스레드를 할당해서 작업을 처리하고 응답한다고 할 수 있습니다.

<br>

<br>

### *<참고 자료>*

- [DBCP (DB connection pool)의 개념부터 설정 방법까지! hikariCP와 MySQL을 예제로 설명합니다! 이거 잘 모르면 힘들..](https://www.youtube.com/watch?v=zowzVqx3MQ4&list=PLcXyemr8ZeoREWGhhZi5FZs6cvymjIBVe&index=30)
- [DB 커넥션 풀(Connection pool)이란? HikariCP란?](https://code-lab1.tistory.com/209)
- [Chapter 8 Connection Pooling with Connector/J](https://dev.mysql.com/doc/connector-j/8.0/en/connector-j-usagenotes-j2ee-concepts-connection-pooling.html)
- [HikariCP Dead lock에서 벗어나기 (이론편)](https://techblog.woowahan.com/2664/)

<br>
