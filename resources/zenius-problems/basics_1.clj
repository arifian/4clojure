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

(def problem-4-list-reference
  {:id          4
   :title       "Lists"
   :tests       ["(= (list __) '(:a :b :c))"]
   :description "Lists can be constructed with either
a function or a quoted form." 
   :difficulty  "Elementary" 
   :tags        []})

(def problem-304-list-deprac-1
  [(= '('_) '(:a :b :c))
   (= (apply list ['_]) '(:a :b :c))])

(def problem-5-conj-reference
  {:id          5
   :title       "conj on lists"
   :tests       ["(= __ (conj '(2 3 4) 1))"
                 "(= __ (conj '(3 4) 2 1))"]
   :description "When operating on a list,
the conj function will return a new list
with one or more items \"added\" to the front." 
   :difficulty  "Elementary" 
   :tags        []})

(def problem-305-conj-deprac-1
  [(= '_ (conj [3 4 2] 1))
   (= '_ (conj [3 4] 2 1))])
