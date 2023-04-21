INSERT INTO category (id, name) VALUES (1, 'IT');
INSERT INTO category (id, name) VALUES (2, 'Philosophy');
INSERT INTO category (id, name) VALUES (3, 'Arts');

INSERT INTO book (isbn, title, price, category_id) VALUES (111, 'Designing Web Services', 40.0, 1);
INSERT INTO book (isbn, title, price, category_id) VALUES (112, 'Algo. Problem Solving', 35.0, 1);
INSERT INTO book (isbn, title, price, category_id) VALUES (113, 'How to be Happy', 60.0, 2);
INSERT INTO book (isbn, title, price, category_id) VALUES (114, 'Basics of sketching', 15.0, 3);



-- INSERT INTO address (id, city, country, state, zipcode) VALUES (1, 'Orlando','US','FL',32832);
-- INSERT INTO address (id, city, country, state, zipcode) VALUES (2, 'Orlando','US','FL',32832);
-- INSERT INTO address (id, city, country, state, zipcode) VALUES (3, 'Orlando','US','FL',32832);
-- INSERT INTO address (id, city, country, state, zipcode) VALUES (4, 'Orlando','US','FL',32832);
-- INSERT INTO address (id, city, country, state, zipcode) VALUES (5, 'Orlando','US','FL',32832);

INSERT INTO author (id, name) VALUES (1,'Zaineh');
INSERT INTO author (id, name) VALUES (2,'Yasmeen');
INSERT INTO author (id, name) VALUES (3,'Mira');
INSERT INTO author (id, name) VALUES (4,'Dean');
INSERT INTO author (id, name) VALUES (5,'Shaimaa');

INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (111,4);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (112,4);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (112,5);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (113,2);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (113,3);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (114,1);






