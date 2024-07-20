Target:

    1: Ui for fetching past dues
    2: Design database model
    3: Configure mqsql server and create the tables as per schema
    4: Create a service endpoint to add ride
    5: Create a service endpoint to retrieve past rides
    6: Create an email template for account confirmation and ride comfirmation  
    7: Otp confirmation for a ride(8 poiunt story:- includes sending an email using SMTP and expose a REST endpoint to authorize the OTP)
    8: Design a UI and service controller for account creation(till that point users are added directly yo db)
    
DB schema:
create database local;
CREATE TABLE local.Rides (
    rideid INT PRIMARY KEY AUTO_INCREMENT,
    userid VARCHAR(10),
    origin VARCHAR(30),
    destination VARCHAR(30),
    fare DECIMAL(10, 2),
    date_Time DATETIME
);


ALTER TABLE local.Rides AUTO_INCREMENT = 10000;
