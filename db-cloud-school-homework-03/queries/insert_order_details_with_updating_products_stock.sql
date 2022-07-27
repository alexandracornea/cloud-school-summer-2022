/* TODO: When placing an order, update the stock for the products. */

/* 1) insert an "order details" record, where "id" refers to
 * the primary key "id" from "orders" table, and "product_code"
 * refers to the primary key "code" from "products" table. */
INSERT INTO `db-cloud-school-spring-course1`.`orderdetails`
(`id`, `product_code`, `quantity`, `price_each`)
VALUES
("1", "121", "2", "500");

/* 2) disable safe update mode in order to use a primary key
 * with a WHERE statement. */
SET SQL_SAFE_UPDATES = 0;

/* 3) update the stock in the "products" table. */
UPDATE `db-cloud-school-spring-course1`.`products`
SET stock = stock - (SELECT quantity FROM
`db-cloud-school-spring-course1`.`orderdetails`
WHERE product_code = 121)
WHERE code = 121;

/* 4) enable the safe update mode. */
SET SQL_SAFE_UPDATES = 1;