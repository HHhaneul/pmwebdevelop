# 스프링 DI 설정 및 사용
1. 스프링을 이용한 객체 조립과 사용
### DI 방식 1 : 생성자 방식
### DI 방식 2 : 세터 메서드 방식

2. @Configuration 
	## 스프링 컨터이너가 관리할 객체에 대한 설정 클래스임을 알려주는 애노테이션
	
3. @Bean
	## 스프링 컨테이너에서 관리할 객체임을 알려주는 애노테이션
	
4. 두개 이상의 설정 파일 사용하기
	## 스프링 컨테이너 생성자 매개변수 
	### 가변적인 매개변수 -> 설정클래스 클래스를 콤마(,)로 구분해서 여러 설정 
	### AppCtx2.class,AppCtx3.class ...
		
	## @Import
	@Import(....)
	
	
	### 참고
	#### 인텔리J -> 소스 보기(CTRL + 마우스 왼쪽 키)
5. 의존 자동 주입
	## @Autowired 
		- 멤버 변수
		- setter 메서드의 매개변수
		- Optional 클래스로 정의된 멤버 변수 
			
		- 기본 생성자가 없는 경우, 생성자 매개변수로 정의(@Autowired를 사용 X, 컴포넌트 자동 스캔 O)
		
		
	### 참고
		class Optional<T> {
			... 
			private final T value;
			...
			}
	## 일치하는 빈이 없는 경우

	## @Qualifier
	### 빈이 중복 될 경우, 자동 주입될 빈을 명시
	
6. 빈 이름과 기본 한정자

7. @Autowired 애노테이션의 필수 여부
	- 의존성을 주입할 객체가 스프링 컨테이너에 존재 X -> 오류
		(requried : true가 기본 설정)
	
	- 의존이 없어서 되는 경우 
		### required = false : 의존성이 없으면 setter 메서드를 호출 X
		### @Nullable : 의존성이 없을 수도 있는 매개변수에 추가 
		#### 의존성이 없으면 setter 메서드 호출, 매개변수에 null을 대입 
		
8. 컴포넌트 스캔
## @Component

## @ComponentScan 
### 설정 클래스에 추가 
### basePackages=스캔할 패키지
#### 패키지를 포함한 하위 패키지가 스캔 범위 설정 
			
## 기본스캔 대상 

	@Component
	@Service
	
### 역할이 정해져 있는 애노테이션
- @Configuration
- @Controller 
- @RestController
- @Aspect
- @Repository
- @ControllerAdvice 
- @RestCntrollerAdvice 
	
## 컴포넌트 스캔에 따른 충돌 처리	
- excludeFilters 
	AspectJ 
	## aspectjweaver 
	## ANT 패턴
	
## 빈 이름 충돌
- 클래스명이 빈의 이름(첫 단어만 소문자)
### 예) MemberDao -> memberDao
		
## 수동 등록한 빈과 충돌
- 수동 등록한 빈이 우선한다.
	

### 참고)
의존성 자동 주입 
@Autowired
#### 멤버 변수
#### setter 메서드 -> 의존하고 있는 객체를 매개변수로 넣어서 호출
#### Optional 형태의 멤버 변수, setter 메서드의 매개변수
#### @Autowired를 사용하지 않고 의존성 주입하는 방법
- 생성자 매개변수에 의존 객체를 지정 -> 자동 주입 
- (기본생성자가 X)
- lombok : getter, setter, toString ...
	@Getter 
	@Setter
	@ToString
#### getter() 호출 해서 출력 
#### Exclude : 제외 
#### Include : 포함
	@EqualsAndHashCode
		
	@Data - @Getter, @Setter, @ToString, @EqualsAndHashCode
		
	@NoArgsConstructor : 기본 생성자
	@AllArgsConstructor : 멤버 변수 초기화 생성자
	@RequiredArgsConstructor : 초기화가 반드시 필요한 멤버 변수를 초기화하는 생성자 
#### 예) 상수 형태의 멤버 변수 
##### final 
##### @NonNull이 있는 멤버 변수
		
	@Builder
			
		
### 참고) Builder 패턴 
#### 객체 직접 생성 하지 않고 Builder라는 별도 클래스에서 생성 로직  : 기본 생성자 private
#### 멤버 변수의 값의 지정 ->  Builder
####  Builder 클래스에 멤버 변수 명칭과 동일한 setter 형태의 메서드 -> 메서드 체이닝 방식(return this)
			
9. 빈 라이프 사이클과 범위

## 객체 생성 -> 의존 설정 -> 초기화 -> 소멸

### InitializingBean 인터페이스 
#### afterPropertiesSet 메서드 : 초기화 단계에서 호출되 실행 
##### 객체 생성 이후 의존성 해결 이후 초기 작업 
			
### DisposableBean 인터페이스
#### destroy 메서드 : 객체 소멸전에 호출 
##### 주요 작업 : 자원의 해제

## 빈 객체의 초기화와 소멸 : 커스텀 메서드
### 외부 라이브러리 클래스 -> InitializingBean, DisposableBean 정의 X
### DB 관련 라이브러리 -> 자원 해제 필요 
	
## @Bean 
### initMethod : InitializingBean 역할 동일
### destroyMethod : DisposableBean 역할 동일 
		
10. 빈 객체의 생성과 관리 범위
- @Scope 

	- 싱글톤 객체 
		singleton
	- 여러 객체 
		prototype