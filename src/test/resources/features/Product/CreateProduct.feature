@CreateProduct
Feature: Create Product
  As a user
  I want to create a product
  So that I am success create product

  Scenario: User want to add new rental product page
    Given I am logged as user
    When I am click menu dropdown icon profile
      And I am click menu Rentalkan Produk
      And I am click button Tambah
      And I am enter in field Nama Produk "Laptop Lenovo Thinkpad X260"
      And I am enter in field Harga Rental 100000
      And I am enter in field Stok Produk 10
      And I am choice of Pilih Jaminan Produk
      And I am upload an image product "gambar/thinkpad.jpg"
      And I am choice of Kota Pemilik
      And I am choice of Kategori Produk
      And I am enter in field Deskripsi Produk "Processor Intel Core i5-6300U 2.4 GHz, Memory DDR4 8gb, Hardisk SSD 256gb,Layar 12 Inch"
      And I am click button Tambahkan
    Then I am success add products