import requests

# Replace 'your_api_key_here' with your actual OpenWeatherMap API key
CITY = input("Enter the name of the city: ").capitalize()
API_KEY = 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
BASE_URL = 'http://api.openweathermap.org/data/2.5/weather'

# Construct the full API URL
url = f"{BASE_URL}?q={CITY}&appid={API_KEY}&units=metric"

# Send a GET request to the API
response = requests.get(url)

# Check if the request was successful
if response.status_code == 200:
    data = response.json()
    # Extract weather information
    main = data['main']
    weather = data['weather'][0]
    temperature = main['temp']
    description = weather['description']
    print(f"Current temperature in {CITY} is {temperature}°C with {description}.")
else:
    print("Error in the HTTP request")

