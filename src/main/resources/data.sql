INSERT INTO users (username, password) VALUES ('user1', '{bcrypt}$2a$10$Dowf7w6bVpoZiQ/4S3sIUu.TpFT5kOF0KPzFX5b2CZAEHnlqjWV/q'); -- password: user1pass
INSERT INTO users (username, password) VALUES ('user2', '{bcrypt}$2a$10$gG3rwZJ5Z4MViwVxAoVheeblm3s4DLw8wFjKdRr.A7k2RVRV2olbS'); -- password: user2pass

INSERT INTO topics (title, message, course, user_id) VALUES ('Topic 1', 'Message 1', 'Course 1', 1);
INSERT INTO topics (title, message, course, user_id) VALUES ('Topic 2', 'Message 2', 'Course 2', 2);
INSERT INTO topics (title, message, course, user_id) VALUES ('Topic 3', 'Message 3', 'Course 3', 1);
