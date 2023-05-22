CREATE TABLE type
(
    vehicle_type VARCHAR(255) PRIMARY KEY ,
    base_price FLOAT,
    kilometer_price FLOAT,
);

INSERT INTO type VALUES ('CAR', 50, 2);
INSERT INTO type VALUES ('MOTORCYCLE', 100, 2.5);
INSERT INTO type VALUES ('UTILITY', 80, 2.9);