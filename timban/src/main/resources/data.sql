
-- Insertar datos en la tabla AppUser
INSERT INTO AppUser (name, age, mail, passwor) VALUES ('User1', 25, 'user1@example.com', 'password1');
INSERT INTO AppUser (name, age, mail, passwor) VALUES ('User2', 30, 'user2@example.com', 'password2');
INSERT INTO AppUser (name, age, mail, passwor) VALUES ('User3', 28, 'user3@example.com', 'password3');
INSERT INTO AppUser (name, age, mail, passwor) VALUES ('User4', 29, 'user4@example.com', 'password4');

-- Insertar datos en la tabla Page para cada usuario
INSERT INTO Page (date_creation, title, id_User) VALUES (CURRENT_TIMESTAMP, 'User1 Page', 1);
INSERT INTO Page (date_creation, title, id_User) VALUES (CURRENT_TIMESTAMP, 'User2 Page', 2);
INSERT INTO Page (date_creation, title, id_User) VALUES (CURRENT_TIMESTAMP, 'User3 Page', 3);

-- Insertar datos en la tabla Post para cada página
-- Posts para la página de User1
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 1 for User1', 'img1.jpg', 1);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 2 for User1', 'img2.jpg', 1);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 3 for User1', 'img3.jpg', 1);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 4 for User1', 'img4.jpg', 1);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 5 for User1', 'img5.jpg', 1);

-- Posts para la página de User2
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 1 for User2', 'img1.jpg', 2);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 2 for User2', 'img2.jpg', 2);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 3 for User2', 'img3.jpg', 2);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 4 for User2', 'img4.jpg', 2);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 5 for User2', 'img5.jpg', 2);

-- Posts para la página de User3
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 1 for User3', 'img1.jpg', 3);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 2 for User3', 'img2.jpg', 3);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 3 for User3', 'img3.jpg', 3);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 4 for User3', 'img4.jpg', 3);
INSERT INTO Post (date_creation, content, img, id_page) VALUES (CURRENT_TIMESTAMP, 'Content 5 for User3', 'img5.jpg', 3);


--- application.properties ---
-- spring.datasource.url=jdbc:h2:mem:timban
-- spring.datasource.driver-class-name=org.h2.Driver
-- spring.datasource.username=sa
-- spring.datasource.password=password
-- spring.h2.console.enabled=true
-- spring.jpa.hibernate.ddl-auto=none


-- --- bean ---
-- import org.springframework.context.annotation.Bean;
-- import org.springframework.context.annotation.Configuration;
-- import org.springframework.jdbc.datasource.DriverManagerDataSource;

-- import javax.sql.DataSource;
-- import java.sql.Driver;

-- //@Configuration
-- public class DatasourceConfig {

--     //@Bean
--     public DataSource dataSource() {
--         final var datasource = new DriverManagerDataSource();
--         datasource.setDriverClassName("org.h2.Driver");
--         datasource.setUrl("jdbc:h2:mem:testdb");
--         datasource.setUsername("sa");
--         datasource.setPassword("password");

--         return datasource;
--     }
-- }
