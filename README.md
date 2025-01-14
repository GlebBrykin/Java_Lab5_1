# Java_Lab5_1

* Создайте обобщенный класс `Box`, который может хранить элементы любого типа. Реализуйте методы для добавления элемента в коробку, извлечения элемента из коробки и определения, пуста ли коробка. Затем напишите программу, которая создает объекты Box для хранения целых чисел, строк и других типов данных и выполняет операции с этими коробками.
* Создайте программу для учета продуктов в магазине. У вас есть список `List<Product>` с продуктами. Напишите метод `calculateTotalPrice`, который принимает список продуктов и вычисляет общую стоимость продуктов. Однако в методе вы должны использовать ограниченный сверху маской типа (`<? extends Product>`) для списка, чтобы он мог работать не только с `List<Product>`, но и с подтипами `List<Fruit>`, `List<Vegetable>`, и т.д.
