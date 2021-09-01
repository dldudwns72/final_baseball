## 숫자 야구게임 요구사항

- [ ] 공 (Ball)                 
  - [ ] 공은 1이상 9이하여야 한다. (rangeValidation)
    

- [ ] 공 위치 (Position)
  - [ ] 공의 위치 범위는 0이상 2이하 이다. (rangeValidation)
    

- [ ] 세개의 공 (Balls)
  - [ ] 세개의 공은 서로 중복될 수 없다. (duplicatedValidation)
  

- [ ] 판별 (Judge)
  - [ ] 스트라이크 (isStrike)
    - [ ] 같은 수가 같은 자리에 있는 경우 스트라이크 
  - [ ] 볼 (isBall)
      - [ ] 같은 수가 다른 자리에 있는 경우 볼
  - [ ] 낫싱 (isNothing)
      - [ ] 다른 수가 다른 자리에도 없는 경우 낫싱
        