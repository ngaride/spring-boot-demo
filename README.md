# spring-boot-demo
go to respective folders and run 
./mvnw spring-boot:run so that each service run separately in terminals on 8081 and 8082
create order internally consumes product service using resttemplate

# Create product
curl -X POST http://localhost:8081/api/products \
  -H "Content-Type: application/json" \
  -d '{"name":"Laptop","description":"Gaming Laptop","price":999.99,"stock":10}'

# Create order
curl -X POST http://localhost:8082/api/orders \
  -H "Content-Type: application/json" \
  -d '{"productId":1,"quantity":2}'


**#next-steps**
Deploy spring-boot-demo 
