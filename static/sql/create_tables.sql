CREATE TABLE episodes (
    id INT PRIMARY KEY,
    name VARCHAR(255) UNIQUE
);

CREATE TABLE locations (
    id INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    type VARCHAR(255),
    dimension VARCHAR(255)
);

CREATE TABLE characters (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    species VARCHAR(255),
    gender VARCHAR(255),
    image VARCHAR(255),
    location_id INT,
    FOREIGN KEY (location_id) REFERENCES locations(id)
);

CREATE TABLE episode_character (
  episode_id INT NOT NULL,
  character_id INT NOT NULL,
  PRIMARY KEY (episode_id, character_id),
  FOREIGN KEY (episode_id) REFERENCES episodes(id),
  FOREIGN KEY (character_id) REFERENCES characters(id)
);