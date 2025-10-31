# Common Library CQRS

A Java-based implementation of the CQRS (Command Query Responsibility Segregation) pattern, providing a clean and scalable architecture for building enterprise applications.

## Features

- **Command Pattern** for write operations
- **Query Pattern** for read operations
- **Event Sourcing** support
- **Modular Design** for easy extension
- **Clean Architecture** principles

## Project Structure

```
src/main/java/com/example/commonlibcqrs/
├── commands/        # Command handlers and command objects
├── events/          # Domain events
├── queries/         # Query handlers and query objects
└── exceptions/      # Custom exceptions
```

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher

### Building the Project

```bash
mvn clean install
```

## Usage

### Commands

Commands represent write operations in your application. Example:

```java
public class CreateOrderCommand implements Command<Order> {
    private final OrderDetails orderDetails;
    
    public CreateOrderCommand(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }
    
    // Getters
}
```

### Queries

Queries represent read operations in your application. Example:

```java
public class GetOrderQuery implements Query<Order> {
    private final String orderId;
    
    public GetOrderQuery(String orderId) {
        this.orderId = orderId;
    }
    
    // Getters
}
```

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
