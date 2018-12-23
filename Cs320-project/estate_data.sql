-- Estate Sample Database Data
-- Version 1.0
-- Copyright 2018, Elif Gocumoglu and/or its affiliates. 
-- Free redistribution


USE estatedb;

--
-- Dumping data for table actor
--

SET AUTOCOMMIT=0;

INSERT INTO `estatetbl` VALUES (1,'For Sale', 600000, 180, 'Çekmeköy', 'Apartment');
INSERT INTO `estatetbl` VALUES (2,'For Sale', 9000000, 250, 'Çekmeköy', 'Villa');
INSERT INTO `estatetbl` VALUES (3,'For Rent', 15000, 1500, 'Çekmeköy', 'Workplace');
INSERT INTO `estatetbl` VALUES (4,'For Sale', 1200000, 2000, 'Çekmeköy', 'Land');
INSERT INTO `estatetbl` VALUES (5,'For Rent', 2500, 120, 'uskudar', 'Apartment');

COMMIT;

SET AUTOCOMMIT=1;