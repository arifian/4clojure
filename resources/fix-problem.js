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

db.problems.updateOne({"_id": 270},{$set: {"title": "higher-order-functions-0"}})
db.problems.updateOne({"_id": 271},{$set: {"title": "higher-order-functions-1"}})
db.problems.updateOne({"_id": 272},{$set: {"title": "higher-order-functions-2"}})
db.problems.updateOne({"_id": 273},{$set: {"title": "higher-order-functions-3"}})
db.problems.updateOne({"_id": 274},{$set: {"title": "higher-order-functions-4"}})
db.problems.updateOne({"_id": 275},{$set: {"title": "higher-order-functions-5"}})
db.problems.updateOne({"_id": 276},{$set: {"title": "higher-order-functions-6"}})
db.problems.updateOne({"_id": 277},{$set: {"title": "higher-order-functions-7"}})
db.problems.updateOne({"_id": 278},{$set: {"title": "higher-order-functions-8"}})
db.problems.updateOne({"_id": 279},{$set: {"title": "higher-order-functions-9"}})
db.problems.updateOne({"_id": 280},{$set: {"title": "runtime-polymorphism-0"}})
db.problems.updateOne({"_id": 281},{$set: {"title": "runtime-polymorphism-1"}})
db.problems.updateOne({"_id": 282},{$set: {"title": "runtime-polymorphism-2"}})
db.problems.updateOne({"_id": 283},{$set: {"title": "lazy-sequences-0"}})
db.problems.updateOne({"_id": 284},{$set: {"title": "lazy-sequences-1"}})
db.problems.updateOne({"_id": 285},{$set: {"title": "lazy-sequences-2"}})
db.problems.updateOne({"_id": 286},{$set: {"title": "lazy-sequences-3"}})
db.problems.updateOne({"_id": 287},{$set: {"title": "lazy-sequences-4"}})
db.problems.updateOne({"_id": 288},{$set: {"title": "lazy-sequences-5"}})
db.problems.updateOne({"_id": 289},{$set: {"title": "lazy-sequences-6"}})
db.problems.updateOne({"_id": 290},{$set: {"title": "sequence-comprehensions-0"}})
db.problems.updateOne({"_id": 291},{$set: {"title": "sequence-comprehensions-1"}})
db.problems.updateOne({"_id": 292},{$set: {"title": "sequence-comprehensions-2"}})
db.problems.updateOne({"_id": 293},{$set: {"title": "sequence-comprehensions-3"}})
db.problems.updateOne({"_id": 294},{$set: {"title": "sequence-comprehensions-4"}})
db.problems.updateOne({"_id": 295},{$set: {"title": "creating-functions-0"}})
db.problems.updateOne({"_id": 296},{$set: {"title": "creating-functions-1"}})
db.problems.updateOne({"_id": 297},{$set: {"title": "creating-functions-2"}})
db.problems.updateOne({"_id": 298},{$set: {"title": "creating-functions-3"}})
db.problems.updateOne({"_id": 299},{$set: {"title": "creating-functions-4"}})
db.problems.updateOne({"_id": 300},{$set: {"title": "creating-functions-5"}})
db.problems.updateOne({"_id": 301},{$set: {"title": "creating-functions-6"}})
