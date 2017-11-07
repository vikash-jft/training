package bootstapsetdata

class Item {
    String itemName
    String itemType
    int itemPrice
    String itemColor
    String itemSize
    String itemPic


    @Override
    public boolean equals(Object obj) {
        Item other = (Item) obj;
        if(this.itemName==other.itemName
                && this.itemType.equals(other.itemType)
                && this.itemPrice.equals(other.itemPrice)
                && this.itemColor.equals(other.itemColor)
                && this.itemSize.equals(other.itemSize)
                && this.itemPic.equals(other.itemPic)){
            return true;
        }else{
            return false;
        }
    }



    static constraints = {
        itemName (unique: true)
    }
}
