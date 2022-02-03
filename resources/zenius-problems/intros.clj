(ns intros)

(comment
  (read-string (slurp "resources/zenius-problems/intros.edn")))

;; iterate

(comment
  345
  "Deprac iterate"
  (->> (map #(take 3 %) [(iterate #(+ 3 %) 3) (iterate #(+ 7 %) 8) (iterate #(+ 6 %) 9) (iterate #(+ 9 %) 2) (iterate #(+ 11 %) 7)])
       (= '_))
  "(->> (map #(take 3 %) [(iterate #(+ 3 %) 3) (iterate #(+ 7 %) 8) (iterate #(+ 6 %) 9) (iterate #(+ 9 %) 2) (iterate #(+ 11 %) 7)])\n
        (= __))")

(comment
  "iterate with a twist"
  (->> (take 10 (iterate (partial + 3) 1))\n
       (iterate identity)
       (take 4)
       (map #(reduce + %))
       (reduce +)
       (= '_))
  "(->> (take 10 (iterate (partial + 3) 1))\n
       (iterate identity)\n
       (take 4)\n
       (map #(reduce + %))\n
       (reduce +)\n
       (= __))")
