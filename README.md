Database Schema:

![Image](https://github.com/user-attachments/assets/055e9eaa-0af0-4bc1-a933-696545db47f8)

Relations:
- Products has one-to-many relationship with Transactions
- Customers has one-to-many relationship with Transactions


**Notes:**    
Before execute the code, setup the .env file first by defining value from .env.example into .env file <br><br>

To do maven installation, running this command **mvn clean install** <br>
To run the project, running this command **mvn spring-boot:run** <br><br>

**Created Endpoint**  
GET v1/api/transactions
