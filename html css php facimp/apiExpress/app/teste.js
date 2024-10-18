const { Pool } = require('pg');

// Crie uma instância do Pool com suas configurações
const pool = new Pool({
    user:"postgres",
    host:'localhost',
    database:"banco",
    password:'markim',
    port:5432,
});

// Função para testar a conexão
const testConnection = async () => {
    try {
        // Conectando ao banco de dados
        const client = await pool.connect();
        console.log('Conexão ao banco de dados bem-sucedida!');

        // Aqui você pode fazer uma consulta para testar
        const res = await client.query('SELECT NOW()'); // Consulta simples para obter a hora atual
        console.log('Hora atual do banco de dados:', res.rows[0]);

        // Liberar o cliente após a operação
        client.release();
    } catch (err) {
        console.error('Erro ao conectar ao banco de dados:', err);
    } finally {
        // Finalizar o pool
        await pool.end();
    }
};

// Executar a função de teste
testConnection();
