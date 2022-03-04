(ns foreclojure.data-set-custom
    (:require [clojure.set])
    (:use [somnium.congomongo]))

(defn problems [problem-edn-path]
  (read-string (slurp problem-edn-path)))

(defn load-problems [problem-edn-path]
  (for [problem (problems problem-edn-path)]
    (let [problem-adjusted-keys (-> problem
                                    (clojure.set/rename-keys {:id :_id})
                                    (assoc :times-solved 0 :approved true))]
      (insert! :problems problem-adjusted-keys))))

;; (defn insert-init-seq []
;;   (insert! :seqs
;;            {:_id "problems"
;;             :seq 151}))

(defn load-problems-2 [problem-edn-path]
  (dorun (mass-insert!
          :problems
          (for [problem (problems problem-edn-path)]
            (-> problem
                (clojure.set/rename-keys {:id :_id})
                (assoc :times-solved 0 :approved true))))))

(comment
  (load-problems)
  (count problems)
  ;; => 151
  )
