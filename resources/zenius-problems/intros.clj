(ns intros)

(comment
  (read-string (slurp "resources/zenius-problems/intros.edn")))

;; iterate

(def problem-45-iterate-reference
  {:id         45
   :title       "Intro to Iterate"
   :tests       ["(= __ (take 5 (iterate #(+ 3 %) 1)))"]
   :description "The iterate function can be used to produce
an infinite lazy sequence."
   :difficulty "Easy" 
   :tags ["seqs"]})

(def problem-345-iterate-deprac-1
  [(->> (map #(take 3 %) [(iterate #(+ 3 %) 3) (iterate #(+ 7 %) 8) (iterate #(+ 6 %) 9) (iterate #(+ 9 %) 2) (iterate #(+ 11 %) 7)])
        (= '_))])

(comment
  "345 Deprac iterate"
  "(->> (map #(take 3 %) [(iterate #(+ 3 %) 3) (iterate #(+ 7 %) 8) (iterate #(+ 6 %) 9) (iterate #(+ 9 %) 2) (iterate #(+ 11 %) 7)])\n
        (= __))")

(def problem-445-iterate-deprac-2
  [(->> (take 10 (iterate (partial + 3) 1))
        (iterate identity)
        (take 4)
        (map #(reduce + %))
        (reduce +)
        (= '_))])

(comment
  "445 iterate with a twist"
  "(->> (take 10 (iterate (partial + 3) 1))\n
       (iterate identity)\n
       (take 4)\n
       (map #(reduce + %))\n
       (reduce +)\n
       (= __))")

(def problem-48-some-reference
  {:id          48
   :title       "Intro to some"
   :tests       ["(= __ (some #{2 7 6} [5 6 7 8]))"
                 "(= __ (some #(when (even? %) %) [5 6 7 8]))"]
   :description "The some function takes
a predicate function and a collection.
It returns the first logical true value of (predicate x)
where x is an item in the collection."
   :difficulty  "Easy" ;; Should be elementary?
   :tags        []})

(def problem-348-some-deprac-1 ;; should be Easy?
  [(= '_ (some {:a :b "nil" 8 nil 7} [:x :y nil "nil"]))
   (= '_ (some #{2 7 1 4 3} (range 5 10)))
   (= '_ (some (partial #{2 7 1 4 3}) (range 5 10)))
   (= '_ (some (set [5 6 7 8]) #{2 7 6}))
   (= '_ (some #(if (odd? %) %) [2 4 7 8]))])

(def problem-448-some-reimplement ;; Should be Medium difficulty?
  [(= 6 ('_ #{2 7 6} [5 6 7 8]))
   (= 6 ('_ #(when (even? %) %) [5 6 7 8]))])

(def problem-52-destructuring-reference
  {:id          52
   :title       "Intro to Destructuring"
   :tests       ["(= [2 4] (let [[a b c d e f g] (range)] __))"]
   :description "Let bindings and function parameter lists
support destructuring."
   :difficulty  "Elementary" 
   :tags        ["destructuring"]})

(def problem-173-destructuring-reference
  {:id          173
   :title       "Intro to Destructuring 2"
   :description "Sequential destructuring allows you to bind symbols to parts of
sequential things (vectors, lists, seqs, etc.): (let [bindings* ] exprs*) Complete
the bindings so all let-parts evaluate to 3."
   :tests       ["(= 3
                      (let [[__] [+ (range 3)]] (apply __))
                      (let [[[__] b] [[+ 1] 2]] (__ b))
                      (let [[__] [inc 2]] (__)))"]
   :difficulty  "Easy" 
   :tags        ["destructuring"]})

(def problem-352-destructuring-deprac-1-1
  [(= [7 '(3 2 1 0)] (let [my-coll           (take 10 (range))
                           [a b c d e f & g] (reverse my-coll)]
                       '_))])

(def problem-452-destructuring-deprac-1-2
  [(= '_ (let [my-hash-map              {:foo :foos :bar :rodah}
               {a-key :foo b-key :bar} my-hash-map]
           {a-key b-key}))])

(def problem-552-destructuring-deprac-1-3
  [(->> (let [my-coll             [(range) (range 2 10)]
              [[e f g] [a b c d]] my-coll]
          ['_])
        (= [2 4]))
   (->> (let [my-hash-map {:ipsum 2
                           :dolor 10
                           :sit   4
                           :amet  7}
              {g :ipsum
               a :dolor
               b :amet
               c :sit}    my-hash-map]
          {'_ '_})
        (= {2 4}))])


(def problem-64-reduce-reference
  {:id          64
   :title       "Intro to Reduce"
   :tests       ["(= 15 (reduce __ [1 2 3 4 5]))"
                 "(=  0 (reduce __ []))"
                 "(=  6 (reduce __ 1 [2 3]))"]
   :description "Reduce takes a 2 argument function
and an optional starting value.
It then applies the function to the first 2 items in the sequence
(or the starting value and the first element of the sequence).
In the next iteration the function will be called on
the previous return value and the next item from the sequence,
thus reducing the entire collection to one value.
Don't worry, it's not as complicated as it sounds."
   :difficulty  "Elementary" 
   :tags        ["seqs"]})

(def problem-364-reduce-deprac-1
  [(= "1,2,3,4,5" (reduce '_ (range 1 6)))
   (= 1 (reduce '_ [1]))
   (= ":a,:b,:c,:d" (reduce '_ :a [:b :c :d]))])

(def problem-464-reduce-deprac-2
  [(= '(5 4 3 2 1) (reduce '_ [] (range 1 6)))
   (= 1 (reduce '_ [1]))
   (= '(:d :c :b :a) (reduce '_ '() [:a :b :c :d]))])

(def problem-464-reduce-deprac-2
  [(= '(5 4 3 2 1) (reduce '_ [] (range 1 6)))
   (= 1 (reduce '_ [1]))
   (= '(:d :c :b :a) (reduce '_ '() [:a :b :c :d]))])

(def problem-564-reduce-deprac-3
  [(= '(1 2 4 5 6 8 9 10) (reduce '_ [(range 1 3) (range 4 7) (range 8 11)]))])
