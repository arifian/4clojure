project_classpath=`lein classpath`
echo $project_classpath
java -cp $project_classpath  clojure.main -i ./src/foreclojure/mongo.clj -e "(use 'foreclojure.mongo) (delete-problems $1) (shutdown-agents)"

# sample
#  ./unload-problem-data.sh "\"[]\""
#  ./unload-problem-data.sh "\"[322 321 320 319 318 317 316]\""
