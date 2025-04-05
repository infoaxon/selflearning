# This is the start of learning about prefixes and suffixes
# lets say I have a URL and I want to check if it starts with a certain prefix and its https://www.infoaxon.com
infoaxon_url = "https://www.infoaxon.com"
# I want to check if it starts with https://
print(infoaxon_url.startswith("https://"))
print(infoaxon_url.removeprefix("https://"))
print(infoaxon_url.removesuffix(".com"))
print(infoaxon_url.removeprefix("https://www."))
print(infoaxon_url.removesuffix(".com"))
# Now lets try to check if it ends with a certain suffix
print(infoaxon_url.endswith(".com"))