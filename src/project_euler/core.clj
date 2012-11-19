(ns project_euler.core
	(:require [clojure.string :as str]))

;problem 1

(defn multiple-of-number [number multiple-candidate]
  (if (true? (= 0 (rem number multiple-candidate)))
    number))

(defn sum-of-the-multiples [number1 number2]
  (pr-str (reduce +
    (filter (fn [index]
              (or (multiple-of-number index number1) (multiple-of-number index number2)))
      (range 1 1000)))))

;problem 2

(defn lazy-seq-fibo
    ([]
        (concat [0 1] (lazy-seq-fibo 0 1)))
    ([a b]
        (let [n (+ a b)]
            (lazy-seq
                (cons n (lazy-seq-fibo b n))))))

(defn sum-of-the-evens []
    (pr-str (reduce +
        (filter even?
            (take-while (fn [n] (< n 4000000)) (lazy-seq-fibo))))))

;problem 3
(defn factors [n candidate]
	(cond (< n candidate) []
		  (zero? (rem n candidate))
			(cons candidate (factors(/ n candidate) candidate))
  		  :else (factors n (+ 1 candidate))))

(defn prime-factors [n]
	(factors n 2))

;problem 4
(defn generate-products-of-3-digit-numbers []
	(for [x (range 100 1000) y (range 100 1000)] (* x y)))

(defn palindrome? [n]
	(let [b (str n)]
	(= b (str/join "" (reduce conj '() b)))))

(defn find-largest-palindrome []
	(reduce max (filter palindrome? (generate-products-of-3-digit-numbers))))

