-- Add new Category objects
INSERT INTO CATEGORY
    (ID, PATH)
VALUES
    (SELECT nextval('SEQ_CATEGORY'), 'itens/objects/');

-- Add new Category kitchen
INSERT INTO CATEGORY
    (ID, PATH)
VALUES
    (SELECT nextval('SEQ_CATEGORY'), 'itens/objects/kitchen');

-- Add new Category foods
INSERT INTO CATEGORY
    (ID, PATH)
VALUES
    (SELECT nextval('SEQ_CATEGORY'), 'itens/foods/');
