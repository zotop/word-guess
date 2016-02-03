(ns word-guess.wordListUtils
	(:gen-class))


(defn getWords []

	(def wordlistFile (.getFile (clojure.java.io/resource "wordlist.txt")))
	(with-open [rdr (clojure.java.io/reader wordlistFile)]
 		 (doall (line-seq rdr))
	)
)

(defn getRandomWord [wordList]
	(rand-nth wordList)
)

(defn shuffleWord [word] 
	(clojure.string/join (clojure.core/shuffle (seq word)))
)


