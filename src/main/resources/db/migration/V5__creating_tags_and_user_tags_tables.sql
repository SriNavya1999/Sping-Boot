create table tags
(
    id   int auto_increment
        primary key,
    name varchar(255) not null
);

create table user_tags
(
    user_id bigint not null,
    tag_id  int    not null,
    constraint user_tags_ibfk_1
        foreign key (user_id) references users (id)
            on delete cascade,
    constraint user_tags_ibfk_2
        foreign key (tag_id) references tags (id)
            on delete cascade
);