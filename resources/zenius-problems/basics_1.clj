(ns basics-1) ;; number 1 - 20 expansion 

(def problem-2-simple-reference
  {:id          2
   :title       "Simple Math"
   :tests       ["(= (- 10 (* 2 3)) __)"]
   :description "Innermost forms are evaluated first." 
   :difficulty  "Elementary" 
   :tags        []})

(def problem-302-math-deprac-1
  [(= '_ (* 10 (- 2 3)))
   (= '_ (- 1 2 3 6))
   (= '_ (* 2 5 -1))])

(def problem-3-strings-reference
  {:id          3
   :title       "Strings"
   :tests       ["(= __ (.toUpperCase \"hello world\"))"]
   :description "Clojure strings are Java strings,
so you can use Java string methods on them." 
   :difficulty  "Elementary" 
   :tags        []})

(def problem-303-string-deprac-1
  [(= '_ (clojure.string/upper-case "hello world"))
   (= '_ (apply str [\H \E \L \L \O " " \W \O \R \L \D]))])

