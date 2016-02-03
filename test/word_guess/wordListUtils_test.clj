(ns word-guess.wordListUtils-test
  (:require [clojure.test :refer :all]
            [word-guess.wordListUtils :refer :all :as wordListUtils]))

(deftest canRetrieveThe5000WordsFromTxtFile-test
  (testing "There should be 5000 words in wordlist.txt"
  	(def words (wordListUtils/getWords))
    (is (= 5000 (count words))))
)