INSERT INTO spring_boot.type(id, base_price, kilometer_price, vehicle_type) VALUES (1,50.0, 2, 'CAR');
INSERT INTO spring_boot.type(id, base_price, kilometer_price, vehicle_type) VALUES (2, 100.0, 2.5, 'MOTORCYCLE');
INSERT INTO spring_boot.type(id, base_price, kilometer_price, vehicle_type) VALUES (3, 80.0, 2.9, 'UTILITY');

INSERT INTO spring_boot.vehicle(registration, brand, color, kilometer, model, status, tax_horses, type) VALUE ('AA-001-AA', 'RENAULT', 'WHITE', 10000, 'TRAFIC', 'AVAILABLE', 4, 'UTILITY');
INSERT INTO spring_boot.vehicle(registration, brand, color, kilometer, model, status, tax_horses, type) VALUE ('BB-001-AA', 'VOLKSWAGEN', 'GRAY', 50000, 'TRANSPORTER', 'AVAILABLE', 5, 'UTILITY');
INSERT INTO spring_boot.vehicle(registration, brand, color, kilometer, model, status, tax_horses, type) VALUE ('CC-001-AA', 'PEUGEOT', 'BLACK', 100000, 'EXPERT', 'UNVAILABLE', 6, 'UTILITY');