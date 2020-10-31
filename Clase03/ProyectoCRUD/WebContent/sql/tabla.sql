

create table amigos (
   id number(8) primary key,
  nombre varchar2(100) not null,
  edad number(3) not null
);


insert into amigos values( 1, 'Ricardo', 50 );
insert into amigos values( 2, 'Martha', 52 );
insert into amigos values( 3, 'Sergio', 45 );
insert into amigos values( 4, 'Cesar', 38 );
insert into amigos values( 5, 'Carmela', 51 );
insert into amigos values( 6, 'Laura', 50 );
insert into amigos values( 7, 'Delia', 45 );

commit;