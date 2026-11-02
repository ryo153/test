import randommain
import display
answer=randommain.create_number()
display.show_start()
while True:
    num=int(input("数字を入力してください"))
    result=randommain.check_answer(num,answer)
    display.show_result(result)
