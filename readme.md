bai tap thuc hanh tuan 1
<img width="1859" height="924" alt="image" src="https://github.com/user-attachments/assets/aed4f11e-7809-4db0-8da2-456dbeb0a20c" />

Unit Test - Student Analyzer

Mô tả bài toán

Chương trình phân tích danh sách điểm số của học sinh:
- Đếm số học sinh đạt loại **Giỏi** (điểm >= 8.0).
- Tính **điểm trung bình** của các điểm hợp lệ (0 ≤ điểm ≤ 10).
- Bỏ qua các điểm không hợp lệ (< 0 hoặc > 10 hoặc null).
- Trả về 0 hoặc 0.0 nếu danh sách rỗng hoặc không có điểm hợp lệ.

Cấu trúc thư mục
unit-test/
├── src/
│   └── StudentAnalyzer.java       # Chứa logic chính
└── test/
└── StudentAnalyzerTest.java   # Unit tests dùng JUnit 5

Công nghệ sử dụng

- Java (JDK 11+ hoặc 17+)
- JUnit 5 (kiểm thử đơn vị)

Cách cài đặt và chạy

1. Compile source và test

```bash
# Vào thư mục unit-test
cd unit-test

# Compile source
javac -d bin src/*.java

# Compile test (cần JUnit jar)
# Tải junit-platform-console-standalone-1.10.2.jar từ https://mvnrepository.com/artifact/org.junit.platform/junit-platform-console-standalone
javac -cp "bin:junit-platform-console-standalone-1.10.2.jar" -d bin test/*.java
