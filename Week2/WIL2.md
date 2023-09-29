# WIL 2

## 1. HTTP

### HTTP 정의

- HTTP = HyperText Transfer Protocol  
  우리가 보는 웹 페이지는 모두 HyperText 문서이다.  
  (HTML 자체가 HyperTextMarkupLanguage 이므로..)

- HTTP는 이 HTML 문서가 사용되는, **웹 영역**에서 사용하는 프로토콜이다.  
  기본적으로는 HTML 데이터를 서버로부터 받을 때, 서버와 클라이언트 사이 통신 규약이다.

- HTTP는 Application 계층의 프로토콜이다.

### HTTP 특징

- Transfer Layer  
  TCP/IP 기반으로 서버와 클라이언트간 요청과 응답을 전송한다.
- 비연결성  
  클라이언트 요청에 서버가 응답을 마치면, 연결을 끊는다. (연결을 유지하지 않는다.)
- 무상태성  
  비연결성으로 인해 서버는 클라이언트를 식별할 수 없다.  
  (어떤 두 요청에 대해, 그 두 요청이 같은 클라이언트에서 왔는지 아닌지 알 수 없다. 즉, 클라이언트를 식별할 수 없다.)

### HTTP 연결 과정

1. 서버는 TCP 연결을 기다리고 (waiting), 클라이언트로부터 연결이 오면 이를 받아들인 후(Accept) 클라이언트에게 받아들였음을 알려준다. (Notifying)
2. 클라이언트가 서버에 접속해 TCP 연결을 시작한다.
3. 연결이 되었음을 서버와 클라이언트 모두 확인한 후, 클라이언트는 서버가 가지고 있는 자원에 대해 `Request Message`를 보낸다.
4. 서버는 `Request Message` 로 부터 정해진 `Response Message`를 보낸다.
5. 서버는 TCP 연결을 닫는다.
6. 클라이언트는 `Response Message` 로부터 HTML 데이터를 파싱하여 띄워준다. (브라우저의 역할)

### HTTP Message

HTTP Message 는 HTTP를 통해 주고받는 실제 데이터이다.  
HTTP Message 는 Method, Path, Protocol Version, Header 등으로 이루어져있다.

- HTTP Method  
  클라이언트가 서버에 요청을 보낼 때, 요청의 목적을 알리는 수단으로 사용된다.  
  아래와 같은 종류가 있다.
  - **GET**  
    리소스 조회
  - **POST**  
    리소스 등록 (요청 데이터 처리)
  - **PUT**  
    리소스를 대체, 없으면 생성
  - **DELETE**  
    리소스 삭제
  - **PATCH**  
    리소스 부분 수정
  - OPTIONS  
    리소스에 대한 통신 가능 옵션 설명
  - TRACE  
    리소스 경로를 따라 메세지 루프백 실행
  - CONNECT  
    서버에 대한 터널 설정
  - HEAD  
    헤더만 반환
- HTTP 상태 코드  
  요청에 대한 응답의 상태를 나타내는 코드이다.
  - 1xx (informational)  
    요청이 수신되어 처리중
  - 2xx (Successful)  
    요청 정상 처리  
    `Ex) 200 (정상 수행), 201(리소스 생성 요청 정상 처리), 204(리소스 삭제 요청 정상 처리)`
  - 3xx (Redirection)  
    요청 완료를 위한 추가 처리 필요
  - 4xx (Client Error)  
    클라이언트 오류, 클라이언트에서 잘못된 요청을 보냄  
     `Ex) 400 (부적절한 요청), 401(인증되지 않은 요청), 403(인증과 관계없이 접근 불가), 404(없는 리소스 요청)`
  - 5xx (Server Error)  
    서버 오류, 서버가 처리를 하지 못함.  
    `Ex) 500 (서버 오류), 502 (게이트웨이 오류)`

## 2. HTTP vs HTTPS

HTTPS = HyperText Transfer Protocol Secure  
기존 HTTP 프로토콜로 주고받는 데이터를 암호화 하여 주고받는 프로토콜이다.  
암호화에는 SSL 이나 TLS 프로토콜을 이용해 암호화한다.

## 3. Resuful API 설계

- 이벤트 목록 조회  
  `GET /events`
- 이벤트 조회  
  `GET /events/{event_id}`
- 이벤트 등록  
  `POST /events/{event_id}`
- 이벤트 수정  
  `PUT /events/{event_id}`
- 이벤트 삭제  
  `DELETE /events/{event_id}`
- 이벤트 상태 변경  
  `PATCH /events/{event_id}`
- 특정 이벤트의 주문 목록 조회  
  `GET /events/{event_id}/orders`
- 멤버 목록 조회  
  `GET /members`
- 특정 멤버 권한 변경  
  `PUT /members/{member_id}/auth`
- 특정 멤버 정보 조회  
  `GET /members/{member_id}/info`
- 특정 멤버 정보 변경  
  `PUT /members/{member_id}/info`
- 멤버 등록  
  `POST /members/{member_id}`
