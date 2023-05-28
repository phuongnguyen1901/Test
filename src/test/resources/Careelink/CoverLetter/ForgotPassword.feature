Feature:  Check quên mật khẩu
  Background: Tại màn hình login click button quên mật khẩu
    When Tại màn hình quên mật khẩu

  Scenario:  Fwpw_2
    Then Hiển thị các thông tin màn quên mật khẩu

  Scenario:  Fwpw_3
    And Nhập Email không tồn tại và click button xác nhận
    Then Hiển thị thông báo lỗi : Your email address does not exist

  Scenario:  Fwpw_4
    And  Nhập email hợp lệ và click button xác nhận
    Then Xác nhận thành công, hiển thị thông báo thành công

