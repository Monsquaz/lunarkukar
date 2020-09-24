Array(10).fill([['l','k'],['u'],['n','k'],['a'],['r']]).map(i=>(k=>i.map(j=>j.length>1?j[k>.5?0:1]:j[0]))(Math.random()).join('')).join(' ');
