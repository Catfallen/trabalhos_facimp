import psycopg2


from flask import flash, render_template, request, redirect, url_for, jsonfify




def db_conn():
    conn = psycopg2.connect(
        database='python',
        host='localhost',
        user='postgres',
        password='markim',
        port='5432'
    )
    return conn


@app.route("/create",methods = ["POST"])
def index():
    conn = db_conn()
    cursor = conn.cursor()
    name = request.form("name")
    cursor.execute('''inser into users (name)values (%s)''',name)
    conn.commit()
    cursor.close()
    cursor.close()
    return redirect(url_for('index'))