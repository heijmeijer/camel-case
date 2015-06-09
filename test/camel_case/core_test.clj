(ns camel-case.core-test
  (:require [clojure.test :refer :all]
            [camel-case.core :refer :all]))

(deftest camel-case-test
  (testing "camel-case"
    (are [word answer] (= answer (camel-case word))
                       "something" "something"
                       "camel-case-app" "camelCaseApp"
                       "javaNameApp" "javaNameApp"
                       "" ""
                       0 nil
                       [] nil
                       nil nil
    )))
