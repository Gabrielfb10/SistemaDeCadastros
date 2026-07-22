-- Migrations para adicionar a coluna de telefone na tabela de usuarios

ALTER TABLE TB_USER
ADD COLUMN phone VARCHAR(14)