import random
def create_number():
    return random.randint(0,100)

def check_answer(num,answer):
    if num==answer:
        return 1
    elif num>answer:
        return 0
    else:
        return -1
    