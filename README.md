# 지하철 노선도 미션

[ATDD 강의](https://edu.nextstep.camp/c/R89PYi5H) 실습을 위한 지하철 노선도 애플리케이션입니다.
<br/>

## 🚀 0단계: 리뷰 사이클 연습

[Pull Request](https://github.com/next-step/atdd-subway-map/pull/789)

- 리뷰 사이클을 연습하기 위한 미션
- "https://google.com"로 요청을 보낼 경우 200 응답 코드가 오는지를 검증하는 테스트 작성
<br/>

## 🚀 1단계: 지하철역 인수 테스트 작성

[Pull Request](https://github.com/next-step/atdd-subway-map/pull/812) | [Feature Branch](https://github.com/dev-yoonjung/atdd-subway-map/tree/feat/subway-acceptance-test)

- 구현된 기능을 대상으로 인수 테스트를 작성하는 단계
- RestAssured를 활용하여 인수 테스트 작성
<br/>

## 🚀 2단계: 지하철 노선 관리

[Pull Request](https://github.com/next-step/atdd-subway-map/pull/918) | [Feature Branch](https://github.com/dev-yoonjung/atdd-subway-map/tree/feat/line-acceptance-test)

- 제시된 인수 조건을 기반으로 기능 구현을 하는 단계
- 기능 구현 전에 인수 조건을 만족하는지 검증하는 인수 테스트를 먼저 작성 후 기능 구현
<br/>

## 🚀 3단계: 지하철 구간 관리

[Pull Request](https://github.com/next-step/atdd-subway-map/pull/933) | [Feature Branch](https://github.com/dev-yoonjung/atdd-subway-map/tree/feat/line-section-acceptance-test)

- 요구사항 설명에서 제공되는 요구사항을 기반으로 지하철 구간 관리 기능 구현
- 요구사항을 정의한 인수 조건 도출
- 인수 조건을 검증하는 인수 테스트 작성
- 예외 케이스에 대한 검증
