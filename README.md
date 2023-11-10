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
 위의 사진 처럼 모듈을 data, domain, presentaiton으로 구성<br><br>
 Hilt Module은 presentation에서 설정<br>
</h4>

　data에서 데이터를 습득 하여 usecase 전달<br><br>
　　↳　usecase에서 데이터를 필요에 맞게 변형 시킨후 presentation으로 전달<br><br>
　　　　　↳　presentation에서 전달 받은 데이터로 이용하여 view를 표시 
 
<br>
<hr>

<h3>1. Data Module</h3>

<div align="center">
 <h6>
  <a href="app/src/main/AndroidManifest.xml">
   app/src/main/AndroidManifest.xml
  </a>
 </h6>
</div>

```
```
