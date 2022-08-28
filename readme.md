1. Add a “IPad Pro” to a Cart

2. Add a “Hero ink Pen” to a Cart

3. Add 2 qty of “GM Cricket bat” to Cart.

4. Remove already added Item “IPad Pro”( with quantities) from cart.

5. As a business User I would like to know which Product/Item was deleted from Cart.

6. As a business User, I would like to differentiate Carts. Two carts where items are same, equality on Carts should return false

```
Cart cart1 = Cart()
Cart cart2 = Cart()
Item item1 = new ( Item(Product("Ipad"), 1)
Item item2 = new ( Item(Product("Ipad"), 1)
cart1.add(item1)
cart2.add(item2)
cart1.equals(cart2)  should be false
```

7. See the Price of Product before adding to a Cart `java.util.Currency`

8.  As a Business User I will like price my product 10% below competitor price (competitor price is available for product) . 
Assume that HashMap of Competitor Product Name and price is available

9. Create Order( with Products) when Cart is checked out
Also Mark cart as checkedOut

10.  Customer and Bank Account
When Customer’s Address is updated, update her all Bank Accounts address as well. (example of invariant or business rules or consistency rules)

11.  Calculate Total amount for the Order.  put shipping cost as per weight
Total cost = cost of all products in order + (weightIngrams of product *.01)