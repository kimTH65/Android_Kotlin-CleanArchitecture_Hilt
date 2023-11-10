# Android(Kotlin)-CleanArchitecture_Hilt

 - CleanArchitecture 사용<br>
 
 - LiveData, ViewModel, Observer메소드를 이용하여 실시간으로 UI변경<br>
 
 - Recyclerview, dataBinding 등등 사용<br>
 
 - DI(Dependency injection)으로 Hilt사용
 
 - <a href ="https://www.kobis.or.kr/kobisopenapi/homepg/main/main.do">영화 진흥 위원회 API</a>를 사용
<br>

 # 흐름
<div align="center">
 <img height="400" src="https://github.com/kimTH65/cs/blob/main/img/CleanArchitecture.jpg">
 <h6>출처 : https://blog.cleancoder.com/</h6>
</div>

<h4>
 위의 사진 처럼 모듈을 data, domain, presentaiton으로 구성<br>
 
</h4>

　data에서 데이터를 습득 하여 domain 전달<br><br>
　　↳　domain에서 데이터를 필요에 맞게 변형 시킨후 presentation으로 전달<br><br>
　　　　　↳　presentation에서 전달 받은 데이터로 이용하여 view를 표시 
     
<div align="center">
 <h4>  
   Hilt Module은 presentation에서 설정
 </h4>
</div>

<br>
<hr>

<h3>1. Data Module</h3>

<div>
 <h5>
  <a href="data/src/main/java/com/example/data/datasource">datasource</a> + 
  <a href="data/src/main/java/com/example/data/mapper">mapper</a> + 
  <a href="data/src/main/java/com/example/data/model">model</a>
  로 데이터를 얻고 
  <a href="data/src/main/java/com/example/data/repository/RepositoryImpl.kt">RepositoryImpl</a>
  를 통해 usecase에 전달<br><br>
  usecase에 Repository interface가 존재
 </h5>
</div>

#

<h3>2. Domain Module</h3>

<div>
 <h5>
  <a href="domain/src/main/java/com/example/domain/model">model</a> + 
  <a href="domain/src/main/java/com/example/domain/usecase">usecase</a> 
  로 데이터 변형 후 presentation에 전달<br><br>
  <a href="domain/src/main/java/com/example/domain/repository/Repository.kt">Repository Interface 존재</a> 
 </h5>
</div>

