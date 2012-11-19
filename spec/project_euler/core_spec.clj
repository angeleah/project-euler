(ns project_euler.core-spec
  (:use [speclj.core] [project_euler.core]))
 
  (describe "Find the sum of all the multiples of 3 or 5 below 1000"
    (it "should return the number if the passed in number is a multiple of the second passed in number"
        (should= 10 (multiple-of-number 10 5)))

    (it "should be able add up a list of multiples"
        (should= "1997" (sum-of-the-multiples 999 998)))
        
    (it "should be able add up a list of multiples"
        (should= "233168" (sum-of-the-multiples 3 5)))
  )

  (describe "Find the sum of all the even fib nums under 4mil"
    (it "should be able to calculate a fibonacci sequence"
        (should= [0 1 1 2 3 5 8 13 21 34] (take 10 (lazy-seq-fibo))))

    (it "should be able to generate the even numbers of the fibonacci sequence under 4 mil"
        (should= "4613732" (sum-of-the-evens)))
  )

  (describe "Find the largest prime factor of the number 600851475143"
    (it "should find the prime factor of nothing"
        (should= [] (prime-factors 0)))

  	(it "should find the prime factor of 1"
      	(should= [] (prime-factors 1)))

    (it "should find the prime factor of 2"
	    (should= [2] (prime-factors 2)))
	
	(it	"should find the prime factor of 3"
		(should= [3] (prime-factors 3)))
		
	(it	"should find the prime factor of 4"
		(should= [2 2] (prime-factors 4)))
		
	(it	"should find the prime factor of 5"
		(should= [5] (prime-factors 5)))
		
	(it	"should find the prime factor of 6"
		(should= [2 3] (prime-factors 6)))
		
	(it	"should find the prime factor of 7"
		(should= [7] (prime-factors 7)))
		
	(it	"should find the prime factor of 8"
		(should= [2 2 2] (prime-factors 8)))

	(it	"should find the prime factor of 9"
		(should= [3 3] (prime-factors 9)))
  )

 (describe "Find the largest palindrome made from the product of two 3-digit numbers"
	(it "should generate a list of products from all 3 digit numbers"
		(should= [10000 10100 10200 10300 10400] (take 5 (generate-products-of-3-digit-numbers))))

	(it "should return true for a one character palindrome"
		(should= true (palindrome? 1)))

	(it "should return true for a two character palindrome"
		(should= true (palindrome? 11)))
		
	(it "should return false for a two chatacter non-palindrome"
		(should= false (palindrome? 12)))
		
	(it "should return true for a 5 digit palindrome"
		(should= true (palindrome? 1095901)))
		
	(it "should be able to detect string palindromes as well"
		(should= true (palindrome? "abba")))

	(it "should be able to detect string palindromes as well"
		(should= false (palindrome? "abcd")))
		
	(it "should f ind the largest palindrome"
		(should= 906609 (find-largest-palindrome)))

 )
  (run-specs)