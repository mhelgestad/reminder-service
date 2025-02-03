USE notifications-db;

CREATE TABLE notifications (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    recipient VARCHAR(255) NOT NULL,
    subject VARCHAR(255) NOT NULL,
    body VARCHAR(255) NOT NULL,
    schedule VARCHAR(255) NOT NULL
);