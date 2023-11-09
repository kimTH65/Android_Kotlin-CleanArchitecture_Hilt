# Android(Kotlin)-CleanArchitecture_Hilt

 - CleanArchitecture 사용<br>
 
 - LiveData, ViewModel, Observer메소드를 이용하여 실시간으로 UI변경<br>
 
 - Recyclerview, dataBinding 등등 사용<br>
 
 - DI(Dependency injection)으로 Hilt사용
 
 - <a href ="https://www.kobis.or.kr/kobisopenapi/homepg/main/main.do">영화 진흥 위원회 API</a>를 사용
 # 흐름
<div align="center">
 <img height="400" src="https://github.com/kimTH65/cs/blob/main/img/CleanArchitecture.jpg">
 <h6>출처 : https://blog.cleancoder.com/</h6>
 </div>
 - Dagger를 기반으로 만든 Dependency Injection 라이브러리<br>
 
 - 모든 Android 클래스에 컨테이너를 제공하고 수명 주기를 자동으로 관리함<br>
 
 - @HiltAndroidApp : 해당 애플리케이션에 Hilt 코드를 자동으로 생성할 수 있게함

 - @AndroidEntryPoint : Hilt로 의존성 주입을 사용할 컨테이너(컴포넌트)를 만듬 

 - @Inject : public 접근자의 경우 Inject 어노테이션으로 의존성 주입 가능

 - @Module : private 접근자의 경우 Module,IntallIn로 의존성 주입

 - @IntallIn : 어느 안드로이드 클래스(activity, fragemnt etc)를 사용할건지 설정

 - @Binds : abstract class(추상 클래스)에서 사용, 리턴값(구현체)를 하나만 가질 수 있음, static이 아님

 - @Provides : object에서 사용, 여러 파라미터를 가질 수 있음, 사용 시 매번 의존성 호출

<br>
<hr>

<h3>1. Manifest</h3>
