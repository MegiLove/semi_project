# semi_project: Weather closet
### 주제선정이유
- 날씨 데이터를 기반으로 사용자에게 그날의 온도에 맞게 옷차림을 추천해주는 사이트를 만들고자 한다
- 옷차림 밖에도 기본적인 그날의 기온, 강수량, 자외선 지수 등을 나타내준다  
--------------------
### 차별화 전략
- 타 사이트에서는 기온에 따른 옷차림만 추천해주었으나 자외선이나 바람을 분석하여 더욱더 세세한 옷차림을 추천  
ex)여름에 기온이 높다고 무조건 반팔을 추천하지 않고 자외선 지수가 5이상이거나, 풍속이 9m/s이상일 경우 긴팔도 추천해준다  
--------------------
### 서비스를 이용할 주요고객 선정 및 특성 분석
- 주 고객은 20-30대이다  
보통 20-30대가 날씨를 확인하는 경우, 평소 외출 전날, 직전, 여행을 갈 때라고 생각하여  
현재 기온과 옷차림에 관한 것은 빠르고 간결하게 보여준다
--------------------
### ERD-logical
![image](https://user-images.githubusercontent.com/91641650/156003906-7677de30-e6ff-4078-b1ec-d77bdcd5ab66.png)
### ERD-physical
![image](https://user-images.githubusercontent.com/91641650/156003968-b255f434-18d8-49c4-b877-9bd4ae341e9e.png)
### 기상청 오픈 API활용방법 소개
![image](https://user-images.githubusercontent.com/91641650/155985563-948cc6f2-37d6-4408-8ec4-daa179fead13.png)
#### 기상청의 단기예보 조회서비스 오픈 API의 지역별 지점코드를 활용하여 이 코드들을 insert문에 넣어 데이터베이스에 삽입했다  
![image](https://user-images.githubusercontent.com/91641650/155986612-5937d776-ec2d-4e20-821c-76a6070a80f1.png)  
#### 응답 메세지에서 이러한 단기예보 정보들을 얻을 수 있다  
### 맡은 기능
- 카카오 api를 이용한 회원가입 기능
- Help 문의사항 게시판 기능

### 카카오 api를 이용한 회원가입 기능
![image](https://user-images.githubusercontent.com/91641650/156004451-c9a75549-2e2b-46de-ba67-030bc1d89a7a.png)
#### 카카오 api를 이용한 회원가입 기능을 구현하였다  
![image](https://user-images.githubusercontent.com/91641650/155984510-b6ef9205-8e33-4db6-b495-dfdcba8cbdb3.png)
#### 버튼을 누르면 카카오 로그인 창과 정보 동의에 관련된 창이 뜬다  
![image](https://user-images.githubusercontent.com/91641650/156004557-50d0208a-17be-49af-a568-13edf9477240.png)
#### 완료하고 나면 사용자의 성별과 이메일이 자동으로 회원가입창에 기입이 된다  

### Help 문의사항 게시판 기능
### 문의목록  
#### 제목을 누르면 문의내용 페이지로 이동한다. 또한 이동할 때마다 조회수가 1씩 늘어나게 하였다.  
![image](https://user-images.githubusercontent.com/91641650/156004242-aaa5e31f-6b78-4c16-9bf8-b55718d7f986.png)
### 문의내용  
![image](https://user-images.githubusercontent.com/91641650/156004312-416926b5-a38c-4fef-853c-9d88c7c1ade1.png)
### 문의등록  
#### 제목과 문의내용을 적지 않으면 등록할 수 없게 하였다. 또한 로그인한 아이디를 자동으로 불러오게 하였다.  
![image](https://user-images.githubusercontent.com/91641650/156004363-a7ed10da-2a63-48aa-8317-36f5df8b1345.png)


