# 배열

같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 배열 (array)라고 한다.
같은 타입이라는 점이 중요하며, 다른 타입의 변수로 구성된 배열은 만들 수 없다.

## 배열의 선언과 생성
타입[] 변수이름 ;
타입 변수이름[];

배열을 선언한 후에는 배열을 생성해야 한다. 배열을 선언한 것은 단지 생성된 배열을 다루기 위한 참조변수를 위한 공간이 만들어진 것 뿐이다.
배열 생성을 위해서는 연산자 "new"와 함께 배열의 타입과 길이를 지정해 주어야 한다.

타입[] 변수이름 = new 타입[길이];
int[] score = new int[5]; // 길이가 5인 int 배열

## 배열의 길이와 인덱스

생성된 배열의 각 저장공간을 "배열의 요소" 라고 하며 "배열이름[인덱스]"의 형식으로 배열의 요소에 접근한다.
인덱스(index)는 배열의 요소마다 붙여진 일련번호로 각 요소를 구별하는데 사용된다.

인덱스의 범위 0 부터 배열길이 -1 까지
예를들어 길이가 5개인 배열(int[] score = new int[5];)은 모두 5개의 요소를 가지며 범위는 0, 1, 2, 3, 4 가 된다.

배열에 값을 저장하고 읽어오는 방법은 변수와 같다.
score[3] = 100; // 배열 score의 4번째 요소에 100을 저장한다.
int value = score[3]; // 배열 score의 4번째 요소에 저장된 값을 읽어서 value에 저장

괄호 안에 수식이 포함 된 경우 수식이 먼저 계산된다.
int tmp = score[i+1];

 배열을 사용할때 주의할 점은 index의 범위를 벗어난 값을 index로 사용하지 않는 것이다.
예) int[] score = new score[5]; // 길이가 5인 배열
   score[5] = 100; // index의 범위를 벗어낫다. 길이가 5인 배열의 index는 0, 1, 2, 3, 4 이다.
   
### 배열의 길이

배열을 생성할 때 괄호[] 안에 배열의 길이를 적어줘야 하는데, 배열의 길이는 배열의 요소의 개수, 즉 값을 저장할 수 있는 공간의 개수이다.
배열의 길이는 정수이어야 하며 최대값은 int타입의 최대값, 약 20억이다.

타입[] 배열이름 = new 타입[길이];
int[] arr = new int[5]; // 길이가 5인 int 배열

길이가 0 인 배열또한 생성이 가능하다.
int[] arr = new int[0];

### 배열 이름.length

자바에서는 JVM이 모든 배열의 길이를 별도로 관리하며 "배열이름.length"를 통해서 배열의 길이에 대한 정보를 알 수 있다.

int[] arr = new int[5]; // 길이가 5인 배열
int tmp = arr.length; // arr.length의 값은 5 이고 tmp에 5가 저장된다.

배열은 한번 생성되면 길이를 변경할 수 없다.
이미 생성된 배열의 길이는 변하지 않는다. 따라서 "배열이름.length"는 상수이다.

## for문을 이용한 배열길이 사용

int[] score = new int[5];
for(int i = 0; i < 6; i++) {} -> for (int i = 0; i < score.length; i++) {}

### 배열의 길이 변경하는 방법
1. 더 큰 배열을 새로 생성한다.
2. 기존 배열의 내용을 새로운 배열에 복사한다.

## 배열의 초기화

배열은 생성과 동시에 자동적으로 자신의 타입에 해당하는 기본값으로 초기화 된다.
그러나, 원하는 값을 저장하려면 아래와 같이 각 요소마다 값을 지정해 줘야 한다.

int[] score = new int[5]; // 길이가 5인 int형 배열을 생성한다.
score[0] = 50; 
score[1] = 60;
score[2] = 70;
score[3] = 80;
score[4] = 90;

배열의 길이가 큰 경우에는 for문을 사용하라.

int[] score = new int[5]; // 길이가 5인 int형 배열
for (int i = 0; i < score.length; i++) {
  score[i] = i * 10 + 50;
  }
  
그러나 for문으로 배열을 초기화 하려면 , 저장하려는 값에 일정한 규칙이 있어야만 가능하기 때문에 자바에서는 다음과 같이 배열을 간단히 초기화 할 수 있는 방법을 제공한다.

int[] socre = new int[] {50, 60, 70, 80, 90}; // 배열의 생성과 초기화를 동시에

괄호 안의 저장할 값들을 쉼표로 구분해 나열하며 괄호[] 안에 배열의 길이는 적지 않는다. 괄호{} 엔의 개수에 의해 배열의 길이가 자동적으로 결정된다.

더 간단히 표현

int[] score;
score = new int[] {50, 60, 70, 80, 90};

### 배열의 출력

배열을 초기화 할 때 for문을 사용하듯이 배열에 저장된 값을 확인할 때도 for문을 사용한다.

int[] iArr = {50, 60, 70, 80, 90};
for (int i = 0; i < iArr.lenght; i++) { // 배열의 요소를 순서대로 하나씩 출력
  sysout.print(iArr[i]);
  }

int[] iArr = {50, 60, 70, 80, 90};
for (int i = 0; i < iArr.lenght; i++) { // 배열의 요소를 순서대로 하나씩 출력
  sysout.print(iArr[i], ","); // 각 요소 간 구별을 위해 쉼표를 넣는다.
  }
  
더 간단한 방법은 "Arrays.toString(배열이름)" 메서드를 사용하는 것 이다.
사용하려면 "import java.util.*" 추가해야 한다.

int[] iArr = {10, 20, 30};
sysout.print(Arrays.toString(iArr)); 

예외적으로 char 배열은 println 메서드로 출력하면 각 요소가 구분자없이 그대로 출력되며, 이는 이렇게 동작하도록 작성되었기 때문이다.

char[] chArr = {a, b, c, d};
sysout.println(chArr); // abcd 이 출력.

## 배열의 복사

배열은 한번 생성하면 길이를 변경할 수 없다. 더 많은 저장공간이 필요하다면 보다 큰 배열을 새로 만들고 이번 배열로부터 내용을 복사해야 한다.

1. for문

int[] arr = new int[5];

int[] tmp = new int[arr.length*2]; // 기존 배열보다 길이가 2배인 배열 생성

for(int i = 0; i < arr.length; i++;)
  tmp[i] = arr[i] // arr[i]의 값을 tmp[i]에 저장
  
arr = tmp; // 참조변수 arr이 새로운 배열을 가리키게 한다.

2. System.arraycopy() ★

이전 예제에서 배열의 복사에 사용된 for문을 arraycopy()로 바꾸면 다음과 같다.

for(int i = 0; i < arr.length; i++;) {
  tmp[i] = arr[i] 
  }
  
->

System.arraycopy(arr,  0,      tmp,  0,     arr.length);
                 arr  [0]에서  tmp로[0]으로 arr.length개의 데이터 복사.
                 
## 배열의 활용 p.196 ★★★★★

# String 배열

## String 배열의 선언과 생성

예를들어 3개의 문자열(String)을 담을 수 있는 배열을 생성하는 문장은 다음과 같다.

String[] name = new String[3]; // 3개의 문자열을 담을 수 있는 배열 생성.

3개의 String타입의 참조변수를 저장하기 위한 공간이 마련되고 참조형 변수의 기본값은 null이므로 각 요소의 값은 null로 초기화 된다.

## String 배열의 초기화

String[] name = new String[3];
name[0] = "kim";
name[1] = "park";
name[2] = "lee";

또는 괄호를 사용해서 간단히 초기화 가능

String[] name = new String[] {"kim", "park", "lee"};
String[] name = {"kim", "park", "lee"}; // new String[] 생략 가능.

##  char 배열과 String 클래스

String 클래스는 char 배열에 기능을 추가한 것이다.
중요한 차이점은 String 객체는 읽을 수만 있을뿐 내용을 변경할 수는 없다.

String str = "java";
str = str + "8"; // "java8" 이라는 새로운 문자열이 str에 저장된다.
sysout.prinln(str); // "java8"

위의 내용은 문자열이 변경되는 것이 아닌, 새로운 내용의 문자열이 생성된 것이다.

### String 클래스의 주요 메서드

- charAt 메서드는 문자열에서 지정된 index에 있는 한 문자를 가져온다. index의 값은 0 부터 시작.

String str = "abcde";
char ch = str.charAt(3); // 문자열 str의 4번째 문자 d를 ch에 저장.

- substring() 은 문자열의 일부를 뽑아낼 수 있다. 주의 범위의 끝은 포함되지 않는다.

String str "012345";
String tmp = str.substring(1,4); // str에서 index범위 1~4d의 문자들을 반환
sysout.println(tmp); // "123"출력된다.

- equals() 문자열의 내용이 같은지 다른지 확인하는데 사용. 문자열 내용을 비교할 때 사용되며, 대소문자 구분하는 점을 주의하자.
대소문자를 구분하지 않고 비교하려면 equalsIgnoreCase()를 사용

String str = "abc";
if (str.equals("abc") {...} // str와 "abc"가 내용이 같은지 확인한다.

### char 배열과 String 클래스의 변환
 
 char[] chArr = {'a', 'b', 'c'};
 String str = new String(chArr); // char 배열 -> String
 char[] tmp = str.toCharArray90; // String -> char 배열

# 다차원 배열

## 2차원 배열의 선언과 인덱스 p.214 ★
































