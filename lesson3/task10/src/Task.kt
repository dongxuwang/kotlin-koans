// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    val firstProducts = customers.first().orders.flatMap { it.products }
    return customers.fold(firstProducts.toSet(), {
        partProduct, element ->
        partProduct.intersect(element.orders.flatMap { it.products }.toSet())
    })
}
