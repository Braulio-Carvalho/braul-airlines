CREATE TABLE if not exists public.aviao (
	id uuid NOT NULL,
	modelo VARCHAR(255) NOT NULL,
	companhia VARCHAR(255)NOT NULL,
	ano_fabricacao DATE NOT NULL,
	qtd_assentos INT NOT NULL,
	assento INT NOT NULL,
	CONSTRAINT aviao_pkey PRIMARY KEY (id)
);