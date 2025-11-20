import psycopg2

conn = psycopg2.connect(
    database = "python",
    host="localhost",user="postgres",password = "markim",port = 5432
)
cursor = conn.cursor()

cursor.execute("""INSERT INTO USERS (name) VALUES ('MARKIM'),('PRETO');""")

conn.commit()
cursor.close()
conn.close()