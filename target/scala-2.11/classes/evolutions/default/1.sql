# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table ingrediente (
  id                            bigint not null,
  nombre                        varchar(255),
  descripcion                   varchar(255),
  tipo                          varchar(255),
  constraint pk_ingrediente primary key (id)
);
create sequence ingrediente_seq;

create table receta (
  id                            bigint not null,
  nombre                        varchar(255),
  descripcion                   varchar(255),
  categoria                     varchar(255),
  constraint pk_receta primary key (id)
);
create sequence receta_seq;

create table receta_ingrediente (
  receta_id                     bigint not null,
  ingrediente_id                bigint not null,
  constraint pk_receta_ingrediente primary key (receta_id,ingrediente_id)
);

alter table receta_ingrediente add constraint fk_receta_ingrediente_receta foreign key (receta_id) references receta (id) on delete restrict on update restrict;
create index ix_receta_ingrediente_receta on receta_ingrediente (receta_id);

alter table receta_ingrediente add constraint fk_receta_ingrediente_ingrediente foreign key (ingrediente_id) references ingrediente (id) on delete restrict on update restrict;
create index ix_receta_ingrediente_ingrediente on receta_ingrediente (ingrediente_id);


# --- !Downs

alter table receta_ingrediente drop constraint if exists fk_receta_ingrediente_receta;
drop index if exists ix_receta_ingrediente_receta;

alter table receta_ingrediente drop constraint if exists fk_receta_ingrediente_ingrediente;
drop index if exists ix_receta_ingrediente_ingrediente;

drop table if exists ingrediente;
drop sequence if exists ingrediente_seq;

drop table if exists receta;
drop sequence if exists receta_seq;

drop table if exists receta_ingrediente;

