project_classpath=`lein classpath`
echo $project_classpath
java -cp $project_classpath  clojure.main -i ./src/foreclojure/mongo.clj -e "(use 'foreclojure.mongo) (add-additional-problems $1) (shutdown-agents)"

# sample
#  ./load-additional-problems.sh "\"resources/koans.edn\""
