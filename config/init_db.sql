CREATE TABLE resume
(
  uuid      CHAR(36) NOT NULL  PRIMARY KEY,
  full_name TEXT
);
CREATE TABLE contacts
(
  id          SERIAL   NOT NULL
    CONSTRAINT contacts_pkey
    PRIMARY KEY,
  type        TEXT     NOT NULL,
  value       TEXT     NOT NULL,
  resume_uuid CHAR(36) NOT NULL  REFERENCES resume
  ON DELETE CASCADE
);

CREATE UNIQUE INDEX contacts_uuid_type_index
  ON contacts (resume_uuid, type);
