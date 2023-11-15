# Android(Kotlin)-CleanArchitecture_Hilt 
  
<div align="right">
  <h5>
    Language : 
    <a href="README.md">한국어</a> 
      ,
    <a href="US.md">English</a> 
  </h5>
</div>
 
 - <a href ="https://github.com/kimTH65/Android_Kotlin-MVVM_Hilt">Android_Kotlin-MVVM_Hilt</a>プロジェクトと同じ機能

 - CleanArchitecture 使用<br>
 
 - Live Data、View Model、Observer Methodを利用してリアルタイムでUI変更<br>
 
 - Recyclerview, dataBinding など使用<br>
 
 - DI(Dependency injection)で Hilt使用
 
 - <a href ="https://www.kobis.or.kr/kobisopenapi/homepg/main/main.do">韓国の映画振興委員会API</a>を使用
<br>

 # 흐름
<div align="center">
 <img height="400" src="https://github.com/kimTH65/cs/blob/main/img/CleanArchitecture.jpg">
 <h6>출처 : https://blog.cleancoder.com/</h6>
</div>

<h4>
 上の写真のようにMoudleをdata, domain, presentaitonで構成<br>
 
</h4>

　dataでデータを取得してdomainに伝達<br><br>
　　↳　domainでデータを必要に応じて変形させた後、presentationに伝達<br><br>
　　　　　↳　presentationで配信されたデータとして利用してviewを表示
     
<div align="center">
 <h4>  
   <a href="presentation/src/main/java/com/example/memo/di">Hilt Module</a>はpresentationで設定
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
  でデータを取得
  <a href="data/src/main/java/com/example/data/repository/RepositoryImpl.kt">RepositoryImpl</a>
　を通してusecaseに伝達<br><br>
  DomainにRepository interfaceが存在
 </h5>
</div>

#

<h3>2. Domain Module</h3>

<div>
 <h5>
  <a href="domain/src/main/java/com/example/domain/model">model</a> + 
  <a href="domain/src/main/java/com/example/domain/usecase">usecase</a> 
  でデータ変形後、presentationに配信<br><br>
  <a href="domain/src/main/java/com/example/domain/repository/Repository.kt">Repository Interface</a>が存在
 </h5>
</div>


#

<h3>3. Presentation Module</h3>

<div>
 <h5>
  <a href="presentation/src/main/java/com/example/memo/viewmodel/MainViewModel.kt">ViewModel</a>
  でusecaseを利用して
  <a href="presentation/src/main/java/com/example/memo/ui">View</a>にデータ連携<br><br>
 </h5>
</div>

