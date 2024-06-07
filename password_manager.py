info={}
def check_cerdentials(user_name,pass_word):
    return user_name in info and info[user_name]["password"]==pass_word
while True:
    choose=input("Enter \n1 to create account \n2 to login \n3 to reset the password \nEnter Here:")
    if choose=="1":
        first_name=input("Enter your first name: ").strip()
        last_name=input("Enter your last name: ").strip()
        email=input("Enter your email address:").strip().lower()
        password=input("Create a new password: ").strip()
        info[email]={"first_name":first_name,"last_name":last_name,"password":password}
        print(info)
        print("Account created successful !")
    elif choose=='2':
        username=input("Enter Username: ").strip().lower()
        password=input("Enter password: ").strip()
        if check_cerdentials(username,password):
            print("Login Successfull !")
        else:
            print("Invalid, credentials")
    elif choose =="3":
        reset_username=input("Enter your username: ").strip().lower()
        reset_password=input("Enter your password: ").strip()
        if check_cerdentials(reset_username,reset_password):
            new_password=input("Enter your new password: ").strip()
            confirm_password=input("Enter your new password to confirm: ").strip()
            if new_password==confirm_password:
                info[reset_username]["password"]=new_password
            else:
                print("New password and confirmation password did not match.")
            print("Password has been changed sucessfully !")
            print(info)
        else:
            print("Invalid, credentials")
    else:
        print("Invalid choice !")
    