create table usuario(
                       id bigint primary key,
                       nomeCompleto varchar(50),
                       email varchar(40),
                       senha varchar(6),
                       descricao varchar(100),
                       telefone varchar(50),
                       dataNascimento varchar(40),
                       cidade varchar(15),
                       sexo varchar(15),
                       idade varchar(15),
                       fotoPerfil varchar,
                       numeroSeguidores bigint,
                       numeroSeguindo bigint,
                       publicacoes bigint
);

CREATE SEQUENCE usuario_id_seq OWNED BY usuario.id;

ALTER TABLE usuario ALTER COLUMN id SET DEFAULT nextval('usuario_id_seq');