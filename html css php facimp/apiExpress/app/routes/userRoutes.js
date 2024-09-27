// routes/userRoutes.js

const express = require("express");
const pool = require("../../config.js");

const router = express.Router();

// Exemplo de rota para buscar usuários
router.get("/users", async (req, res) => {
    console.log("preto macaco")
    try {
        const result = await pool.query("SELECT * FROM usuarios");
        res.json(result.rows);
    } catch (err) {
        console.error(err.message);
        res.status(500).send("Erro no servidor");
    }
});



module.exports = router;
