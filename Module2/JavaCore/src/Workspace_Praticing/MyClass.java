//Ở class Apple, bởi vì không có constructor nào được viết tường minh, lớp Apple sẽ ngầm định có một constructor không có tham số. constructor đó ngầm định gọi tới constructor không có tham số của lớp cha là lớp Fruit, nhưng bởi vì Fruit có tường minh một constructor có tham số, vậy nên Fruit không có constructor không có tham số nào, điều này sẽ gây ra lỗi khi compile. Chương trình này thậm chí còn không thể build được.

