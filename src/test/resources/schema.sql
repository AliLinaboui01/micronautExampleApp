CREATE TABLE IF NOT EXISTS person
(
    id     BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    name  VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
