create table todo_list
(
    id           bigint not null auto_increment,
    completed_at date,
    content      TEXT   not null,
    created_at   date,
    pin          TINYINT,
    shown         TINYINT,
    target_date  date,
    title        TEXT   not null,
    updated_at   date,
    primary key (id)
) engine=InnoDB