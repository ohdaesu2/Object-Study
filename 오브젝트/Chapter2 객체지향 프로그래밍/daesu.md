Chapter2 객체지향 프로그래밍
=======================

### 객체지향 프로그램으로 가는 길 
- 객체지향 프로그램을 작성할 때 가장 먼저 어떤 클래스가 필요한지 고민할 것이다. 
- 하지만 이는, 객체지향 프로그래밍과는 거리가 멀다. 클래스가 아닌 객체에 초첨을 맞추어야 한다. 
- 프로그래밍 하는 동안 다음의 두 가지에 집중해야 한다. 
  1. 어떤 클래스가 필요한지를 고민하기 전에 어떤 객체들이 필요한지 고민하자! 
  2. 객체를 독립적인 존재가 아닌, 기능을 구현하기 위해 협력하는 공동체의 일원으로 봐야 한다! 

### 도메인의 구조를 따르는 프로그램 구조 
도메인(domain): 문제를 해결하기 위해 사용자가 프로그램을 사용하는 분야
- 객체지향 패러다임이 강력한 이유는 요구사항을 분석하는 초기 단계부터 프로그램을 구현하는 마지막 단계까지 객체라는 동일한 추상화 기법을 사용하기 때문이다. 
- 요구사항과 프로그램을 객체라는 동일한 관점에서 볼 수 있기 때문에 도메인을 구성하는 개념들이 객체와 클래스로 매끄럽게 연결될 수 있다. 
![도메인 개념의 구조를 따르는 클래스구조](https://user-images.githubusercontent.com/90598930/146708196-f608314e-0c96-435f-a537-344e4dc71c34.jpeg)

### 클래스의 내부와 외부를 구분해야 하는 이유?
- 경계의 명확성이 객체의 자율성을 보장하기 때문
- 프로그래머에게 구현의 자유를 제공 

### 객체는 자율적인 객체
- 객체는 상태(state)와 행동(behavior)을 함께 가지는 복합적인 존재이다. 
- 데이터와 기능을 객체 내부로 함께 묶는 것을 캡슐화라고 부른다. 
- 캡슐화에서 더 나아가 접근 제어 메커니즘, 접근 수정자를 제공하기도 한다. 
- 객체 내부에 접근을 통제하는 이유는 객체를 자율적인 존재로 만들기 위해서이다! 
- 객체지향의 핵심은 스스로 상태를 관리하고, 판단하고, 행동하는 자율적인 객체들의 공동체를 구성하는 것이다. => 간섭을 최소화 해야한다. 

### 캡슐화와 접근 제어
1. 퍼블릭 인터페이스(public interface): 외부에서 접근 가능한 부분
2. 구현(implementation): 외부에서는 접근 불가능하고 오직 내부에서만 접근 가능한 부분
- 일반적으로 객체의 상태는 숨기고 행동만 외부에 공개해야 한다. 
- 클래스 속성은 private로 선언해서 감추고 외부에 제공해야 하는 일부 메서드만 public으로 선언해야 한다. 

### 프로그래머의 자유 
프로그래머의 역할을 두 개로 구분지을 수 있다. 
1. 클래스 작성자(class creator): 새로운 데이터 타입을 프로그램에 추가한다. 
2. 클라이언트 프로그래머(client programmer): 클래스 작성자가 추가한 데이터 타입을 사용한다. 
- 클라이언트 프로그래머의 목표는 필요한 클래스들을 엮어서 애플리케이션을 빠르고 안정적으로 구축하는 것이다. 
- 클래스 작성자는 클라이언트 프로그래머에게 필요한 부분만 공개하고 나머지는 숨겨야 한다. 
- 클라이언트 프로그래머가 숨겨 놓은 부분을 접근할 수 없도록 방지함으로써 클라이언트 프로그래머에 대한 영향을 걱정하지 않고도 내부 구현을 마음대로 변경할 수 있다. => 구현 은닉(implementation hiding) 

### 객체의 외부와 내부를 구분하면 클라이언트 프로그래머가 알아야 할 지식의 양이 줄어들고, 클래스 작성자가 자유롭게 구현을 변경할 수 있는 폭이 넓어진다. 
### 클래스를 개발할 때마다 인터페이스와 구현을 깔끔하게 분리하기 위해 노력해야 한다. 

### 메시지와 메서드
- 객체가 다른 객체와 상호작용할 수 있는 방법은 메시지를 전송 하는 것 이다. 
- 다른 객체에게 요청이 도착할 때 해당 객체가 메시지를 수신 했다고 한다.
- 수신된 메시지를 처리하기 위한 자신만의 방법을 메서드라고 부른다.

### 메시지와 메서드를 구분하는 것은 중요하다 
- 객체지향 패러다임이 유연하고, 확장 가능하며, 재사용 가능한 설계를 낳는다면 명성을 얻게 된 배경에는 메시지와 메서드를 구분한 것도 있다. 

### 오버라이딩과 오버로딩 
오버라이딩(overriding): 부모 클래스에 정의된 같은 이름, 같은 파라미터 목록을 가진 메서드를 자식 클래스에서 재정의하는 경우를 가리킨다. 
자식 클래스의 메서드는 오버라이딩한 부모 클래스의 메서드를 가리기 때문에 외부에서는 부모 클래스의 메서드가 보이지 않는다. 
<img width="400" alt="스크린샷 2021-12-20 오후 1 12 59" src="https://user-images.githubusercontent.com/90598930/146710874-fa18c8dc-83fd-4f23-ae3e-a07f64314d34.png">

오버로딩(overloading): 메서드의 이름은 같지만 제공되는 파라미터의 목록이 다르다. 오버로딩 메서드는 원래의 메서드를 가리지 않기 때문에 공존이 가능하다. 
<img width="400" alt="스크린샷 2021-12-20 오후 1 12 40" src="https://user-images.githubusercontent.com/90598930/146710870-eddf9476-f85e-40db-8123-b02b88a5b8bc.png">

### 상속
- 기존의 클래스와 매우 비슷한 클래스를 추가하고 싶다고 생각해보자. 
- 가장 좋은 방법은 클래스의 코드를 수정하지 않고도 재사용하는 것이다. 이것이 바로 상속이다.
- 부모 클래스와 다른 부분만을 추가해서 새로운 클래스를 쉽고 빠르게 만드는 방법을 차이에 의한 프로그래밍(programming by difference)이라고 부른다. 

### 다형성(polymorphism)
동일한 메시지를 전송하지만 실제로 어떤 메서드가 실행될 것인지는 메시지를 수신하는 객체의 클래스가 무엇이냐에 따라 달라진다. 이를 다형성이라고 한다. 
- 다른말로, 동일한 메시지를 수신했을 때 객체의 타입에 따라 응답할 수 있는 능력을 의미한다. 
- 따라서 다형적인 협력에 참여하는 객체들은 모두 같은 메시지를 이해할 수 있어야 한다. 다시말해 인터페이스가 동일해야 한다. 
- 두 클래스의 인터페이스를 통일하기 위해 사용한 구현 방법이 바로 상속이다. 

### 인터페이스와 다형성
- 구현은 공유할 필요가 없고 순수하게 인터페이스만 공유하고 싶을 때가 있다.
- 자바의 인터페이스는 말 그대로 구현에 대한 고려 없이 다형적인 협력에 참여하는 클래스들이 공유 가능한 외부 인터페이스를 정의한 것이다. 
- C++의 경우 추상 기반 클래스를 통해 자바의 인터페이스 개념을 구현할 수 있다. 

### 상속과 합성
상속은 객체지향에서 코드를 재사용하기 위해 널리 사용되지만, 때로 설계에 안좋은 영향을 미친다. 
- 상속은 캡슐화를 위반한다. 
- 상속은 설계를 유연하지 못하게 만든다. 

합성은 상속이 가지는 두 가지 문제점을 모두 해결한다.
- 인터페이스에 정의된 메시지를 통해서만 재사용이 가능하기 때문에 구현을 효과적으로 캡슐화할 수 있다. 
- 의존하는 인스턴스를 교체하는 것이 비교적 쉽기 때문에 설계를 유연하게 만든다. 
- 코드 재사용을 위해서는 상속보다는 합성을 선호하는 것이 좋은 방법이다. 

그렇다고 상속을 사용하지 말라는 것은 아니다! 대부분의 설계에는 상속과 합성을 함께 사용해야 한다. 
- 다형성을 위해 인터페이스를 재사용하는 경우에는 상속과 합성을 함께 조합해서 사용할 수 밖에 없다. 
