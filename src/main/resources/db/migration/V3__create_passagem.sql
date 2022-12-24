CREATE TABLE if not exists public.passagem (
	id uuid NOT NULL,
	id_voo uuid NOT NULL,
	data_compra DATE NOT NULL,
	valor DECIMAL NOT NULL,
	CONSTRAINT passagem_pkey PRIMARY KEY (id),
	CONSTRAINT fk_id_voo FOREIGN KEY (id_voo) REFERENCES Voo(id)
);