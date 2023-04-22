INSERT INTO category (id, name) VALUES (111, 'IT');
INSERT INTO category (id, name) VALUES (112, 'Philosophy');
INSERT INTO category (id, name) VALUES (113, 'Arts');

INSERT INTO book (isbn, title, price, category_id) VALUES (111, 'Designing Web Services', 40.0,111);
INSERT INTO book (isbn, title, price, category_id) VALUES (112, 'Algo. Problem Solving', 35.0, 111);
INSERT INTO book (isbn, title, price, category_id) VALUES (113, 'How to be Happy', 60.0, 112);
INSERT INTO book (isbn, title, price, category_id) VALUES (114, 'Basics of sketching', 15.0, 113);

INSERT INTO author (id, name) VALUES (111,'Zaineh');
INSERT INTO author (id, name) VALUES (112,'Yasmeen');
INSERT INTO author (id, name) VALUES (113,'Mira');
INSERT INTO author (id, name) VALUES (114,'Dean');
INSERT INTO author (id, name) VALUES (115,'Shaimaa');

INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (111,114);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (112,114);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (112,115);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (113,112);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (113,113);
INSERT INTO BOOK_AUTHORS( BOOKS_ISBN , AUTHORS_ID) VALUES (114,111);






