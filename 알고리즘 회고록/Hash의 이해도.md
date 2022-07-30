# Hash의 이해도
### 목차
 1. [Hash 이해도를 키우는 이유](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#1-hash-%EC%9D%B4%ED%95%B4%EB%8F%84%EB%A5%BC-%ED%82%A4%EC%9A%B0%EB%8A%94-%EC%9D%B4%EC%9C%A0)
 2. [Hash 종류 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#2-hash-%EC%A2%85%EB%A5%98-%EB%8C%80%ED%95%98%EC%97%AC)
 3. [Hash Set 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#3-hash-set-%EB%8C%80%ED%95%98%EC%97%AC)
 4. [Hash Table 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#4-hash-table-%EB%8C%80%ED%95%98%EC%97%AC)
 5. [Hash Map 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#5-hash-map-%EB%8C%80%ED%95%98%EC%97%AC)
 6. [HashMap과 HashTable의 차이점](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#6-hashmap%EA%B3%BC-hashtable%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90)
 7. [반성과 회고록](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#7-%EB%B0%98%EC%84%B1%EA%B3%BC-%ED%9A%8C%EA%B3%A0%EB%A1%9D)
 8. [참고내용](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#8-%EC%B0%B8%EA%B3%A0%EB%82%B4%EC%9A%A9)


#### 1. Hash 이해도를 키우는 이유

 - 시작에 앞서
 > Hash 이해도를 키워야 하는 이유는 <b>알고리즘에서 문제 해결을 원만하게 해주는 역할을 하며<br/>
 > 현업에서 자료구조를 통해 정보를 효율적으로 관리하는데 많은 역할을 할 것이라 필자는 생각</b>한다.
#### 2. Hash 종류 대하여

 - 해시(Hash)이란?
   ```text
   Hash 산술적이 연산을 이용하여 키의 위치를 계산하여 검색하는 방식이며
   "키(key) 값(value)을 원소 위치로 변환하는 함수를 해시함수(Hash Function)"이라 한다.
   ```
 
   ![image](https://user-images.githubusercontent.com/66407386/180723497-f59d43b6-eb74-4fdc-9960-5b9976aac80d.png)

 - 해시함수(hash function)
   ```text
    - 백과사전 검색 : "해시함수"
    하나의 주어진 출력에 대하여 이 출력으로 사상시키는 하나의 입력을 찾는 것이 계산적으로 불가능하고,
    하나의 주어진 입력에 대하여 같은 출력으로 사상시키는 또 다른 입력을 찾는 것이 계산적으로
    불가능하다는 두 가지 성질을 만족하면서 임의의 비트열을 고정된 길이의 비트열로 사상시키는 함수
    
    즉, 임의의 길이를 갖는 데이터를 입력받아 고정된 길이의 해시값을 출력하는 함수
    암호 알고리즘에는 키가 사용되며, 해시 함수는 키를 사용하지 않으므로 같은 입력에 
    대해서는 항상 같은 출력이 나오며 해시함수를 사용하는 
    목적은 "메시지의 오류나 변조를 탐지할 수 있는 무결성을 제공하기 위해 사용"된다.
   ```

 - 여기서 빨강색으로 이어저 있는 jeong과 han은 두개는 충돌로 인해서 데이터가 손상된다.<br/>
  ☞ 이처럼 "해시충돌"이 일어난다.
   ※ Hash 충돌이란?<br/>
      - Hash 함수가 서로 다른 두개의 입력값에 대해 동일한 출려값을 내는 상황을 의미
      - Hash 충돌은 해시 함수를 이용한 자료구조나 알고리즘의 효율성을 떨어트리기 때문에<br/>
      오히려 역효과를 만들 수 있기 때문에 자주 사용하는 것은 지양한다.
      - Hash 충돌을 했을 때 해결 방법 
        - 열린 어드레싱 방법(Open addressing method)<br/>
            A. 성형 조사법<br/>
            B. 이차 조사법<br/>
            C. 이중 해시<br/>
            D. 재해싱<br/>
        - 닫힌 어드레싱 방법(Closed addressing method)<br/>
            A. 체이닝<br/>

    ※ 자세한 내용은 "Hash 충돌을 했을 때"라는  내용으로 추가적으로 다루도록 하겠다.

 - 해시의 특징<br/>
   a. 일방향성 : >>> 공부 中 <br/>
   
   b. 강한 충돌 회피성 : >>> 공부 中 <br/>

 - 해시의 종류
   |알고리즘|출력길이|블럭의 크기|라운드 수|Endianness|
   |---|---|---|---|---|
   |MD5|128|512|64|Little|
   |SHA1|160|512|80|Big|
   |SHA256|256|512|80|Big|
   |SHA384|384|1024|80|Big|
   |SHA512|512|1024|80|Big|
   |RMD128|128|512|128|Little|
   |RMD160|160|512|160|Little|
   |RMD256|256|512|128|Little|
   |RMD320|320|512|160|Little|
   |HAS160|160|512|80|Little|
   |TIGER|192|512|56|Little|
   
   해시를 많이 사용하는 곳이 데이터의 변조가 가능한 곳을 막기 위하여 실개발에 많이 사용된다.<br/>
   대표적인 예시는 회원가입에 대한 비밀번호 혹은 파일 혹은 영상저장위치 등 다양한 방법으로 많이 사용된다.<br/>
   필자가 사용해본 Hash 알고리즘 - SHA256, SHA512
  
#### 3. Hash Set 대하여

   - HashSet의 정의
   > Hash + Set이 혼합되어 만들어진 것이라 필자는 생각하며 자바 내부구현 코드를 봐도 그와 같은 모습을 볼 수 있다.<br/>
   > 그 예로 아래의 HashSet의 내부 구현 코드를 확인해보자.

<div align="center">   
 
   ![HashSet(1)](https://user-images.githubusercontent.com/66407386/181668628-cc46e7d8-c187-4a72-aa96-8c892d824f0f.png)
 
</div>

   > HashSet 내부를 확인하면 AbstratSet<E>을 extends 받으면 동시에 Set을 implements 받는 것을 확인 할 수 있다.<br/>
   > 
   > 더 자세히 들어가보면 아래와 같다.
 
<div align="center">   
 
 ![HashSet(2)](https://user-images.githubusercontent.com/66407386/181668651-db4811cd-a626-4d92-b7ae-a347109a5097.png)
 
</div> 
 
   > AbstractSet은 다시 한번 컬렉션의 Extends를 받고 Set를 implements를 하여 셋팅을 하게 된다.<br/>
   > 1. boolean구조로 문자를 비교<br/>
   > 2. HashCode는 Object가 null이 아니라면 주소값을 입력하여 리턴<br/>
   > 3. boolean구조로 해당 동일 구조가 있다면 삭제<br/>
   > 
   > 위 코드와 같이 진행됨으로 Set의 특징을 HashSet으로 가져오면서 Hash의 특징을 살려내는 역할을 하지 않았을까 생각한다.<br/>
   > 기본적인 Set이 특성은 중복된 타이브이 객체는 저장하지 않으며<br/>
   > 때문에 HashSet 역시 같은 특징을 가지고 있다.    
   
- 선언방법 및 예제
    ```java
    public class Main {
        public static void main(String[] args) {
            // Set<타입(Type)> set = new HashSet<타입(Type)>();  JDK8버전 이후 부터 "new HashSet<>();"으로 지정하더라도 타입이 자동으로 입력된다.
            
            Set<String> set = new HashSet<>();
            set.add("삼XX권");
            set.add("검X청");
            set.add("LXX활건강");
            set.add("삼XX권");
            set.add("검X청");
            set.remove("검X청");
            
            Iterator<String> it = set.iterator();
    	       while(it.hasNext()) {
    		         String str = it.next();
    		         System.out.println(str);
    	       }
        }
    }
    // 출력결과 
    // 삼XX권 
    // LXX활건강
    ```
 - 예제의 출력 흐름도
   ![image](https://user-images.githubusercontent.com/66407386/181683699-c23697cd-05c1-4f8d-9725-2e8077f5c00a.png)

#### 4. Hash Table 대하여

 - HashTable의 정의
   > Key, Value로 데이터를 저장하는 자료 구조이자 빠르게 데이터를 검색할 수 있는 자료구조<br/>
   > Key값에 대한 고유 index를 생성하여 값을 저장(buckets)하는 구조이다.<br/>
   > HashTable의 평균 시간복잡도는 O(1)이다.<br/>
   >
   > 단, 데이터의 충돌이 발생한 경우 Chaining에 연결된 리스트들까지 검색하기 때문에 O(N)까지<br/>
   > &nbsp; &nbsp; &nbsp; 시간복잡도가 증가하기 때문에 오히려 치명적인 성능저하로 이어질 수 있다.
 
    ※ 추후에 "시간복잡도"라는 내용으로 추가적으로 다루도록 하겠다.
 
 ❔ 그렇다면 HashMap과 HashTable의 차이점이 없는가 아닌가? <br/>
 &nbsp; &nbsp; ▶ 반은 맞고 받은 틀리다. 아래의 HashMap과 HashTable의 차이점을 알아보자. - [HashMap과 HashTable의 차이점 이동](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Hash%EC%9D%98%20%EC%9D%B4%ED%95%B4%EB%8F%84.md#6-hashmap%EA%B3%BC-hashtable%EC%9D%98-%EC%B0%A8%EC%9D%B4%EC%A0%90) <br/>
 
 - 선언방법 및 예제
 
 
 - 예제의 출력 흐름도

 

#### 5. Hash Map 대하여

 - HashMap의 정의
   > HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션입니다.<br/>
   > Map은 키와 값으로 구성된 Entry객체를 저장하는 구조를 가지고 있는 자료구조이며<br/>
   > 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보여준다.
   >
   > 단, 값은 중복 저장될 수 있지만 키는 중복 저장될 수 없으며 기존에 저장된 키와<br/>
   > 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 변경됨

   ![image](https://user-images.githubusercontent.com/66407386/181888081-9859024f-a184-4af1-8e37-a53783853ee0.png)

 - 선언방법 및 예제
 
 
 - 예제의 출력 흐름도

 
#### 6. HashMap과 HashTable의 차이점
 - HashMap과 HashTable의 공통점
   A. Map을 상속 받아 구현하는 클래스이며 Key, value를 한상으로 가진 자료구조<br/>
   B. Key에 Hash함수를 적용하여 고유의 Index를 생성한 후, Index를 활용하여 값을 저장하거나 검색하는 방식
 
 - HashMap과 HashTable의 차이점
   > HashMap과 HashTable 과연 무슨 차이점이 있을까?<br/>
   > 아래의 내부 코드와 내용을 살펴보자.

   A. 동기화
   > HashMap은 동기화를 제공하고, HashTable은 동기화를 제공하며<br/>
   > 멀티스레드를 쓰고 안쓰고에 따라 성능 차이가 있음으로 아래와 같은경 해당 방법으로 사용하자
   >
   > 멀티스레드 사용   - HashMap<br/>
   > 멀티스레드 미사용 - HashTable

   B. 반환값 - Enumeration(열거) 여부
   > HashMap은 저장된 요소들의 순회를 위해 Fail-Fast Iterator를 반환한다.<br/>
   > Hashtable은 같은 경우 Enumeration을 반환한다.
 
   C. Null 여부
   > HashMap에서는 null을 허용하고 HashTable에서는 null을 허용하지 않는다.
 
   D. 보조해시함수
   > 보조해시함수의 역할은 Key의 해시값을 변경해 해시 충돌 가능성을 줄여주는 역할을 하며<br/>
   > 보조해시를 통해서 HashMap이 HashTable에 비해서 해시 충돌이 적게 발생한다.
 
  - 차이점 한눈에 정리
   
     |Hash 종류|Key값 null<br/>허용여부|동기화<br/>제공여부|멀티스레드<br/>환경 지원여부|속도 우위<br/>(멀티스레드O)|속도 우위<br/>(멀티스레드X)|추천 환경|
     |:-:|:-:|:-:|:-:|:-:|:-:|:-:|
     |HashMap|O|O|O<br/>(Data 무결성을 보장)|HashTable보다 빠르다|HashTable보다 느리다|싱글스레드|
     |HashTable|X|O|X|HashMap보다 느리다|HashMap보다 빠르다|멀티스레드|

#### 7. 반성과 회고록



#### 8. 참고내용
 1. [별의수다님의 해시 함수의 종류](https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=wnrjsxo&logNo=221718933319)
 2. [위키백과 홈페이지의 해시 함수](https://ko.wikipedia.org/wiki/%ED%95%B4%EC%8B%9C_%ED%95%A8%EC%88%98)
 3. [위키백과 홈페이지의 해시 충돌](https://ko.wikipedia.org/wiki/%ED%95%B4%EC%8B%9C_%EC%B6%A9%EB%8F%8C)
 4. [개발/지름님의 Hash의 특징과 종류](https://tertis.tistory.com/entry/HASH%EC%9D%98-%ED%8A%B9%EC%A7%95%EA%B3%BC-%EC%A2%85%EB%A5%98)
 5. [kkw9312님의 Hash에 대해 공부해보자!](https://velog.io/@kkw9312/javaHash)
 6. [st-lab님의 자바 [JAVA] - Hash Set (해시 셋) 구현하기](https://st-lab.tistory.com/240)
 7. [배하람님의 해슅 테이블이란?](https://baeharam.netlify.app/posts/data%20structure/hash-table)
 8. [코딩팩토리 블로그의 [Java] 자바 HashMap 사용법 & 예제 총정리](https://coding-factory.tistory.com/556)
 9. [java Platform의 HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
 
---
<div align="center">
  <b>긴 글 읽어주셨어 감사합니다.</b><br/><br/>
  아직 많이 배워야하는 웹린이 입니다.<br/>
  내용에 문제가 있다면 이슈를 통해 알려주신다면 <br>
  감사하겠습니다.
 </div>
