## 소프트웨어 크리에이티비티 2.0 : 이론 대 실무 (로버트 L. 글래스)
- 대부분의 사람들은 이론이 먼저 정립된 후에 실무가 그 뒤를 따라 발전한다고 생각
- 하지만 글래스는 어떤 분야를 막론하고 이론을 정립할 수 없는 초기에는 실무가 먼저 급속한 발전을 이룬다고 함
- 실무가 어느 정도 발전한 후, 실무의 실용성을 입증할 수 있는 이론이 점점 나오기 시작하고
- 해당 분야가 충분히 성숙해지는 시점에 이르러서야 이론이 실무를 추월

## 티켓 어플리케이션 구현
### 요구사항
- 간단한 추첨을 통해 선정된 관람객에게 공연을 무료로 관람할 수 있는 초대장을 발송
- 이벤트 당첨자는 초대장을 티켓으로 교환
- 이벤트 미당첨자는 티켓을 구매해야만 입장 가능
- 따라서 관람객 입장 전에 이벤트 당첨 여부 확인 필요

### 구현해야하는 객체들
- Invitation (초대장)
- Ticket (티켓)
- Bag (가방)
- Audience (관람객)
- TicketOffice (티켓 판매소)
- TicketSeller (티켓 판매원)
- Theater (소극장)

![다이어그램1](https://wikibook.co.kr/images/errata/object/object-1-1.png)
[mainV1.java]

## 소프트웨어 모듈이 가져야하는 세 가지 기능(목적) (로버트 마틴)
1. 실행 중에 제대로 동작하는 것이다.
2. 변경을 위해 존재하는 것이다.
3. 코드를 읽는 사람과 의사소통하는 것이다.

# 변경에 취약한 코드
## 의존성
- 의존성은 변경에 대한 영향을 암시한다.
- 어떤 객체가 변경될 때 그 객체에게 의존하는 다른 객체도 함께 변경될 수 있다는 사실이 내포돼 있다.
- 객체지향 설계는 서로 의존하면서 협력하는 객체들의 공동체를 구축하는 것이다.
- 때문에 객체 사이의 의존성을 완전히 없애는 것보다
- 애플리케이션의 기능을 구현하는 데 필요한 최소한의 의존성만 유지하고 불필요한 의존성을 제거하는 것을 목표로 해야 한다.

## 결합도
- 객체 사이의 의존성이 과한 경우를 가리킨다.
- 반대로 객체들이 합리적인 수준으로 의존할 경우에는 결합도가 낮다고 한다.
- 두 객체 사이의 결합도가 높으면 높을수록 함게 변경될 확률도 높아지기 때문에 변경하기 어려워진다.
- 따라서 객체 사이의 결합도를 낮춰 변경이 용이한 설계를 만드는 것을 목표로 해야 한다.

### 너무 많은 클래스에 의존하는 Theater
![다이어그램2](https://wikibook.co.kr/images/errata/object/object-1-6.png)

# 자율성
## 캡슐화
- 개념적으로 물리적으로 객체 내부의 세부적인 사항을 감추는 것을 말한다.
- 캡슐화의 목적은 변경하기 쉬운 객체를 만드는 것.
- 캡슐화를 통해 객체 내부로의 접근을 제한하면 객체와 객체 사이의 결합도를 낮출 수 있기 때문에 설계를 좀 더 쉽게 변경할 수 있다.

[mainV2.java]

> Theater 는 오직 TicketSeller 의 **인터페이스** 에만 의존한다.
> TicketSeller 가 내부에 TicketOffice 인스턴스를 포함하고 있다는 사실은 **구현**의 영역에 속한다.
> 객체를 인터페이스와 구현으로 나누고 인터페이스만을 공개하는 것은 객체 사이의 결합도를 낮추고 변경하기
> 쉬운 코드를 작성하기 위해 따라야하는 가장 기본적인 설계 원칙이다.

## 응집도
- 밀접하게 연관된 작업만을 수행하고 연관성 없는 작업은 다른 객체에게 위임하는 객체를 가리켜 응집도가 높다고 할 수 있다.
- 자신의 데이터를 스스로 처리하는 자율적인 객체를 만들면 결합도를 낮출 수 있을뿐더러 응집도를 높일 수 있다.
- 객체의 응집도를 높이기 위해서는 객체 스스로 자신의 데이터를 책임져야 한다.

[mainV3.java]

### 절차지향과 객체지향
## 절차적 프로그래밍
- 메서드(Theater의 enter 메서드)를 **프로세스**, 객체(Audience, TicketSeller, Bag, TicketOffice)를 **데이터** 라고 할 때,
- 프로세스와 데이터를 별도의 모듈에 위치시키는 방식을 일컫는다.
- 모든 처리가 하나의 클래스 안에 위치하고 나머지 클래스는 단지 데이터의 역할만 수행하는 전형적인 의존성 구조를 보여준다.
- 의존성이 높기 때문에 변경에 취약하다.

## 객체지향 프로그래밍
- 데이터와 프로세스가 동일한 모듈 내부에 위치하도록 프로그래밍하는 방식을 일컫는다.
- 캡슐화를 이용해 의존성을 적절히 관리함으로써 객체 사이의 결합도를 낮추는 것이 훌륭한 객체지향 설계의 핵심이다.
- 객체지향 코드는 자신의 문제를 스스로 처리해야 한다는 우리의 예상을 만족시켜주기 때문에 이해하기 쉽고,
- 객체 내부의 변경이 객체 외부에 파급되지 않도록 제어할 수 있기 때문에 변경하기가 수월하다.

### 책임의 이동
## 책임의 이동
- 절차적 프로그래밍과 객체지향 프로그래밍의 근본적인 차이를 만드는 것은 책임의 이동이다.
- Theater 에 몰려있던 책임이 개별 객체로 이동한 것이 책임의 이동을 의미한다.
- 객체지향 설계에서는 독재자가 존재하지 않고 각 객체에 책임이 적절하는 분배된다.
- 따라서 각 객체는 **자신을 스스로 책임**진다.

## 객체지향 설계 정리
- 설계를 어렵게 만드는 것은 **의존성**이다.
- 해결 방법은 불필요한 의존성을 제거함으로써 객체 사이의 **결합도**를 낮추는 것이다.
- 예제에서 선택한 결합도를 낮추는 방법은 Theater 가 몰라도 되는 세부사항을 Audience 와 TicketSeller 내부로 감춰 **캡슐화**하는 것이다.
- 결과적으로 캡슐화는 객체의 **자율성**을 높이고 **응집도** 높은 객체들의 공동체를 창조할 수 있다.
- 불필요한 세부사항을 캡슐화하는 자율적인 객체들이 낮은 결합도와 높은 응집도를 가지고 협렵하도록 최소한의 의존성만들 남기는 것이 훌륭한 객체지향 설계다.

### 트레이드 오프
## 트레이드 오프의 시점
- TicketSeller 가 TicketOffice 의 구현이 아닌 인터페이스에만 의존하게 코드를 리펙토링하였다.
- 하지만 이로인해 TicketOffice 와 Audience 사이에 의존성이 추가되었다.
- 의존성의 추가는 높은 결합도를 의미하고, 높은 결합도는 변경하기 어려운 설계를 의미한다.
- 이 시점을 책에서는 **트레이드오프의 시점이 왔다**라고 표현했다.
- 책에 있는 가상의 개발팀은 TicketOffice 의 자율성보다는 Audience 에 대한 결합도를 낮추는 것이 더 중요하다는 결론에 도달했다고 한다.

## 정리
- [1] 어던 기능을 설계하는 방법은 한 가지 이상일 수 있다.
- [2] 동일한 기능을 한 가지 이상의 방법으로 설계할 수 있기 때문에 결국 설계는 트레이드오프의 산물이다.
- 어떤 경우에도 모든 사람들을 만족시킬 수 있는 설계를 만들 수는 없다.
- 설계는 균형의 예술이다.
- 훌륭한 설계는 적절한 트레이드오프의 결과물이다.
- 이러한 트레이드오프 과정이 설계를 어려우면서도 흥미진진한 작업으로 만드는 것이다.

### 현실과 객체지향의 세계의 차이
## 의인화
- 비록 현실에서는 수동적인 존재라고 하더라도 일단 객체지향의 세계에 들어오면 모든 것이 능동적이고 자율적인 존재로 바뀐다.
- 레베카 워프스브록은 능동적이고 자율적인 존재로 소프트웨어 객체를 설계하는 원칙을 **의인화**라고 가리켰다.

## 객체지향 설계의 재정의
- 앞에서는 실세계에서의 생물처럼 스스로 생각하고 행동하도록 소프트웨어 객체를 설계하는 것이 이해하기 쉬운 코드를 작성하는 것이라고 설명했다.
- 하지만 소프트웨어를 구성하는 모든 객체들이 자율적으로 행동하는 설계를 훌륭한 객체지향 설계라고 재정의한다.
- 실세계에서는 생명이 없는 수동적인 존재라고 하더라도 객체지향의 세계로 넘어오는 순간 그들은 생명과 지능을 가진 싱싱한 존재로 다시 태어난다.


### 객체지향 설계
## 설계
- 설계란 코드를 배치하는 것이다.

## 좋은 설계란
- [1] 오늘 완성해야 하는 기능을 구현하는 코드를 짜야 한다.
- [2] 내일 쉽게 변경할 수 있는 코드를 짜야 한다.
- 오늘 요구하는 기능을 온전히 수행하면서 내일의 변경을 매끄럽게 수용할 수 있는 것을 좋은 설계라고 한다.

## 변경을 수용할 수 있는 설계각 중요한 이유
- [1] 요구사항이 항상 변경되기 때문
- [2] 코드를 변경할 때 버그가 추가될 가능성이 높기 때문