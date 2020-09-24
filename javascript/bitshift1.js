(a=(b,c)=>b+(c&1==1?'lunar':'kukar')+(c>0?a(' ',c>>1):''))(' ',(({random,pow})=>random()*pow(2,10))(Math))
