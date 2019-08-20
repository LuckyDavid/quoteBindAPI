INSERT INTO product (id, name) VALUES
  ('CYB', 'Cyber Spain'),
  ('HNH', 'Household Spain');

INSERT INTO industry_sector (id, name) VALUES
  ('IND1', 'IT industry'),
  ('IND2','telco'),
  ('IND3','Test');

INSERT INTO PRODUCT_AVAILABLE_INDUSTRIES (PRODUCT_ID, AVAILABLE_INDUSTRIES_ID) VALUES
  ('CYB', 'IND1'),
  ('CYB', 'IND2'),
  ('HNH', 'IND2'),
  ('HNH', 'IND3')
