# my-first-project

### 1. 사전준비 - spring boot hello world(https://vmpo.tistory.com/)

### 2. 사전준비 - 스프링부트를 이용하여 게시판 만들기

1. 사이트 : https://victorydntmd.tistory.com
2. 프로젝트 생성(Hello World) - 실행 후 삭제, h2 database에서 mysql로 변경해야함
3. Mysql 연동(https://victorydntmd.tistory.com/321?category=764331)
   1. Mysql 대신 mariadb로 설치한다 (https://hoony-gunputer.tistory.com/entry/Mac에서-Maria-DB설치하기)
   2. mariadb 로그인 계정을 설정한다 (https://brunch.co.kr/@artiveloper/21) : 2번방법
      - user:root, pw:root1234
   3. 프로젝트에 데이터베이스를 연결한다.
      - victolee 블로그의 내용대로 데이터베이스 설정을 진행한다.
      - 데이터베이스 연결시 https://csy7792.tistory.com/63 참조하여 mariadb 연결 >>> dependencies, reimport gradle, application.properties 입력 참고할 것.
4. JPA 설정(https://victorydntmd.tistory.com/323?category=764331)
   - yml이 아닌, property로 설정함.
5. 게시판(1)-준비작업(https://victorydntmd.tistory.com/325?category=764331)
6. 게시판(2)-게시글추가하기(https://victorydntmd.tistory.com/326)
   1. 에러 발생 : 그대로 타이핑 하고 컴파일 했는데, 에러남. 데이터베이스 관련인듯...
