Feature: Delete Payment Method

  Background:
    Given Admin mengakses menggunakan endpoint yang valid untuk menghapus payment method

Scenario:
  When Admin send request untuk menghapus payment method
  Then Muncul status code 200
  And Payment Method berhasil dihapus