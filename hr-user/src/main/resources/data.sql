INSERT INTO tb_user (name, email, password) VALUES ('Fabio Britto', 'fabio.tritono@gmail.com','$2a$12$hPU7bU1UYQJbBQXDmf145.6BLjXls8V.p/q8yb4BOd0wKBIDtlUWG');
INSERT INTO tb_user (name, email, password) VALUES ('Priscila Britto', 'priscila.britto@gmail.com', '$2a$12$xGDo6r1ETkbOlUeXab4sL..2/b8m0pVwBOoZEhs1sShK77sQOa4hq');

-- INSERT INTO tb_user (id, name, email, password) VALUES (null,'Fabio Britto', 'fabio.tritono@gmail.com', '$2a$12$/0lNQtllHslai9IHmR1S9uB6hFDpKSITsYLj9X41ehMOwe/8iUOdOddd');
-- INSERT INTO tb_user (id, name, email, password) VALUES (null, 'Priscila Britto', 'priscila.britto@gmail.com', '$2a$12$xGDo6r1ETkbOlUeXab4sL..2/b8m0pVwBOoZEhs1sShK77sQOa4hq');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (id_user, id_role) VALUES (1, 1);
INSERT INTO tb_user_role (id_user, id_role) VALUES (2, 1);
INSERT INTO tb_user_role (id_user, id_role) VALUES (2, 2);

-- senhaDoFabioBritto123
-- senhaDaPriscilaBritto123