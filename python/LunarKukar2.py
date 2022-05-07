print(''.join((lambda v: chr([v+96, 32][v==0]))(sum([[ord(c)-96, 0][ord(c)==32] for c in p])%27) for p in zip(
    "Deven Gallo, what a man",
    "dusthillresident",
    "DBZ FOREVER !!!",
    'jyfcvhkhrky'
)))
