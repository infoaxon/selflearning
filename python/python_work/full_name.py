first_name = " Shubham "
second_name = " Nagar "

full_name = f"{first_name} {second_name}"
print(full_name)
print(f"What is going on {full_name.title()}")
# Trying out the new line and tab related white spaces
print(f"What is going on \n\t{full_name.title()}")
# Trying out some of the other work here
print(f"I am trying to see if my Full name {full_name.title()} is working")
# Lets us try to now strip the name
print(f"{first_name.title().lstrip()}")
print(f"{second_name.title().rstrip()}")
print(f"{first_name.title().strip()}")