# JUnit5와 AssertJ를 활용한 TDD 기반 테스트

## 🚪 들어가기
이 프로젝트는 카페 키오스크 애플리케이션을 개발하며, 테스트 주도 개발(TDD) 방식을 활용해 기능을 구현하고 검증하는 과정을 담고 있습니다. 요구사항에 기반한 코드를 작성하면서 JUnit5와 AssertJ를 사용하여 단위 테스트와 통합 테스트를 진행했습니다.

카페 키오스크 애플리케이션은 주문 기능을 포함하여 사용자와 상호작용하는 다양한 기능을 제공합니다. 이를 구현하는 과정에서 각 기능의 안정성과 정확성을 보장하기 위해 TDD를 채택했으며, AssertJ를 사용하여 더 읽기 쉬운 테스트 코드와 직관적인 검증 로직을 작성했습니다.

이 프로젝트는 단순한 코드 작성뿐 아니라 테스트를 통해 애플리케이션의 신뢰성을 확보하는 방법을 학습하고, 실제 개발 과정에서 테스트의 중요성을 체감하는 데 중점을 두었습니다. TDD의 실무 적용 경험을 통해 테스트의 가치와 효과를 깊이 이해하는 기회가 되기를 기대하고 있습니다.

<br>

## 💻 시스템 환경 및 소프트웨어
| **항목**                | **내용**                          |  
|-------------------------|----------------------------------|  
| **프로그래밍 언어**      | Java 17                          |  
| **프레임워크**           | Spring Boot 3.4.3                |  
| **빌드 툴**             | Gradle 8.1                       |  
| **테스트 프레임워크**     | JUnit 5, AssertJ                 |  
| **IDE 및 편집기**         | IntelliJ IDEA Ultimate           |  
| **API 테스트 도구**       | IntelliJ IDEA Ultimate HTTP Client |  


<br>

## 💁🏻 카페 키오스크 요구사항

- 주문 목록에 음료 추가 / 삭제 기능
주문 목록 전체 지우기
- 주문 목록 총 금액 계산하기
- 주문 생성하기
- 한 종류의 음료 여러 잔을 한 번에 담는 기능
- 가게 운영 시간(10:00 ~ 22:00) 외에는 주문을 생성할 수 없다

<br>

- 키오스크 주문을 위한 상품 후보 리스트 조회하기
- 상품의 판매 상태 : 판매중, 판매보류, 판매중지 (판매중, 판매보류인 상태의 상품을 화면에 보여준다)
- id, 상품번호, 상품타입, 판매상태, 상품이름, 가격

<br>

- 상품 번호 리스트를 받아 주문 생성하기
- 주문은 주문 상태, 주문 등록 시간을 가진다
- 주문의 총 금액을 계산 할 수 있어야 한다

<br>

- 주문 생성시 재고 확인 및 개수 차감 후 생성학기
- 재고는 상품번호를 가진다
- 재고와 관련 있는 상품 타입은 병 음료, 베이커리이다

  <br>

- 관리자 페이지에서 신규 상품을 등록할 수 있다
- 상품명, 상품 타입, 판매 상태, 가격 등을 입력받는다 
