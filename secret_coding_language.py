import random
import time


current_time = time.strftime("%H:%M")
hour=int(current_time[:2])

name="Dear"
if(hour<12):
    print(f"Hello {name} , Good Morning ! \nWhat would you like to do, Today?")
elif(hour>=12 and hour<18):
    print(f"Hello {name} , Good Afternoon!\nWhat would you like to do, Today?")
elif(hour>=18 and hour<20):
    print(f"Hello {name} , Good Evening! \nWhat would you like to do, Today?")
elif(hour>=20 and hour<24):
    print(f"Hello {name} , Good Night! \nWhat would you like to do, Today?")

while True:
    choice=input("Choose \n1 to encode \n2 to decode: ")
    if choice=='1':
        message=input("Enter your message to encode: ")

        list_msg=message.split(" ")
        alphabet=['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

        # Method that gives me 3 random letters in string formate from the alphabet
        def ran_letter():
            ran_list=random.sample(alphabet,3)
            three_ran_letters=''.join(ran_list)
            return three_ran_letters

        print("Your encoded message is :")
        for word in list_msg:
            if len(word)>=1:
                edited_word=word[1:len(word)]+word[0]
                added_word= ran_letter()+edited_word+ran_letter()
                new_word=added_word[::-1]
                print(new_word,end=' ')
        print()



    elif choice=='2':
        message_decode=input("Enter your message to decode :")
        list_decode=message_decode.split(" ")
        print("Your message is : ")
        for word2 in list_decode:
            if len(word2)>=1:
                ran_remove=word2[3:-3]
                unreversing=ran_remove[::-1]
                final_word=unreversing[-1]+unreversing[0:len(unreversing)-1]
                print(final_word,end=' ')
        print()
        