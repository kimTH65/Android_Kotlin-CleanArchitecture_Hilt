# Android(Kotlin)-CleanArchitecture_Hilt 
  
<div align="right">
  <h5>
    Language : 
    <a href="README.md">한국어</a> 
      ,
    <a href="JP.md">日本語</a> 
  </h5>
</div>
 
 - <a href ="https://github.com/kimTH65/Android_Kotlin-MVVM_Hilt">Android_Kotlin-MVVM_Hilt</a> is same as This Project

 - Using CleanArchitecture<br>
 
 - Update UI in real time using Room(Local Database), LiveData, ViewModel, Observer Method<br>
 
 - Using Recyclerview, dataBinding ...<br>
 
 - Using Hilt for DI(Dependency injection)
 
 - Using <a href ="https://www.kobis.or.kr/kobisopenapi/homepg/main/main.do">Korean Film Council API</a>
<br>

 # Flow
<div align="center">
 <img height="400" src="https://github.com/kimTH65/cs/blob/main/img/CleanArchitecture.jpg">
 <h6>Source : https://blog.cleancoder.com/</h6>
</div>

<h4>
 Configure modules as data, domain, presentaiton as shown in the picture above<br>
 
</h4>

　Acquire data from data module and deliver domain module<br><br>
　　↳　Transform the data in the domain module to fit your needs and deliver it to presentation module<br><br>
　　　　　↳　data passed from presentation module is used in View 
     
<div align="center">
 <h4>  
   <a href="presentation/src/main/java/com/example/memo/di">Hilt Module</a> is set in presentation
 </h4>
</div>

<br>
<hr>

<h3>1. Data Module</h3>

<div>
 <h5>
  Get the data with
  <a href="data/src/main/java/com/example/data/datasource">datasource</a> + 
  <a href="data/src/main/java/com/example/data/mapper">mapper</a> + 
  <a href="data/src/main/java/com/example/data/model">model</a>
  And Forward to usecase via 
  <a href="data/src/main/java/com/example/data/repository/RepositoryImpl.kt">RepositoryImpl</a>
  exists in Domain<br><br>
 </h5>
</div>

#

<h3>2. Domain Module</h3>

<div>
 <h5>
  Transforming data with 
  <a href="domain/src/main/java/com/example/domain/model">model</a> + 
  <a href="domain/src/main/java/com/example/domain/usecase">usecase</a> 
  and forwarding to presentation<br><br>
  <a href="domain/src/main/java/com/example/domain/repository/Repository.kt">Repository Interface</a>
  exists in Domain<br><br>
 </h5>
</div>


#

<h3>3. Presentation Module</h3>

<div>
 <h5>
  Transfer data from <a href="presentation/src/main/java/com/example/memo/viewmodel/MainViewModel.kt">ViewModel</a>
  to <a href="presentation/src/main/java/com/example/memo/ui">View</a> using usecase
  
  
  
 </h5>
</div>

