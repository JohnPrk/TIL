# Linux

## ToDo **List Up**

- [ ]  맥OS의 zsh를 통해 우분투 리눅스의 터미널에 접속해보기
- *[***우분투 서버 SSH 접속 세팅하기***]* : [https://ca.ramel.be/74](https://ca.ramel.be/74)
    
    ---
    
    *<설명>*
    
    1. Ubuntu 리눅스에 ‘SSH Server’을 설치 
        
        ```java
        $ sudo apt-get install openssh-server
        ```
        
    2. ‘SSH Server’가 잘 설치 되었는지 확인
        
        ```java
        RSA 방식의 공개키, 비밀키 위치로 이동 : cd /etc/ssh
        파일 확인 : ls -al => ssh_host_rsa_key(비밀키 : 절때 노출되어선 안됨) / ssh_host_rsa_key.pub(공개키 : 노출 되어도 상관은 없음)
        ```
        
    
    1. 포트 번호 변경
        - SSH의 기본 포트번호는 22번이고, 이 번호는 매우 널리 알려져있기 때문에 바꿔주지 않으면 보안의 문제가 있기에 바꿔줄 필요가 있다.
        
        ```java
        포트 변경이 가능할 수 있는 위치로 이동 : cd /etc/ssh 
        포트 편집 : sudo vi sshd_config => Port 22(기본값)를 임의의 값(2222)으로 수정
        포트 재시동 : sudo service ssh restart
        ```
        
        - 포트 변경시에 sshd_config 파일과 비슷한 ssh_config 파일이 있는데, 이 둘의 차이는 다음과 같다,
            => 외부 서버에서 내부 서버에 접속을 할 때는 'sshd_config'의 설정에 영향을 받고, 내부 서버에서 외부 서버로의 접속 설정의 영향을 받는것은 ssh_config 파일이다.
            
        
    2. 자신의 ip 확인
    - ‘ip addr / ifconfig’를 통해 ip 확인
        
        ⇒ 둘 다 가능하다면? 이들의 차이점은 무엇인가?
        
        - *[**리눅스 ip 확인 : ifconfig / ip addr show 차이] :*** [https://www.leafcats.com/169](https://www.leafcats.com/169)
            
            **결론 : ip addr show에서는 Network Manger를 통한 모든 설정을 볼 수 있다. 따라서 inconfig를 쓰는 것보다 ip addr show를 쓰는 것이 좋다.**
            
            **(정확히 어떤 부분이 좋은지 아직은 이해가 안 감)**
            
            1) ip addr show
            
            - 인터페이스별 IP 주소를 확인(Shows addresses assigned to all network interfaces)
            
            ![Untitled](Linux%20ac869c79ca004bbd989b339c731bd6f6/Untitled.png)
            
            2) ifconfig
            
            - Ifconfig는 커널 상주 네트워크 인터페이스를 구성하는 데 사용됩니다.
            - 기본 설치 대상X → ifconfig 유틸리티 설치
            
            ```java
            $ sudo apt-get install net-tools
            ```
            
            ![Untitled](Linux%20ac869c79ca004bbd989b339c731bd6f6/Untitled%201.png)
            
    
    1. 맥 터미널에서 Ubuntu 서버로 ssh 접속
    - *[**맥 터미널에서 Ubuntu 서버로 ssh 접속하기]* [:** https://immature-ee.tistory.com/8](https://immature-ee.tistory.com/8)
        
        ```java
        [맥 터미널]
        / ssh john@192.168.XXX.XXX -p 2222 입력하고 접속(/ ssh 아이디@ip주소 -p 포트번호)
        ```
        
        - 맨 처음 접속했다면 다음과 같은 확인여부를 물어봄 ⇒ ‘yes’로 넘어가기 ⇒ 비밀번호 입력
        
        <aside>
        🚖 The authenticity of host '(ip주소)' can't be established.
        
        ---
        
        Are you sure you want to continue connecting (yes/no/[fingerprint])?
        
        </aside>
        
        <추가> 접속할 때마다 ip주소와 포트번호를 입력하기 귀찮다면 자동화 - 문제가 생겨서 시간이 되게 오래 걸렸음…(어휴)
        
        ```java
        [맥 터미널]
        alias 등록할 수 있는 위치로 이동 : $ cd ~
        vi로 .zshrc 파일 수정 : $ vi .zshrc(숨긴파일)
        
        alias ubuntu-server="ssh john@192.168.XXX.XXX -p 2222"
        
        안되었던 이유 : ssh는 맥 터미널에서 직접 입력하고 내용은 따로 별칭으로 저장해서 불러왔던 것이 문제가 되었음(사실,, 왜 문제가 되는지는 모르겠지만, 이렇게 되면 띄어쓰기가 인식이 안됨)
        따라서 이 모두를 하나로 뭉쳐서 별칭으로 만들기
        
        수정 후에 재시동하기 : $ source ~/.zshrc
        ```
        
    
