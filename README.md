# FitBox Backend – Contact API

A Spring Boot REST API for handling contact form submissions from the FitBox landing page.  
Deployed on **Railway**, using an **H2 in-memory database** for demo purposes.

---

## Features
- REST endpoint for contact form submissions
- JPA + H2 in-memory database integration
- Simple JSON response with saved contact data
- Ready for deployment on Railway

---

## Tech Stack
- **Backend:** Spring Boot (Java 17)
- **Database:** H2 (in-memory, demo only)
- **Deployment:** Railway

---

## API Endpoints
### `POST /api/contact`
Create a new contact message.

**Request Body:**
{
  "name": "Umut",
  "email": "umut@example.com",
  "message": "Hello FitBox!"
}
Response:
{
  "id": 1,
  "name": "Umut",
  "email": "umut@example.com",
  "message": "Hello FitBox!"
}

Deployment
Railway URL: https://fitbox-backend-production-aec7.up.railway.app/api/contact
(fitbox-backend-production-aec7.up.railway.app in Bing)

Build & Run Locally
# Clone the repository
git clone https://github.com/umutekinkrsln/fitbox-backend.git

# Navigate into the project
cd fitbox-backend

# Build the project
./mvnw clean package -DskipTests

# Run the JAR
java -jar target/*.jar

Notes
H2 database is in-memory. Data will be lost when the service restarts.
For production, replace H2 with PostgreSQL or another persistent database.
