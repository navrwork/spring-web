# HelloEmployee REST API

## REST API
* REST is an acronym for REpresentational State Transfer and an architectural style for distributed hypermedia systems.
* Reference:
  * https://restfulapi.net/
  * <a href="https://spring.io/guides/tutorials/rest">Building REST services with Spring | spring.io</a>
  * <a href="https://www.baeldung.com/rest-with-spring-series">REST with Spring Tutorial | baeldung.com</a>


## Model Mapper
* The goal of ModelMapper is to make object mapping easy, by automatically determining how one object model maps to another, based on conventions, in the same way that a human would - while providing a simple, refactoring-safe API for handling specific use cases.
<br/>
* Reference:
  * <a href="https://modelmapper.org/getting-started/">Getting Started | modelmapper.org</a>
  * <a href="https://modelmapper.org/examples/projection/#example-1">Examples | modelmapper.org</a>
  * <a href="https://www.baeldung.com/entity-to-and-from-dto-for-a-java-spring-application">Entity To DTO Conversion | baeldung.com</a>

## HelloEmployee app -- Sample Request and Response
<pre>
// GetAllEmployees -- Request
curl --location 'http://localhost:8080/employeeapp/api/employees' \
--header 'Accept: application/json' \
--data ''


// GetAllEmployees -- Response
[
    {
        "id": 100,
        "firstName": "aaa",
        "lastName": "AAA",
        "dateOfJoining": "2010-01-01",
        "street": "100, Pantheon road, Egmore",
        "city": "Chennai"
    },
    {
        "id": 200,
        "firstName": "nnn",
        "lastName": "NNN",
        "dateOfJoining": "2020-02-02",
        "street": "200, Race course road, Guindy",
        "city": "Chennai"
    }
]
</pre>

<pre>
// GetEmployee -- Request
curl --location 'http://localhost:8080/employeeapp/api/employees/100' \
--header 'Accept: application/json'

// GetEmployee -- Response
{
    "id": 100,
    "firstName": "aaa",
    "lastName": "AAA",
    "dateOfJoining": "2010-01-01",
    "street": "100, Pantheon road, Egmore",
    "city": "Chennai"
}
</pre>

<pre>
// AddEmployee -- Request
curl --location 'http://localhost:8080/employeeapp/api/employees' \
--header 'Accept: application/json' \
--header 'Content-Type: application/json' \
--data '{
    "id": 101,
    "firstName": "bbb",
    "lastName": "BBB",
    "dateOfJoining": "2022-02-02",
    "street": "101, Dalal Street",
    "city": "Mumbai"
}'

// AddEmployee -- Response
{
    "message": "Employee successfully added!",
    "success": true
}
</pre>