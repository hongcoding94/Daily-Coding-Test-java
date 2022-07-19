# Scanner에 잘못된 집착한 이유
### 목차
 1. [내가 잘못된 생각을 하게 된 이유](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#1-%EB%82%B4%EA%B0%80-%EC%9E%98%EB%AA%BB%EB%90%9C-%EC%83%9D%EA%B0%81%EC%9D%84-%ED%95%98%EA%B2%8C-%EB%90%9C-%EC%9D%B4%EC%9C%A0)
 2. [Scanner에 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#2-scanner%EC%97%90-%EB%8C%80%ED%95%98%EC%97%AC)
 3. [BufferedReader&BufferedWriter에 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#3-bufferedreaderbufferedwriter%EC%97%90-%EB%8C%80%ED%95%98%EC%97%AC)
 4. [반성과 회고록](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#4-%EB%B0%98%EC%84%B1%EA%B3%BC-%ED%9A%8C%EA%B3%A0%EB%A1%9D)
 5. [참고 내용](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#5-%EC%B0%B8%EA%B3%A0-%EB%82%B4%EC%9A%A9) 

---

#### 1. 내가 잘못된 생각을 하게 된 이유

 - 시작에 앞서
 > 알고리즘에 대한 기본적 원칙은 간접적인 로직이 아닌 직접적으로 빠르게 알고리즘에 도달하여 <br/>
 > 핵심 데이터를 분리하여 처리해야한다는 것을 망각하고 일단 완성 후 수정을 해야한다는 생각으로 작성하다보니<br/>
 > 많이 부족한 코딩실력과 제한적인 범위에서만 생각을 하고 있었으며 이제 이야기 할 주제인<br/>
 > 
 > **"Scanner를 통한 데이터가 직접적으로 데이터를 주고 받기에 더 빠를 것이다"라고 생각했던<br/>
 > 자신과의 오해를 풀기 위해서 이 글을 작성합니다.**

#### 2. Scanner에 대하여

 - Scanner
 > 필자가 아는 스캐너는 남궁성님의 자바의정석3판에 나와있는 자료를 기초로 하였다. - [자바의정석3판 내용 中) Scanner 사용방법](https://github.com/hongcoding94/java_storage/blob/main/Chapter02.%20%EB%B3%80%EC%88%98(Variable).md#2-6-%ED%99%94%EB%A9%B4%EC%97%90%EC%84%9C-%EC%9E%85%EB%A0%A5%EB%B0%9B%EA%B8%B0)
 >  - 스캐너의 각각의 기본적인 설명은 하지 않도록 하겠다.(핵심만 말하고 싶습니다)
 >  > Scanner의 메소드들이 궁금하다면 이클립스 혹은 인텔리제이 내에서 class파일에 Scanner import한 후 <br/> 
 >  > ctrl과 마우스를 가져가 살포시 눌러주면 해당 방식이 나오니 참고 하기 바랍니다.
 >  
 >  - Scanner는 바이트 표준 입력 스트림을 통해서 작동하며 해당 인코딩을 통하여 진수가 아닌 문자열 혹은 정수 실수 등으로 변환하여 보인다.
 >  ![image](https://user-images.githubusercontent.com/66407386/179672607-cc3f6b1d-1140-49fa-a243-77c5abf27e24.png)
 > 
 >  - Scanner안에 궁금증<br/>
 >  > 매번 우리는 Scanner를 쓰기전 메소드 안에 스캐너를 선언 후 임포트한다.
 >  > ```java
 >  > import java.util.Scanner;
 >  > 
 >  > public class Main{
 >  >  public static void main(String[] args) {
 >  >   Scanner in = new Scanner(System.in);
 >  >  }
 >  > }
 >  > ```
 >  > 여기서 Scanner 안의 System.in은 무엇인가? 의문점이 생기기 시작했다.
 >  > ![asc](https://user-images.githubusercontent.com/66407386/179691369-a4b2e2aa-dcdb-4797-9b19-43c9ec76ca4f.png)
 >  > 
 >  > 
 >  - 스트림의 기본적 설명은 하지 않도록 하겠다.(핵심만 말하고 싶습니다.) - [자바의정석3판 내용 中) 스트림(stream)](https://github.com/hongcoding94/java_storage/blob/main/Chapter14.%20%EB%9E%8C%EB%8B%A4%EC%99%80%20%EC%8A%A4%ED%8A%B8%EB%A6%BC.md#%EC%8A%A4%ED%8A%B8%EB%A6%BCstream)<br/>
 >  > System 안에 InputStream을 내포하고 있는 것을 위 System.class에서 확인 할 수 있다.<br/>
 >  > InputStream은 **바이트 기반 입력 스트림의 최상위 추상클래스** 그리고 InputStream의 추상메소드를<br/>
 >  > 오버라이딩하여 목적에 따라 데이터를 입력 받을 수 있다.
 >  > 
 >  > 즉. System.in표준 입력에서 입력을 받는 데 사용됩니다. 키보드에서 입력을 받는 것처럼 작동
 >  > 
 >  
 >  - 흐름도
 >  > ![image](https://user-images.githubusercontent.com/66407386/179727520-0ef09725-1083-42c1-9d72-8fb38b244b5d.png)
 >  > 
 >  > 입출력이 한자 한자 들어갈 시 Cpu와 성능에 갭이 생겨 데이터 입력에 버퍼랑 비교 하였을 때 비효율성을 확인 할 수 있다.<br/>
 >  > 단, Buffer와 다르게 여러 타입을 적용할 수 있기 때문에 데이터 가공이 번거롭지 않다고 하지만 속도가 Buffer보다 느리다.

#### 3. BufferedReader&BufferedWriter에 대하여

 - BufferedReader & BufferedWriter
 >  ##### BufferedReader
 >  - 정의
 >  > BufferedReader는 개행문자만 경계로 인식하고 입력받은 데이터가 String으로 고정된다.<br/>
 >  > 때문에 따로 데이터를 가공해야하는 경우가 많다. 하지만 Scanner보다 속도가 빠르다! - 아래의 흐름도 참조
 >  > 
 >  - 공식문서 내용 中
 >  > ![image](https://user-images.githubusercontent.com/66407386/179772959-72c0b474-afe5-4c33-b89b-7a79a2441147.png)
 >  > 
 >  > ```text
 >  > BufferedReader reads text from a character-input stream, buffering characters so as to provide for 
 >  > the efficient reading of characters, arrays, and lines.
 >  > 문자 입력 스트림에서 텍스트를 읽으며 문자, 배열 및 행을 효율적으로 읽을 수 있도록 문자를 버퍼링한다.
 >  > 
 >  > The buffer size may be specified, or the default size may be used. The default is large enough for most purposes.
 >  > 버퍼 크기를 지정하거나 기본 크기를 사용할 수 있습니다. 기본값(default)은 대부분의 용도에 맞게 충분히 큽니다.
 >  > ```
 >  > 
 >  - Scanner와 BufferedReader의 차이 예시
 >  > ![image](https://user-images.githubusercontent.com/66407386/179776195-c1ebc33c-5c05-4943-a07c-4193ca9c3c33.png)
 >  >
 >  - 흐름도
 >  > ![image](https://user-images.githubusercontent.com/66407386/179729363-bd399be7-e5de-4313-a8a2-e79f5c9696bb.png)
 >  > 
 >  > 입출력이 문자로 전송하여 버퍼가 가득차거나 개행 할 시 Cpu와 성능에 많은 비효율성을 줄일 수 있기 때문이다.<br/>
 >  > 단, String으로 고정되기 때문에 데이터 가공을 많이 하여야 하기 때문에 번거로움이 있지만 속도는 Scanner보다 빠르다.
 >  >
 >  ##### BufferedWriter
 >  - 정의
 >  > System.out.println(); == BufferedWriter 동일한 기능을 하는 메소드이다.<br/>
 >  > Buffer를 이용하기때문에 효율이 좋고 많이 양의 데이터를 처리할때 이득
 >  > 
 >  - 주의점
 >  > Scanner처럼 바로 적용되는것이 아니라 버퍼에 데이터를 저장했다가 버퍼가<br/>
 >  > flush나 close가 될때 한번에 Stream쪽으로 전달이 되기 때문이다.<br/>
 >  > 따라서 해당값을 출력하기 위해선 "BufferedWriter.flush();와 BufferedWriter.close();"를 꼭 사용해줘야한다.

#### 4. 반성과 회고록

 익숙한 Scanner만 쓰려고 했던 과거의 나에게 정말 Buffer를 사용하여 코딩테스트에 임했다면<br/>
 보다 좋은 로직과 효율성을 이끌어 낼수 있었을 것이라 생각한다.<br/>
 아직 Buffer가 익숙하지 않지만 최대한 빨리 적응하여 코테를 하게된다면 Buffer의 장점을 살려서 효율적인 코딩 테스트를 준비해야겠다.<br/>
 **회고록을 쓰면서 편안한 것들만 그리고 자기가 아는 것들만 지속적으로 사용하게 된다면 나태되는 것 같다.<br/>
 더 분발해야겠다.**

#### 5. 참고 내용
  1. [Programiz 자바 스캐너 클래스](https://www.programiz.com/java-programming/scanner)
  2. [Tistory 양햄찌님의 BufferedReader / BufferWriter](https://jhnyang.tistory.com/m/92)
  3. [Tistory 크크님의 BufferedReader / BufferedWriter](https://rlakuku-program.tistory.com/33)
  4. [naver Yjh701701님의 BufferedReader, Bufferedwriter 사용법 및 공백단위 가공](https://m.blog.naver.com/yjh701701/222795285552)
  5. [ZetCode 홈페이지의 bufferedreader문서 요약](https://zetcode.com/java/bufferedreader/)

---
<div align="center">
  <b>긴 글 읽어주셨어 감사합니다.</b><br/><br/>
  아직 많이 배워야하는 웹린이 입니다.<br/>
  내용에 문제가 있다면 이슈를 통해 알려주신다면 <br>
  감사하겠습니다.
 </div>
