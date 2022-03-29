-- USERS

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (111, 'uinan@miu.edu', 'umur', 'inan', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (112, 'john@miu.edu', 'john', 'doe', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (113, 'muhyidean@miu.edu', 'muhyidean', 'al-tarawneh', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (114, 'levi@miu.edu', 'keith', 'levi', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (115, 'okalu@miu.edu', 'obinna', 'kalu', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123

INSERT INTO users (id, email, firstname, lastname, password)
VALUES (116, 'tina@miu.edu', 'tina', 'xing', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2'); --123


-- PRODUCTS

INSERT INTO product (id, name, price, id_user)
VALUES (111, 'iPhone', 1200, 111);

INSERT INTO product (id, name, price, id_user)
VALUES (112, 'iPad', 900, 111);

INSERT INTO product (id, name, price, id_user)
VALUES (113, 'Pen', 5, 112);

-- REVIEWS

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (1,'awesome phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (2,'amazing phone',5,111);

INSERT INTO REVIEW (id,comment,number_of_stars,product_id)
VALUES (3,'awesome tablet',5,112);
