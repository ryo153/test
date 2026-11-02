def show_start():
    print("game start")
def show_result(result):
    if result==1:
        print("正解")
    elif result==0:
        print("正解はもっと小さい")
    else:
        print("もっと大きい")