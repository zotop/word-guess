(ns word-guess.core
  (require [word-guess.wordListUtils :refer :all :as wordListUtils])
  (:gen-class))

(def numberOfRounds 3)

(defn -main
  "Playing the word guess game for a series of rounds and displaying the amount of seconds it took to solve all the words."
  [& args]
  
  (def words (wordListUtils/getWords))

  (def startTime (quot (System/currentTimeMillis) 1000))

  (dotimes [n numberOfRounds]
  	(def wordToGuess (wordListUtils/getRandomWord words))

  	(println (str "Word to solve: " (wordListUtils/shuffleWord wordToGuess )))

  	(while (not= wordToGuess (read-line)) 
  		(println "Wrong! Try again")
  	)
  	(println "Correct!") 
  )

  (def totalTime (- (quot (System/currentTimeMillis) 1000) startTime))
  (println (str "Total Time: " totalTime " seconds"))
)
