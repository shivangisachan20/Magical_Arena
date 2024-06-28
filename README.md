# Magical_Arena
Design a Magical Arena. Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. The player dies if his health attribute touches 0

## Running the Application

1. Start the Spring Boot application:
    ```sh
    mvn spring-boot:run
    ```

2. The application will start on port 8080 by default. You can access the endpoint at `http://localhost:8080/arena/start`.

## Testing the Application

You can use tools like Postman or curl to test the application.

### Using Postman
1. Create a new POST request to `http://localhost:8080/arena/start`.
2. Set the request body to JSON with the following content:
    ```json
    {
        "player1": {
            "health": 50,
            "strength": 5,
            "attack": 10
        },
        "player2": {
            "health": 100,
            "strength": 10,
            "attack": 5
        }
    }
    ```
3. Send the request and observe the response, adding screenshot of final response.
<img width="976" alt="Response" src="https://github.com/shivangisachan20/Magical_Arena/assets/76780454/92182fa5-4b3a-4a35-8ef7-7e955b7b69ed">
<img width="758" alt="Response_2" src="https://github.com/shivangisachan20/Magical_Arena/assets/76780454/bda1a110-424f-4b77-92b4-5aace9580d8b">
