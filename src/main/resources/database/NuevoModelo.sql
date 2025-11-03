
-- Migrations will appear here as you chat with AI

create table categories(
  id bigint primary key generated always as identity,
  name_category varchar(100) not null
);

create table products (
  id bigint primary key generated always as identity,
  name_product varchar(150) not null,
  price numeric(10, 2) not null,
  stock int not null,
  available boolean,
  code varchar(20),
  category_id bigint references categories (id)
);

create table list_prices (
  id bigint primary key generated always as identity,
  product_id bigint references products (id),
  price numeric(10, 2) not null,
  effective_date date not null
);

create table payment_methods (
  id bigint primary key generated always as identity,
  method varchar(100) not null
);

create table tables (
  id bigint primary key generated always as identity,
  table_number int not null,
  available boolean
);

create table sales (
  id bigint primary key generated always as identity,
  sale_date timestamp with time zone default now(),
  table_id bigint references tables (id),
  total_sales decimal(10, 2),
  total_article int,
  additional decimal(10, 2),
  invoice_number varchar(15),
  seller_name varchar(100) not null
);

create table sale_details (
  id bigint primary key generated always as identity,
  sale_id bigint references sales (id),
  product_id bigint references products (id),
  quantity_price int not null,
  quantity_price_total int not null,
  quantity_article int not null,
  paid boolean,
  payment_method_id bigint references payment_methods (id)
);

create table roles (
  id bigint primary key generated always as identity,
  role_name varchar(100) not null
);

create table employees (
  id bigint primary key generated always as identity,
  name_emp varchar(100) not null,
  phone_emp varchar(12) not null,
  password_emp varchar(10) not null,
  user_emp varchar(10) not null,
  identification varchar(20) not null,
  role_id bigint references roles (id)
);

create table product_price_history (
  id bigint primary key generated always as identity,
  product_id bigint references products (id),
  old_price numeric(10, 2) not null,
  new_price numeric(10, 2) not null,
  change_date timestamp with time zone default now()
);

create table sale_payments (
  id bigint primary key generated always as identity,
  sale_id bigint references sales (id),
  payment_method_id bigint references payment_methods (id),
  amount numeric(10, 2) not null
);

alter table sale_details
add column employee_id bigint references employees (id);

alter table sale_details
drop constraint sale_details_payment_method_id_fkey;

alter table sale_details
drop payment_method_id;