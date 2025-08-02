create table categories
(
    id   tinyint auto_increment
        primary key,
    name varchar(255) not null
);

create table products
(
    id          bigint auto_increment
        primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) not null,
    category_id tinyint        not null,
    constraint products_ibfk_1
        foreign key (category_id) references categories (id)
            on delete restrict
);

create index category_id
    on products (category_id);

