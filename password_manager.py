info={}
while True:
    choose=input("Enter \n1 to create account \n2 to login \n3 to reset the password \nEnter Here:")
    if choose=="1":
        first_name=input("Enter your first name: ")
        last_name=input("Enter your last name: ")
        email=input("Enter your email address:")
        password=input("Create a new password: ")
        info["Username"]=email
        info[f"{email}Password"]=password   
        # i have used here email+password for password to make it unique beacause to make sure not to mis match to others password in the dictionary
        print(info)
        print("Account created successful !")
    elif choose=='2':
        username=input("Enter Username: ")
        password=input("Enter password: ")
        if username==info["Username"] and password==info[f"{username}Password"]:
            print("Login Successfull !")
        else:
            print("Invalid, credentials")
    elif choose =="3":
        reset_username=input("Enter your username: ")
        reset_password=input("Enter your password: ")
        if reset_username==info["Username"] and reset_password==info[f"{reset_username}Password"]:
            new_password=input("Enter your new password: ")
            confirm_password=input("Enter your new password to confirm: ")
            info[f"{reset_username}Password"]=new_password
            print(info)
            print("Password has been changed sucessfully !")

        else:
            print("Invalid, credentials")
    else:
        print("Invalid choice !")
    