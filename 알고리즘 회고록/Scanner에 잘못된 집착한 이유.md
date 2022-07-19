# BufferedReader&BufferedWriter
### 목차
 1. [내가 잘못된 생각을 하게 된 이유](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#1-%EB%82%B4%EA%B0%80-%EC%9E%98%EB%AA%BB%EB%90%9C-%EC%83%9D%EA%B0%81%EC%9D%84-%ED%95%98%EA%B2%8C-%EB%90%9C-%EC%9D%B4%EC%9C%A0)
 2. [Scanner에 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#2-scanner%EC%97%90-%EB%8C%80%ED%95%98%EC%97%AC)
 3. [BufferedReader&BufferedWriter에 대하여](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#3-bufferedreaderbufferedwriter%EC%97%90-%EB%8C%80%ED%95%98%EC%97%AC)
 4. [반성과 회고록](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#4-%EB%B0%98%EC%84%B1%EA%B3%BC-%ED%9A%8C%EA%B3%A0%EB%A1%9D)
 5. [참고 내용](https://github.com/hongcoding94/Daily-Coding-Test-java/blob/main/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98%20%ED%9A%8C%EA%B3%A0%EB%A1%9D/Scanner%EC%97%90%20%EC%9E%98%EB%AA%BB%EB%90%9C%20%EC%A7%91%EC%B0%A9%ED%95%9C%20%EC%9D%B4%EC%9C%A0.md#%EC%B0%B8%EA%B3%A0-%EB%82%B4%EC%9A%A9) 

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

#### 3. BufferedReader&BufferedWriter에 대하여


#### 4. 반성과 회고록


#### 5. 참고 내용



---
<div align="center">
  <b>긴 글 읽어주셨어 감사합니다.</b><br/><br/>
  내용에 문제가 있다면 이슈를 통해 알려주신다면 <br>
  감사하겠습니다.
 </div>
