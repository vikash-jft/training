package bootstapsetdata

class Cart {

    String itemName
    String itemType
    int itemPrice
    String itemColor
    String itemSize
    String itemPic



    static constraints = {
        itemName (unique: true)
        itemType(nullable: true)
        itemPrice(nullable: true)
        itemColor(nullable: true)
        itemSize(nullable: true)
        itemPic(nullable: true)
    }
}
