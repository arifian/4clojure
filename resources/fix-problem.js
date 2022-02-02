// original
{ "_id" : NumberLong(119),
  "title" : "Win at Tic-Tac-Toe",
  "description" : "As in Problem 73, a tic-tac-toe board\nis represented by a two dimensional vector.\nX is represented by :x, O is represented by :o,\nand empty is represented by :e.\nCreate a function that accepts a game piece and board as arguments,\nand returns a set (possibly empty) of all valid board placements\nof the game piece which would result in an immediate win.\n\nBoard coordinates should be as in calls to get-in.\nFor example, [0 1] is the topmost row, center position.",
  "tests" : [ "(is (= (__ :x [[:o :e :e]\n                               [:o :x :o]\n                               [:x :x :e]])\n                      #{[2 2] [0 1] [0 2]}))", "(is (= (__ :x [[:x :o :o]\n                               [:x :x :e]\n                               [:e :o :e]])\n                      #{[2 2] [1 2] [2 0]}))", "(is (= (__ :x [[:x :e :x]\n                               [:o :x :o]\n                               [:e :o :e]])\n                      #{[2 2] [0 1] [2 0]}))", "(is (= (__ :x [[:x :x :o]\n                               [:e :e :e]\n                               [:e :e :e]])\n                      #{}))", "(is (= (__ :o [[:x :x :o]\n                               [:o :e :o]\n                               [:x :e :e]])\n                      #{[2 2] [1 1]}))" ],
  "difficulty" : "Hard",
  "tags" : [ "game" ],
  "times-solved" : NumberLong(0),
  "approved" : true }

// modified
{ "_id" : NumberLong(119),
  "tests" : [ "(= (__ :x [[:o :e :e]\n           [:o :x :o]\n           [:x :x :e]])\n   #{[2 2] [0 1] [0 2]})",
	      "(= (__ :x [[:x :o :o]\n           [:x :x :e]\n           [:e :o :e]])\n   #{[2 2] [1 2] [2 0]})",
	      "(= (__ :x [[:x :e :x]\n           [:o :x :o]\n           [:e :o :e]])\n   #{[2 2] [0 1] [2 0]})",
	      "(= (__ :x [[:x :x :o]\n           [:e :e :e]\n           [:e :e :e]])\n   #{})",
	      "(= (__ :o [[:x :x :o]\n           [:o :e :o]\n           [:x :e :e]])\n   #{[2 2] [1 1]})" ]}

// command
db.problems.updateOne({ "_id" : NumberLong(119) },{ $set: { "tests" : [ "(= (__ :x [[:o :e :e]\n           [:o :x :o]\n           [:x :x :e]])\n   #{[2 2] [0 1] [0 2]})", "(= (__ :x [[:x :o :o]\n           [:x :x :e]\n           [:e :o :e]])\n   #{[2 2] [1 2] [2 0]})", "(= (__ :x [[:x :e :x]\n           [:o :x :o]\n           [:e :o :e]])\n   #{[2 2] [0 1] [2 0]})", "(= (__ :x [[:x :x :o]\n           [:e :e :e]\n           [:e :e :e]])\n   #{})", "(= (__ :o [[:x :x :o]\n           [:o :e :o]\n           [:x :e :e]])\n   #{[2 2] [1 1]})" ] } })
