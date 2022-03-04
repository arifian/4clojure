project_classpath=`lein classpath`
echo $project_classpath
java -cp $project_classpath  clojure.main -i ./src/foreclojure/mongo.clj -e "(use 'foreclojure.mongo) (add-koans-problems) (shutdown-agents)"
