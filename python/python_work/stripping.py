# Learning stripping of charaxters 
first_name = "Shubham "
second_name = " Nagar"

full_name = f"{first_name} {second_name}"
print(full_name)
print(f"What is going on {full_name.title()}")
# Now trying to get the stripping of extra spaces
print(first_name.rstrip())
print(full_name)
# This does not permanently strip it so we need to make the changes
first_name = first_name.rstrip()
full_name = f"{first_name} {second_name}"
print(full_name)

# Now removing spaces from the Left side of the string

first_name = " Shubham"
second_name = " Nagar"
full_name = f"{first_name} {second_name}"
print(full_name)
first_name = first_name.lstrip()
full_name = f"{first_name} {second_name}"
print(full_name)

# Now removing spaces from either side
print("Now removing the spaces from either side")
first_name = " Shubham "
second_name = " Nagar"
full_name = f"{first_name} {second_name}"
print(full_name)
first_name = first_name.strip()
full_name = f"{first_name} {second_name}"
print(full_name)


