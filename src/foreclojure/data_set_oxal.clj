(ns foreclojure.data-set-oxal
  (:require [clojure.set])
  (:use [somnium.congomongo]))

(def problems
  (read-string (slurp "resources/problem.edn")))

(defn load-problems []
  (for [problem problems]
    (let [problem-adjusted-keys (-> problem
                                    (clojure.set/rename-keys {:id :_id})
                                    (assoc :times-solved 0 :approved true))]
      (insert! :problems problem-adjusted-keys))))

(defn insert-init-seq []
  (insert! :seqs
           {:_id "problems"
            :seq 151}))

(defn load-problems-2 []
  (dorun (mass-insert!
          :problems
          (for [problem problems]
            (-> problem
                (clojure.set/rename-keys {:id :_id})
                (assoc :times-solved 0 :approved true))))))

(comment
  (load-problems)
  (count problems)
  ;; => 151
  )
