from turtle import color
import pandas as pd
import matplotlib.pyplot as plt

match_df = pd.read_csv('./matches/match_data.txt')
match_df = match_df.iloc[:, :-1]
match_df.columns = ['Player Name', 'Shot Selection', 'Shot Outcome', 'Hit_X_loc', 'Land_X_loc', 'Hit_Y_loc', 'Land_Y_loc']
#match_df.plot(kind='scatter')
coor_init = pd.DataFrame(match_df[['Hit_X_loc', 'Hit_Y_loc']])
coor_end = pd.DataFrame(match_df[['Land_X_loc', 'Land_Y_loc']])
coor_init.iloc[:,0] = coor_init.iloc[:,0] * 2
coor_end.iloc[:,0] = coor_end.iloc[:,0] * 2
coor_init.iloc[:,1] = coor_init.iloc[:,1] * 2.5
coor_end.iloc[:,1] = coor_end.iloc[:,1] * 2.5
background = plt.imread('./images/tennis-court.png')
plt.imshow(background)
plt.plot(coor_init.iloc[:, 0], coor_init.iloc[:, 1], color='black', linestyle='None', markersize=5.0, marker='.')
plt.plot(coor_end.iloc[:, 0], coor_end.iloc[:, 1], linestyle='None', marker='.', color='red', markersize=5.0)

plt.show()