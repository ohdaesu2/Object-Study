Chapter1 객체, 설계 
=================

소프트웨어 모듈이 가져야 하는 3가지 기능 by Robert C, Martin
>모듈: 크기와 상관없이 클래스나 패키지, 라이브러리와 같이 프로그램을 구성하는 임의의 요소를 의미
> 1. 실행 중 제대로 동작해야 한다. 
> 2. 변경을 위해 존재해야 한다 -> 간단한 작업만으로 변경이 가능해야 한다. 
> 3. 코드를 읽는 사람과 의사소통 해야한다. -> 개발자가 쉽게 읽고 이해할 수 있어야 한다. 

의존성 (dependency)
>객체지향 설계는 서로 의존하면서 협력하는 객체들의 공동체를 구축하는 것이다. 
>우리의 목표는 에플리케이션의 기능을 구현하는 데 필요한 최소한의 의존성만 유지하고 불필요한 의존성을 제거하는 것이다. 

결합도 (Coupling)
>객체 사이의 의존성이 과한 경우를 결합도가 높다 라고 정의한다. 
>객체 사이의 결합도가 높을수록 함께 변경될 가능성도 높아지기 때문에 변경하기 어려워진다. 
>=> 설계의 목표는 객체 사이의 결합도를 낮춰 변경에 용이한 설계를 만들어야 한다! 

캡슐화 (encapsulation)
>개념적이나 물리적으로 객체 내부의 세부적인 사항을 감추는 일. 
>캡슐화를 통해 객체 내부로의 접근을 제한하면 객체 사이의 결합도를 낮출 수 있기 때문에 변경에 용이한 설계를 만들 수 있다. 


절차지향 프로그래밍 (Procedural Programming)
>프로세스와 데이터를 별도의 모듈에 위치하도록 하는 프로그래밍 방식

객체지향 프로그래밍 (Object-Oriented Programming)
>프로세스와 데이터가 동일한 모듈 내부에 위치하도록 하는 프로그래밍 방식    



**훌륭한 객체지향 설계의 핵심 => 캡슐화를 이용해 의존성을 적절히 관리함으로써 객체 사이의 결합도를 낮추는 것이다.**  




책임의 이동
>객체지향 설계에서는 독재자가 존재하지 않고(한쪽에서 너무 많은 책임을 가지지 않고) 각 객체에 책임이 적절하게 분배된다. 
>각 객체는 자신을 스스로 책임진다.

***

설계란 코드를 배치하는 것이다. 
### 좋은 설계란 무엇인가? => 오늘 요구하는 기능을 온전히 수행하면서 변경을 매끄럽게 수용할 수 있는 설계이다. 

***
티켓 판매 애플리케이션을 통한 예제
***
<img width="677" alt="절차지향프로그래밍" src="https://user-images.githubusercontent.com/90598930/145749384-e11f92f3-b16a-4da2-a1af-92f89ec6d2d7.png">
책임이 중앙집중된 절차지향 프로그래밍



<img width="657" alt="객체지향 프로그래밍" src="https://user-images.githubusercontent.com/90598930/145749348-c9350358-d6cc-4b8e-84bb-32fd9cfe8c95.png">
책임이 분산된 객체지향 프로그래밍

