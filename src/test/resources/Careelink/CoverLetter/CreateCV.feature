Feature:  Check login
  Background: Sign in with valid credential
    Given The user login with username and password and naviate to tạo hồ sơ
    And Button Tạo hồ sơ -> Tạo hồ sơ theo từng bước

  Scenario:  crCV_2
    Then Hiển thị màn hình hồ sơ xin việc

  Scenario:  crCV_4
    And Nhập các thông tin hợp lệ
    Then Tạo cv thành công