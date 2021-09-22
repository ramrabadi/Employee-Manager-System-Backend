# Back-end for Employee Manager System

This repository hosts the back-end for the Employee Manager System application.
It is built with Spring Boot and MySQL using Spring Data JPA. 

This application creates a REST API which uses HTTP requests 
to access, add, update, or delete an employee. 

The front-end consumes this API and provides these same functions through the corresponding web application.
You can visit the repository for the front-end [here](https://github.com/ramrabadi/Employee-Manager-System-Frontend).


## API Design

![Screenshot](https://i.imgur.com/k9ugE6x.png)

  
## API Reference

#### URL

localhost:4200

#### List all employees

```http
  GET /employee/all
```

#### Find an employee by id

```http
  GET /employee/find/{id}
```
#### Add an employee

```http
  POST /employee/add
```

#### Update an employee's information

```http
  PUT /employee/add/update
```
#### Delete an employee by id

```http
  DELETE /employee/delete/{id}
```
## Run Locally

Clone the project

```bash
  git clone https://github.com/ramrabadi/Employee-Manager-System-Backend
```

Open the project in a Java IDE, such as IntelliJ IDEA


Build and run the project.

  
