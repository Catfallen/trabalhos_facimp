const pool = ("../config.js");

const User = {
    getAll: async ()=>{
        const result = await pool.query("Select * from users");
        return result.rows;
    },
    getById: async (id)=>{
        const result = await pool.query("select * From users where id = $1",[id]);
        return result.rows[0];
    },
    create: async (name,email)=>{
        const result = await pool.query('INSERT INTO users (name,email) VALUES ($1,$2) RETURNING *',[name,email]);
        return result.rows;
    }
}