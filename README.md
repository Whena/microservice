README – User & Order Service (Spring Boot 3, PostgreSQL, JWT)


users-service/README.md

User Service — Spring Boot 3 + JWT + PostgreSQL

Layanan autentikasi & manajemen user. Menyediakan registrasi user, login (JWT), serta endpoint untuk mengambil data user yang diproteksi oleh JWT.

1.  Fitur

POST /api/users — Registrasi user baru (validasi: email valid, password ≥ 8, unik).

POST /api/login — Autentikasi (email + password) → JWT.

GET /api/users — Daftar semua user (protected: Bearer JWT).

GET /api/users/{id} — Detail user (protected: Bearer JWT).

2. Teknologi

Java 17, Spring Boot 3.2.x

Spring Web, Spring Data JPA, Validation, Spring Security (JWT)

PostgreSQL

Build: Maven

3. Prasyarat

JDK 17+

Maven 3.9+

PostgreSQL 14+
