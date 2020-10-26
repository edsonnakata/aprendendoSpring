CREATE TABLE ordem_servico (
	 id int NOT NULL,
	 cliente_id int NOT NULL,
	 descricao text NOT null,
	 preco decimal(10,2) not null,
	 status varchar(20) not null,
	 data_abertura timestamp not null,
	 data_finalizacao timestamp,
	 PRIMARY KEY (id),
	 FOREIGN KEY (cliente_id) REFERENCES cliente (id)
);