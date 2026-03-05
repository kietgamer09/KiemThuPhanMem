# Báo cáo Kiểm thử Hiệu năng bằng JMeter

## 1. Mục tiêu Kiểm thử
Thực hiện kiểm thử hiệu năng đối với trang web `https://en.wikipedia.org` nhằm đánh giá thời gian phản hồi, khả năng chịu tải và tỷ lệ lỗi với nhiều kịch bản khác nhau.

## 2. Các Kịch bản Kiểm thử

### Kịch bản 1: Kịch bản cơ bản (Base Load)
- **Số lượng người dùng (Threads):** 10
- **Thời gian chạy (Loop Count):** 5 lần lặp
- **Hành vi:** Gửi yêu cầu HTTP GET đến trang chủ `/wiki/Main_Page`.

### Kịch bản 2: Kịch bản tải nặng (Heavy Load)
- **Số lượng người dùng (Threads):** 50
- **Ramp-up Period:** 30 giây
- **Hành vi:** Gửi yêu cầu HTTP GET đến trang chủ `/wiki/Main_Page` và trang `/wiki/JMeter`.

### Kịch bản 3: Kịch bản tùy chỉnh (Custom Load)
- **Số lượng người dùng (Threads):** 20
- **Thời gian chạy:** Chạy liên tục trong 60 giây ở một thông lượng xác định.
- **Hành vi:** Gửi yêu cầu HTTP GET đến `/wiki/Performance_testing` và trang `/wiki/Software_testing`.

## 3. Phân tích Kết quả

Kết quả từ quá trình chạy 3 kịch bản kiểm thử với JMeter qua CLI. Đã thực hiện tổng cộng **28,428 request** trong khoảng thời gian ~60 giây.

- **Response Time (Thời gian phản hồi):** Trung bình **42.2 ms** (nhanh nhất 34 ms, chậm nhất 1159 ms).
- **Throughput (Thông lượng yêu cầu xử lý mỗi giây):** **~473.1 requests/second**
- **Error Rate (Tỉ lệ lỗi):** **100%** do Wikipedia áp dụng chính sách chặn (nhận mã phản hồi `403 Forbidden` đối với các request tự động từ JMeter mà không có User-Agent đặc biệt). 

*Lưu ý: Mọi Request đều gặp mã 403 Forbidden do biện pháp giới hạn request tự động từ Wikipedia.*

## 4. Minh chứng (Screenshots & File Report)

*(Chèn ảnh chụp Summary Report tại đây)*

- **Kết quả CSV:** Tệp `jmeter_results.csv` được sinh ra tự động trong cùng thư mục chạy JMeter.
