Feature:  Check login
  Background: Given login page
  Scenario:  login_2
    Given Kiểm tra màn hình bao gồm các thông tin

  Scenario:  login_3
    Given Nhập thông tin email hợp lệ và nhập password hợp lệ và  Click button Đăng nhập
    Then Đăng nhập thành công, hiển thị màn hình home