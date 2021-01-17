insert into users(username ,password ,enabled) values ('user','ajay',true)
insert into users(username ,password ,enabled) values ('admin','rahul',true)

insert into authorities(username ,authority) values ('user','ROLE_USER')
insert into authorities(username ,authority) values ('admin','ROLE_ADMIN')