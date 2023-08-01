# 06/23 수업

# 공간

    Block 레벨 요소
        - 줄개행 O
        - 공간을 지정할 수 있다. / 너비, 높이를 지정할 수 있다.
        - 외부여백(margin): 모든 방향에 설정 가능, 내부 여백도 O
        예) div, p, table, form, ...

    Inline 레벨 요소
        - 줄개행 X
        - 공간 지정 X, 너비, 높이 설정X
        - 외부 여백(margin): 좌우 여백만 설정 가능, 내부 여백은 모두 가능
        예) span, a, i, ...

    display
        - Inline: 기본값
        - block: 블록형태 - 블록 형태가 아닌 선택자 -> Block 속성으로 변경
        - Inline-block: Inline + Block 둘의 속성을 모두 가지고 있는 요소 속성 변경 가능
        - none: 감춤처리 // 영역도 없어짐.
            visibility: visible; 보임
            visibility: hidden; 안보임 처리 // none과 달리 영역은 차지하면서 안보임 처리

        - flex

- 여백
    외부 여백(margin)
        margin: 50px; - 상하좌우 전부 50px
        margin: 20px 50px - 상하 20px, 좌우 50px
        margin: 20px 30px 40px - 상 20px, 하 40px, 좌우 30px
        margin: 20px 30px 40px 50px - 상 20px, 우 30px, 하 40px, 좌 50px
                -> 방향은 상단 기준으로 시계방향!

        margin-left: 왼쪽 여백
        margin-right: 오른쪽 여백
        margin-top: 위쪽 여백
        margin-bottom: 아래쪽 여백


    내부 여백(padding)
        padding: 50px; - 상하좌우 전부 50px
        padding: 20px 50px - 상하 20px, 좌우 50px
        padding: 20px 30px 40px - 상 20px, 하 40px, 좌우 30px
        padding: 20px 30px 40px 50px - 상 20px, 우 30px, 하 40px, 좌 50px
                -> 방향은 상단 기준으로 시계방향!

        padding-left: 왼쪽 내부 여백
        padding-right: 오른쪽 내부 여백
        padding-top: 위쪽 내부 여백
        padding-bottom: 아래쪽 내부 여백

    경계선
        border-width: 선의 두께
        border-style: 선의 스타일
            solid - 직선
            dotted - 점선
            dashed - 점선

        border-color: 선의 색상

        - 단축 표기법
        border: 두께 스타일 색상;

        border-left: 왼쪽 경계선
        border-right: 오른쪽 경계선
        border-top: 상단 경계선
        border-bottom: 하단 경계선


        border-radius: 경계선을 둥글게
                        px 또는 %
                        50% 이상이면 원이된다!

        
# 레이아웃

    box-sizing:
            - content-box: 기본값: 너비, 높이 기준: 컨텐츠 내용
            - border-box: 너비, 높이, 기준: 경계선 기준
                // border-box를 가장 많이 사용한다.
                // Why? 정확한 사이즈를 맞추기 위함.


    position: 배치
        - static: 정적 위치 배치 (기본값)

        - 상대 위치 배치
            relative: 현재 요소의 위치(우측 상단)
            absolute: 문서 우측 상단, 상위 요소에 상대 배치 속성(relative, absolute, fixed)이 있으면, 기준이 상위 요소
            fixed: 현재 보이는 화면 기준

                top: 양수: 위 -> 아래, 음수: 아래 -> 위
                botton: 양수: 아래 -> 위, 음수: 아래 -> 아래
                left: 양수: 좌 -> 우, 음수 좌 -> 좌
                right: 양수 우 -> 우, 음수 좌 -> 우

            z-index: 층위 - 숫자가 높을 수록 위쪽에 배치

    float:
        left - 좌측 배치
        right - 우측 배치

    - clear 속성: float 적용 속성 제거
        - clear: left;
        - clear: right;
        - clear: both;

    media query
    @media all and (max-width: 720px){ // 화면 720px 이하까지 적용되는 CSS

    }

    @media all and (min-width: 720px){ // 화면 720px 이상부터 적용되는 CSS

    }

# 그래픽
    background - 배경색, 배경 이미지
        - background-color: 색상 -  1) 색상명
                                    2) rgb(),rgba()
                                    3) hex code# .. .. ..
        - background-image: url("이미지 경로");
        - background-repeat:    repeat-x; - 좌 -> 우 (반복 출력)
                                repeat-y; - 우 -> 좌 (반복 출력)
                                no-repeat; - 반복X 이미지 1개만 출력

        - background-position: 20px 100px; 
                    ex) 좌 -> 우 20px 이동, 위 -> 아래 100px 이동
                    
                    left | center | right,   top | center | bottom
                    좌측 |  중앙  | 우측     상단 | 중앙   | 하단

        - 단축 표기법
        background: [색상] 이미지(url) 반복 위치

# overflow

    - 컨텐츠의 내용이 영역 크기보다 클 경우
        - visible: 기본 값: 넘치더라도 노출!
        - hidden: 넘치는 영역 감추기
        - scroll: 스크롤바 노출
        - auto: 스크롤바 자동 노출

    참고)
        글자가 넘칠 때 말 줄임표(...)
        text-overflow: ellipsis;
        - overflow: hidden 함께 쓰이고
        - white-spacing: wrap - 글자가 끝에 도달하면 다음 줄 개행
                         nowrap - 줄개행 X 

# transition

    - 전환효과 (CSS가 적용 되기 전 지연시간 - 애니메이션 효과)
    - transition-duration: 전환 효과 진행 시간
    - transition-property: 전환 효과 적용 속성
    - transition-timing-function: 애니메이션 효과(linear, ease, ease-in, ease-out, ease-in-out)
    - transition-delay: 전환효과 지연시간

    - 단축 표기법
    transition: 속성 지연시간 애니메이션효과 전환발생 대기시간
