## 숫자 야구게임 요구사항

- [X] 공 (Ball)                 
  - [X] 공은 위치와 숫자를 가지고 있다.
  - [X] 공은 1이상 9이하여야 한다. (rangeBallValidation)
  - [X] 공 위치 (Position)
    - [X] 공의 위치 범위는 0이상 2이하여야 한다. (rangePositionValidation)


- [ ] 세개의 공 (Balls)
  - [ ] 세개의 공은 서로 중복될 수 없다. (duplicatedValidation)
  

- [ ] 판별 (Judge)
  - [ ] 스트라이크 (isStrike)
    - [ ] 같은 수가 같은 자리에 있는 경우 스트라이크 
  - [ ] 볼 (isBall)
      - [ ] 같은 수가 다른 자리에 있는 경우 볼
  - [ ] 낫싱 (isNothing)
      - [ ] 다른 수가 다른 자리에도 없는 경우 낫싱
        