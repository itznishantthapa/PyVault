import time

# Get the current local time and format it to show only hours and minutes
current_time = time.strftime("%H:%M")
hour=int(current_time[:2])

name=input("Enter your name:")
if(hour<12):
    print(f"Hello {name} , Good Morning ! \nThe time is {current_time} AM")
elif(hour>=12 and hour<18):
    print(f"Hell0 {name} , Good Afternoon!\nThe time is {current_time} PM")
elif(hour>=18 and hour<20):
    print(f"Hell0 {name} , Good Evening! \nThe time is {current_time} PM")
elif(hour>=20 and hour<24):
    print(f"Hell0 {name} , Good Night! \nThe time is {current_time} PM")


