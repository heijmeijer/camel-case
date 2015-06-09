(ns camel-case.core
  (:gen-class))

(defn camel-case
  [word]
  (let [x (re-seq #"[a-zA-Z]+" word)]
    (apply str (cons (first x) (map clojure.string/capitalize (rest x))))
    )
  )

(defn -main
  "Camel case"
  [& args]
  (println (camel-case "test-this-app-name")))
