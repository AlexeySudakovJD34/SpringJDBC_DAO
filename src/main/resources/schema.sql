create schema if not exists mine;

create table if not exists mine.customers(
    id int primary key auto_increment,
    name varchar(255) not null,
    surname varchar(255) not null,
    age int default 18,
    phone_number varchar(255)
);

insert into mine.customers (name, surname, age, phone_number)
values ('Alexey', 'Petrov', 27, null),
       ('Olga', 'Semenova', 33, '+79990010101'),
       ('Nurlan', 'Sadykov', 23, '+77015554466'),
       ('aLeXeY', 'Ivanov', 42, '+79150020304'),
       ('Nikolai', 'Sudakov', 9, null);

create table if not exists mine.orders(
    id int primary key auto_increment,
    date date not null,
    customer_id int not null,
    product_name varchar(255) not null,
    amount int not null,
    foreign key (customer_id) references mine.customers(id)
);

insert into mine.orders (date, customer_id, product_name, amount)
values (now(), 1, 'pizza', 2),
       (now(), 2, 'hot dog', 1),
       (now(), 3, 'juice', 1),
       (now(), 4, 'chocolate bar', 3),
       (now(), 5, 'orange', 3);