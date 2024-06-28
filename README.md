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
3. Send the request and observe the response , adding screenshot of final response.
