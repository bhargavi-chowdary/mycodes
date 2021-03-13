current_player="A"
gameisgoing=True
winner=None
values=[" " for i in range(9)]
board=["-","-","-",
      "-","-","-",
      "-","-","-",]
def display_board():
    print(board[0] + " | " + board[1] + " | " + board[2])
    print(board[3] + " | " + board[4] + " | " + board[5])
    print(board[6] + " | " + board[7] + " | " + board[8])
def handle_turn():
     global  gameisgoing
          p = int(input("Choose the random value from 0 t0 8:"))
          if p<8:
              board[p] = current_player
          elif p>8:
              p = int(input("Choose the random value from 0 t0 8:"))
              gameisgoing=True
          #if p==board[p]:
          # print("Place already filled")
          # p = int(input("Choose the random value from 0 t0 8:"))
def swap_players():
    global current_player
    if current_player=="A":
        current_player="B"
    elif current_player=="B":
        current_player="A"
def check_who_is_the_winner():
    global winner
    rowwinner=check_row()
    colwinner=check_column()
    diawinner=check_diagonal()
    check_tie()
    if rowwinner:
         winner=rowwinner
    elif colwinner:
         winner=colwinner
    elif diawinner:
         winner=diawinner




def check_row():
    global gameisgoing
    row1 = board[0] == board[1] == board[2]!="-"
    row2 = board[3] == board[4] == board[5]!= "-"
    row3 = board[6] == board[7] == board[8]!= "-"
    if row1 or row2 or row3:
        gameisgoing=False
    if row1:
        return board[0]
    elif row2:
        return board[3]
    elif row3:
        return board[6]

def check_column():
    global gameisgoing
    col1 = board[0] == board[3] == board[6] != "-"
    col2 = board[1] == board[4] == board[7] != "-"
    col3 = board[2] == board[5] == board[8] != "-"
    if col1 or col2 or col3:
        gameisgoing = False
    if col1:
        return board[0]
    elif col2:
        return board[1]
    elif col3:
        return board[2]
def check_diagonal():
    global gameisgoing
    dia1 = board[0] == board[4] == board[8] != "-"
    dia2 = board[2] == board[4] == board[6] != "-"
    if dia1 or dia2:
        gameisgoing = False
    if dia1:
        return board[0]
    elif dia2:
        return board[1]
def check_tie():
    global  gameisgoing
    if "-" not in board:
        gameisgoing=False
        print("Match is Tied")
def play_game():
    while gameisgoing:
        display_board()
        handle_turn()
        swap_players()
        check_who_is_the_winner()
        if winner=="A":
            print("A is the winner")
        elif winner=="B":
            print("B is the winner")
play_game()
