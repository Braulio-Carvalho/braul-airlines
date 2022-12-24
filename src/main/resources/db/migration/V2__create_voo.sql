CREATE TABLE if not exists public.voo (
    id uuid NOT NULL,
	origem varchar(255) NOT NULL,
	destino varchar(255) NOT NULL,
	data_partida date NOT NULL,
	data_chegada date NOT NULL,
	id_aviao uuid not NULL,
	CONSTRAINT voo_pkey PRIMARY KEY (id),
	CONSTRAINT fk_id_aviao FOREIGN KEY (id_aviao) REFERENCES Aviao(id)
);