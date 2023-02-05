# ⚾자바 숫자야구

## 숫자 야구 (02.03~02.05)

## 기능 요구사항

- 기본적으로 1부터 9까지 **서로 다른 수**로 이루어진 `3자리의 수`를 맞추는 게임이다.
- **같은 수가 같은 자리에 있으면 스트라이크, 다른 자리에 있으면 볼, 같은 수가 전혀 없으면 포볼 도는 낫싱**이란 힌트를 얻고, 그 힌트를 이용해서 먼저 상대방(컴퓨터)의 수를 맞추면 승리한다.
  - [예] 상대방(컴퓨터)의 수가 425일 때
    123을 제시한 경우: 1스트라이크.
    456을 제시한 경우: 1스트라이크 1몰
    789를 제시한 경우: 낫싱
- 위 숫자 야구 게임에서 상대방의 역할을 컴퓨터가 한다. **컴퓨터는 **1에서 9까지 서로 다른 임의의 수 3개\*\*를 선택한다.
- 게임 플레이어는 컴퓨터가 생각하고 있는 **3개의 숫자를 입력**하고, 컴퓨터는 **입력한 숫자에 대한 결과를 출력**한다.
- 이 같은 과정을 반복해 컴퓨터가 선택한 **3개의 숫자를 모두 맞히면 게임이 종료**된다.

## 프로그램 실행 결과

![1.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/149f1b5c-7a00-41c1-839e-7e53944f3437/1.png)

![2.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4b3d1d40-6e03-4740-b200-a2b049eb4b0c/2.png)

## 프로그래밍 요구 사항

- **어떠한 입력에 대해서도** 프로그램이 잘 동작해야 합니다.
- 새로운 Git Repository를 생성하여 진행합니다.
  - Repository 주소: **[Java_Number_BaseBall](https://github.com/kwb020312/Java_Number_BaseBall)**
- **최소한의 기능 단위**로 commit합니다.
- **가독성**있게 로직을 작성합니다.

## 개발 노트

- [x] 사용자 입력 유효성 검사
      숫자외에 타입이 입력되었는가?
      중복된 수가 입력되었는가?
      3자리 이상의 수인가?
      3자리 미만의 수인가?
- [x] 스트라이크, 볼 검사
      `공통된 수의 개수` - `스트라이크 개수` = `볼 개수`

## 작업 결과

- 숫자만 입력 가능
  ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1f43eb14-81f9-4d10-93b0-dbd01f94bbfd/Untitled.png)
- 중복된 수 입력 방지
  ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ceabbd07-ac39-4a6d-90db-8db7c0d01fa0/Untitled.png)
- 3개 이상의 수 입력 방지
  ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6dd667cd-083b-4e51-b0e9-2c9059a3a157/Untitled.png)
- 3개 미만의 수 입력 방지

  ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9a7271cb-5a1b-4550-a74d-6f94480a388d/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/2582e3f4-491f-4bba-9b97-395ca97a5a03/Untitled.png)
