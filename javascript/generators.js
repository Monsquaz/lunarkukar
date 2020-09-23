[...((lunar, kukar) => lunar(kukar, lunar))(function* (lunar, kukar) { yield ["lunar", "kukar"][Math.round(Math.random())]; lunar > 0 ? yield* kukar(lunar-1, kukar) : lunar}, 10)].join(' ')
