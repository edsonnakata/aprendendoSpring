CREATE TABLE ordem_servico (
	 id serial PRIMARY KEY,
	 cliente_id int NOT NULL,
	 descricao text NOT null,
	 preco decimal(10,2) not null,
	 status varchar(20) not null,
	 data_abertura timestamp not null,
	 data_finalizacao timestamp,
	 FOREIGN KEY (cliente_id) REFERENCES cliente (id)
);