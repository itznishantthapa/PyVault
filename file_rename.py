import os
# this is a functional programming
path=r"C:\Users\Premier Tech\OneDrive\Desktop\my_files"
files=os.listdir(path)

i=0
for file in files:
    if file[-3:].lower()=="jpg":
        first_file=f"{path}\{file}"
        renamed_file=f"{path}\Image{i}.jpg"
        new_file=os.rename(first_file,renamed_file)
        print(renamed_file)
        i+=1

# this is a oops programming
class file_renamer:

    def __init__(self,file_path):
        self.file_path=file_path

    def rename(self):
        path=self.file_path
        files=os.listdir(path)
        i=0
        for file in files:
            if file[-3:].lower()=="jpg":
                first_file=fr"{path}\{file}"
                renamed_file=fr"{path}\Images{i}.jpg"
                new_file=os.rename(first_file,renamed_file)
                print(renamed_file)
                i+=1    

obj= file_renamer(r"C:\Users\Premier Tech\OneDrive\Desktop\my_files")
obj.rename()    


