// incase mismatched difficulty tag
db.problems.updateMany({"difficulty": "elementary"}, {$set: {"difficulty": "Elementary"}})
db.problems.updateMany({"difficulty": "easy"}, {$set: {"difficulty": "Easy"}})
db.problems.updateMany({"difficulty": "medium"}, {$set: {"difficulty": "Medium"}})
db.problems.updateMany({"difficulty": "hard"}, {$set: {"difficulty": "Hard"}})
db.problems.updateMany({"_id": NumberLong(118)}, {$set: {"restricted" : [ "map" ]}})
db.problems.updateMany({"_id": NumberLong(116)}, {$unset: {"restricted" : ""}})
