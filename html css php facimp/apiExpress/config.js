// config.js

const { Pool } = require('pg'); // Importa a classe Pool do módulo pg

// Cria uma nova instância do Pool com as configurações do banco de dados
const pool = new Pool({
    user: 'postgres',         // Insira o seu usuário do banco de dados
    host: 'localhost',           // O endereço do servidor do banco de dados
    database: 'nome_do_banco',   // O nome do banco de dados
    password: 'sua_senha',       // A senha do usuário do banco de dados
    port: 5432,                  // A porta padrão do PostgreSQL
});

// Exporta a instância do pool para ser utilizada em outros arquivos
module.exports = pool;
