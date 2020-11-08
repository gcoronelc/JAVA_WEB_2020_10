

create table familia (
  id number(8) primary key,
  nombre varchar2(100) not null,
  correo varchar2(100) not null	
);

create table socio (
   id number(8) primary key,
  nombre varchar2(100) not null,
  correo varchar2(100) not null
);

create table clientes (
   id number(8) primary key,
  nombre varchar2(100) not null,
  correo varchar2(100) not null
);

create table partners (
   id number(8) primary key,
  nombre varchar2(100) not null,
  correo varchar2(100) not null
);

insert into familia values( 1, 'Ricardo', 'Ricardo@gmail.com' );
insert into familia values( 2, 'Carmela', 'Carmela@gmail.com' );
insert into familia values( 3, 'Laura', 'Laura@gmail.com' );
insert into familia values( 4, 'Delia', 'Delia@gmail.com' );
insert into socio values( 1, 'Martha', 'marta@gmail.com' );
insert into clientes values( 1, 'Sergio', 'Sergio@gmail.com' );
insert into partners values( 1, 'Cesar', 'Cesar@gmail.com' );


commit;