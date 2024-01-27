class Shape {

    int getCorner() {
        return 0;
    }

}

class Rectangle extends Shape {
    int getCorner() {
        return 4; // Kita override menjadi 4
    }

    int getParentCorner() {
        return super.getCorner(); // 3. (Super Keyword) Super digunakan untuk mengambil corner dari parent, kalo tidak menggunakan super maka akan keambil getCorner() yang dari si rectangle
    }
}
