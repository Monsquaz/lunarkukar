print(''.join(chr((lambda v: [v+97, 32][v//26])(sum(x) % 27)) for x in [
    [495, 188, 692, 420, 376],
    [541, 868, 109, 672, 746],
    [471, 594, 628, 598, 260],
    [561, 243, 472, 584, 840],
    [593, 499, 717, 976, 472],
    [455, 846, 416, 771, 967],
    [642, 920, 569, 417, 621],
    [635, 175, 938, 507, 816],
    [307, 153, 404, 284, 806],
    [317, 841, 971, 331, 672],
    [334, 512, 401, 901, 137]
]))
