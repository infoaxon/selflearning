# Lesson to generate a personal message
# This is the python lesson code
shubham_message =" hello Shubham, how are you doing today? Are you ready to learn Python?"
print(shubham_message)
# Lesson on Name Cases
myname = "Shubham"
print(myname.title())
print(myname.upper())
print(myname.lower())
print(myname.capitalize())
print(myname.casefold())
print(myname.swapcase())
# Lesson on printing a famous quote
famous_person = "Mahatma Gandhi"
message = f"{famous_person} once said, 'Be the change that you wish to see in the world.'"
print(message)
# Lesson in stripping whitespace
myfullname = "    Shubham Nagar   "
print(myfullname)
myfullnamewithNewline = "Shubham\nNagar"
myfullnamewithTab = "Shubham\tNagar"
print(myfullnamewithNewline)
print(myfullnamewithTab)
# Now lets try to strip the whitespace
print(myfullname)
print(myfullname.lstrip())
print(myfullname.rstrip())
# Now lets try to strip multiple whitespace
print(myfullname.strip())
# Lesson on removing prefixes and suffixes from file names
filename = "example.txt"
print(filename)
# Removing the file extension
filename_without_extension = filename.removesuffix(".txt")
print(filename_without_extension)
# Removing the prefix
filename_with_prefix = "example_2023.txt"
print(filename_with_prefix)
filename_without_prefix = filename_with_prefix.removeprefix("example_")
print(filename_without_prefix)
