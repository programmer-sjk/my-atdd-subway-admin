# 인수 테스트 주도 개발

## 1단계 - 지하철역 인수 테스트 작성

### 기능 요구사항
- 지하철역 관련 인수 테스트를 완성하세요.
    - 지하철역 목록 조회 인수 테스트 작성하기
    - 지하철역 삭제 인수 테스트 작성하기

### 프로그래밍 요구사항
- 인수 테스트의 재사용성과 가독성, 그리고 빠른 테스트 의도 파악을 위해 인수 테스트를 리팩터링 하세요.
    - 각각의 테스트를 동작시키면 잘 동작하지만 한번에 동작시키면 실패할 수 있습니다. 이번 단계에서는 이 부분에 대해 고려하지 말고 각각의 인수 테스트를 작성하는 것에 집중해서 진행하세요.

#### API 명세

##### 지하철역 목록

**[ HTTP request ]**
```json
GET /stations HTTP/1.1
Accept: application/json
Host: localhost:8080
```
**[ HTTP response ]**
```json
HTTP/1.1 200 OK
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
Content-Type: application/json
Content-Length: 167
[   {
    "id": 1,
    "name": "지하철역이름"
},  {
    "id": 2,
    "name": "새로운지하철역이름"
},  {
    "id": 3,
    "name": "또다른지하철역이름"
}   ]
```

##### 지하철역 삭제

**[ HTTP request ]**
```json
DELETE /stations/1 HTTP/1.1
Host: localhost:8080
```
**[ HTTP response ]**
```json
HTTP/1.1 204 No Content
Vary: Origin
Vary: Access-Control-Request-Method
Vary: Access-Control-Request-Headers
```

## 2단계 - 지하철 노선 기능

### 미션 소개
- 제시된 인수 조건을 기반으로 기능 구현을 하는 단계입니다.
- 기능 구현 전에 인수 조건을 만족하는지 검증하는 인수 테스트를 먼저 만들고 기능구현을 해보세요.

### 기능 요구사항
- 요구사항 설명에서 제공되는 인수 조건을 기반으로 지하철 노선 관리 기능을 구현하세요.
- 인수 조건을 검증하는 인수 테스트를 작성하세요.

#### 기능 목록
- 지하철 노선 생성
- 지하철 노선 목록 조회
- 지하철 노선 조회
- 지하철 노선 수정
- 지하철 노선 삭제

### 프로그래밍 요구사항
- 아래의 순서로 기능을 구현하세요.
  - 인수 조건을 검증하는 인수 테스트 작성
  - 인수 테스트를 충족하는 기능 구현
- 인수 테스트의 결과가 다른 인수 테스트에 영향을 끼치지 않도록 인수 테스트를 서로 격리 시키세요.
- 인수 테스트의 재사용성과 가독성, 그리고 빠른 테스트 의도 파악을 위해 인수 테스트를 리팩터링 하세요.

### 요구사항 설명
인수 조건

**지하철 노선 생성**
<pre>
When 지하철 노선을 생성하면
Then 지하철 노선 목록 조회 시 생성한 노선을 찾을 수 있다
</pre>

**지하철 노선 목록 조회**
<pre>
Given 2개의 지하철 노선을 생성하고
When 지하철 노선 목록을 조회하면
Then 지하철 노선 목록 조회 시 2개의 노선을 조회할 수 있다.
</pre>
**지하철 노선 조회**
<pre>
Given 지하철 노선을 생성하고
When 생성한 지하철 노선을 조회하면
Then 생성한 지하철 노선의 정보를 응답받을 수 있다.
</pre>
**지하철 노선 수정**
<pre>
Given 지하철 노선을 생성하고
When 생성한 지하철 노선을 수정하면
Then 해당 지하철 노선 정보는 수정된다
</pre>
**지하철 노선 삭제**
<pre>
Given 지하철 노선을 생성하고
When 생성한 지하철 노선을 삭제하면
Then 해당 지하철 노선 정보는 삭제된다
</pre>

### 기능 구현 목록
- [x] Line 도메인 생성
- [x] Line Repository 생성
- [ ] Line Service 생성
- [ ] Line Controller 생성
- [ ] 지하철 노선 생성 인수 테스트 작성
- [ ] 지하철 노선 생성 기능 구현
- [ ] 지하철 노선 목록 조회 인수 테스트 작성
- [ ] 지하철 노선 목록 조회 기능 구현
- [ ] 지하철 노선 조회 인수 테스트 작성
- [ ] 지하철 노선 조회 기능 구현
- [ ] 지하철 노선 수정 인수 테스트 작성
- [ ] 지하철 노선 수정 인수 테스트 작성
- [ ] 지하철 노선 삭제 인수 테스트 작성
- [ ] 지하철 노선 삭제 기능 구현
- [ ] 인수 테스트 격리
- [ ] 인수 테스트 리팩토링
