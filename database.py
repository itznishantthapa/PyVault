import mysql.connector

# Establish the connection to MySQL
connection = mysql.connector.connect(
    host='localhost',  # Your MySQL server address
    user='root',  # Your MySQL username
    password='ntstyle',  # Your MySQL password
    database='game_scores_db'  # Your database name
)

# Create a cursor object
cursor = connection.cursor()

# Function to insert game score
def insert_game_score(player_name, score):
    insert_query = """
    INSERT INTO game_scores (player_name, score)
    VALUES (%s, %s)
    """
    cursor.execute(insert_query, (player_name, score))
    connection.commit()
    print("Score inserted successfully")

# Example usage
insert_game_score('Nishant', 100)
insert_game_score('Alex', 150)

# Close the cursor and connection
cursor.close()
connection.close()
