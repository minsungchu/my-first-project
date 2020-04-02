# my-first-project

### 1. 사전준비 - spring boot hello world

1. IntelliJ 설치
2. IntelliJ를 이용하여 Spring Boot 시작, Hello World 출력(https://vmpo.tistory.com/7)
3. 영화진흥위원회 오픈API를 이용한 REST API 테스트(https://vmpo.tistory.com/27?category=730732)
   - 변수 디버깅이 안됨. 방법을 모르겠음.
   - 해결됨 : Breakpoint 설정후, localhost:8080으로 웹페이지를 띄워야함.
4. 공공데이터 오픈API를 이용한 REST API 및 AJAX 예제
   4-1. REST API 테스트(https://vmpo.tistory.com/33?category=730732)
   4-2. AJAX 호출 예제(https://vmpo.tistory.com/53?category=730732)
   - CORS 에러 발생 : 해결방안(https://velog.io/@jmkim87/지긋지긋한-CORS-파헤쳐보자), (https://brunch.co.kr/@adrenalinee31/1)
   - 결론 : 해결방안은 블로그를 통해 확인가능하나, 내용의 이해가 현재 수준으로는 어려움
   - 해결됨 : 웹페이지를 띄우는 방식이 잘못됬었음. localhost:8080으로 웹페이지를 실행해야함.

### 2. 사전준비 - 스프링부트를 이용하여 게시판 만들기

1. 사이트 : https://victorydntmd.tistory.com
2. 프로젝트 생성(Hello World) - 실행 후 삭제, h2 database에서 mysql로 변경해야함
3. Mysql 연동(https://victorydntmd.tistory.com/321?category=764331)
   3-1. Mysql 대신 mariadb로 설치한다 (https://hoony-gunputer.tistory.com/entry/Mac에서-Maria-DB설치하기)
   3-2. mariadb 로그인 계정을 설정한다 (https://brunch.co.kr/@artiveloper/21) : 2번방법
   user:root, pw:root1234
   3-3. 프로젝트에 데이터베이스를 연결한다.
   victolee 블로그의 내용대로 데이터베이스 설정을 진행한다.
   데이터베이스 연결시 https://csy7792.tistory.com/63 참조하여 mariadb 연결 >>> dependencies, reimport gradle, application.properties 입력 참고할 것.
